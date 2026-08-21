package com.example.presentation

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.theme.*
import android.app.Activity
import java.util.Locale

@Composable
fun AppContent(viewModel: QuizViewModel) {
    val screen by viewModel.currentScreen.collectAsState()
    val isAdShowing by viewModel.isRewardAdShowing.collectAsState()
    // TODO val isInterstitialAdShowing by viewModel.isInterstitialAdShowing.collectAsState()//
    val showInsufficientToken by viewModel.showInsufficientTokenDialog.collectAsState()

    // --- INTEGRASI ADMOB ASLI ---
    val context = LocalContext.current
    val activity = context as? Activity
    val rewardedAdManager = remember(context) { RewardedAdManager(context) }

    // Load iklan di awal saat komponen ini masuk ke layar
    LaunchedEffect(Unit) {
        rewardedAdManager.loadAd()
    }

    // Pemicu saat isAdShowing bernilai true
    LaunchedEffect(isAdShowing) {
        if (isAdShowing) {
            if (activity != null) {
                rewardedAdManager.showAd(
                    activity = activity,
                    onRewardEarned = {
                        // 1. Tambah 5 token ke user
                        viewModel.grantRewardTokens(5)
                        // 2. Siapkan/load iklan baru untuk penggunaan berikutnya
                        rewardedAdManager.loadAd()
                    },
                    onAdDismissed = {
                        // Reset state iklan agar tidak terus-menerus bernilai true
                        viewModel.isRewardAdShowing.value = false
                    }
                )
            } else {
                // Jika activity null, tetap reset state agar tidak stuck
                viewModel.isRewardAdShowing.value = false
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedContent(
            targetState = screen,
            transitionSpec = {
                slideInHorizontally { width -> width } + fadeIn() togetherWith
                        slideOutHorizontally { width -> -width } + fadeOut()
            },
            label = "ScreenTransition"
        ) { currentScreen ->
            when (currentScreen) {
                is Screen.Home -> HomeScreen(viewModel)
                is Screen.TkbCategory -> TkbCategoryScreen(viewModel)
                is Screen.Quiz -> QuizScreen(viewModel)
                is Screen.Result -> ResultScreen(viewModel)
                is Screen.Review -> ReviewScreen(viewModel)
                is Screen.Materi -> MateriScreen(viewModel)
                is Screen.Statistik -> StatistikScreen(viewModel, onBackClick = { viewModel.currentScreen.value = Screen.Home })
                is Screen.Akun -> AkunScreen(viewModel)
            }
        }

        // Insufficient Token Dialog
        if (showInsufficientToken) {
            InsufficientTokenDialog(viewModel)
        }
    }
}

// --- HOME SCREEN ---
@Composable
fun HomeScreen(viewModel: QuizViewModel) {
    val username by viewModel.usernameState.collectAsState()
    val tokenEntity by viewModel.tokenState.collectAsState()
    val activeSession by viewModel.activeSessionState.collectAsState()
    val context = LocalContext.current
    val tokenCount = tokenEntity?.tokenCount ?: 0

    LaunchedEffect(Unit) {
        viewModel.initUsername(context)
    }

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.navigationBars),
                color = Color.White,
                shadowElevation = 8.dp,
                border = BorderStroke(1.dp, Color(0xFFF1F5F9))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Home (Active)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { viewModel.currentScreen.value = Screen.Home }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            tint = DeepNavy,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Home", color = DeepNavy, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }

                    // Materi (Ubah biar gak nuduh token habis)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { viewModel.currentScreen.value = Screen.Materi }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Materi",
                            tint = LightText,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Materi", color = LightText, fontSize = 10.sp, fontWeight = FontWeight.Medium)
                    }

                    // Statistik (Ubah biar informatif)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { viewModel.currentScreen.value = Screen.Statistik }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Statistik",
                            tint = LightText,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Statistik", color = LightText, fontSize = 10.sp, fontWeight = FontWeight.Medium)
                    }

                    // Akun (Ubah biar informatif)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { viewModel.currentScreen.value = Screen.Akun }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Akun",
                            tint = LightText,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Akun", color = LightText, fontSize = 10.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(OffWhite)
        ) {
            // Upper Elegant Curved Navy Header
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = DeepNavy,
                            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp)
                        )
                        .padding(top = 28.dp, bottom = 48.dp, start = 24.dp, end = 24.dp)
                ) {
                    // Geometric circle decorations on header background
                    Canvas(modifier = Modifier.matchParentSize()) {
                        drawCircle(
                            color = Color.White.copy(alpha = 0.05f),
                            radius = 200f,
                            center = Offset(size.width * 0.95f, size.height * 0.15f)
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Profile greeting block
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(44.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(Color.White.copy(alpha = 0.18f))
                                    .border(1.dp, Color.White.copy(alpha = 0.3f), RoundedCornerShape(12.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "CAT",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Black
                                )
                            }
                            Column {
                                Text(
                                    text = "Selamat Datang,",
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Medium,
                                    letterSpacing = 0.5.sp
                                )
                                Text(
                                    // ✅ GANTI DENGAN VARIABEL username (Tanpa memakai .value)
                                    text = username,
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )

                            }
                        }

                        // Compact Token Badge Pill (pulsating Ad trigger action)
                        Card(
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .clickable { viewModel.triggerAdmobRewardedVideo() }
                                .testTag("isi_token_button"),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = EmeraldToken),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.2f))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(8.dp)
                                        .clip(CircleShape)
                                        .background(Color.White)
                                )
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "TOKEN",
                                        color = Color.White.copy(alpha = 0.8f),
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Bold,
                                        lineHeight = 9.sp
                                    )
                                    Text(
                                        text = "$tokenCount",
                                        color = Color.White,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Black,
                                        lineHeight = 14.sp
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .size(18.dp)
                                        .clip(CircleShape)
                                        .background(Color.White.copy(alpha = 0.25f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "+",
                                        color = Color.White,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // Suspended Quiz Resume Card (with nice offset layout overlaying the navy header)
            val session = activeSession
            if (session != null && !session.isCompleted) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                            .offset(y = (-24).dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, AccentYellow.copy(alpha = 0.4f), RoundedCornerShape(24.dp)),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFBEB)), // Amber 50
                            shape = RoundedCornerShape(24.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .size(36.dp)
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(AccentYellow.copy(alpha = 0.15f)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Warning,
                                            contentDescription = "Pending Exam",
                                            tint = AccentYellow,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Text(
                                        text = "Latihan Mandiri Ditunda",
                                        color = Color(0xFF92400E), // Amber 800
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp
                                    )
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Tes terakhir Anda telah disimpan (${session.activeQuizType}).",
                                    color = Color(0xFFB45309), // Amber 700
                                    fontSize = 13.sp,
                                    lineHeight = 18.sp
                                )
                                Spacer(modifier = Modifier.height(18.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    TextButton(
                                        onClick = { viewModel.startFreshSessionConfirm() },
                                        modifier = Modifier.testTag("reset_quiz_button")
                                    ) {
                                        Text("Mulai Ulang", color = LightRed, fontWeight = FontWeight.SemiBold)
                                    }
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Button(
                                        onClick = { viewModel.currentScreen.value = Screen.Quiz },
                                        colors = ButtonDefaults.buttonColors(containerColor = AccentYellow),
                                        shape = RoundedCornerShape(12.dp),
                                        modifier = Modifier.testTag("resume_quiz_button")
                                    ) {
                                        Text("Lanjutkan Ujian", color = Color.White, fontWeight = FontWeight.Bold)
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Icon(Icons.Default.PlayArrow, contentDescription = "Play", tint = Color.White, modifier = Modifier.size(16.dp))
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Promotional Banner with nice gradients matching design
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 12.dp)
                        .height(115.dp)
                        .clip(RoundedCornerShape(20.dp))
                ) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(id = R.drawable.img_cpns_banner),
                        contentDescription = "CPNS Header Banner",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(DeepNavy.copy(alpha = 0.95f), Color.Transparent),
                                    startX = 0f,
                                    endX = 600f
                                )
                            )
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(16.dp)
                            .width(220.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "100% GRATIS",
                            color = EmeraldToken,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Tanpa Pendaftaran",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Belajar sepuasnya didukung iklan sponsor",
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 11.sp
                        )
                    }
                }
            }

            // Section: Kategori Utama Ujian CAT CPNS
            item {
                Text(
                    text = "Kategori Ujian Utama",
                    color = DarkText,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 20.dp, bottom = 12.dp)
                )
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Row 1: TWK and TIU
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CategoryCard(
                            title = "TWK",
                            subtitle = "Wawasan Kebangsaan",
                            info = "20 Soal • 20 Menit",
                            icon = Icons.Default.Info,
                            accentColor = Color(0xFF3B82F6), // Blue
                            onClick = { viewModel.startQuiz("TWK") },
                            modifier = Modifier.weight(1f)
                        )

                        CategoryCard(
                            title = "TIU",
                            subtitle = "Inteligensia Umum",
                            info = "20 Soal • 20 Menit",
                            icon = Icons.Default.Star,
                            accentColor = EmeraldToken, // Emerald
                            onClick = { viewModel.startQuiz("TIU") },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Row 2: TKP and TKB
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CategoryCard(
                            title = "TKP",
                            subtitle = "Karakteristik Pribadi",
                            info = "20 Soal • 20 Menit",
                            icon = Icons.Default.Person,
                            accentColor = Color(0xFF8B5CF6), // Purple
                            onClick = { viewModel.startQuiz("TKP") },
                            modifier = Modifier.weight(1f)
                        )

                        CategoryCard(
                            title = "TKB",
                            subtitle = "Kompetensi Bidang",
                            info = "100 Soal • 100 Menit",
                            icon = Icons.AutoMirrored.Filled.List,
                            accentColor = AccentYellow, // Amber/Yellow
                            onClick = {
                                //viewModel.showInterstitialAd {
                                    viewModel.currentScreen.value = Screen.TkbCategory
                               // }
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }

            item { Spacer(modifier = Modifier.height(48.dp)) }
        }
    }
}

