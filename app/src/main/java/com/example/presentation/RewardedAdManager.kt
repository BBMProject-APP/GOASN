package com.example.presentation

import android.app.Activity
import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

class RewardedAdManager(private val context: Context) {
    private var rewardedAd: RewardedAd? = null

    // MASUKKAN AD UNIT ID REWARDED ASLI ANDA DI SINI
    private val adUnitId = "ca-app-pub-8960108261064180/1084459876"

    // 1. Fungsi untuk mendownload/load iklan di background
    fun loadAd(onAdLoaded: () -> Unit = {}, onAdFailed: () -> Unit = {}) {
        val adRequest = AdRequest.Builder().build()
        RewardedAd.load(context, adUnitId, adRequest, object : RewardedAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                rewardedAd = null
                onAdFailed()
            }

            override fun onAdLoaded(ad: RewardedAd) {
                rewardedAd = ad
                onAdLoaded()
            }
        })
    }

    // 2. Fungsi untuk menampilkan iklan ke layar
    fun showAd(activity: Activity, onRewardEarned: () -> Unit, onAdDismissed: () -> Unit) {
        rewardedAd?.let { ad ->
            ad.show(activity) { rewardItem ->
                // User menonton iklan sampai selesai -> Panggil callback reward
                onRewardEarned()
            }
            // Setelah iklan ditutup, kosongkan dan load lagi iklan baru untuk kesempatan berikutnya
            rewardedAd = null
            loadAd()
        } ?: run {
            // Jika iklan belum siap saat tombol ditekan
            onAdDismissed()
            loadAd()
        }
    }
}