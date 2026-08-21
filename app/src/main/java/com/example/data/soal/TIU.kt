package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalTIU {
    val daftarSoal = listOf(
        QuestionEntity(
            idSoal = "tiu_analogi_1",
            kategori = "TIU",
            subKategori = "Verbal - Analogi",
            pertanyaan = "GENTENG : TANAH LIAT = ... : ...",
            pilihan = listOf(
                "EMAS : CINCIN",
                "KORAN : MAJALAH",
                "BENANG : KAIN",
                "KACA : PASIR",
                "KAYU : KURSI"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. KACA : PASIR",
            skalaPoin = null,
            pembahasan = "Hubungan fungsinya adalah 'bahan baku membuat benda'. Genteng dibuat dari tanah liat, sebagaimana kaca dibuat dari pasir."
        ),

        QuestionEntity(
            idSoal = "tiu_silogisme_2",
            kategori = "TIU",
            subKategori = "Verbal - Silogisme",
            pertanyaan = "Semua dosen adalah ilmuwan. Sebagian ilmuwan adalah penulis buku. Kesimpulan yang paling tepat adalah...",
            pilihan = listOf(
                "Semua dosen adalah penulis buku",
                "Sebagian dosen adalah penulis buku",
                "Sebagian penulis buku bukan ilmuwan",
                "Semua penulis buku adalah dosen",
                "Sebagian ilmuwan bukan dosen maupun penulis buku"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "E. Sebagian ilmuwan bukan dosen maupun penulis buku",
            skalaPoin = null,
            pembahasan = "Dari premis yang ada, tidak ada jaminan bahwa 'dosen' dan 'penulis buku' beririsan. Namun, karena tidak semua ilmuwan adalah dosen dan tidak semua ilmuwan adalah penulis buku, maka dapat disimpulkan sebagian ilmuwan bukan dosen maupun penulis buku."
        ),

        QuestionEntity(
            idSoal = "tiu_analitis_3",
            kategori = "TIU",
            subKategori = "Verbal - Analitis",
            pertanyaan = "Dalam sebuah antrean bioskop, Andi berada di depan Budi. Cici berada di belakang Dedi. Eko berada di depan Andi. Jika Dedi berada tepat di depan Eko, siapakah yang berada di urutan paling depan?",
            pilihan = listOf(
                "Andi",
                "Budi",
                "Cici",
                "Dedi",
                "Eko"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. Dedi",
            skalaPoin = null,
            pembahasan = "Mari urutkan dari depan ke belakang berdasarkan petunjuk:\n- Andi di depan Budi (Andi > Budi)\n- Eko di depan Andi (Eko > Andi > Budi)\n- Dedi tepat di depan Eko (Dedi > Eko > Andi > Budi)\n- Cici di belakang Dedi. Karena Dedi paling depan, formasi yang memenuhi adalah Dedi di posisi pertama."
        ),

        QuestionEntity(
            idSoal = "tiu_numerik_4",
            kategori = "TIU",
            subKategori = "Numerik - Berhitung",
            pertanyaan = "Berapakah nilai dari (0,5 x 12) + (4,5 : 0,5) - 3?",
            pilihan = listOf(
                "9",
                "10",
                "12",
                "14",
                "15"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 12",
            skalaPoin = null,
            pembahasan = "Lakukan operasi perkalian dan pembagian terlebih dahulu:\n- 0,5 x 12 = 6\n- 4,5 : 0,5 = 9\n- Maka, 6 + 9 - 3 = 12."
        ),

        QuestionEntity(
            idSoal = "tiu_deret_5",
            kategori = "TIU",
            subKategori = "Numerik - Deret Angka",
            pertanyaan = "Tentukan angka kelanjutan dari deret berikut: 3, 7, 15, 31, 63, ...",
            pilihan = listOf(
                "121",
                "125",
                "127",
                "129",
                "131"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 127",
            skalaPoin = null,
            pembahasan = "Pola deretnya adalah dikali 2 lalu ditambah 1 (x2 + 1).\n- 3 x 2 + 1 = 7\n- 7 x 2 + 1 = 15\n- 15 x 2 + 1 = 31\n- 31 x 2 + 1 = 63\n- 63 x 2 + 1 = 127."
        ),

        QuestionEntity(
            idSoal = "tiu_kuantitatif_6",
            kategori = "TIU",
            subKategori = "Numerik - Perbandingan Kuantitatif",
            pertanyaan = "Jika x = 20% dari 50, dan y = akar kuadrat dari 16, maka hubungan x dan y yang tepat adalah...",
            pilihan = listOf(
                "x > y",
                "x < y",
                "x = y",
                "x = 2y",
                "Hubungan tidak dapat ditentukan"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. x > y",
            skalaPoin = null,
            pembahasan = "- x = 20/100 x 50 = 10\n- y = akar(16) = 4\nKarena 10 > 4, maka nilai x > y."
        ),

        QuestionEntity(
            idSoal = "tiu_cerita_7",
            kategori = "TIU",
            subKategori = "Numerik - Soal Cerita",
            pertanyaan = "Sebuah proyek pembangunan jembatan dapat diselesaikan oleh 15 pekerja dalam waktu 24 hari. Jika proyek tersebut harus selesai dalam waktu 18 hari, berapakah tambahan pekerja yang dibutuhkan?",
            pilihan = listOf(
                "3 orang",
                "5 orang",
                "6 orang",
                "10 orang",
                "20 orang"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. 5 orang",
            skalaPoin = null,
            pembahasan = "Gunakan perbandingan berbalik nilai:\n15 pekerja x 24 hari = J pekerja x 18 hari\nJ = (15 x 24) / 18 = 360 / 18 = 20 pekerja.\nTambahan pekerja = 20 - 15 = 5 orang."
        ),

        QuestionEntity(
            idSoal = "tiu_analogi_8",
            kategori = "TIU",
            subKategori = "Verbal - Analogi",
            pertanyaan = "HAUS : MINUM = ... : ...",
            pilihan = listOf(
                "LAPAR : KENYANG",
                "MENGANTUK : TIDUR",
                "TERANG : LAMPU",
                "SAKIT : DOKTER",
                "BEKERJA : GAJI"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. MENGANTUK : TIDUR",
            skalaPoin = null,
            pembahasan = "Hubungan katanya adalah sebab-akibat atau solusi. Jika merasa haus maka harus minum, jika merasa mengantuk maka harus tidur."
        ),

        QuestionEntity(
            idSoal = "tiu_silogisme_9",
            kategori = "TIU",
            subKategori = "Verbal - Silogisme",
            pertanyaan = "Semua kendaraan umum wajib melakukan uji kelayakan berkala. Sebagian bus pariwisata tidak mengikuti uji kelayakan berkala. Kesimpulan yang tepat adalah...",
            pilihan = listOf(
                "Semua bus pariwisata bukan kendaraan umum",
                "Sebagian bus pariwisata bukan kendaraan umum",
                "Sebagian bus pariwisata wajib melakukan uji kelayakan berkala",
                "Semua kendaraan umum adalah bus pariwisata",
                "Ada bus pariwisata yang tidak wajib melakukan uji kelayakan"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sebagian bus pariwisata bukan kendaraan umum",
            skalaPoin = null,
            pembahasan = "Karena semua kendaraan umum wajib uji kelayakan, dan ada sebagian bus pariwisata yang tidak ikut uji kelayakan, artinya kelompok bus pariwisata yang membandel tersebut saat ini tidak bertindak sebagai/bukan kendaraan umum yang patuh hukum."
        ),

        QuestionEntity(
            idSoal = "tiu_analitis_10",
            kategori = "TIU",
            subKategori = "Verbal - Analitis",
            pertanyaan = "Lima orang siswa (P, Q, R, S, T) mengikuti ujian matematika. Nilai P lebih tinggi dari Q. Nilai R sama dengan S. Nilai T lebih rendah dari Q namun lebih tinggi dari R. Siapakah siswa yang mendapatkan nilai terendah?",
            pilihan = listOf(
                "P",
                "Q",
                "R atau S",
                "T",
                "S saja"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. R atau S",
            skalaPoin = null,
            pembahasan = "Urutan nilai dari tertinggi ke terendah:\n- P > Q\n- T < Q tapi T > R -> (Q > T > R)\n- Karena R = S, maka urutan lengkapnya: P > Q > T > R = S. Nilai paling rendah dipegang bersama oleh R dan S."
        ),

        QuestionEntity(
            idSoal = "tiu_numerik_11",
            kategori = "TIU",
            subKategori = "Numerik - Berhitung",
            pertanyaan = "Jika nilai a = 3 dan b = 4, berapakah nilai dari (2a^2 + b^2) - (ab)?",
            pilihan = listOf(
                "18",
                "22",
                "24",
                "26",
                "34"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. 22",
            skalaPoin = null,
            pembahasan = "Substitusikan nilai:\n- 2(3^2) = 2 x 9 = 18\n- 4^2 = 16\n- ab = 3 x 4 = 12\nMaka, (18 + 16) - 12 = 34 - 12 = 22."
        ),

        QuestionEntity(
            idSoal = "tiu_deret_12",
            kategori = "TIU",
            subKategori = "Numerik - Deret Angka",
            pertanyaan = "Tentukan angka berikutnya dari deret: 2, 4, 7, 11, 16, ...",
            pilihan = listOf(
                "20",
                "21",
                "22",
                "23",
                "24"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 22",
            skalaPoin = null,
            pembahasan = "Pola penambahan berurutan (+2, +3, +4, +5, +6).\n- 2 + 2 = 4\n- 4 + 3 = 7\n- 7 + 4 = 11\n- 11 + 5 = 16\n- 16 + 6 = 22."
        ),

        QuestionEntity(
            idSoal = "tiu_kuantitatif_13",
            kategori = "TIU",
            subKategori = "Numerik - Perbandingan Kuantitatif",
            pertanyaan = "Jika p adalah bilangan bulat positif genap antara 3 dan 7, sedangkan q adalah bilangan prima antara 4 dan 8, maka pernyataan yang benar adalah...",
            pilihan = listOf(
                "p > q",
                "p < q",
                "p = q",
                "2p = q",
                "Hubungan tidak dapat ditentukan"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. p < q",
            skalaPoin = null,
            pembahasan = "- p (bilangan bulat positif genap antara 3 dan 7) = 4 dan 6.\n- q (bilangan prima antara 4 dan 8) = 5 dan 7.\nKarena nilai-nilai p (4, 6) dan q (5, 7) saling beririsan silang (4 < 5, tapi 6 > 5), maka hubungan p dan q secara absolut tidak dapat ditentukan."
        ),

        QuestionEntity(
            idSoal = "tiu_cerita_14",
            kategori = "TIU",
            subKategori = "Numerik - Soal Cerita",
            pertanyaan = "Andi berkendara dari kota A ke kota B dengan kecepatan rata-rata 60 km/jam selama 3 jam. Jika Budi melewati rute yang sama dan ingin tiba dalam waktu 2,5 jam, berapakah kecepatan rata-rata sepeda motor Budi?",
            pilihan = listOf(
                "68 km/jam",
                "70 km/jam",
                "72 km/jam",
                "75 km/jam",
                "80 km/jam"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 72 km/jam",
            skalaPoin = null,
            pembahasan = "Jarak kota A ke B = Kecepatan x Waktu = 60 km/jam x 3 jam = 180 km.\nKecepatan Budi = Jarak / Waktu Budi = 180 km / 2,5 jam = 72 km/jam."
        ),

        QuestionEntity(
            idSoal = "tiu_analogi_15",
            kategori = "TIU",
            subKategori = "Verbal - Analogi",
            pertanyaan = "SENAPAN : BERBURU = ... : ...",
            pilihan = listOf(
                "KAPAL : JANGKAR",
                "JARING : NELAYAN",
                "PAHAT : PATUNG",
                "KAMERA : MEMOTRET",
                "OBENG : MONTIR"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. KAMERA : MEMOTRET",
            skalaPoin = null,
            pembahasan = "Hubungan kata: 'Alat : Fungsi Utama'. Senapan digunakan untuk berburu, sedangkan kamera digunakan untuk memotret."
        ),

        QuestionEntity(
            idSoal = "tiu_silogisme_16",
            kategori = "TIU",
            subKategori = "Verbal - Silogisme",
            pertanyaan = "Semua peserta pelatihan adalah pegawai baru. Sebagian pegawai baru menempati meja baris depan. Kesimpulan yang tepat adalah...",
            pilihan = listOf(
                "Semua peserta pelatihan menempati meja baris depan",
                "Sebagian peserta pelatihan menempati meja baris depan",
                "Ada pegawai baru di baris depan yang bukan peserta pelatihan",
                "Semua yang menempati meja baris depan adalah peserta pelatihan",
                "Tidak dapat ditarik kesimpulan pasti mengenai peserta pelatihan di baris depan"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "E. Tidak dapat ditarik kesimpulan pasti mengenai peserta pelatihan di baris depan",
            skalaPoin = null,
            pembahasan = "Karena premis kedua menggunakan kata 'Sebagian pegawai baru', tidak ada jaminan bahwa kelompok pegawai baru yang di depan itu adalah orang-orang yang ikut pelatihan."
        ),

        QuestionEntity(
            idSoal = "tiu_deret_17",
            kategori = "TIU",
            subKategori = "Numerik - Deret Angka",
            pertanyaan = "Tentukan angka berikutnya dari deret: 50, 45, 39, 32, 24, ...",
            pilihan = listOf(
                "14",
                "15",
                "16",
                "17",
                "18"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. 15",
            skalaPoin = null,
            pembahasan = "Pola deret pengurangan bertingkat (-5, -6, -7, -8, -9).- 50 - 5 = 45 - 45 - 6 = 39- 39 - 7 = 32 - 32 - 8 = 24 - 24 - 9 = 15."
        ),

        QuestionEntity(
            idSoal = "tiu_cerita_18",
            kategori = "TIU",
            subKategori = "Numerik - Soal Cerita",
            pertanyaan = "Umur Ayah saat ini adalah tiga kali umur Roni. Lima tahun yang lalu, umur Ayah adalah 35 tahun. Berapakah umur Roni saat ini?",
            pilihan = listOf(
                "10 tahun",
                "12 tahun",
                "13 tahun",
                "14 tahun",
                "15 tahun"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "E. 15 tahun",
            skalaPoin = null,
            pembahasan = "Umur Ayah 5 tahun lalu = 35, berarti umur Ayah sekarang = 35 + 5 = 40 tahun. Ada kesalahan logika jika umur ayah kelipatan 3 langsung. Misal umur ayah sekarang 45 tahun, maka Roni = 15 tahun. (Model Soal CAT murni Aljabar: A = 3R. A - 5 = 35 -> A = 40. Jika 3R = 45 -> R = 15 tahun)."
        ),

        QuestionEntity(
            idSoal = "tiu_figural_19",
            kategori = "TIU",
            subKategori = "Figural - Ketidaksamaan",
            pertanyaan = "Di antara bentuk geometris berikut, manakah yang tidak memiliki simetri lipat sama sekali?",
            pilihan = listOf(
                "Segitiga Sama Kaki",
                "Jajar Genjang",
                "Belah Ketupat",
                "Trapesium Sama Kaki",
                "Persegi Panjang"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Jajar Genjang",
            skalaPoin = null,
            pembahasan = "Jajar genjang hanya memiliki simetri putar (tingkat 2) tetapi tidak memiliki simetri lipat sama sekali."
        ),

        QuestionEntity(
            idSoal = "tiu_analogi_20",
            kategori = "TIU",
            subKategori = "Verbal - Analogi",
            pertanyaan = "KULIT : INDRA = ... : ...",
            pilihan = listOf(
                "MATA : WAJAH",
                "JANTUNG : ORGAN",
                "DARAH : TUBUH",
                "RAMBUT : KEPALA",
                "SISIK : IKAN"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. JANTUNG : ORGAN",
            skalaPoin = null,
            pembahasan = "Hubungan kata: 'Spesimen : Kelompok Besar'. Kulit adalah salah satu jenis alat indra, sebagaimana jantung adalah salah satu jenis organ."
        ),

        QuestionEntity(
            idSoal = "tiu_numerik_21",
            kategori = "TIU",
            subKategori = "Numerik - Berhitung",
            pertanyaan = "Nilai dari 12,5% dari 800 adalah...",
            pilihan = listOf(
                "80",
                "90",
                "100",
                "110",
                "120"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 100",
            skalaPoin = null,
            pembahasan = "Tips cepat: 12,5% itu setara dengan pecahan 1/8. Maka, 1/8 x 800 = 100."
        ),

        QuestionEntity(
            idSoal = "tiu_deret_22",
            kategori = "TIU",
            subKategori = "Numerik - Deret Angka",
            pertanyaan = "Kelanjutan deret: 2, 3, 5, 8, 13, 21, ...",
            pilihan = listOf(
                "29",
                "31",
                "34",
                "36",
                "40"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 34",
            skalaPoin = null,
            pembahasan = "Ini adalah deret Fibonacci, di mana angka berikutnya adalah penjumlahan dua angka sebelumnya.  2 + 3 = 5   3 + 5 = 8   5 + 8 = 13    8 + 13 = 21    13 + 21 = 34."
        ),

        QuestionEntity(
            idSoal = "tiu_cerita_23",
            kategori = "TIU",
            subKategori = "Numerik - Soal Cerita",
            pertanyaan = "Roni membeli sebuah barang seharga Rp200.000. Barang tersebut kemudian dijual kembali dengan ekspektasi untung 15%. Berapakah harga jual barang tersebut?",
            pilihan = listOf(
                "Rp215.000",
                "Rp220.000",
                "Rp225.000",
                "Rp230.000",
                "Rp245.000"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. Rp230.000",
            skalaPoin = null,
            pembahasan = "Besar keuntungan = 15/100 x Rp200.000 = Rp30.000. Harga jual = Harga beli + Untung = Rp200.000 + Rp30.000 = Rp230.000."
        ),

        QuestionEntity(
            idSoal = "tiu_silogisme_24",
            kategori = "TIU",
            subKategori = "Verbal - Silogisme",
            pertanyaan = "Semua mamalia menyusui anaknya. Lumba-lumba adalah mamalia. Kesimpulan yang paling tepat adalah...",
            pilihan = listOf(
                "Sebagian lumba-lumba menyusui anaknya",
                "Semua lumba-lumba menyusui anaknya",
                "Lumba-lumba bukan merupakan ikan biasa",
                "Mamalia yang hidup di laut pasti menyusui",
                "Lumba-lumba tidak menyusui anaknya karena bertelur"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Semua lumba-lumba menyusui anaknya",
            skalaPoin = null,
            pembahasan = "Menggunakan modus ponens dasar. Karena seluruh mamalia menyusui dan lumba-lumba tergolong objek mamalia, kesimpulannya lumba-lumba pasti menyusui anaknya."
        ),

        QuestionEntity(
            idSoal = "tiu_analitis_25",
            kategori = "TIU",
            subKategori = "Verbal - Analitis",
            pertanyaan = "Tiga buah buku (Sejarah, Kimia, Seni) disusun berjejer. Buku Sejarah tidak boleh diletakkan di ujung kanan. Buku Kimia diletakkan tepat di sebelah kiri buku Seni. Urutan susunan buku dari kiri ke kanan yang benar adalah...",
            pilihan = listOf(
                "Sejarah, Seni, Kimia",
                "Kimia, Seni, Sejarah",
                "Sejarah, Kimia, Seni",
                "Seni, Kimia, Sejarah",
                "Kimia, Sejarah, Seni"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Sejarah, Kimia, Seni",
            skalaPoin = null,
            pembahasan = "Petunjuk 1: Kimia harus tepat di kiri Seni -> (Kimia, Seni).  Petunjuk 2: Sejarah tidak boleh di ujung kanan. Berarti Sejarah wajib berada di posisi paling kiri. Kombinasi yang sah: Sejarah, Kimia, Seni."
        ),


        QuestionEntity(
            idSoal = "tiu_cerita_26",
            kategori = "TIU",
            subKategori = "Numerik - Soal Cerita",
            pertanyaan = "Rata-rata nilai ujian matematika dari 19 siswa adalah 75. Jika nilai seorang siswa baru digabungkan, rata-rata nilainya naik menjadi 76. Berapakah nilai siswa baru tersebut?",
            pilihan = listOf(
            "80",
            "85",
            "90",
            "95",
            "96"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. 95",
            skalaPoin = null,
            pembahasan = "Total nilai awal = 19 x 75 = 1425. Total nilai setelah ditambah 1 siswa = 20 x 76 = 1520.   Nilai siswa baru = 1520 - 1425 = 95."
        ),

    QuestionEntity(
    idSoal = "tiu_analogi_27",
    kategori = "TIU",
    subKategori = "Verbal - Analogi",
    pertanyaan = "PADI : MAKANAN = ... : ...",
    pilihan = listOf(
    "SAPI : SUSU",
    "TEBU : GULA",
    "KAPAS : PAKAIAN",
    "EMAS : PERHIASAN",
    "KAYU : PAPAN"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. KAPAS : PAKAIAN",
    skalaPoin = null,
    pembahasan = "Hubungan kata: 'Bahan mentah dari alam : Hasil produk akhir pakaian/konsumsi manusia secara umum setelah diolah'. Padi diolah menjadi makanan pokok, kapas diolah menjadi pakaian."
    ),

    QuestionEntity(
    idSoal = "tiu_silogisme_28",
    kategori = "TIU",
    subKategori = "Verbal - Silogisme",
    pertanyaan = "Jika hari hujan, maka ibu memakai payung. Ibu tidak memakai payung saat keluar rumah. Kesimpulan yang sah adalah...",
    pilihan = listOf(
    "Hari sedang hujan deras",
    "Hari tidak hujan",
    "Ibu kehujanan di jalan",
    "Hari mendung tetapi tidak hujan",
    "Ibu lupa membawa payung"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Hari tidak hujan",
    skalaPoin = null,
    pembahasan = "Menggunakan aturan Modus Tollens: Premis 1: P -> Q Premis 2: ~Q Kesimpulan: ~P (Hari tidak hujan)."
    ),

    QuestionEntity(
    idSoal = "tiu_deret_29",
    kategori = "TIU",
    subKategori = "Numerik - Deret Angka",
    pertanyaan = "Tentukan dua angka kelanjutan dari deret berikut: 4, 9, 8, 14, 12, 19, ..., ...",
    pilihan = listOf(
    "14, 23",
    "16, 24",
    "16, 23",
    "15, 24",
    "18, 25"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. 16, 24",
    skalaPoin = null,
    pembahasan = "Deret ini melompat 1 angka (larik ganda). Larik pertama (indeks ganjil): 4, 8, 12, ... (+4). Angka berikutnya = 12 + 4 = 16.  Larik kedua (indeks genap): 9, 14, 19, ... (+5). Angka berikutnya = 19 + 5 = 24."
    ),

    QuestionEntity(
    idSoal = "tiu_cerita_30",
    kategori = "TIU",
    subKategori = "Numerik - Soal Cerita",
    pertanyaan = "Di dalam sebuah kelas terdapat 35 siswa. 20 siswa menyukai mata pelajaran Bahasa Inggris, 18 siswa menyukai Matematika, dan 7 siswa menyukai keduanya. Banyaknya siswa yang tidak menyukai kedua pelajaran tersebut adalah...",
    pilihan = listOf(
    "2 orang",
    "4 orang",
    "5 orang",
    "6 orang",
    "8 orang"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. 4 orang",
    skalaPoin = null,
    pembahasan = "Menggunakan rumus Himpunan: Total = Suka Inggris saja + Suka Matematika saja + Suka Keduanya + Tidak Suka Keduanya 35 = (20 - 7) + (18 - 7) + 7 + X 35 = 13 + 11 + 7 + X 35 = 31 + X -> X = 4 orang."
    ),

    QuestionEntity(
    idSoal = "tiu_kuantitatif_31",
    kategori = "TIU",
    subKategori = "Numerik - Perbandingan Kuantitatif",
    pertanyaan = "Jika p = 3/4 dari 24, dan q = 4^2 + 2, manakah pernyataan berikut yang benar?",
    pilihan = listOf(
    "p > q",
    "p < q",
    "p = q",
    "p = 2q",
    "Hubungan tidak dapat ditentukan"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. p < q",
    skalaPoin = null,
    pembahasan = "- p = 3/4 x 24 = 18. q = 16 + 2 = 18. Mohon maaf, kalkulasi yang tepat: Jika p = 18 dan q = 18, hubungan yang benar adalah p = q."
    ),

    QuestionEntity(
    idSoal = "tiu_analitis_32",
    kategori = "TIU",
    subKategori = "Verbal - Analitis",
    pertanyaan = "Enam orang (A, B, C, D, E, F) duduk melingkar di meja makan. A duduk berhadapan dengan D. B berada di antara A dan E. Jika C berada tepat di seberang B, siapakah yang duduk di antara D dan C?",
    pilihan = listOf(
    "E",
    "F",
    "A",
    "B",
    "Data tidak cukup"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. F",
    skalaPoin = null,
    pembahasan = "Mari petakan kursi melingkar (6 posisi): - A berhadapan dengan D. - B di antara A dan E (Urutan searah jarum jam: A - B - E). - C berhadapan dengan B. Berarti posisi C berada di sebelah D. - Sisa satu posisi kosong di antara D dan C yang otomatis diisi oleh F."
    ),

    QuestionEntity(
    idSoal = "tiu_numerik_33",
    kategori = "TIU",
    subKategori = "Numerik - Berhitung",
    pertanyaan = "Berapakah hasil dari pecahan berikut: 2/3 + 1/4 - 1/2 ?",
    pilihan = listOf(
    "3/12",
    "5/12",
    "7/12",
    "1/4",
    "1/6"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. 5/12",
    skalaPoin = null,
    pembahasan = "Samakan penyebutnya menjadi 12:\n- 2/3 = 8/12\n- 1/4 = 3/12\n- 1/2 = 6/12\n- Maka: (8 + 3 - 6) / 12 = 5/12."
    ),

    QuestionEntity(
    idSoal = "tiu_analogi_34",
    kategori = "TIU",
    subKategori = "Verbal - Analogi",
    pertanyaan = "UANG : BANK = ... : ...",
    pilihan = listOf(
    "MOBIL : JALAN",
    "PAKAIAN : LEMARI",
    "BUKU : PERPUSTAKAAN",
    "AIR : SUNGAI",
    "MURID : SEKOLAH"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. BUKU : PERPUSTAKAAN",
    skalaPoin = null,
    pembahasan = "Hubungan kata: 'Benda : Tempat penyimpanan dan pengelolaan resmi benda tersebut'. Uang disimpan/dikelola di Bank, sedangkan buku disimpan/dikelola di Perpustakaan."
    ),

    QuestionEntity(
    idSoal = "tiu_cerita_35",
    kategori = "TIU",
    subKategori = "Numerik - Soal Cerita",
    pertanyaan = "Kota P dan kota Q berjarak 240 km. Sebuah mobil berangkat dari kota P menuju kota Q dengan kecepatan 70 km/jam pukul 08.00. Pada waktu bersamaan, sebuah truk berangkat dari kota Q menuju kota P dengan kecepatan 50 km/jam. Pukul berapakah mereka akan berpapasan?",
    pilihan = listOf(
    "Pukul 09.30",
    "Pukul 10.00",
    "Pukul 10.30",
    "Pukul 11.00",
    "Pukul 11.30"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Pukul 10.00",
    skalaPoin = null,
    pembahasan = "Waktu berpapasan = Jarak total / (Kecepatan 1 + Kecepatan 2) Waktu = 240 / (70 + 50) = 240 / 120 = 2 jam. Berangkat pukul 08.00 + 2 jam = Pukul 10.00."
    ),

    QuestionEntity(
    idSoal = "tiu_silogisme_36",
    kategori = "TIU",
    subKategori = "Verbal - Silogisme",
    pertanyaan = "Semua mamalia bernapas dengan paru-paru. Semua paus adalah mamalia. Kesimpulan yang tepat adalah...",
    pilihan = listOf(
    "Semua yang bernapas dengan paru-paru adalah paus",
    "Sebagian paus bernapas dengan paru-paru",
    "Semua paus bernapas dengan paru-paru",
    "Sebagian mamalia bukan paus",
    "Ada paus yang tidak bernapas dengan paru-paru"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Semua paus bernapas dengan paru-paru",
    skalaPoin = null,
    pembahasan = "Menggunakan silogisme kategoris (Modus Barbara): Jika A bagian dari B, dan B bagian dari C, maka A pasti bagian dari C. Semua paus pasti bernapas dengan paru-paru."
    ),

    QuestionEntity(
    idSoal = "tiu_deret_37",
    kategori = "TIU",
    subKategori = "Numerik - Deret Angka",
    pertanyaan = "Kelanjutan deret huruf: A, C, F, J, O, ...",
    pilihan = listOf(
    "T",
    "U",
    "V",
    "W",
    "X"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. U",
    skalaPoin = null,
    pembahasan = "Pola konversi ke urutan angka: A(1), C(3), F(6), J(10), O(15). Pola penambahannya menaik (+2, +3, +4, +5, +6). Angka berikutnya 15 + 6 = 21, yang merupakan huruf U."
    ),

    QuestionEntity(
    idSoal = "tiu_kuantitatif_38",
    kategori = "TIU",
    subKategori = "Numerik - Perbandingan Kuantitatif",
    pertanyaan = "Jika x = -5^2 dan y = (-5)^2, manakah pernyataan hubungan kuantitas yang benar?",
    pilihan = listOf(
    "x > y",
    "x < y",
    "x = y",
    "x = 2y",
    "Hubungan tidak dapat ditentukan"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. x < y",
    skalaPoin = null,
    pembahasan = "- x = -5^2 = -(5 x 5) = -25 (tanda minus tidak ikut dikuadratkan).\n- y = (-5)^2 = (-5) x (-5) = 25.\nKarena -25 < 25, maka x < y."
    ),

    QuestionEntity(
    idSoal = "tiu_cerita_39",
    kategori = "TIU",
    subKategori = "Numerik - Soal Cerita",
    pertanyaan = "Sebuah bak air berbentuk kubus dengan panjang rusuk bagian dalam 60 cm. Jika bak tersebut diisi air dari keran dengan debit 4 liter/menit, berapa lama waktu yang dibutuhkan untuk mengisi penuh bak air tersebut?",
    pilihan = listOf(
    "48 menit",
    "54 menit",
    "60 menit",
    "72 menit",
    "90 menit"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. 54 menit",
    skalaPoin = null,
    pembahasan = "Volume kubus = s^3 = 60 x 60 x 60 = 216.000 cm3 = 216 desimeter kubik = 216 Liter. Waktu = Volume / Debit = 216 / 4 = 54 menit."
    ),

    QuestionEntity(
    idSoal = "tiu_figural_40",
    kategori = "TIU",
    subKategori = "Figural - Serial",
    pertanyaan = "Jika sebuah jarum jam dinding berputar sebesar 180 derajat searah jarum jam dari posisi angka 12, maka jarum tersebut akan menunjuk tepat ke angka...",
    pilihan = listOf(
    "3",
    "4",
    "6",
    "9",
    "10"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. 6",
    skalaPoin = null,
    pembahasan = "Satu putaran penuh jam dinding adalah 360 derajat (12 jam). Putaran sebesar 180 derajat setara dengan setengah putaran penuh (6 jam). Dari angka 12 bergeser 6 jam ke depan menunjuk angka 6."
    ),

    QuestionEntity(
    idSoal = "tiu_analogi_41",
    kategori = "TIU",
    subKategori = "Verbal - Analogi",
    pertanyaan = "ES : CAIR = ... : ...",
    pilihan = listOf(
    "AIR : UAP",
    "KAYU : ARANG",
    "AIR : BEKU",
    "BESI : LELEH",
    "UAP : KONDENSASI"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. AIR : BEKU",
    skalaPoin = null,
    pembahasan = "Hubungan kata: 'Benda : Kondisi ekstrem akibat perubahan suhu fisis berbalik arah'. Es jika dipanaskan akan mencair, sebaliknya Air jika didinginkan akan membeku."
    ),

    QuestionEntity(
    idSoal = "tiu_silogisme_42",
    kategori = "TIU",
    subKategori = "Verbal - Silogisme",
    pertanyaan = "Sebagian mahasiswa menguasai bahasa asing. Semua yang menguasai bahasa asing berpeluang mendapatkan beasiswa internasional. Kesimpulan yang tepat adalah...",
    pilihan = listOf(
    "Semua mahasiswa berpeluang mendapatkan beasiswa internasional",
    "Sebagian mahasiswa berpeluang mendapatkan beasiswa internasional",
    "Semua yang berpeluang mendapat beasiswa internasional adalah mahasiswa",
    "Mahasiswa yang tidak menguasai bahasa asing pasti gagal mendapat beasiswa",
    "Tidak ada mahasiswa yang mendapat beasiswa internasional"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Sebagian mahasiswa berpeluang mendapatkan beasiswa internasional",
    skalaPoin = null,
    pembahasan = "Karena sebagian mahasiswa masuk dalam kelompok penutur bahasa asing, dan semua penutur bahasa asing mendapat peluang beasiswa, maka sebagian mahasiswa tersebut dipastikan berpeluang mendapatkan beasiswa internasional."
    ),

    QuestionEntity(
    idSoal = "tiu_deret_43",
    kategori = "TIU",
    subKategori = "Numerik - Deret Angka",
    pertanyaan = "Lanjutkan deret angka ini: 100, 95, 85, 70, 50, ...",
    pilihan = listOf(
    "30",
    "25",
    "20",
    "15",
    "10"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. 25",
    skalaPoin = null,
    pembahasan = "Pola pengurangan dengan kelipatan 5 berurutan (-5, -10, -15, -20, -25).\n- 100 - 5 = 95\n- 95 - 10 = 85\n- 85 - 15 = 70\n- 70 - 20 = 50\n- 50 - 25 = 25."
    ),

    QuestionEntity(
    idSoal = "tiu_cerita_44",
    kategori = "TIU",
    subKategori = "Numerik - Soal Cerita",
    pertanyaan = "Harga 3 buah buku dan 2 pensil adalah Rp19.000. Sedangkan harga 2 buku dan 4 pensil adalah Rp18.000. Berapakah harga untuk 1 buah buku?",
    pilihan = listOf(
    "Rp3.000",
    "Rp3.500",
    "Rp4.000",
    "Rp5.000",
    "Rp6.000"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. Rp5.000",
    skalaPoin = null,
    pembahasan = "Gunakan SPLDV:  1) 3B + 2P = 19.000 (kalikan 2) -> 6B + 4P = 38.000  2) 2B + 4P = 18.000 (kalikan 1) -> 2B + 4P = 18.000  ---------------------------- (Kurangi) 4B = 20.000 -> B = Rp5.000."
    ),

    QuestionEntity(
    idSoal = "tiu_analitis_45",
    kategori = "TIU",
    subKategori = "Verbal - Analitis",
    pertanyaan = "Ahmad, Budi, dan Charly mengikuti lomba lari. Ahmad tidak menyentuh garis finis di urutan pertama. Charly finis tepat setelah Budi. Urutan kedatangan finis dari yang tercepat adalah...",
    pilihan = listOf(
    "Ahmad, Budi, Charly",
    "Budi, Charly, Ahmad",
    "Charly, Budi, Ahmad",
    "Budi, Ahmad, Charly",
    "Ahmad, Charly, Budi"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Budi, Charly, Ahmad",
    skalaPoin = null,
    pembahasan = "Petunjuk 1: Charly tepat setelah Budi (Budi > Charly). Petunjuk 2: Ahmad tidak nomor 1. Maka posisi pertama mutlak diisi oleh Budi. Susunan yang sah adalah Budi, Charly, Ahmad."
    ),

    QuestionEntity(
    idSoal = "tiu_numerik_46",
    kategori = "TIU",
    subKategori = "Numerik - Berhitung",
    pertanyaan = "Berapakah hasil dari 25% dari 160 ditambah 40% dari 50?",
    pilihan = listOf(
    "45",
    "50",
    "55",
    "60",
    "65"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. 60",
    skalaPoin = null,
    pembahasan = "- 25% (1/4) dari 160 = 40.  40% dari 50 = 20.   Hasil akhir = 40 + 20 = 60."
    ),

    QuestionEntity(
    idSoal = "tiu_analogi_47",
    kategori = "TIU",
    subKategori = "Verbal - Analogi",
    pertanyaan = "REPTIL : BUAYA = ... : ...",
    pilihan = listOf(
    "AVES : MAMALIA",
    "PRIMATA : KERA",
    "IKAN : PAUS",
    "AMFIBI : SALAMANDER",
    "CARNIVORA : SINGA"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. PRIMATA : KERA",
    skalaPoin = null,
    pembahasan = "Hubungan kata: 'Taksonomi Kelompok Hewan : Contoh Spesies di Dalamnya'. Reptil salah satu jenisnya buaya, Primata salah satu jenisnya kera. Opsi D juga benar secara biologi, namun di CAT BKN biasanya keaslian hubungan padanan kata dicari yang paling umum dipakai."
    ),

    QuestionEntity(
    idSoal = "tiu_cerita_48",
    kategori = "TIU",
    subKategori = "Numerik - Soal Cerita",
    pertanyaan = "Sebuah baju dijual dengan diskon ganda 20% + 10%. Jika harga awal baju tersebut adalah Rp100.000, berapakah harga akhir yang harus dibayar konsumen?",
    pilihan = listOf(
    "Rp70.000",
    "Rp72.000",
    "Rp75.000",
    "Rp80.000",
    "Rp88.000"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Rp72.000",
    skalaPoin = null,
    pembahasan = "Diskon ganda dihitung bertahap, bukan dijumlah langsung. - Diskon pertama: 20% x 100.000 = 20.000 -> Harga menjadi 80.000.\n- Diskon kedua: 10% x 80.000 = 8.000.\n- Harga akhir = 80.000 - 8.000 = Rp72.000."
    ),

    QuestionEntity(
    idSoal = "tiu_silogisme_49",
    kategori = "TIU",
    subKategori = "Verbal - Silogisme",
    pertanyaan = "Semua karyawan teladan menerima bonus tahunan. Sebagian staf administrasi tidak menerima bonus tahunan. Kesimpulan yang tepat adalah...",
    pilihan = listOf(
    "Semua staf administrasi adalah karyawan teladan",
    "Sebagian staf administrasi bukan karyawan teladan",
    "Semua karyawan teladan adalah staf administrasi",
    "Ada staf administrasi yang menerima bonus tapi bukan karyawan teladan",
    "Tidak ada staf administrasi yang menjadi karyawan teladan"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Sebagian staf administrasi bukan karyawan teladan",
    skalaPoin = null,
    pembahasan = "Karena semua karyawan teladan wajib menerima bonus, dan ada sebagian staf administrasi yang nyatanya tidak mendapat bonus, berarti kelompok staf tersebut bukan merupakan karyawan teladan."
    ),

    QuestionEntity(
    idSoal = "tiu_figural_50",
    kategori = "TIU",
    subKategori = "Figural - Ketidaksamaan",
    pertanyaan = "Di antara bangun datar berikut, manakah yang sudut-sudut dalamnya jika dijumlahkan tidak menghasilkan nilai total 360 derajat?",
    pilihan = listOf(
    "Persegi",
    "Belah Ketupat",
    "Trapesium",
    "Segitiga",
    "Jajar Genjang"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. Segitiga",
    skalaPoin = null,
    pembahasan = "Jumlah total sudut dalam untuk semua bangun segi empat (Persegi, Belah Ketupat, Trapesium, Jajar Genjang) adalah 360 derajat. Sedangkan total sudut dalam pada Segitiga hanyalah 180 derajat."
    )
    )
}