@Composable
fun CategoryCard(
    title: String,
    subtitle: String,
    info: String,
    icon: ImageVector,
    accentColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(140.dp)
            .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(20.dp))
            .clickable { onClick() }
            .testTag("category_card_$title"),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(accentColor.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = accentColor,
                    modifier = Modifier.size(22.dp)
                )
            }

            Column {
                Text(
                    text = title,
                    color = DarkText,
                    fontWeight = FontWeight.Black,
                    fontSize = 18.sp,
                    lineHeight = 22.sp
                )
                Text(
                    text = subtitle,
                    color = DarkText.copy(alpha = 0.7f),
                    fontWeight = FontWeight.Bold,
                    fontSize = 11.sp,
                    lineHeight = 14.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = info,
                    color = LightText,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun TkbCategoryScreen(viewModel: QuizViewModel) {
    val fields = listOf(
        Pair("Hukum", "Bidang Hukum, Peradilan, dan HAM"),
        Pair("TIK", "Bidang TI dan Komputer (TIK)"),
        Pair("Sosbud", "Bidang Sosbud dan Keagamaan"),
        Pair("Ekonomi", "Bidang Ekonomi, Keuangan, dan Akuntansi"),
        Pair("Kesehatan", "Bidang Kesehatan dan Medis"),
        Pair("Pendidikan", "Bidang Pendidikan dan Pengajaran"),
        Pair("Administrasi", "Bidang Administrasi, Sekretariat, dan Kebijakan Publik")
    )

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(DeepNavy)
                    .padding(top = 40.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { viewModel.currentScreen.value = Screen.Home },
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Kembali ke Beranda",
                            tint = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Tes Kompetensi Bidang (TKB)",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(OffWhite)
                .padding(innerPadding)
                .padding(horizontal = 24.dp)
        ) {
            item { Spacer(modifier = Modifier.height(20.dp)) }

            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEFF6FF)),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Info TKB",
                            tint = Color(0xFF1D4ED8),
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Pilih sub-bidang keahlian Anda di bawah ini untuk memulai simulasi ujian khusus TKB sebanyak 100 soal.",
                            color = Color(0xFF1E40AF),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 16.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            itemsIndexed(fields) { index, field ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(16.dp))
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { viewModel.startQuiz("TKB_${field.first}") }
                        .testTag("tkb_field_${field.first}"),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(AccentYellow.copy(alpha = 0.12f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = (index + 1).toString(),
                                    color = AccentYellow,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = field.second,
                                color = DarkText,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                lineHeight = 18.sp
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Mulai",
                            tint = DeepNavy,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }

            item { Spacer(modifier = Modifier.height(48.dp)) }
        }
    }
}


