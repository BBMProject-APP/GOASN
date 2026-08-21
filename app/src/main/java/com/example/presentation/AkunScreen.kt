package com.example.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.DeepNavy
import com.example.ui.theme.OffWhite

@Composable
fun AkunScreen(viewModel: QuizViewModel) {
    val context = LocalContext.current
    val currentUsername by viewModel.usernameState.collectAsState()
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) {
        viewModel.initUsername(context)
    }

    var inputNama by remember(currentUsername) {
        mutableStateOf(if (currentUsername == "Andi Pratama") "" else currentUsername)
    }

    val isButtonEnabled = inputNama.isNotBlank()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite)
            .padding(16.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Pengaturan Akun",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = DeepNavy,
            modifier = Modifier.align(Alignment.Start).padding(bottom = 24.dp)
        )

        // 💳 1. KARTU PENGATURAN PROFIL
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                Text(text = "Ubah Nama Profil", fontWeight = FontWeight.Bold, fontSize = 16.sp)

                OutlinedTextField(
                    value = inputNama,
                    onValueChange = { newValue: String -> inputNama = newValue },
                    label = { Text("Nama Lengkap") },
                    placeholder = { Text("Masukkan nama asli Anda...") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Button(
                    onClick = {
                        viewModel.saveUsername(context, inputNama.trim())
                        android.widget.Toast.makeText(context, "Profil Berhasil Diperbarui!", android.widget.Toast.LENGTH_SHORT).show()
                        viewModel.currentScreen.value = Screen.Home
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = isButtonEnabled,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = DeepNavy,
                        disabledContainerColor = androidx.compose.ui.graphics.Color.LightGray
                    )
                ) {
                    Text(
                        text = "Simpan Perubahan",
                        color = if (isButtonEnabled) androidx.compose.ui.graphics.Color.White else androidx.compose.ui.graphics.Color.DarkGray
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // 📘 2. KARTU PETUNJUK PENGGUNAAN APLIKASI
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(Icons.Default.Info, contentDescription = "Panduan", tint = DeepNavy)
                    Text(
                        text = "Petunjuk Penggunaan Aplikasi",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = DeepNavy
                    )
                }

                HorizontalDivider()

                PanduanItem(nomor = "1", teks = "Pilih materi ujian di halaman utama (TWK, TIU, TKP, atau Bidang TKB) untuk memulai simulasi kuis.")
                PanduanItem(nomor = "2", teks = "Setiap sesi kuis TKB dibatasi waktu 100 menit untuk menyelesaikan total 100 butir soal secara taktis.")
                PanduanItem(nomor = "3", teks = "Aplikasi dilengkapi Auto-Save Engine, sehingga kuis Anda tidak akan hilang meskipun aplikasi tertutup tidak sengaja.")
                PanduanItem(nomor = "4", teks = "Lihat riwayat nilai, grafik skor tertinggi, serta akumulasi status kelulusan Anda pada menu Statistik.")
                PanduanItem(nomor = "5", teks = "Pastikan mengubah nama profil di atas agar piagam hasil skor tryout akhir Anda tercetak dengan nama asli.")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // 🛡️ 3. KARTU DISCLAIMER & SUMBER INFORMASI RESMI (TAKTIK LOLOS CEKALAN GOOGLE)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(Icons.Default.Warning, contentDescription = "Disclaimer", tint = MaterialTheme.colorScheme.error)
                    Text(
                        text = "Informasi & Disclaimer Hukum",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.error
                    )
                }

                HorizontalDivider()

                Text(
                    text = "Aplikasi ini dirancang murni sebagai media simulasi mandiri dan latihan soal untuk membantu persiapan seleksi. Aplikasi ini BUKAN aplikasi resmi pemerintah dan TIDAK mewakili, berafiliasi, atau didukung oleh entitas pemerintah Republik Indonesia mana pun (seperti BKN atau Kemenpan-RB).",
                    fontSize = 13.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 18.sp
                )

                HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))

                Text(
                    text = "Tautan Sumber Informasi Resmi:",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = DeepNavy
                )

                SumberInformasiItem(label = "Portal Seleksi CASN", url = "https://sscasn.bkn.go.id")
                SumberInformasiItem(label = "Situs Resmi BKN", url = "https://www.bkn.go.id")
                SumberInformasiItem(label = "Situs Resmi Kemenpan-RB", url = "https://menpan.go.id")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // 🔙 4. TOMBOL KEMBALI KE HOME
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { viewModel.currentScreen.value = Screen.Home }
                .align(Alignment.Start)
                .padding(vertical = 8.dp)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali", tint = DeepNavy)
            Spacer(modifier = Modifier.width(14.dp))
            Text(text = "KEMBALI", color = DeepNavy, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
    }
}

@Composable
fun PanduanItem(nomor: String, teks: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "$nomor.",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = DeepNavy,
            modifier = Modifier.width(20.dp)
        )
        Text(
            text = teks,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 20.sp
        )
    }
}

@Composable
fun SumberInformasiItem(label: String, url: String) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(vertical = 2.dp)
    ) {
        Text(
            text = "• $label:",
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            text = url,
            fontSize = 12.sp,
            color = DeepNavy,
            modifier = Modifier.padding(start = 12.dp)
        )
    }
}