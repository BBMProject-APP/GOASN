package com.example.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_sessions")
data class UserSessionEntity(
    @PrimaryKey val id: Int = 1,
    val isCompleted: Boolean = false,
    val currentQuestionIndex: Int = 0,
    val activeQuizType: String = "",
    // 🎯 TAMBAHKAN KOLOM SKOR & KELULUSAN INI:
    val lastScoreTotal: Int = 0,
    val lastScoreTwk: Int = 0,
    val lastScoreTiu: Int = 0,
    val lastScoreTkp: Int = 0,
    val lastScoreTkb: Int = 0,
    val isPassed: Boolean = false
)