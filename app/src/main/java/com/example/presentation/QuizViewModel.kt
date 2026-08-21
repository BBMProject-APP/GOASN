package com.example.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.core.content.edit
import com.example.data.model.QuestionEntity
import com.example.data.model.TokenEntity
import com.example.data.model.UserSessionEntity
import com.example.data.repository.QuizRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

sealed class Screen {
    object Home : Screen()
    object TkbCategory : Screen()
    object Quiz : Screen()
    object Result : Screen()
    object Review : Screen()
    object Materi : Screen()
    object Statistik : Screen()
    object Akun : Screen()
}

// 🎯 CACHE STATISTIK MEMORI: Pengunci nilai agar tidak balik ke 0 saat kembali ke Home screen
object StatistikCache {
    var scoreTwk = 0
    var scoreTiu = 0
    var scoreTkp = 0
    var scoreTkb = 0
    var scoreTotal = 0
    var activeQuizType = "KILAT"
}

class QuizViewModel(private val repository: QuizRepository) : ViewModel() {

    private val _usernameState = MutableStateFlow("Andi Pratama")

    // --- STATES ---
    val currentScreen = MutableStateFlow<Screen>(Screen.Home)
    val tokenState = repository.tokenFlow.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), TokenEntity(id = 1, tokenCount = 10))
    val activeSessionState = repository.activeSessionFlow.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    // User Profil State
    val usernameState: StateFlow<String> = _usernameState.asStateFlow()

    // Active Quiz Details
    val quizQuestions = MutableStateFlow<List<QuestionEntity>>(emptyList())
    val currentQuestionIndex = MutableStateFlow(0)
    val remainingTimeSeconds = MutableStateFlow(0L)
    val userAnswers = MutableStateFlow<Map<String, String>>(emptyMap())
    val doubtfulQuestions = MutableStateFlow<Set<String>>(emptySet())
    val activeQuizType = MutableStateFlow(StatistikCache.activeQuizType)

    // Reveal Explanation states
    val revealedExplanations = MutableStateFlow<Set<String>>(emptySet())

    // Scoring result details (Di-link langsung ke Cache agar persisten saat re-init ViewModel)
    val scoreTwk = MutableStateFlow(StatistikCache.scoreTwk)
    val scoreTiu = MutableStateFlow(StatistikCache.scoreTiu)
    val scoreTkp = MutableStateFlow(StatistikCache.scoreTkp)
    val scoreTkb = MutableStateFlow(StatistikCache.scoreTkb)
    val scoreTotal = MutableStateFlow(StatistikCache.scoreTotal)

    val isPassingTWK = MutableStateFlow(false)
    val isPassingTIU = MutableStateFlow(false)
    val isPassingTKP = MutableStateFlow(false)
    val isPassingTKB = MutableStateFlow(false)
    val isPassedOverall = MutableStateFlow(false)

    // Splash screen loading state
    val isLoading = MutableStateFlow(true)

    // UI Feedback indicators
    val isRewardAdShowing = MutableStateFlow(false)
    val showInsufficientTokenDialog = MutableStateFlow(false)

    // AdMob Interstitial Ad Simulation
    val isInterstitialAdShowing = MutableStateFlow(false)
    val interstitialAdCountdown = MutableStateFlow(3)
    private var postAdAction: (() -> Unit)? = null

    fun showInterstitialAd(onDismiss: () -> Unit) {
        interstitialAdCountdown.value = 3
        isInterstitialAdShowing.value = true
        postAdAction = onDismiss
        viewModelScope.launch {
            while (interstitialAdCountdown.value > 0) {
                delay(1000)
                interstitialAdCountdown.value -= 1
            }
            dismissInterstitialAd()
        }
    }

    fun dismissInterstitialAd() {
        if (isInterstitialAdShowing.value) {
            isInterstitialAdShowing.value = false
            val action = postAdAction
            postAdAction = null
            action?.invoke()
        }
    }

    fun initUsername(context: android.content.Context) {
        val prefs = context.getSharedPreferences("user_prefs", android.content.Context.MODE_PRIVATE)
        _usernameState.value = prefs.getString("username", "Andi Pratama") ?: "Andi Pratama"
    }

    fun saveUsername(context: android.content.Context, newName: String) {
        val prefs = context.getSharedPreferences("user_prefs", android.content.Context.MODE_PRIVATE)
        prefs.edit { putString("username", newName) }
        _usernameState.value = newName
    }

    private var timerJob: Job? = null
    private var autoSaveJob: Job? = null

    // 🎯 SINKRONISASI COLD START: Load otomatis riwayat database terakhir saat app/viewmodel dinyalakan
    init {
        viewModelScope.launch {
            repository.initializeApp()

            val activeSession = repository.getActiveSession()
            if (activeSession != null) {
                // 🛑 [LAS PERMANEN]: Kategori apa pun kondisinya (lengkap atau menggantung),
                // NILAI HISTORIS yang sudah tersimpan HARUS SELALU DIPULIHKAN ke UI & Cache!
                scoreTotal.value = activeSession.lastScoreTotal
                scoreTwk.value = activeSession.lastScoreTwk
                scoreTiu.value = activeSession.lastScoreTiu
                scoreTkp.value = activeSession.lastScoreTkp
                scoreTkb.value = activeSession.lastScoreTkb

                StatistikCache.scoreTotal = activeSession.lastScoreTotal
                StatistikCache.scoreTwk = activeSession.lastScoreTwk
                StatistikCache.scoreTiu = activeSession.lastScoreTiu
                StatistikCache.scoreTkp = activeSession.lastScoreTkp
                StatistikCache.scoreTkb = activeSession.lastScoreTkb

                if (!activeSession.isCompleted) {
                    // Jika ada kuis menggantung, kembalikan posisi indeks & tipe soalnya tanpa merusak skor kategori lain
                    currentQuestionIndex.value = activeSession.currentQuestionIndex
                    activeQuizType.value = activeSession.activeQuizType
                    StatistikCache.activeQuizType = activeSession.activeQuizType
                } else {
                    // Jika sesi terakhir sudah submit penuh, arahkan tipe aktifnya sesuai database
                    StatistikCache.activeQuizType = activeSession.activeQuizType
                    activeQuizType.value = activeSession.activeQuizType
                }
            }

            // Jalankan kalkulator presisi BKN (656 Poin) berdasarkan data yang baru dipulihkan
            evaluatePassingGrades()

            isLoading.value = false
        }
    }
    fun startQuiz(type: String) {
        viewModelScope.launch {
            activeQuizType.value = type
            StatistikCache.activeQuizType = type
            revealedExplanations.value = emptySet()

            // Menggunakan fungsi repository Komandan yang valid (mengembalikan List)
            val allQuestions = repository.getAllQuestions()
            if (allQuestions.isEmpty()) return@launch

            val selectedQuestions = when {
                (type == "TWK") || (type == "TIU") || (type == "TKP") -> {
                    allQuestions.filter { it.kategori == type }.shuffled().take(20)
                }
                type.startsWith("TKB_") -> {
                    val field = type.substringAfter("TKB_")
                    allQuestions.filter { it.kategori == "TKB" && it.subKategori.contains(field, ignoreCase = true) }.shuffled().take(100)
                }
                type == "KILAT" -> {
                    val twk = allQuestions.filter { it.kategori == "TWK" }.shuffled().take(4)
                    val tiu = allQuestions.filter { it.kategori == "TIU" }.shuffled().take(4)
                    val tkp = allQuestions.filter { it.kategori == "TKP" }.shuffled().take(2)
                    twk + tiu + tkp
                }
                else -> {
                    allQuestions.shuffled().take(110)
                }
            }

            quizQuestions.value = selectedQuestions.mapIndexed { index: Int, q: QuestionEntity ->
                val num = index + 1
                q.copy(
                    idSoal = "${q.idSoal}_run_$num",
                    pertanyaan = "[No. $num] ${q.pertanyaan}"
                )
            }

            currentQuestionIndex.value = 0
            userAnswers.value = emptyMap()
            doubtfulQuestions.value = emptySet()

            remainingTimeSeconds.value = when {
                type.startsWith("TKB_") -> 6000L
                type == "TWK" || type == "TIU" || type == "TKP" -> 1200L
                type == "KILAT" -> 600L
                else -> 6000L
            }

            saveActiveStateToDb(completed = false)
            currentScreen.value = Screen.Quiz
            startTimer()
            startAutoSaveTracker()
        }
    }

    private fun startTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (remainingTimeSeconds.value > 0) {
                delay(1000)
                remainingTimeSeconds.value -= 1
                if (remainingTimeSeconds.value <= 0) {
                    calculateAndSubmitQuiz()
                }
            }
        }
    }

    private fun startAutoSaveTracker() {
        autoSaveJob?.cancel()
        autoSaveJob = viewModelScope.launch {
            while (true) {
                delay(9900)
                saveActiveStateToDb(completed = false)
            }
        }
    }

    fun selectOption(questionId: String, optionText: String) {
        val updated = userAnswers.value.toMutableMap()
        updated[questionId] = optionText
        userAnswers.value = updated

        viewModelScope.launch {
            saveActiveStateToDb(completed = false)
        }
    }

    fun toggleDoubtful(questionId: String) {
        val updated = doubtfulQuestions.value.toMutableSet()
        if (updated.contains(questionId)) {
            updated.remove(questionId)
        } else {
            updated.add(questionId)
        }
        doubtfulQuestions.value = updated

        viewModelScope.launch {
            saveActiveStateToDb(completed = false)
        }
    }

    fun nextQuestion() {
        val currentIndex = currentQuestionIndex.value
        if (currentIndex < quizQuestions.value.size - 1) {
            currentQuestionIndex.value = currentIndex + 1
            viewModelScope.launch { saveActiveStateToDb(completed = false) }
        }
    }

    fun prevQuestion() {
        if (currentQuestionIndex.value > 0) {
            currentQuestionIndex.value -= 1
            viewModelScope.launch { saveActiveStateToDb(completed = false) }
        }
    }

    fun navigateToQuestion(index: Int) {
        if (index in quizQuestions.value.indices) {
            currentQuestionIndex.value = index
            viewModelScope.launch { saveActiveStateToDb(completed = false) }
        }
    }

    fun tryRevealExplanation(questionId: String, onUnlockSuccess: () -> Unit) {
        viewModelScope.launch {
            if (revealedExplanations.value.contains(questionId)) {
                onUnlockSuccess()
                return@launch
            }

            val success = repository.deductToken()
            if (success) {
                val updated = revealedExplanations.value.toMutableSet()
                updated.add(questionId)
                revealedExplanations.value = updated
                onUnlockSuccess()
            } else {
                showInsufficientTokenDialog.value = true
            }
        }
    }

    fun triggerAdmobRewardedVideo() {
        showInsufficientTokenDialog.value = false
        isRewardAdShowing.value = true

        /* SIMULASI LAMA (DIKOMENTARI)
        // Dulu pakai timer simulasi manual 5 detik, sekarang waktu iklan diatur penuh oleh SDK AdMob
        rewardAdCountdown.value = 5

        viewModelScope.launch {
            while (rewardAdCountdown.value > 0) {
                delay(1000)
                rewardAdCountdown.value -= 1
            }
            repository.addTokens(5)
            isRewardAdShowing.value = false
        }
        */
    }

    // Tambahkan fungsi penambah token baru ini agar bisa dipanggil dari UI setelah nonton iklan AdMob
    fun grantRewardTokens(amount: Int = 5) {
        viewModelScope.launch {
            repository.addTokens(amount)
        }
    }

    // 🎯 MESIN KALKULASI UTAMA (+5) & DISTRIBUSI REKAM DATA STATISTIK
    fun calculateAndSubmitQuiz() {
        timerJob?.cancel()
        autoSaveJob?.cancel()

        viewModelScope.launch {
            val questions = quizQuestions.value
            val answers = userAnswers.value

            // 🎯 STEP 1: Ambil akumulasi nilai terakhir yang sudah tersimpan di Database/Cache
            // Jangan mulai dari 0, tapi teruskan perjuangan dari tes sebelumnya!
            var twkAccumulated = StatistikCache.scoreTwk
            var tiuAccumulated = StatistikCache.scoreTiu
            var tkpAccumulated = StatistikCache.scoreTkp
            var tkbAccumulated = StatistikCache.scoreTkb

            // Reset hanya kategori yang SEDANG DIKERJAKAN saat ini agar tidak double-count
            val activeType = activeQuizType.value
            when {
                activeType == "TWK" -> twkAccumulated = 0
                activeType == "TIU" -> tiuAccumulated = 0
                activeType == "TKP" -> tkpAccumulated = 0
                activeType.startsWith("TKB_") -> tkbAccumulated = 0
            }

            val allDbQuestions = repository.getAllQuestions()

            for (q in questions) {
                val cleanIdSoal = q.idSoal.substringBefore("_run_")
                val baseQuestion = allDbQuestions.firstOrNull { it.idSoal == cleanIdSoal } ?: q

                val selectedAnswer = answers[q.idSoal]
                if (selectedAnswer.isNullOrBlank()) continue

                val cleanUserAnswer = selectedAnswer.trim()
                    .replace(Regex("^[A-Ea-e]\\.\\s*"), "")
                    .trim()

                val tipeScoring = baseQuestion.tipeScoring
                val kategoriSoal = baseQuestion.kategori

                // --- LOGIKA HITUNG PRESISI ---
                if (tipeScoring.equals("SKALA", ignoreCase = true)) {
                    var poinDitemukan = 0
                    val mapPoin = baseQuestion.skalaPoin

                    if (!mapPoin.isNullOrEmpty()) {
                        val matchingKey = mapPoin.keys.firstOrNull { key ->
                            key.trim().equals(cleanUserAnswer, ignoreCase = true)
                        }
                        matchingKey?.let {
                            poinDitemukan = mapPoin[it] ?: 0
                        }
                    }
                    tkpAccumulated += poinDitemukan
                } else {
                    val targetCorrectAnswer = baseQuestion.jawabanBenar ?: q.jawabanBenar ?: ""
                    val cleanCorrectAnswer = targetCorrectAnswer.trim()
                        .replace(Regex("^[A-Ea-e]\\.\\s*"), "")
                        .trim()

                    if (cleanUserAnswer.isEmpty() || cleanCorrectAnswer.isEmpty()) continue

                    if (cleanUserAnswer.equals(cleanCorrectAnswer, ignoreCase = true)) {
                        when (kategoriSoal) {
                            "TWK" -> twkAccumulated += 5
                            "TIU" -> tiuAccumulated += 5
                            "TKB" -> tkbAccumulated += 5
                        }
                    }
                }
            }

            // 🎯 STEP 2: Kunci hasil update ke StateFlow UI
            scoreTwk.value = twkAccumulated
            scoreTiu.value = tiuAccumulated
            scoreTkp.value = tkpAccumulated
            scoreTkb.value = tkbAccumulated

            // 🎯 STEP 3: Amankan ke dalam Cache Global agar tidak ter-reset saat pindah screen
            StatistikCache.scoreTwk = twkAccumulated
            StatistikCache.scoreTiu = tiuAccumulated
            StatistikCache.scoreTkp = tkpAccumulated
            StatistikCache.scoreTkb = tkbAccumulated

            // Evaluasi passing grade gabungan (510 Poin)
            evaluatePassingGrades()

            // 🎯 STEP 4: Simpan status permanen ke database Room
            saveActiveStateToDb(completed = true)

            currentScreen.value = Screen.Result
        }
    }

    fun submitQuiz() {
        calculateAndSubmitQuiz()
    }

    private fun evaluatePassingGrades() {
        val currentTwk = StatistikCache.scoreTwk
        val currentTiu = StatistikCache.scoreTiu
        val currentTkpMurni = StatistikCache.scoreTkp // Skor asli dari 20 soal (Max 100)
        val currentTkb = StatistikCache.scoreTkb

        // 🎯 KONVERSI TKP KE SKALA BKN (Maksimal 225)
        // Rumus: (Skor Murni / 100) * 225
        val currentTkpBkn = ((currentTkpMurni.toFloat() / 100f) * 225f).toInt().coerceIn(0, 225)

        // 🎯 EVALUASI AMBANG BATAS RESMI BKN
        isPassingTWK.value = currentTwk >= 60
        isPassingTIU.value = currentTiu >= 80
        isPassingTKP.value = currentTkpBkn >= 166 // Saklek versi BKN setelah dikonversi!
        isPassingTKB.value = currentTkb >= 350

        // 🎯 HITUNG AKUMULASI GLOBAL SKALA REALISTIS BKN
        val globalTotalScore = currentTwk + currentTiu + currentTkpBkn + currentTkb
        scoreTotal.value = globalTotalScore
        StatistikCache.scoreTotal = globalTotalScore

        // Simpan hasil konversi TKP ke variabel state khusus UI agar sinkron
        // Tambahkan variabel `scoreTkpBkn` di ViewModel Komandan jika diperlukan, atau langsung konversi di UI.

        // Status kelulusan akbar
        isPassedOverall.value = currentTwk >= 60 && currentTiu >= 80 && currentTkpBkn >= 166 && currentTkb >= 350
    }

    fun backToHome() {
        viewModelScope.launch {
            // Saat kembali ke home, pastikan status terkomit selesai agar tidak dianggap menggantung
            saveActiveStateToDb(completed = true)
            currentScreen.value = Screen.Home
        }
    }

    fun startFreshSessionConfirm() {
        viewModelScope.launch {
            repository.deleteActiveSession()
            // Reset Cache lokal saat mau mulai sesi baru bersih
            StatistikCache.scoreTwk = 0
            StatistikCache.scoreTiu = 0
            StatistikCache.scoreTkp = 0
            StatistikCache.scoreTkb = 0
            StatistikCache.scoreTotal = 0
            scoreTwk.value = 0
            scoreTiu.value = 0
            scoreTkp.value = 0
            scoreTkb.value = 0
            scoreTotal.value = 0
            backToHome()
        }
    }

    // 🎯 INTEGRASI PENYIMPANAN 100% SESUAI STRUKTUR USERSESSIONENTITY ASLI KOMANDAN
    private suspend fun saveActiveStateToDb(completed: Boolean) {
        try {
            val type = activeQuizType.value

            // 🎯 TAKTIK PENGUNCIAN ABSOLUT:
            // Ambil nilai yang sudah tervalidasi di memori (StateFlow) untuk memastikan
            // data antar-kategori saling mendukung dan tidak ada yang ter-overwrite jadi 0.
            val finalTwk = scoreTwk.value
            val finalTiu = scoreTiu.value
            val finalTkp = scoreTkp.value
            val finalTkb = scoreTkb.value

            // Total skor selalu sinkron dengan akumulasi global yang tampil di UI
            val finalTotal = scoreTotal.value

            val session = UserSessionEntity(
                id = 1,
                isCompleted = completed,
                currentQuestionIndex = currentQuestionIndex.value,
                activeQuizType = type,
                lastScoreTotal = finalTotal,
                lastScoreTwk = finalTwk,
                lastScoreTiu = finalTiu,
                lastScoreTkp = finalTkp,
                lastScoreTkb = finalTkb,
                isPassed = isPassedOverall.value
            )

            repository.saveActiveSession(session)

        } catch (e: Exception) {
            android.util.Log.e("DB_SAVE_ERROR", "Gagal mengamankan hasil ke  database: ${e.message}")
        }
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
        autoSaveJob?.cancel()
    }
}

// 🎯 GERBANG PABRIK VIEWMODEL: Bersih, rapi, dan siap meluncurkan QuizViewModel ke pulau Samsul Note 8
class QuizViewModelFactory(private val repository: QuizRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return QuizViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class - Cetak biru tidak dikenali!")
    }
}