package com.example.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.* // 🎯 MENGGUNAKAN MATERIAL 3 SECARA PENUH
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Warna Premium Taktis
private val NavyDark = Color(0xFF1E293B)
private val GoldAccent = Color(0xFFF59E0B)
private val GreenSuccess = Color(0xFF10B981)
private val RedAlert = Color(0xFFEF4444)
private val CardBg = Color(0xFFF8FAFC)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatistikScreen(
    viewModel: QuizViewModel,
    onBackClick: () -> Unit,
) {
    // 🎯 OBSERVING RADAR DATA LINTAS HALAMAN
    val scoreTwk by viewModel.scoreTwk.collectAsState()
    val scoreTiu by viewModel.scoreTiu.collectAsState()
    val scoreTkp by viewModel.scoreTkp.collectAsState()
    val scoreTkb by viewModel.scoreTkb.collectAsState()
    val scoreTotal by viewModel.scoreTotal.collectAsState()

    val isPassingTWK by viewModel.isPassingTWK.collectAsState()
    val isPassingTIU by viewModel.isPassingTIU.collectAsState()
    val isPassingTKP by viewModel.isPassingTKP.collectAsState()
    val isPassingTKB by viewModel.isPassingTKB.collectAsState()
    val isPassedOverall by viewModel.isPassedOverall.collectAsState()
    val username by viewModel.usernameState.collectAsState()


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pusat Statistik CASN/CPPPK", fontWeight = FontWeight.Bold, color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = NavyDark)
            )
        }
    ) { paddingValues: PaddingValues -> // 🎯 FIKSASI PRESISI: Tipe data dideklarasikan eksplisit
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.White)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // ==================== BANNER APRESIASI DINAMIS ====================
            AnimatedVisibility(
                visible = true,
                enter = fadeIn() + expandVertically()
            ) {
                if (isPassedOverall) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Brush.horizontalGradient(listOf(Color(0xFF059669), GreenSuccess)))
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(Icons.Default.Star, contentDescription = "Lulus", tint = GoldAccent, modifier = Modifier.size(48.dp))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "SELAMAT, $username!",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "ANDA DINYATAKAN LULUS Simulasi TES CPNS/PPPK! Total Nilai Anda Melampaui Syarat 510 Poin. Pertahankan dengan terus berlatih!",
                            fontSize = 14.sp,
                            color = Color.White.copy(alpha = 0.9f),
                            textAlign = TextAlign.Center
                        )
                    }
                } else {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Brush.horizontalGradient(listOf(Color(0xFF059669), RedAlert)))
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "TETAP SEMANGAT, $username!",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Syarat kelulusan belum terpenuhi  (Minimal 70 per SKD & 350 pada TKB). Jangan menyerah, teruslah berlatih, Anda pasti berhasil!",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.9f),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // ==================== TOTAL SCORE BOARD ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = CardBg)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "AKUMULASI NILAI CAT ANDA", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "$scoreTotal / 800",
                        fontSize = 42.sp,
                        fontWeight = FontWeight.Black,
                        color = NavyDark
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(if (isPassedOverall) GreenSuccess.copy(alpha = 0.15f) else RedAlert.copy(alpha = 0.15f))
                            .padding(horizontal = 16.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = if (isPassedOverall) "STATUS: MEMENUHI SYARAT KELULUSAN (MIN 510)" else "STATUS: BELUM LULUS / BELUM SELESAI",
                            color = if (isPassedOverall) Color(0xFF047857) else Color(0xFFB91C1C),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Rincian Hasil Tes Kompetensi",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = NavyDark,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(10.dp))

// ==================== LIST DETAIL SKD & TKB ====================
// 1. TWK & TIU dipanggil normal dengan ambang batas baru BKN
            CompetencyRow("Tes Wawasan Kebangsaan (TWK)", scoreTwk, 100, 60, isPassingTWK)
            CompetencyRow("Tes Inteligensia Umum (TIU)", scoreTiu, 100, 80, isPassingTIU)

// 🎯 KUNCI UTAMA: Konversi dulu skor murni TKP (0-100) ke Skala BKN (0-225) sebelum dimasukkan ke dalam cetakan
            val scoreTkpBkn = ((scoreTkp.toFloat() / 100f) * 225f).toInt().coerceIn(0, 225)
            CompetencyRow("Tes Karakteristik Pribadi (TKP)", scoreTkpBkn, 225, 166, isPassingTKP)

// 4. TKB dipanggil normal
            CompetencyRow("Tes Kompetensi Bidang (TKB - Bidang Anda)", scoreTkb, 500, 350, isPassingTKB)
            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = onBackClick,
                colors = ButtonDefaults.buttonColors(containerColor = NavyDark),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Kembali ke DASHBOARD", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun CompetencyRow(
    title: String,
    score: Int,
    maxScore: Int,
    targetScore: Int,
    isPassed: Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = NavyDark)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Skor: $score / $maxScore (Ambang batas: $targetScore)",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(6.dp))
                LinearProgressIndicator(
                    progress = { (score.toFloat() / maxScore.toFloat()).coerceIn(0f, 1f) },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = if (isPassed) GreenSuccess else Color(0xFFCBD5E1),
                    trackColor = Color(0xFFE2E8F0)
                )
            }

            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(if (isPassed) GreenSuccess.copy(alpha = 0.1f) else RedAlert.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                if (isPassed) {
                    Icon(Icons.Default.CheckCircle, contentDescription = "LOLOS", tint = GreenSuccess, modifier = Modifier.size(24.dp))
                } else {
                    Icon(Icons.Default.Close, contentDescription = "GAGAL", tint = RedAlert, modifier = Modifier.size(24.dp))
                }
            }
        }
    }
}