// --- QUIZ GAMEPLAY SCREEN ---
@Composable
fun QuizScreen(viewModel: QuizViewModel) {
    val activeQuizType by viewModel.activeQuizType.collectAsState()
    val questions by viewModel.quizQuestions.collectAsState()
    val currentIndex by viewModel.currentQuestionIndex.collectAsState()
    val remainingTime by viewModel.remainingTimeSeconds.collectAsState()
    val answers by viewModel.userAnswers.collectAsState()
    val doubtfulSet by viewModel.doubtfulQuestions.collectAsState()
    val isRevealed by viewModel.revealedExplanations.collectAsState()

    if (questions.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator(color = DeepNavy)
        }
        return
    }

    val currentQuestion = questions[currentIndex]
    val selectedOption = answers[currentQuestion.idSoal]
    val isDoubtful = doubtfulSet.contains(currentQuestion.idSoal)
    val hasUnlockedExplanation = isRevealed.contains(currentQuestion.idSoal)

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(DeepNavy)
                    .padding(top = 40.dp, bottom = 12.dp, start = 16.dp, end = 16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { viewModel.backToHome() },
                        modifier = Modifier.testTag("back_to_home_icon")
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Keluar", tint = Color.White)
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = if (activeQuizType == "KILAT") "Belajar Kilat" else "Simulasi CAT CPNS",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Soal ${currentIndex + 1} dari ${questions.size}",
                            color = Color.White.copy(alpha = 0.7f),
                            fontSize = 13.sp
                        )
                    }

                    // Countdown formatted visual timer
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White.copy(alpha = 0.15f))
                            .padding(horizontal = 12.dp, vertical = 6.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Refresh, // Watch Timer rep
                                contentDescription = "Timer countdown",
                                tint = AccentYellow,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = formatRemainingTime(remainingTime),
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Progress Bar representation
                LinearProgressIndicator(
                    progress = { (currentIndex + 1).toFloat() / questions.size.toFloat() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(CircleShape),
                    color = EmeraldToken,
                    trackColor = Color.White.copy(alpha = 0.2f)
                )
            }
        },
        bottomBar = {
            // Interactive Bottom Panel (Back, Doubt, Next) conforming notch standard
            Surface(
                tonalElevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.navigationBars)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Back Action
                    OutlinedButton(
                        onClick = { viewModel.prevQuestion() },
                        enabled = currentIndex > 0,
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .testTag("button_prev")
                    ) {
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = "Sebelumnya")
                        Text("Kembali", fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    // Ragu-ragu (Doubtful status button)
                    Button(
                        onClick = { viewModel.toggleDoubtful(currentQuestion.idSoal) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isDoubtful) AccentYellow else Color.LightGray.copy(alpha = 0.3f),
                            contentColor = if (isDoubtful) Color.White else DarkText
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1.2f)
                            .testTag("button_doubtful")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Ragu-ragu",
                            tint = if (isDoubtful) Color.White else LightText,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (isDoubtful) "Ragu √" else "Ragu-Ragu",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    // Next/Finish Action
                    val isLast = currentIndex == questions.size - 1
                    Button(
                        onClick = {
                            if (isLast) {
                                viewModel.submitQuiz()
                            } else {
                                viewModel.nextQuestion()
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isLast) LightRed else DeepNavy
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .testTag("button_next")
                    ) {
                        Text(
                            text = if (isLast) "Selesai" else "Next",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                        if (!isLast) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Lanjut")
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(OffWhite)
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            // Category & Sub-category Label
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(
                                when (currentQuestion.kategori) {
                                    "TWK" -> DeepNavy.copy(alpha = 0.1f)
                                    "TIU" -> AccentYellow.copy(alpha = 0.1f)
                                    else -> EmeraldToken.copy(alpha = 0.1f)
                                }
                            )
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = currentQuestion.kategori,
                            color = when (currentQuestion.kategori) {
                                "TWK" -> DeepNavy
                                "TIU" -> AccentYellow
                                else -> EmeraldTokenDark
                            },
                            fontWeight = FontWeight.Black,
                            fontSize = 12.sp
                        )
                    }
                    Text(
                        text = currentQuestion.subKategori,
                        color = LightText,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
                Spacer(modifier = Modifier.height(14.dp))
            }

            // Question Statement Card
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = OffWhiteSurface),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
                ) {
                    Text(
                        text = currentQuestion.pertanyaan,
                        color = DarkText,
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(18.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
            }

            // Options Choice list elements
            itemsIndexed(currentQuestion.pilihan) { index, option ->
                val isSelected = selectedOption == option
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                        .clickable { viewModel.selectOption(currentQuestion.idSoal, option) }
                        .testTag("option_$index"),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = if (isSelected) DeepNavy.copy(alpha = 0.05f) else OffWhiteSurface
                    ),
                    border = BorderStroke(
                        width = if (isSelected) 2.dp else 1.dp,
                        color = if (isSelected) DeepNavy else Color.LightGray.copy(alpha = 0.4f)
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Custom Letter Circle Icon (A, B, C, D, E)
                        val letter = 'A' + index
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(if (isSelected) DeepNavy else Color.LightGray.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = letter.toString(),
                                color = if (isSelected) Color.White else DarkText,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = option,
                            color = DarkText,
                            fontSize = 14.sp,
                            fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,
                            modifier = Modifier.weight(1f)
                        )
                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Terpilih",
                                tint = DeepNavy,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }

            // REVEAL EXPLANATION DIRECT WORKFLOW DURING EXAM (Interactive Cuan Engine testing!)
            item {
                Spacer(modifier = Modifier.height(24.dp))
                if (hasUnlockedExplanation) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, EmeraldToken.copy(alpha = 0.4f), RoundedCornerShape(12.dp)),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0FDF4)), // Emerald 50
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(modifier = Modifier.padding(18.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = "Tebuka",
                                    tint = EmeraldTokenDark
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Pembahasan Terbuka (Token Berhasil Terpotong)",
                                    color = EmeraldTokenDark,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            if (currentQuestion.tipeScoring == "STANDAR") {
                                Text(
                                    text = "Kunci Jawaban: ${currentQuestion.jawabanBenar}",
                                    fontWeight = FontWeight.Bold,
                                    color = DarkText,
                                    fontSize = 14.sp
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                            }
                            Text(
                                text = currentQuestion.pembahasan,
                                color = DarkText,
                                fontSize = 13.sp,
                                lineHeight = 18.sp
                            )
                        }
                    }
                } else {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = Color.LightGray.copy(alpha = 0.15f)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(Icons.Default.Lock, contentDescription = "Locked", tint = LightText)
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = "Buka Jawaban?",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = DarkText
                                    )
                                    Text(
                                        text = "Gunakan 1 Token  untuk membuka kunci jawaban saat ini.",
                                        fontSize = 11.sp,
                                        color = LightText
                                    )
                                }
                            }
                            Button(
                                onClick = { 
                                    viewModel.tryRevealExplanation(currentQuestion.idSoal) {
                                        // unlocked callback
                                    }
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = DeepNavy),
                                modifier = Modifier.testTag("reveal_explanation_button")
                            ) {
                                Text("-1 Token", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                            }
                        }
                    }
                }
            }

            // Quick index navigator helper grid at the bottom
            item {
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Lompat ke Nomor",
                    fontWeight = FontWeight.Bold,
                    color = DarkText,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val start = (currentIndex - 2).coerceAtLeast(0)
                    val end = (currentIndex + 2).coerceAtMost(questions.size - 1)
                    for (i in start..end) {
                        val isCurrent = i == currentIndex
                        val isAnswered = answers.containsKey(questions[i].idSoal)
                        val isQuestionDoubtful = doubtfulSet.contains(questions[i].idSoal)

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    when {
                                        isCurrent -> DeepNavy
                                        isQuestionDoubtful -> AccentYellow
                                        isAnswered -> EmeraldToken
                                        else -> Color.LightGray.copy(alpha = 0.3f)
                                    }
                                )
                                .clickable { viewModel.navigateToQuestion(i) },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = (i + 1).toString(),
                                color = if (isCurrent || isAnswered || isQuestionDoubtful) Color.White else DarkText,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

// --- RESULT SCORE SUMMARY SCREEN ---
@Composable
fun ResultScreen(viewModel: QuizViewModel) {
    val twk by viewModel.scoreTwk.collectAsState()
    val tiu by viewModel.scoreTiu.collectAsState()
    val tkp by viewModel.scoreTkp.collectAsState()
    val activeQuizType by viewModel.activeQuizType.collectAsState()
    val total by viewModel.scoreTotal.collectAsState()

    val passTwk by viewModel.isPassingTWK.collectAsState()
    val passTiu by viewModel.isPassingTIU.collectAsState()
    val passTkp by viewModel.isPassingTKP.collectAsState()
    val passedOverall by viewModel.isPassedOverall.collectAsState()

    val quizType = activeQuizType
    val questions by viewModel.quizQuestions.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite)
            .padding(horizontal = 24.dp)
    ) {
        item { Spacer(modifier = Modifier.height(48.dp)) }

        // Top Crown Graphic Visual Presentation
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(if (passedOverall) EmeraldToken.copy(alpha = 0.15f) else LightRed.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (passedOverall) Icons.Default.CheckCircle else Icons.Default.Warning,
                        contentDescription = "Status Kelulusan",
                        tint = if (passedOverall) EmeraldToken else LightRed,
                        modifier = Modifier.size(48.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = if (passedOverall) "LULUS PASSING GRADE!" else "BELUM LULUS PASSING GRADE",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    color = if (passedOverall) EmeraldTokenDark else LightRed,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Berdasarkan Peraturan Kemenpan-RB: TWK>=60), TIU>=80, TKP>=166)",
                    fontSize = 12.sp,
                    color = LightText,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
        }

        // Circular Score Plate Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = DeepNavyDark),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "SKOR AKHIR AKUMULATIF",
                        color = Color.White.copy(alpha = 0.6f),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "$total Poin",
                        color = AccentYellow,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    // Small horizontal divider line
                    Box(
                        modifier = Modifier
                            .width(120.dp)
                            .height(1.dp)
                            .background(Color.White.copy(alpha = 0.2f))
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    if (quizType.startsWith("TKB_")) {
                        val scoreTkbVal by viewModel.scoreTkb.collectAsState()
                        val passTkbVal by viewModel.isPassingTKB.collectAsState()
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            ScoreBadge(label = "TKB", score = scoreTkbVal, isSuccess = passTkbVal, limit = 300)
                        }
                    } else {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            ScoreBadge(label = "TWK", score = twk, isSuccess = passTwk, limit = if (quizType == "KILAT" || quizType == "TWK") 10 else 60)
                            ScoreBadge(label = "TIU", score = tiu, isSuccess = passTiu, limit = if (quizType == "KILAT" || quizType == "TIU") 10 else 80)
                            ScoreBadge(label = "TKP", score = tkp, isSuccess = passTkp, limit = if (quizType == "KILAT" || quizType == "TKP") 7 else 166)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }

        // Performance review alert message
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = OffWhiteSurface)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Text(
                        text = "Analisis Performa Kategori:",
                        color = DarkText,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                    if (quizType.startsWith("TKB_")) {
                        val scoreTkbVal by viewModel.scoreTkb.collectAsState()
                        val passTkbVal by viewModel.isPassingTKB.collectAsState()
                        CategoryPerformanceRow(category = "TKB (Kompetensi Bidang)", score = scoreTkbVal, pass = passTkbVal, target = 300)
                    } else {
                        CategoryPerformanceRow(category = "TWK (Wawasan Kebangsaan)", score = twk, pass = passTwk, target = if (quizType == "KILAT" || quizType == "TWK") 10 else 65)
                        CategoryPerformanceRow(category = "TIU (Intelektual Umum)", score = tiu, pass = passTiu, target = if (quizType == "KILAT" || quizType == "TIU") 10 else 80)
                        CategoryPerformanceRow(category = "TKP (Karakteristik Pribadi)", score = tkp, pass = passTkp, target = if (quizType == "KILAT" || quizType == "TKP") 7 else 166)
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }

        // List Question Numbers for Review
        item {
            Text(
                text = "Review Pembahasan Soal",
                fontWeight = FontWeight.Bold,
                color = DarkText,
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = OffWhiteSurface)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Pilih nomor soal di bawah ini untuk melihat ulasan kunci jawaban dan pembahasan detil:",
                        color = LightText,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )

                    // Draw custom grids of circular numbers
                    FlowRowWithCustomCount(total = questions.size) { index ->
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(DeepNavy.copy(alpha = 0.08f))
                                .clickable {
                                    viewModel.currentQuestionIndex.value = index
                                    viewModel.currentScreen.value = Screen.Review
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = (index + 1).toString(),
                                color = DeepNavy,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
        }

        // Home Navigation Button
        item {
            Button(
                onClick = { viewModel.backToHome() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .testTag("result_back_to_home"),
                colors = ButtonDefaults.buttonColors(containerColor = DeepNavy),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Kembali ke Beranda",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(48.dp))
        }
    }
}

// Custom flow-like wrap row layout helper since standard FlowRow is part of compose foundation layout experimental or newer
@Composable
fun FlowRowWithCustomCount(total: Int, content: @Composable (Int) -> Unit) {
    Column {
        var cursor = 0
        while (cursor < total) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(6) {
                    if (cursor < total) {
                        Box(modifier = Modifier.weight(1f)) {
                            content(cursor++)
                        }
                    } else {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun ScoreBadge(label: String, score: Int, isSuccess: Boolean, limit: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = label,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
        Text(
            text = "$score",
            color = if (isSuccess) EmeraldToken else Color(0xFFFCA5A5), // Red 300
            fontSize = 20.sp,
            fontWeight = FontWeight.Black
        )
        Text(
            text = "Pass: $limit",
            color = Color.White.copy(alpha = 0.5f),
            fontSize = 10.sp
        )
    }
}

@Composable
fun CategoryPerformanceRow(category: String, score: Int, pass: Boolean, target: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = category,
                color = DarkText,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "Nilai diperoleh: $score (Ambang batas minimum: $target)",
                color = LightText,
                fontSize = 11.sp
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(6.dp))
                .background(if (pass) EmeraldToken.copy(alpha = 0.15f) else LightRed.copy(alpha = 0.15f))
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = if (pass) "√ LULUS" else "X GAGAL",
                color = if (pass) EmeraldTokenDark else LightRed,
                fontWeight = FontWeight.Bold,
                fontSize = 11.sp
            )
        }
    }
}

// --- REVIEW DETAILED ANSWER SCREEN ---
@Composable
fun ReviewScreen(viewModel: QuizViewModel) {
    val questions by viewModel.quizQuestions.collectAsState()
    val currentIndex by viewModel.currentQuestionIndex.collectAsState()
    val answers by viewModel.userAnswers.collectAsState()
    val isRevealed by viewModel.revealedExplanations.collectAsState()

    val currentQuestion = questions[currentIndex]
    val selectedOption = answers[currentQuestion.idSoal]
    val hasUnlockedExplanation = isRevealed.contains(currentQuestion.idSoal)

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(DeepNavy)
                    .padding(top = 40.dp, bottom = 12.dp, start = 16.dp, end = 16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { viewModel.currentScreen.value = Screen.Result }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali ke Skor", tint = Color.White)
                    }

                    Text(
                        text = "Review Soal ${currentIndex + 1}",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.width(48.dp))
                }
            }
        },
        bottomBar = {
            Surface(
                tonalElevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.navigationBars)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { viewModel.prevQuestion() },
                        enabled = currentIndex > 0,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = DeepNavy)
                    ) {
                        Text("Sebelumnya")
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = { viewModel.nextQuestion() },
                        enabled = currentIndex < questions.size - 1,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = DeepNavy)
                    ) {
                        Text("Selanjutnya")
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(OffWhite)
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Kategori: ${currentQuestion.kategori} - ${currentQuestion.subKategori}",
                        color = LightText,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )

                    // 🎯 SINKRONISASI TOTAL: Pembersihan prefiks huruf (A-E) untuk evaluasi UI yang adil
                    val cleanUserSelected = (selectedOption ?: "").trim()
                        .replace(Regex("^[A-Ea-e]\\.\\s*"), "")
                        .trim()

                    val cleanCorrectAnswer = (currentQuestion.jawabanBenar ?: "").trim()
                        .replace(Regex("^[A-Ea-e]\\.\\s*"), "")
                        .trim()
