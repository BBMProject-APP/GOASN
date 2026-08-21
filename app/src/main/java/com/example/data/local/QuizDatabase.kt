package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.data.model.QuestionEntity
import com.example.data.model.TokenEntity
import com.example.data.model.UserSessionEntity
import com.example.data.soal.BankSoal // Import BankSoal Anda
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(
    entities = [QuestionEntity::class, UserSessionEntity::class, TokenEntity::class],
    version = 3, // 🎯 Tetap versi 3, aman!
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao

    companion object {
        @Volatile
        private var INSTANCE: QuizDatabase? = null

        fun getDatabase(context: Context): QuizDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizDatabase::class.java,
                    "cat_cpns_database"
                )
                    .fallbackToDestructiveMigration(dropAllTables = true)
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            // 🎯 AMANKAN SEEDING: Jalankan Coroutine IO secara mandiri
                            CoroutineScope(Dispatchers.IO).launch {
                                try {
                                    // Ambil INSTANCE yang sudah ter-inisialisasi tanpa memanggil getDatabase() lagi!
                                    INSTANCE?.let { database ->
                                        val dao = database.quizDao()
                                        val daftarSoal = BankSoal.ambilSemuaSoal()

                                        if (daftarSoal.isNotEmpty()) {
                                            dao.insertQuestions(daftarSoal)
                                            android.util.Log.d("DB_INIT", "BERHASIL: Memasukkan ${daftarSoal.size} soal ke database.")
                                        } else {
                                            android.util.Log.e("DB_INIT", "GAGAL: BankSoal.ambilSemuaSoal() kosong!")
                                        }
                                    }
                                } catch (e: Exception) {
                                    android.util.Log.e("DB_INIT", "ERROR saat seeding database: ${e.message}")
                                    e.printStackTrace()
                                }
                            }
                        }
                    })
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private fun roomCallback(context: Context) = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)

                // Jalankan di Coroutine IO
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        // Gunakan INSTANCE yang sedang dibuat, panggil quizDao() langsung
                        val dao = getDatabase(context).quizDao()
                        val daftarSoal = BankSoal.ambilSemuaSoal()

                        if (daftarSoal.isNotEmpty()) {
                            dao.insertQuestions(daftarSoal)
                            android.util.Log.d("DB_INIT", "BERHASIL: Memasukkan ${daftarSoal.size} soal ke database.")
                        } else {
                            android.util.Log.e("DB_INIT", "GAGAL: BankSoal.ambilSemuaSoal() mengembalikan list kosong!")
                        }
                    } catch (e: Exception) {
                        android.util.Log.e("DB_INIT", "ERROR saat seeding database: ${e.message}")
                        e.printStackTrace()
                    }
                }
            }
        }
    }
}