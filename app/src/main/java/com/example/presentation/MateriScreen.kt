package com.example.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.offset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.DeepNavy
import com.example.ui.theme.OffWhite


@Composable
fun MateriScreen(viewModel: QuizViewModel) {
    // 📊 1. Tambahkan menu TWK, TIU, dan TKP di urutan paling atas list
    val listMateriSemua = listOf(
        "Tes Wawasan Kebangsaan (TWK)",
        "Tes Inteligensia Umum (TIU)",
        "Tes Karakteristik Pribadi (TKP)",
        "TKB Administrasi",
        "TKB Kesehatan",
        "TKB Pendidikan",
        "TKB Hukum & HAM",
        "TKB Teknis & IT",
        "TKB Keuangan",
        "TKB Sosbud"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite)
            .padding(16.dp)
    ) {

        // 📝 2. JUDUL HALAMAN
        Text(
            text = "Materi Pokok CAT CPNS", // Diubah sedikit agar universal
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = DeepNavy,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // 📋 3. DAFTAR KATEGORI KUIS (Sekarang mencakup semua materi)
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            itemsIndexed(listMateriSemua) { _, materi ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .clickable {
                            // 🚀 PEMETAAN MATERI: Menentukan tipe quiz berdasarkan teks menu
                            val quizType = when (materi) {
                                "Tes Wawasan Kebangsaan (TWK)" -> "TWK"
                                "Tes Inteligensia Umum (TIU)"  -> "TIU"
                                "Tes Karakteristik Pribadi (TKP)" -> "TKP"
                                "TKB Administrasi"  -> "TKB_Administrasi"
                                "TKB Kesehatan"  -> "TKB_Kesehatan"
                                "TKB Pendidikan" -> "TKB_Pendidikan"
                                "TKB Hukum & HAM"-> "TKB_Hukum"
                                "TKB Teknis & IT"-> "TKB_TIK"
                                "TKB Keuangan"   -> "TKB_Ekonomi"
                                else             -> "TKB_Sosbud"
                            }

                            // 🎯 CEGAT DENGAN IKLAN INTERSTITIAL SEBELUM MEMULAI KUIS
                           // TODO viewModel.showInterstitialAd {//
                                viewModel.startQuiz(quizType)
                            //}//
                        },
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                ) {
                    // Isi komponen Row, Icon Info, dan ArrowForward milik Anda tetap sama...
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Icon(Icons.Default.Info, contentDescription = null, tint = DeepNavy)
                            Text(text = materi, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                        }
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        // 🔙 TOMBOL KEMBALI KE HOME
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .offset(y = (-10).dp)
                .clickable { viewModel.currentScreen.value = Screen.Home }
                .padding(vertical = 10.dp)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali", tint = DeepNavy)
            Spacer(modifier = Modifier.width(14.dp))
            Text(text = "KEMBALI", color = DeepNavy, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}