// 🛑 2. Kunci status: Dianggap benar jika user menjawab DAN teksnya cocok
                    val isCorrect = cleanUserSelected.equals(cleanCorrectAnswer, ignoreCase = true)

                    if (currentQuestion.tipeScoring == "STANDAR") {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                // 🎯 Gunakan variabel isCorrect yang sudah bersih
                                .background(if (isCorrect) EmeraldToken.copy(alpha = 0.15f) else LightRed.copy(alpha = 0.15f))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                // 🎯 Gunakan variabel isCorrect yang sudah bersih
                                text = if (isCorrect) "BENAR (+5)" else "SALAH (0)",
                                color = if (isCorrect) EmeraldTokenDark else LightRed,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp
                            )
                        }
                    } else {
                        // 🧽 TKP Scoring results (Aman dari spasi gaib database)
                        val pt = currentQuestion.skalaPoin?.entries?.firstOrNull {
                            it.key.trim().equals(cleanUserSelected, ignoreCase = true)
                        }?.value ?: 0

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(EmeraldToken.copy(alpha = 0.15f))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = "Poin Diperoleh: $pt",
                                color = EmeraldTokenDark,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(14.dp))
            }

            // Question Text Card
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = OffWhiteSurface),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = currentQuestion.pertanyaan,
                        color = DarkText,
                        fontSize = 15.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(18.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
            }

            // Options List Review View
            // Options List Review View
            itemsIndexed(currentQuestion.pilihan) { index, option ->
                val cleanOption = option.trim()
                val cleanSelectedOption = selectedOption?.trim() ?: ""
                val cleanCorrectAnswer = (currentQuestion.jawabanBenar ?: "").replace(Regex("^[A-Ea-e]\\.\\s*"), "").trim()

                // 🛑 KUNCI KEDUA: Logika baru, pastikan user memang memilih (tidak kosong)
                val isSelected = cleanSelectedOption.isNotEmpty() && cleanSelectedOption == cleanOption

                // Soal dianggap benar jika: Jawaban cocok DAN user tidak menskip soal tersebut
                val isAnswerTrue = currentQuestion.tipeScoring == "STANDAR" &&
                        cleanOption.equals(cleanCorrectAnswer, ignoreCase = true) &&
                        cleanSelectedOption.isNotEmpty() // ◄ Tambahkan ini agar kalau skip tidak jadi hijau
                // Khusus SKALA (TKP), cari poin dengan mencocokkan key yang sudah di-trim
                val optionPoints = currentQuestion.skalaPoin?.entries?.firstOrNull {
                    it.key.trim().equals(cleanOption, ignoreCase = true)
                }?.value ?: 0

                val cardBg = when {
                    isSelected && isAnswerTrue -> Color(0xFFEFF6FF) // light blue
                    isAnswerTrue -> Color(0xFFF0FDF4) // Light emerald
                    isSelected && !isAnswerTrue -> Color(0xFFFEF2F2) // Light red
                    else -> OffWhiteSurface
                }

                val borderCol = when {
                    isSelected && isAnswerTrue -> DeepNavy
                    isAnswerTrue -> EmeraldToken
                    isSelected && !isAnswerTrue -> LightRed
                    else -> Color.LightGray.copy(alpha = 0.3f)
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(containerColor = cardBg),
                    border = BorderStroke(1.dp, borderCol)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val ch = 'A' + index
                        // Tetap tampilkan teks asli bawaan database biar tidak merusak layout
                        Text(
                            text = "$ch.$option", // Di sini kita buang spasinya karena di "$option" Anda sudah ada spasi bawaan
                            color = DarkText,
                            fontSize = 13.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        if (currentQuestion.tipeScoring == "SKALA") {
                            Text(
                                text = "[$optionPoints Poin]",
                                color = if (isSelected) DeepNavy else LightText,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp
                            )
                        } else {
                            if (isAnswerTrue) {
                                Icon(Icons.Default.Check, contentDescription = "Kunci", tint = EmeraldToken)
                            } else if (isSelected) {
                                Icon(Icons.Default.Close, contentDescription = "Pilihan Anda", tint = LightRed)
                            }
                        }
                    }
                }
            }
            // Locked/Unlocked Pembahasan area (Token security represented)
            item {
                Spacer(modifier = Modifier.height(24.dp))
                if (hasUnlockedExplanation) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = OffWhiteSurface),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Pembahasan Lengkap:",
                                fontWeight = FontWeight.Bold,
                                color = DeepNavy,
                                fontSize = 14.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = currentQuestion.pembahasan,
                                color = DarkText,
                                fontSize = 13.sp,
                                lineHeight = 18.sp
                            )
                        }
                    }
                } else {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = Color.LightGray.copy(alpha = 0.15f)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(Icons.Default.Lock, contentDescription = "Locked", tint = LightText)
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = "Ulasan Pembahasan Terkunci",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = DarkText
                                    )
                                    Text(
                                        text = "Gunakan 1 Token untuk membaca.",
                                        fontSize = 11.sp,
                                        color = LightText
                                    )
                                }
                            }
                            Button(
                                onClick = {
                                    viewModel.tryRevealExplanation(currentQuestion.idSoal) {}
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = DeepNavy)
                            ) {
                                Text("-1 Token", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

// ============================================================================
// --- OVERLAYS: SIMULATED ADMOB AD SCREEN DIALOG (TIDAK DIPAKAI LAGI) ---
// Dikomentari karena sudah menggunakan SDK Google AdMob Asli
// ============================================================================
/*
@Composable
fun SimulatedAdmobAdDialog(viewModel: QuizViewModel) {
    val countdown by viewModel.rewardAdCountdown.collectAsState()

    Dialog(
        onDismissRequest = {}, // Disallow cancellation to simulate realistic rewarded ads constraints
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Top row countdown panel label
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color.White.copy(alpha = 0.2f))
                            .padding(horizontal = 10.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Iklan Sponsor AdMob",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "$countdown",
                            color = Color.White,
                            fontWeight = FontWeight.Black,
                            fontSize = 14.sp
                        )
                    }
                }

                // Simulated Premium Video Player content container
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Simulated Video Player Action icon",
                        tint = EmeraldToken,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Video Sponsor CPNS...",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Jangan tutup layar! Sisa waktu menonton video $countdown detik untuk mengklaim token gratis Anda.",
                        color = Color.White.copy(alpha = 0.6f),
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    // Decorative progress bar animating simulation
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .height(6.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(((5 - countdown).toFloat() / 5f).coerceIn(0f, 1f))
                                .fillMaxHeight()
                                .background(EmeraldToken)
                        )
                    }
                }

                // Banner promo under the player
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.DarkGray.copy(alpha = 0.4f)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Star, contentDescription = "Premium icon indicator", tint = AccentYellow)
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "CAT CPNS/PPPK Premium Sponsor",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp
                            )
                            Text(
                                text = "Menyediakan latihan CPNS dan PPPK 100% Bebas Biaya untuk Masa Depan Anda",
                                color = Color.White.copy(alpha = 0.7f),
                                fontSize = 11.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
*/

// --- OVERLAYS: INSUFFICIENT TOKEN DIALOG ---
@Composable
fun InsufficientTokenDialog(viewModel: QuizViewModel) {
    AlertDialog(
        onDismissRequest = { viewModel.showInsufficientTokenDialog.value = false },
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Lock, contentDescription = "Kunci", tint = LightRed)
                Spacer(modifier = Modifier.width(10.dp))
                Text("Token Habis!", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = DarkText)
            }
        },
        text = {
            Text(
                "Token Anda habis. Ambil +5 token GRATIS dengan menonton iklan sponsor, instan dan aman!",
                fontSize = 14.sp,
                color = DarkText
            )
        },
        confirmButton = {
            Button(
                onClick = {
                    // Tutup dialog Token Habis lebih dulu
                    viewModel.showInsufficientTokenDialog.value = false

                    // Pemicu untuk memunculkan iklan AdMob asli lewat state
                    viewModel.triggerAdmobRewardedVideo()
                },
                colors = ButtonDefaults.buttonColors(containerColor = EmeraldToken),
                modifier = Modifier.testTag("ad_watch_confirm_button")
            ) {
                Text("Tonton Iklan (+5)", fontWeight = FontWeight.Bold, color = Color.White)
            }
        },
        dismissButton = {
            TextButton(
                onClick = { viewModel.showInsufficientTokenDialog.value = false },
                modifier = Modifier.testTag("ad_watch_cancel_button")
            ) {
                Text("Nanti Saja", color = LightText)
            }
        },
        shape = RoundedCornerShape(16.dp),
        containerColor = OffWhiteSurface
    )
}
// --- UTIL HELPER FORMAT REMAINING TIME ---
private fun formatRemainingTime(seconds: Long): String {
    val m = seconds / 60
    val s = seconds % 60
    return String.format(Locale.getDefault(), "%02d:%02d", m, s)
}
