package com.example.data.soal
import com.example.data.model.QuestionEntity

object BankSoal {
    fun ambilSemuaSoal(): List<QuestionEntity> {
        return  SoalTWK.daftarSoal +
                SoalTIU.daftarSoal +
                SoalTKP.daftarSoal +
                SoalPendidikan.daftarSoal +
                SoalKesehatan.daftarSoal +
                SoalHukum.daftarSoal +
                SoalEkonomi.daftarSoal +
                SoalAdministrasi.daftarSoal +
                SoalSosbud.daftarSoal +
                SoalTIK.daftarSoal

    }
}