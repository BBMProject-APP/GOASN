package com.example.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tokens")
data class TokenEntity(
    @PrimaryKey
    val id: Int = 1,

    @ColumnInfo(name = "token_count")
    val tokenCount: Int
)
