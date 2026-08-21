package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity


object SoalTWK {
    val daftarSoal = listOf(
    QuestionEntity(
        idSoal = "twk_pancasila_1",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Pancasila sebagai dasar negara memiliki konsekuensi yuridis bahwa seluruh peraturan perundang-undangan di Indonesia harus bersumber dari Pancasila. Di bawah ini, manakah tindakan yang paling mencerminkan pengamalan sila ke-4 Pancasila dalam kehidupan bernegara?",
        pilihan = listOf(
          " Mengutamakan produk-produk dalam negeri untuk meningkatkan perekonomian nasional",
             " Menghargai hasil karya orang lain serta tidak melakukan plagiarisme",
            " Menyelesaikan konflik antarorganisasi melalui jalur musyawarah mufakat tanpa memaksakan kehendak",
            " Memberikan bantuan logistik kepada korban bencana alam tanpa membedakan latar belakang suku",
            " Mengembangkan sikap saling menghormati kebebasan menjalankan ibadah sesuai agama masing-masing"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Menyelesaikan konflik antarorganisasi melalui jalur musyawarah mufakat tanpa memaksakan kehendak",
        skalaPoin = null,
        pembahasan = "Sila ke-4 Pancasila menekankan pada kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan/perwakilan. Tindakan bermusyawarah dan tidak memaksakan kehendak merupakan wujud nyata pengamalan sila ini."
    ),

    QuestionEntity(
        idSoal = "twk_uud_2",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Berdasarkan Pasal 1 Ayat (2) UUD 1945 setelah amandemen, kedaulatan berada di tangan rakyat dan dilaksanakan menurut UUD. Lembaga negara yang memiliki kewenangan untuk melantik Presiden dan/atau Wakil Presiden berdasarkan hasil pemilu adalah...",
        pilihan = listOf(
           " Dewan Perwakilan Rakyat (DPR)",
             " Majelis Permusyawaratan Rakyat (MPR)",
            " Mahkamah Konstitusi (MK)",
            " Komisi Pemilihan Umum (KPU)",
            " Dewan Perwakilan Daerah (DPD)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Majelis Permusyawaratan Rakyat (MPR)",
        skalaPoin = null,
        pembahasan = "Sesuai dengan Pasal 3 Ayat (2) UUD 1945, Majelis Permusyawaratan Rakyat (MPR) berwenang melantik Presiden dan/atau Wakil Presiden."
    ),

    QuestionEntity(
        idSoal = "twk_bhineka_3",
        kategori = "TWK",
        subKategori = "Bhineka Tunggal Ika",
        pertanyaan = "Kemajemukan bangsa Indonesia merupakan kekayaan sekaligus tantangan. Konsep 'Bhinneka Tunggal Ika' yang digali dari Kitab Sutasoma karya Mpu Tantular pada dasarnya menekankan pada...",
        pilihan = listOf(
           " Penyeragaman seluruh kebudayaan daerah menjadi satu kebudayaan nasional",
             " Pengakuan atas keberagaman yang diikat oleh kesadaran akan persatuan dan kesatuan",
            " Pemberian hak otonomi seluas-luasnya kepada tiap suku untuk mengatur wilayahnya",
            " Pembatasan interaksi budaya antar-daerah guna menghindari gesekan sosial",
            " Penghapusan identitas lokal demi terciptanya identitas baru yang modern"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pengakuan atas keberagaman yang diikat oleh kesadaran akan persatuan dan kesatuan",
        skalaPoin = null,
        pembahasan = "Bhinneka Tunggal Ika berarti 'berbeda-beda tetapi tetap satu'. Konsep ini mengakui adanya perbedaan realitas suku, agama, dan ras, namun tetap terikat dalam satu kesatuan bangsa."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_4",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Wilayah laut Indonesia yang diukur sejauh 12 mil laut dari garis pangkal lurus ke arah laut lepas disebut sebagai...",
        pilihan = listOf(
           " Zona Ekonomi Eksklusif (ZEE)",
             " Laut Teritorial",
            " Landas Kontinen",
            " Laut Pedalaman",
            " Zona Tambahan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Laut Teritorial",
        skalaPoin = null,
        pembahasan = "Laut Teritorial adalah wilayah laut yang menjadi hak kedaulatan penuh penuh bagi NKRI, diukur sejauh 12 mil laut dari garis pangkal."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_5",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Seorang aparatur sipil negara (ASN) yang menolak segala bentuk suap dan gratifikasi demi menjaga integritas jabatan serta nama baik instansinya, pada hakikatnya sedang mengimplementasikan nilai bela negara, yaitu...",
        pilihan = listOf(
           " Cinta tanah air",
             " Kesadaran berbangsa dan bernegara",
            " Setia kepada Pancasila sebagai ideologi negara",
            " Rela berkorban untuk bangsa dan negara",
            " Memiliki kemampuan awal bela negara"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kesadaran berbangsa dan bernegara",
        skalaPoin = null,
        pembahasan = "Menjalankan tugas secara profesional, berintegritas, dan menolak korupsi/suap merupakan bentuk dari nilai 'Kesadaran berbangsa dan bernegara' dengan menaati hukum dan peraturan yang berlaku."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_6",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Organisasi pergerakan nasional pertama di Indonesia yang secara terang-terangan (eksplisit) mencantumkan tujuan mencapai kemerdekaan Indonesia dalam program politiknya adalah...",
        pilihan = listOf(
           " Budi Utomo",
             " Sarekat Islam",
            " Indische Partij",
            " Perhimpunan Indonesia",
            " Partai Nasional Indonesia (PNI)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Indische Partij",
        skalaPoin = null,
        pembahasan = "Indische Partij didirikan oleh Tiga Serangkai pada tahun 1912 dan merupakan partai politik pertama yang mengusung ideologi nasionalisme serta menyuarakan kemerdekaan secara radikal/terang-terangan di masa itu."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_7",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Di tengah maraknya penyebaran berita bohong (hoax) di media sosial yang berpotensi memecah belah bangsa, sikap yang sesuai dengan nilai-nilai Sila Ketiga Pancasila untuk meminimalisir dampak negatif tersebut adalah...",
        pilihan = listOf(
           " Membiarkan berita tersebut berlalu seiring waktu berjalan",
             " Melaporkan seluruh akun penyebar konten ke pihak kepolisian tanpa verifikasi",
            " Melakukan cek fakta (cross-check) sebelum menyebarkan informasi untuk menjaga persatuan",
            " Membuat konten tandingan yang lebih provokatif agar menarik perhatian publik",
            " Membatasi diri untuk tidak menggunakan media sosial sama sekali"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Melakukan cek fakta (cross-check) sebelum menyebarkan informasi untuk menjaga persatuan",
        skalaPoin = null,
        pembahasan = "Menjaga persatuan bangsa (Sila ke-3) di era digital dicapai dengan bersikap bijak dalam mengonsumsi berita, memverifikasi kebenaran informasi, dan tidak ikut andil dalam menyebarkan kebencian."
    ),

    QuestionEntity(
        idSoal = "twk_uud_8",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Apabila Presiden dan Wakil Presiden mangkat, berhenti, diberhentikan, atau tidak dapat melakukan kewajibannya dalam masa jabatannya secara bersamaan, pelaksana tugas kepresidenan dipegang secara kolektif oleh...",
        pilihan = listOf(
           " Ketua MPR, Ketua DPR, dan Ketua DPD",
             " Menteri Dalam Negeri, Menteri Luar Negeri, dan Menteri Pertahanan",
            " Menteri Dalam Negeri, Menteri Sekretaris Negara, dan Panglima TNI",
            " Ketua Mahkamah Agung, Ketua MK, dan Ketua KY",
            " Jaksa Agung, Kapolri, dan Kepala BIN"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menteri Dalam Negeri, Menteri Luar Negeri, dan Menteri Pertahanan",
        skalaPoin = null,
        pembahasan = "Menurut Pasal 8 Ayat (3) UUD 1945, jika terjadi kekosongan kepemimpinan Presiden dan Wapres secara bersamaan, tugas kepresidenan dijalankan oleh triumvirat: Menteri Dalam Negeri, Menteri Luar Negeri, dan Menteri Pertahanan."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_9",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Pancasila sebagai ideologi terbuka harus mampu menyerap nilai-nilai baru yang positif tanpa kehilangan jati dirinya. Salah satu batasan keterbukaan ideologi Pancasila adalah tidak boleh mengubah nilai dasar, yaitu...",
        pilihan = listOf(
           " Peraturan perundang-undangan tata usaha negara",
             " Ketetapan dan kebijakan operasional kementerian",
            " Nilai ketuhanan, kemanusiaan, persatuan, kerakyatan, dan keadilan",
            " Pola pelaksanaan pembangunan lima tahunan (Repelita)",
            " Struktur lembaga kepresidenan dan kabinet"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Nilai ketuhanan, kemanusiaan, persatuan, kerakyatan, dan keadilan",
        skalaPoin = null,
        pembahasan = "Nilai dasar Pancasila adalah inti dari kelima sila yang bersifat universal dan tetap (tidak boleh diubah). Yang boleh berkembang dan menyesuaikan zaman hanyalah nilai instrumen dan nilai praksis."
    ),

    QuestionEntity(
        idSoal = "twk_pilar_10",
        kategori = "TWK",
        subKategori = "Bhineka Tunggal Ika",
        pertanyaan = "Konsep geopolitik Indonesia yang memandang seluruh wilayah kepulauan Indonesia, daratan, lautan, serta ruang udara di atasnya sebagai satu kesatuan politik, ekonomi, Sosbud, dan pertahanan keamanan dinamakan...",
        pilihan = listOf(
           " Wawasan Nusantara",
             " Ketahanan Nasional",
            " Deklarasi Djuanda",
            " Integrasi Nasional",
            " Kedaulatan Wilayah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Wawasan Nusantara",
        skalaPoin = null,
        pembahasan = "Wawasan Nusantara merupakan cara pandang bangsa Indonesia mengenai diri dan lingkungannya sebagai satu kesatuan yang utuh (IPOLESOSBUDHANKAM)."
    ),

    QuestionEntity(
        idSoal = "twk_uud_11",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Menurut UUD 1945, Mahkamah Konstitusi (MK) memiliki salah satu kewenangan mutlak dalam tingkat pertama dan terakhir yang putusannya bersifat final, yaitu...",
        pilihan = listOf(
           " Menguji peraturan perundang-undangan di bawah undang-undang terhadap undang-undang",
             " Memutuskan perselisihan tentang hasil pemilihan umum",
            " Memberikan pertimbangan hukum kepada Presiden terkait pemberian grasi dan rehabilitasi",
            " Mengadili perkara pidana yang melibatkan pejabat tinggi negara",
            " Mengusulkan pengangkatan Hakim Agung kepada DPR"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memutuskan perselisihan tentang hasil pemilihan umum",
        skalaPoin = null,
        pembahasan = "Berdasarkan Pasal 24C Ayat (1) UUD 1945, kewenangan MK meliputi: menguji UU terhadap UUD, memutus sengketa kewenangan lembaga negara, memutus pembubaran partai politik, dan memutus perselisihan hasil pemilu."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_12",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Keikutsertaan warga negara dalam upaya bela negara dapat diselenggarakan melalui hal-hal berikut, kecuali...",
        pilihan = listOf(
           " Pendidikan kewarganegaraan",
             " Pelatihan dasar kemiliteran secara wajib bagi kelompok tertentu sesuai undang-undang",
            " Pengabdian sebagai prajurit Tentara Nasional Indonesia secara sukarela atau wajib",
            " Aksi demonstrasi anarkis guna menuntut pembatalan suatu kebijakan pemerintah",
            " Pengabdian sesuai dengan profesi masing-masing"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Aksi demonstrasi anarkis guna menuntut pembatalan suatu kebijakan pemerintah",
        skalaPoin = null,
        pembahasan = "Berdasarkan UU No. 23 Tahun 2019 tentang Pengelolaan Sumber Daya Nasional untuk Pertahanan Negara, demonstrasi anarkis bukan merupakan bentuk keikutsertaan bela negara melainkan tindakan pelanggaran hukum."
    ),

    QuestionEntity(
        idSoal = "twk_bahasa_13",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Bahasa Indonesia ditetapkan sebagai bahasa negara tercantum dalam UUD 1945 Pasal...",
        pilihan = listOf(
           " Pasal 35",
             " Pasal 36",
            " Pasal 36A",
            " Pasal 36B",
            " Pasal 37"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pasal 36",
        skalaPoin = null,
        pembahasan = "Pasal 36 UUD 1945 menegaskan bahwa 'Bahasa Negara ialah Bahasa Indonesia'."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_14",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Sidang pertama BPUPKI yang berlangsung pada tanggal 29 Mei - 1 Juni 1945 secara khusus membahas tentang...",
        pilihan = listOf(
           " Rancangan Batang Tubuh UUD",
             " Rumusan Dasar Negara Indonesia",
            " Sistem Pemerintahan RI",
            " Batas wilayah negara Indonesia",
            " Pengangkatan Presiden dan Wakil Presiden"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Rumusan Dasar Negara Indonesia",
        skalaPoin = null,
        pembahasan = "Sidang pertama BPUPKI difokuskan untuk merumuskan fondasi atau dasar negara Indonesia merdeka, di mana Mohammad Yamin, Soepomo, dan Soekarno memaparkan gagasan mereka."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_15",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Sikap mengakui persamaan derajat, persamaan hak, dan kewajiban asasi setiap manusia tanpa membeda-bedakan suku, keturunan, agama, dan jenis kelamin merupakan butir pengamalan Pancasila pada...",
        pilihan = listOf(
           " Sila Pertama",
             " Sila Kedua",
            " Sila Ketiga",
            " Sila Keempat",
            " Sila Kelima"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Sila Kedua",
        skalaPoin = null,
        pembahasan = "Menghargai persamaan derajat, harkat, dan martabat manusia sebagai makhluk ciptaan Tuhan merupakan esensi dari Kemanusiaan yang Adil dan Beradab (Sila ke-2)."
    ),

    QuestionEntity(
        idSoal = "twk_integritas_16",
        kategori = "TWK",
        subKategori = "Integritas",
        pertanyaan = "Dalam konteks penyelenggaraan negara yang bersih, 'Integritas' seorang aparatur sipil negara diartikan sebagai...",
        pilihan = listOf(
           " Kemampuan bekerja lembur tanpa menuntut tunjangan tambahan",
             " Keselarasan antara perkataan, hati nurani, dan tindakan nyata yang berpegang pada nilai moral dan etika publik",
            " Kepatuhan mutlak kepada seluruh perintah atasan meskipun melanggar regulasi",
            " Kecerdasan dalam memecahkan masalah birokrasi yang kompleks",
            " Sikap ramah kepada rekan kerja untuk menghindari konflik internal"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Keselarasan antara perkataan, hati nurani, dan tindakan nyata yang berpegang pada nilai moral dan etika publik",
        skalaPoin = null,
        pembahasan = "Integritas diukur dari kesesuaian antara pikiran, perkataan, dan perbuatan terhadap norma hukum, agama, dan etika profesi."
    ),

    QuestionEntity(
        idSoal = "twk_uud_17",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Lembaga yang berwenang mengusulkan pengangkatan hakim agung dan mempunyai wewenang lain dalam rangka menjaga dan menegakkan kehormatan, keluhuran martabat, serta perilaku hakim adalah...",
        pilihan = listOf(
           " Mahkamah Agung (MA)",
             " Mahkamah Konstitusi (MK)",
            " Komisi Yudisial (KY)",
            " Dewan Perwakilan Rakyat (DPR)",
            " Kejaksaan Agung"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Komisi Yudisial (KY)",
        skalaPoin = null,
        pembahasan = "Berdasarkan Pasal 24B Ayat (1) UUD 1945, Komisi Yudisial bersifat mandiri yang berwenang mengusulkan pengangkatan hakim agung serta menjaga martabat perilaku hakim."
    ),

    QuestionEntity(
        idSoal = "twk_nasionalisme_18",
        kategori = "TWK",
        subKategori = "Nasionalisme",
        pertanyaan = "Nasionalisme chauvinistik merupakan bentuk nasionalisme yang berlebihan dan ekstrem. Dampak buruk dari diterapkannya paham chauvinisme dalam kehidupan antar-negara adalah...",
        pilihan = listOf(
           " Meningkatnya kerja sama ekonomi regional",
             " Munculnya rasa saling menghormati kedaulatan bangsa lain",
            " Lahirnya kebijakan perlindungan lingkungan global",
            " Terjadinya konflik dan imperialisme karena menganggap bangsa lain lebih rendah",
            " Mempercepat proses asimilasi budaya dunia"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Terjadinya konflik dan imperialisme karena menganggap bangsa lain lebih rendah",
        skalaPoin = null,
        pembahasan = "Chauvinisme adalah paham nasionalisme sempit yang mengagungkan bangsa sendiri secara berlebihan sambil merendahkan bangsa lain, yang sering memicu fasisme atau penjajahan."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_19",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Peristiwa Rengasdengklok yang terjadi pada tanggal 16 Agustus 1945 menunjukkan adanya dinamika perjuangan berupa...",
        pilihan = listOf(
           " Kerja sama erat antara tokoh Indonesia dengan pihak militer Jepang untuk menyatakan kemerdekaan",
             " Perbedaan strategi antara golongan tua dan golongan muda terkait momentum dan mekanisme proklamasi kemerdekaan",
            " Pemberontakan bersenjata rakyat Jawa Barat terhadap dominasi tentara Sekutu",
            " Strategi penipuan yang dilakukan Belanda untuk menangkap Soekarno-Hatta",
            " Kesepakatan membagi wilayah Indonesia menjadi serikat"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Perbedaan strategi antara golongan tua dan golongan muda terkait momentum dan mekanisme proklamasi kemerdekaan",
        skalaPoin = null,
        pembahasan = "Peristiwa Rengasdengklok dipicu oleh keinginan golongan muda agar proklamasi dilakukan secepatnya tanpa campur tangan PPKI (yang dianggap buatan Jepang), sementara golongan tua ingin bersikap lebih berhati-hati."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_20",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Bentuk pemerintahan Indonesia adalah Republik, sedangkan bentuk negaranya adalah Kesatuan. Hal ini secara tegas diatur dalam UUD 1945 pasal...",
        pilihan = listOf(
           " Pasal 1 Ayat (1)",
             " Pasal 1 Ayat (2)",
            " Pasal 1 Ayat (3)",
            " Pasal 2 Ayat (1)",
            " Pasal 4 Ayat (1)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Pasal 1 Ayat (1)",
        skalaPoin = null,
        pembahasan = "Pasal 1 Ayat (1) UUD 1945 berbunyi: 'Negara Indonesia ialah Negara Kesatuan, yang berbentuk Republik'."
    ),

    QuestionEntity(
        idSoal = "twk_uud_21",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Sebelum dilakukan amandemen, UUD 1945 menempatkan sebuah lembaga sebagai lembaga tertinggi negara yang memegang kedaulatan rakyat sepenuhnya. Lembaga yang dimaksud adalah...",
        pilihan = listOf(
           " Presiden",
             " Dewan Perwakilan Rakyat",
            " Majelis Permusyawaratan Rakyat",
            " Mahkamah Agung",
            " Dewan Pertimbangan Agung"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Majelis Permusyawaratan Rakyat",
        skalaPoin = null,
        pembahasan = "Sebelum amandemen, berdasar Pasal 1 Ayat (2) UUD 1945 yang lama, kedaulatan berada di tangan rakyat dan dilakukan sepenuhnya oleh MPR selaku Lembaga Tertinggi Negara."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_22",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Suatu daerah berhasil menurunkan angka stunting secara drastis karena pemerintah daerah setempat aktif menggerakkan posyandu, memberikan insentif gizi bagi ibu hamil, serta memastikan pelayanan kesehatan dasar menyentuh masyarakat miskin di pelosok. Keberhasilan ini searah dengan pencapaian...",
        pilihan = listOf(
           " Sila ke-1 Pancasila",
             " Sila ke-2 Pancasila",
            " Sila ke-3 Pancasila",
            " Sila ke-4 Pancasila",
            " Sila ke-5 Pancasila"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "E. Sila ke-5 Pancasila",
        skalaPoin = null,
        pembahasan = "Keadilan sosial (Sila ke-5) mencakup pemerataan kesejahteraan dan pelayanan publik dasar, termasuk akses kesehatan dan gizi bagi seluruh lapisan masyarakat tanpa terkecuali."
    ),

    QuestionEntity(
        idSoal = "twk_bhineka_23",
        kategori = "TWK",
        subKategori = "Bhineka Tunggal Ika",
        pertanyaan = "Globalisasi membawa masuk pertukaran kebudayaan barat yang sangat masif di kalangan remaja. Salah satu sikap pilar Bhinneka Tunggal Ika yang tepat dalam menyaring dampak negatif tren luar tersebut adalah...",
        pilihan = listOf(
           " Melarang keras pemutaran musik dan film asing di media penyiaran nasional",
             " Menumbuhkan kebanggaan atas identitas budaya lokal tanpa menutup diri dari perkembangan zaman yang positif",
            " Mengisolasi diri dan komunitas dari dunia digital internasional",
            " Menolak mentah-mentah seluruh inovasi teknologi yang berasal dari negara barat",
            " Mengadopsi budaya asing seutuhnya agar bangsa dipandang maju dan modern"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menumbuhkan kebanggaan atas identitas budaya lokal tanpa menutup diri dari perkembangan zaman yang positif",
        skalaPoin = null,
        pembahasan = "Keberagaman dalam Bhinneka Tunggal Ika diuji oleh zaman. Ketahanan budaya nasional dibangun dengan memperkuat identitas internal (lokal) dan bersikap selektif-adaptif terhadap tren eksternal."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_24",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Asas yang menentukan kewarganegaraan seseorang berdasarkan tempat kelahiran, yang dianut oleh sebagian negara di dunia, dikenal dengan istilah...",
        pilihan = listOf(
           " Ius Sanguinis",
             " Ius Soli",
            " Apatride",
            " Bipatride",
            " Stelsel Aktif"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Ius Soli",
        skalaPoin = null,
        pembahasan = "Ius Soli (asas kedaerahan/tempat kelahiran) menentukan warga negara berdasarkan lokasi lahir, sedangkan Ius Sanguinis menentukan berdasarkan pertalian darah/keturunan orang tua."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_25",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Kesadaran rela berkorban untuk bangsa dan negara dapat ditunjukkan oleh seorang mahasiswa melalui tindakan...",
        pilihan = listOf(
           " Menyisihkan waktu belajar untuk membantu riset komersial dosen demi imbalan materi",
             " Membantu mengedukasi literasi digital dan mengajar anak-anak di desa tertinggal secara sukarela",
            " Mengikuti aksi unjuk rasa di jalanan hingga memicu kemacetan parah di pusat kota",
            " Membeli barang-barang bermerek luar negeri untuk gengsi sosial",
            " Berfokus sepenuhnya pada IPK pribadi tanpa memedulikan lingkungan sosial sekitar"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membantu mengedukasi literasi digital dan mengajar anak-anak di desa tertinggal secara sukarela",
        skalaPoin = null,
        pembahasan = "Mendarmabaktikan ilmu pengetahuan dan waktu demi kemajuan masyarakat marjinal/tertinggal merupakan implementasi nyata nilai rela berkorban untuk kemajuan bangsa."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_26",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Kongres Pemuda II pada 27-28 Oktober 1928 melahirkan Sumpah Pemuda. Salah satu dampak politik paling signifikan dari peristiwa sejarah ini terhadap pergerakan nasional adalah...",
        pilihan = listOf(
           " Belanda langsung memberikan hak otonomi daerah bagi organisasi kepemudaan",
             " Pembubaran seluruh partai politik bentukan tokoh pribumi oleh intelijen Belanda",
            " Meleburnya sifat perjuangan yang semula kedaerahan menjadi satu kesatuan visi nasional",
            " Dimulainya perjuangan bersenjata secara serentak di seluruh wilayah nusantara",
            " Ditetapkannya Soekarno sebagai pemimpin tunggal pergerakan saat itu"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Meleburnya sifat perjuangan yang semula kedaerahan menjadi satu kesatuan visi nasional",
        skalaPoin = null,
        pembahasan = "Sumpah Pemuda meruntuhkan ego kesukuan (Jong Java, Jong Sumatranen Bond, dll.) dan menyatukannya dalam satu ikatan tumpah darah, bangsa, dan bahasa yang sama: Indonesia."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_27",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Ketika terjadi bencana gempa bumi, sekelompok relawan medis bergegas mendirikan tenda darurat dan melakukan operasi medis tanpa memungut biaya, murni didorong oleh rasa kemanusiaan demi menyelamatkan nyawa korban. Tindakan ini mencerminkan nilai...",
        pilihan = listOf(
           " Nilai Vital",
             " Nilai Kerohanian",
            " Nilai Material",
            " Nilai Praksis Sila Kedua",
            " Nilai Praksis Sila Ketiga"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Nilai Praksis Sila Kedua",
        skalaPoin = null,
        pembahasan = "Aksi kemanusiaan, tenggang rasa, gemar melakukan kegiatan sosial, dan menjunjung tinggi hak hidup orang lain tergolong pengamalan konkret (praksis) Sila ke-2 Pancasila."
    ),

    QuestionEntity(
        idSoal = "twk_uud_28",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Konstitusi RI yang pernah berlaku dan mengubah sistem pemerintahan Indonesia dari presidensial menjadi parlementer di awal masa kemerdekaan (November 1945) dipicu oleh diterbitkannya...",
        pilihan = listOf(
           " Dekrit Presiden 5 Juli 1959",
             " Maklumat Pemerintah No. X tanggal 16 Oktober 1945",
            " Maklumat Wakil Presiden tanggal 3 November 1945",
            " Maklumat Pemerintah tanggal 14 November 1945",
            " Supersemar"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Maklumat Pemerintah tanggal 14 November 1945",
        skalaPoin = null,
        pembahasan = "Maklumat Pemerintah tanggal 14 November 1945 mengubah sistem kabinet presidensial (di bawah Presiden) menjadi kabinet parlementer yang dipimpin oleh seorang Perdana Menteri (Sutan Sjahrir)."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_29",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Politik luar negeri Indonesia bersifat 'Bebas Aktif'. Kata 'Aktif' dalam prinsip ini mengandung makna bahwa Indonesia...",
        pilihan = listOf(
           " Harus ikut campur dalam urusan dalam negeri negara tetangga",
             " Berpartisipasi aktif dalam perdamaian dunia dan meredakan ketegangan internasional",
            " Selalu memihak blok pertahanan militer negara-negara berkembang",
            " Agresif memperluas pengaruh wilayah ekonomi ke Samudra Pasifik",
            " Membuka pangkalan militer asing di wilayah perbatasan laut"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Berpartisipasi aktif dalam perdamaian dunia dan meredakan ketegangan internasional",
        skalaPoin = null,
        pembahasan = "Bebas artinya tidak memihak blok ideologi/militer mana pun. Aktif artinya berkontribusi nyata menjaga perdamaian dunia sesuai dengan amanat Pembukaan UUD 1945 Alinea ke-4."
    ),

    QuestionEntity(
        idSoal = "twk_bhineka_30",
        kategori = "TWK",
        subKategori = "Bhineka Tunggal Ika",
        pertanyaan = "Keberadaan sengketa lahan adat sering kali memicu konflik horizontal. Peran negara yang paling adil dalam menyelesaikan konflik berbasis masyarakat hukum adat sesuai prinsip keadilan sosial adalah...",
        pilihan = listOf(
           " Mengutamakan kepentingan korporasi besar demi menaikkan pendapatan daerah",
             " Menghapus status tanah adat agar status hukum tanah di seluruh Indonesia seragam",
            " Melakukan mediasi dengan menghormati hak tradisional masyarakat adat yang diakui hukum",
            " Menggunakan aparat keamanan untuk mengosongkan lahan secara sepihak",
            " Menyarankan masyarakat adat pindah ke pulau lain"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Melakukan mediasi dengan menghormati hak tradisional masyarakat adat yang diakui hukum",
        skalaPoin = null,
        pembahasan = "Negara mengakui dan menghormati kesatuan-kesatuan masyarakat hukum adat beserta hak-hak tradisionalnya selama masih hidup (Pasal 18B Ayat 2 UUD 1945). Penyelesaian sengketa harus menjunjung tinggi pengakuan ini."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_31",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Kedudukan Pancasila sebagai 'Staatsfundamentalnorm' diartikan bahwa Pancasila merupakan...",
        pilihan = listOf(
           " Norma hukum tertulis yang sanksinya dapat diubah sewaktu-waktu oleh presiden",
             " Landasan hukum operasional dalam pembuatan keputusan pengadilan negeri",
            " Pokok kaidah fundamental negara yang kedudukannya tetap, kuat, dan tidak dapat diubah oleh lembaga mana pun termasuk MPR",
            " Undang-undang organik yang mengatur tata cara pemilu legislatif",
            " Perjanjian luhur yang dibuat khusus untuk kepentingan golongan mayoritas"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Pokok kaidah fundamental negara yang kedudukannya tetap, kuat, dan tidak dapat diubah oleh lembaga mana pun termasuk MPR",
        skalaPoin = null,
        pembahasan = "Sebagai Staatsfundamentalnorm (Norma Fundamental Negara), Pancasila adalah sumber dari segala sumber hukum yang mengikat dan menjadi dasar pembentukan hukum di bawahnya."
    ),

    QuestionEntity(
        idSoal = "twk_uud_32",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Bagian dari UUD 1945 yang tidak dapat diubah (diamandemen) oleh Majelis Permusyawaratan Rakyat adalah Pembukaan. Alasan hukum utama di balik larangan ini adalah...",
        pilihan = listOf(
           " Pembukaan ditulis dengan bahasa sastra kuno yang sulit diinterpretasi ulang",
             " Mengubah Pembukaan sama saja dengan membubarkan NKRI karena di dalamnya terdapat tujuan dan dasar negara",
            " Pembukaan tidak memuat pasal-pasal operasional pemerintahan",
            " Jumlah kata dalam Pembukaan terlalu sedikit untuk diamandemen",
            " Seluruh pasal dalam Pembukaan sudah diadopsi oleh hukum tata negara internasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengubah Pembukaan sama saja dengan membubarkan NKRI karena di dalamnya terdapat tujuan dan dasar negara",
        skalaPoin = null,
        pembahasan = "Pembukaan UUD 1945 memuat cita-cita luhur, proklamasi, tujuan negara, serta Pancasila sebagai dasar negara. Sesuai kesepakatan dasar MPR, bagian Pembukaan tidak boleh diubah karena berisikan fundamen berdirinya negara."
    ),

    QuestionEntity(
        idSoal = "twk_integritas_33",
        kategori = "TWK",
        subKategori = "Integritas",
        pertanyaan = "Seorang petugas imigrasi mendapati bahwa salah satu kerabat dekatnya melakukan pelanggaran dokumen keimigrasian. Demi menegakkan integritas nasional, tindakan petugas tersebut sebaiknya...",
        pilihan = listOf(
           " Membantu mengoreksi dokumen di luar prosedur resmi agar kerabatnya terhindar dari sanksi",
             " Menyerahkan berkas pemeriksaan kepada rekan kerja lain agar proses hukum tetap berjalan objektif",
            " Membiarkannya lolos untuk kali ini dengan jaminan kerabat tersebut tidak akan mengulanginya",
            " Berpura-pura tidak tahu dan melimpahkan kesalahan pada sistem komputer imigrasi",
            " Mengundurkan diri dari jabatan agar tidak terbebani oleh pilihan moral"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menyerahkan berkas pemeriksaan kepada rekan kerja lain agar proses hukum tetap berjalan objektif",
        skalaPoin = null,
        pembahasan = "Integritas menuntut penolakan terhadap benturan kepentingan (conflict of interest). Menyerahkan penanganan ke rekan kerja demi asas objektivitas hukum tanpa pandang bulu adalah pilihan etis yang paling tepat."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_34",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Ancaman nonmiliter merupakan ancaman yang menggunakan faktor-faktor nonmiliter yang dinilai mempunyai kemampuan membahayakan kedaulatan negara. Salah satu contoh ancaman nonmiliter di bidang ekonomi adalah...",
        pilihan = listOf(
           " Agresi militer negara asing ke wilayah perbatasan laut pulau terluar",
             " Penyelundupan senjata api ilegal oleh kelompok separatis bersenjata",
            " Ketergantungan akut terhadap komoditas impor yang merusak industri dan stabilitas pasar domestik",
            " Pelanggaran wilayah udara oleh pesawat tempur tak dikenal",
            " Spionase siber terhadap database rahasia pangkalan militer nasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Ketergantungan akut terhadap komoditas impor yang merusak industri dan stabilitas pasar domestik",
        skalaPoin = null,
        pembahasan = "Ancaman ekonomi nonmiliter meliputi inflasi, pengangguran, sistem ekonomi yang tidak kompetitif, serta ketergantungan yang tinggi terhadap pasokan luar negeri sehingga menjatuhkan kedaulatan ekonomi dalam negeri."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_35",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Perjanjian Linggajati (1947) memicu pro dan kontra di internal tokoh perjuangan bangsa. Dampak kerugian geopolitik bagi Indonesia akibat ditandatanganinya perjanjian tersebut adalah...",
        pilihan = listOf(
           " Wilayah de facto Indonesia menyusut dan hanya diakui meliputi Jawa, Madura, dan Sumatra",
             " Indonesia harus membayar ganti rugi seluruh biaya perang kepada pihak Kerajaan Belanda",
            " Pembubaran institusi Tentara Nasional Indonesia secara permanen",
            " Ibu kota Jakarta harus diserahkan seutuhnya ke bawah kontrol administrasi Sekutu",
            " Kembalinya kekuasaan militer Jepang di wilayah timur Indonesia"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Wilayah de facto Indonesia menyusut dan hanya diakui meliputi Jawa, Madura, dan Sumatra",
        skalaPoin = null,
        pembahasan = "Melalui Perjanjian Linggajati, Belanda hanya mengakui secara de facto wilayah Republik Indonesia atas Jawa, Sumatra, dan Madura, yang memicu kekecewaan sebagian tokoh nasional karena mengaburkan klaim seluruh nusantara."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_36",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Nilai ketuhanan pada Sila Pertama Pancasila dalam tata hukum Indonesia melahirkan prinsip kebebasan beragama yang bermakna bahwa...",
        pilihan = listOf(
           " Setiap individu dibebaskan untuk tidak memercayai keberadaan Tuhan Yang Maha Esa",
             " Negara berhak memaksa seseorang pindah agama demi menjaga kedamaian wilayah",
            " Setiap warga negara bebas memeluk agama dan beribadah sesuai dengan keyakinannya tanpa paksaan dari pihak mana pun",
            " Hanya agama mayoritas yang berhak mendirikan rumah ibadah di fasilitas umum",
            " Hukum nasional harus didasarkan sepenuhnya pada hukum satu agama tertentu"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Setiap warga negara bebas memeluk agama dan beribadah sesuai dengan keyakinannya tanpa paksaan dari pihak mana pun",
        skalaPoin = null,
        pembahasan = "Pasal 29 Ayat (2) UUD 1945 menjamin kemerdekaan tiap-tiap penduduk untuk memeluk agamanya masing-masing dan beribadah menurut agama dan kepercayaannya itu, yang diturunkan dari esensi Sila ke-1."
    ),

    QuestionEntity(
        idSoal = "twk_uud_37",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Hak DPR untuk melakukan penyelidikan terhadap pelaksanaan suatu undang-undang atau kebijakan pemerintah yang berkaitan dengan hal penting, strategis, dan berdampak luas pada kehidupan bermasyarakat disebut...",
        pilihan = listOf(
           " Hak Interpelasi",
             " Hak Angket",
            " Hak Menyatakan Pendapat",
            " Hak Imunitas",
            " Hak Budget"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Hak Angket",
        skalaPoin = null,
        pembahasan = "Hak Angket adalah hak DPR untuk melakukan penyelidikan. Hak Interpelasi adalah hak meminta keterangan kepada pemerintah. Hak Menyatakan Pendapat adalah tindak lanjut dari interpelasi/angket."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_38",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Deklarasi Djuanda yang dicetuskan pada tanggal 13 Desember 1957 mempunyai arti penting bagi kedaulatan wilayah NKRI karena...",
        pilihan = listOf(
           " Mengubah batas daratan Indonesia dengan wilayah Malaysia secara damai",
             " Menetapkan bahwa laut di antara pulau-pulau nusantara merupakan satu kesatuan wilayah laut nasional yang utuh",
            " Mengizinkan kapal perang asing berpatroli secara bebas di perairan Indonesia",
            " Membuka perdagangan bebas internasional di seluruh pelabuhan utama",
            " Mengakhiri konfrontasi militer dengan Australia terkait sengketa celah Timor"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menetapkan bahwa laut di antara pulau-pulau nusantara merupakan satu kesatuan wilayah laut nasional yang utuh",
        skalaPoin = null,
        pembahasan = "Sebelum Deklarasi Djuanda, Indonesia memakai aturan kolonial (TZMKO 1939) di mana laut teritorial hanya 3 mil dari garis pantai, membuat laut antarpulau berstatus laut bebas. Deklarasi Djuanda menyatukan darat dan laut menjadi kesatuan tunggal NKRI."
    ),

    QuestionEntity(
        idSoal = "twk_bhineka_39",
        kategori = "TWK",
        subKategori = "Bhineka Tunggal Ika",
        pertanyaan = "Konflik berlatar belakang perbedaan suku dan ras dapat diredam jika masyarakat mengembangkan sikap toleransi multikultural, yang diwujudkan melalui...",
        pilihan = listOf(
           " Sikap stereotip negatif terhadap kebiasaan suku lain yang berbeda",
             " Menghargai keunikan adat istiadat kelompok lain tanpa memandangnya lebih rendah dari budaya sendiri",
            " Menuntut seluruh suku minoritas berasimilasi total menghilangkan adat aslinya",
            " Mengelompokkan area tempat tinggal warga berdasarkan asal daerah",
            " Melakukan modernisasi paksa terhadap komunitas adat yang terisolasi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menghargai keunikan adat istiadat kelompok lain tanpa memandangnya lebih rendah dari budaya sendiri",
        skalaPoin = null,
        pembahasan = "Prinsip Bhinneka Tunggal Ika menuntut apresiasi terhadap perbedaan pluralitas budaya secara horizontal, menjauhi etnosentrisme (menganggap budayanya sendiri paling hebat)."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_40",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Sistem Pertahanan dan Keamanan Rakyat Semesta (Sishankamrata) menempatkan Tentara Nasional Indonesia (TNI) dan Kepolisian Negara Republik Indonesia (Polri) berkedudukan sebagai...",
        pilihan = listOf(
           " Kekuatan pendukung",
             " Kekuatan utama",
            " Kekuatan cadangan",
            " Kekuatan operasional tunggal",
            " Kekuatan administratif"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kekuatan utama",
        skalaPoin = null,
        pembahasan = "Berdasarkan Pasal 30 Ayat (2) UUD 1945, TNI dan Polri merupakan kekuatan utama, sedangkan rakyat merupakan kekuatan pendukung dalam pertahanan keamanan negara."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_41",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Ketika merumuskan dasar negara pada sidang BPUPKI, para tokoh nasional memiliki latar belakang ideologi dan agama yang beraneka ragam, namun mereka berhasil mencapai mufakat demi persatuan Indonesia. Sikap kepemimpinan ini mencerminkan integrasi...",
        pilihan = listOf(
           " Sila ke-1 dan Sila ke-3 Pancasila",
             " Sila ke-3 dan Sila ke-4 Pancasila",
            " Sila ke-2 dan Sila ke-5 Pancasila",
            " Sila ke-1 dan Sila ke-2 Pancasila",
            " Sila ke-4 dan Sila ke-5 Pancasila"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Berlandaskan persatuan (Sila 3) lewat jalan musyawarah mufakat (Sila 4)",
        skalaPoin = null,
        pembahasan = "Proses perumusan dasar negara mengutamakan musyawarah untuk mufakat (Sila ke-4) guna mewujudkan dan mempertahankan persatuan nasional (Sila ke-3)."
    ),

    QuestionEntity(
        idSoal = "twk_uud_42",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Bentuk pembatasan kekuasaan eksekutif presiden setelah amandemen UUD 1945 dalam hal pengangkatan duta dan konsul serta menerima penempatan duta negara lain adalah wajib memperhatikan pertimbangan dari...",
        pilihan = listOf(
           " Majelis Permusyawaratan Rakyat (MPR)",
             " Dewan Perwakilan Rakyat (DPR)",
            " Mahkamah Agung (MA)",
            " Dewan Perwakilan Daerah (DPD)",
            " Menteri Luar Negeri"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Dewan Perwakilan Rakyat (DPR)",
        skalaPoin = null,
        pembahasan = "Sesuai Pasal 13 UUD 1945 pasca amandemen, dalam mengangkat duta/konsul serta menerima duta negara lain, Presiden harus memperhatikan pertimbangan DPR (bukan pertimbangan MA/MPR)."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_43",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Salah satu keputusan krusial hasil sidang PPKI pada tanggal 18 Agustus 1945 yang menjadi tonggak legitimasi ketatanegaraan Indonesia merdeka adalah...",
        pilihan = listOf(
           " Membentuk 12 kementerian negara dan membagi wilayah menjadi 8 provinsi",
             " Mengesahkan Undang-Undang Dasar (UUD 1945) serta memilih Soekarno dan Mohammad Hatta sebagai Presiden dan Wakil Presiden",
            " Membentuk Badan Keamanan Rakyat (BKR) secara formal",
            " Menetapkan pembubaran KNIP (Komite Nasional Indonesia Pusat)",
            " Meresmikan pembentukan Peta (Pembela Tanah Air)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengesahkan Undang-Undang Dasar (UUD 1945) serta memilih Soekarno dan Mohammad Hatta sebagai Presiden dan Wakil Presiden",
        skalaPoin = null,
        pembahasan = "Sidang PPKI tanggal 18 Agustus 1945 melahirkan keputusan penting: mengesahkan UUD 1945, memilih Presiden dan Wapres pertama, serta membentuk Komite Nasional untuk membantu tugas Presiden."
    ),

    QuestionEntity(
        idSoal = "twk_nasionalisme_44",
        kategori = "TWK",
        subKategori = "Nasionalisme",
        pertanyaan = "Sikap nasionalisme progresif di era keterbukaan informasi global saat ini menuntut warga negara untuk...",
        pilihan = listOf(
           " Menolak kerja sama investasi asing karena berpotensi mengurangi kedaulatan penuh",
             " Meningkatkan kualitas kompetensi diri dan daya saing global inovasi lokal di kancah internasional",
            " Menggunakan produk dalam negeri meskipun kualitasnya jauh di bawah standar kelayakan",
            " Membatasi akses internet dari luar negeri agar ideologi transnasional tidak masuk",
            " Mengagungkan masa lalu kejayaan kerajaan nusantara tanpa melakukan aksi nyata di masa kini"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Meningkatkan kualitas kompetensi diri dan daya saing global inovasi lokal di kancah internasional",
        skalaPoin = null,
        pembahasan = "Nasionalisme modern tidak bersifat menutup diri (xenofobia), melainkan proaktif meningkatkan daya saing bangsa, keahlian SDM, dan inovasi domestik agar mampu berkompetisi di arena global."
    ),

    QuestionEntity(
        idSoal = "twk_pancasila_45",
        kategori = "TWK",
        subKategori = "Pancasila",
        pertanyaan = "Prinsip 'Keadilan Sosial' dalam Sila Kelima Pancasila melarang adanya gaya hidup mewah dan pemborosan. Aturan nilai praksis ini menekankan pentingnya sikap...",
        pilihan = listOf(
           " Mengabaikan hak milik pribadi demi kesejahteraan komunal bersama",
             " Mengembangkan pola konsumsi yang hemat dan menghargai hasil karya ekonomi orang lain",
            " Membatasi pendapatan maksimal pengusaha agar tidak terjadi jurang kekayaan",
            " Menyerahkan seluruh manajemen distribusi pangan nasional ke badan usaha swasta",
            " Mengutamakan tabungan valuta asing daripada mata uang rupiah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengembangkan pola konsumsi yang hemat dan menghargai hasil karya ekonomi orang lain",
        skalaPoin = null,
        pembahasan = "Salah satu butir pengamalan Sila ke-5 adalah tidak menggunakan hak milik untuk hal-hal yang bersifat pemborosan, gaya hidup mewah, serta menghargai karya yang dihasilkan orang lain."
    ),

    QuestionEntity(
        idSoal = "twk_uud_46",
        kategori = "TWK",
        subKategori = "UUD 1945",
        pertanyaan = "Amandemen UUD 1945 yang dilakukan sebanyak 4 kali sepanjang tahun 1999-2002 diarahkan pada reposisi struktur ketatanegaraan. Amandemen Pertama yang disahkan pada tahun 1999 difokuskan pada...",
        pilihan = listOf(
           " Pembatasan kekuasaan kekuasaan Presiden dan penguatan fungsi legislatif DPR",
             " Pembentukan Mahkamah Konstitusi dan Komisi Yudisial",
            " Pengaturan sistem otonomi daerah dan pemilihan kepala daerah langsung",
            " Perubahan mekanisme pemilihan Presiden dari MPR menjadi langsung oleh rakyat",
            " Penghapusan keberadaan lembaga Dewan Pertimbangan Agung (DPA)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Pembatasan kekuasaan kekuasaan Presiden dan penguatan fungsi legislatif DPR",
        skalaPoin = null,
        pembahasan = "Amandemen Pertama (19 Oktober 1999) bertujuan membatasi kekuasaan eksekutif Presiden yang dinilai terlalu kuat (executive heavy) pada masa Orde Baru dan memperkuat porsi pengawasan legislatif."
    ),

    QuestionEntity(
        idSoal = "twk_belanegara_47",
        kategori = "TWK",
        subKategori = "Bela Negara",
        pertanyaan = "Aksi terorisme, radikalisme ekstrem, dan persebaran doktrin khilafah yang berniat mengganti ideologi Pancasila dikategorikan sebagai jenis ancaman terhadap...",
        pilihan = listOf(
           " Kedaulatan fisik wilayah maritim",
             " Keamanan ekonomi makro",
            " Pertahanan ideologi dan kedaulatan politik negara",
            " Ketahanan sumber daya alam hayati",
            " Integrasi logistik nasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Pertahanan ideologi dan kedaulatan politik negara",
        skalaPoin = null,
        pembahasan = "Gerakan yang berupaya meruntuhkan konsensus dasar negara (Pancasila) merupakan ancaman nonmiliter serius terhadap pertahanan ideologi dan keutuhan politik NKRI."
    ),

    QuestionEntity(
        idSoal = "twk_nkri_48",
        kategori = "TWK",
        subKategori = "NKRI",
        pertanyaan = "Badan yang dibentuk oleh pemerintah Indonesia untuk mengelola, mengawasi, dan mengoordinasikan pembangunan infrastruktur di kawasan berbatasan langsung dengan negara tetangga adalah...",
        pilihan = listOf(
           " Badan Nasional Penanggulangan Bencana (BNPB)",
             " Badan Nasional Pengelola Perbatasan (BNPP)",
            " Badan Pusat Statistik (BPS)",
            " Badan Siber dan Sandi Negara (BSSN)",
            " Badan Koordinasi Penanaman Modal (BKPM)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Badan Nasional Pengelola Perbatasan (BNPP)",
        skalaPoin = null,
        pembahasan = "BNPP bertugas mengelola batas wilayah negara dan mengoordinasikan pembangunan kawasan perbatasan agar ketahanan dan kesejahteraan di beranda terdepan NKRI terjaga."
    ),

    QuestionEntity(
        idSoal = "twk_sejarah_49",
        kategori = "TWK",
        subKategori = "Sejarah Perjuangan",
        pertanyaan = "Setelah Agresi Militer Belanda II dilancarkan dan Yogyakarta jatuh, jalannya roda pemerintahan Republik Indonesia diselamatkan lewat pembentukan Pemerintahan Darurat Republik Indonesia (PDRI) di Sumatra Barat yang dipimpin oleh...",
        pilihan = listOf(
           " Sutan Sjahrir",
             " Tan Malaka",
            " Sjafruddin Prawiranegara",
            " Jenderal Soedirman",
            " Mohammad Natsir"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Sjafruddin Prawiranegara",
        skalaPoin = null,
        pembahasan = "Sjafruddin Prawiranegara menerima mandat kilat untuk memimpin PDRI (1948-1949) di Bukittinggi guna membuktikan kepada dunia internasional bahwa pemerintahan RI masih berdiri tegak meski Soekarno-Hatta ditawan."
    ),

    QuestionEntity(
        idSoal = "twk_integritas_50",
        kategori = "TWK",
        subKategori = "Integritas",
        pertanyaan = "Di sebuah instansi pelayanan publik, seorang ASN menolak melayani calo tiket meskipun ditawari pembagian keuntungan finansial yang besar. Ia tetap konsisten meminta pengguna jasa mengantre sesuai prosedur digital instansi. Karakter ASN ini mencerminkan integritas tingkat...",
        pilihan = listOf(
           " Menghindari hukuman disiplin semata",
             " Mencari pujian dan pengakuan dari atasan langsung",
            " Internalisasi nilai moral universal dan kepatuhan kode etik secara konsisten dan mandiri",
            " Sikap kaku yang menghambat percepatan bisnis pelayanan publik",
            " Ketakutan terhadap pengawasan CCTV ruang kerja"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Internalisasi nilai moral universal dan kepatuhan kode etik secara konsisten dan mandiri",
        skalaPoin = null,
        pembahasan = "Integritas sejati (level tinggi) ditandai oleh kepatuhan internal atas nilai moral dan kode etik profesi secara mandiri, bukan karena takut hukuman, diawasi kamera, atau demi mengejar pujian eksternal."
    )
	)
}
