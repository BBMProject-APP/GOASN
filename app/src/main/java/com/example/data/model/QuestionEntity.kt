package com.example.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity(tableName = "questions")
@JsonClass(generateAdapter = true)
data class QuestionEntity(
    @PrimaryKey
    @field:ColumnInfo(name = "id_soal")
    @field:Json(name = "id_soal")
    val idSoal: String,

    @field:ColumnInfo(name = "kategori")
    val kategori: String, // TWK, TIU, TKP

    @field:ColumnInfo(name = "sub_kategori")
    @field:Json(name = "sub_kategori")
    val subKategori: String,

    @field:ColumnInfo(name = "pertanyaan")
    val pertanyaan: String,

    @field:ColumnInfo(name = "pilihan")
    val pilihan: List<String>,

    @field:ColumnInfo(name = "tipe_scoring")
    @field:Json(name = "tipe_scoring")
    val tipeScoring: String, // STANDAR, SKALA

    @field:ColumnInfo(name = "jawaban_benar")
    @field:Json(name = "jawaban_benar")
    val jawabanBenar: String?, // Nullable for TKP

    @field:ColumnInfo(name = "skala_poin")
    @field:Json(name = "skala_poin")
    val skalaPoin: Map<String, Int>? = null, // Nullable for TWK/TIU

    @field:ColumnInfo(name = "pembahasan")
    val pembahasan: String
)
