package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModelProvider
import com.example.data.local.QuizDatabase
import com.example.data.repository.QuizRepository
import com.example.presentation.AppContent
import com.example.presentation.QuizViewModel
import com.example.presentation.QuizViewModelFactory
import com.example.ui.theme.CATCPNSTheme 
import com.google.android.gms.ads.MobileAds
import android.content.SharedPreferences
import androidx.core.content.edit

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    val splashScreen = installSplashScreen()
    super.onCreate(savedInstanceState)
    MobileAds.initialize(this) {}
    enableEdgeToEdge()

    val database = QuizDatabase.getDatabase(this)
    val repository = QuizRepository(database.quizDao())

    val viewModel = ViewModelProvider(
      this,
      QuizViewModelFactory(repository)
    )[QuizViewModel::class.java]

    splashScreen.setKeepOnScreenCondition {
      viewModel.isLoading.value
    }

    val sharedPreferences = getSharedPreferences("app_policy_prefs", MODE_PRIVATE)
    val hasAcceptedDisclaimer = sharedPreferences.getBoolean("disclaimer_accepted", false)

    setContent {
      CATCPNSTheme {
        MainScreen(viewModel, sharedPreferences, hasAcceptedDisclaimer)
      }
    }
  }
}

@Composable
fun MainScreen(
  viewModel: QuizViewModel,
  sharedPreferences: SharedPreferences,
  hasAcceptedDisclaimer: Boolean
) {
  Surface(
    modifier = Modifier.fillMaxSize()
  ) {
    var showDialog by remember { mutableStateOf(!hasAcceptedDisclaimer) }

    AppContent(viewModel = viewModel)

    if (showDialog) {
      GovernmentDisclaimerDialog {
        sharedPreferences.edit { putBoolean("disclaimer_accepted", true) }
        showDialog = false
      }
    }
  }
}

@Composable
fun GovernmentDisclaimerDialog(onDismiss: () -> Unit) {
  AlertDialog(
    onDismissRequest = { },
    title = {
      Text(
        text = "Pernyataan Penting (Disclaimer)",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
      )
    },
    text = {
      Text(
        text = "Aplikasi ini adalah media pembelajaran mandiri (Latihan Soal) yang dikembangkan secara independen.\n\n" +
                "Aplikasi ini TIDAK berafiliasi, tidak didukung, dan TIDAK mewakili entitas pemerintah Republik Indonesia manapun (termasuk BKN atau Kemenpan-RB).\n\n" +
                "Seluruh materi simulasi kuis didalamnya dihimpun secara mandiri dari kisi-kisi umum publik untuk tujuan edukasi persiapan ujian.",
        fontSize = 14.sp,
        lineHeight = 20.sp
      )
    },
    confirmButton = @Composable{
      TextButton(onClick = onDismiss) {
        Text(
          text = "SAYA MENGERTI & SETUJU",
          fontWeight = FontWeight.Bold,
          fontSize = 14.sp
        )
      }
    }
  )
}