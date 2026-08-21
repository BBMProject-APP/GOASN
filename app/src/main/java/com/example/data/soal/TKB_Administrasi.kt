package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalAdministrasi {
    val daftarSoal = listOf(
	QuestionEntity(
        idSoal = "ADM_01",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Pekerjaan kantor yang meliputi pencatatan, pengelompokan, dan penyimpanan dokumen secara sistematis agar mudah ditemukan kembali disebut...",
        pilihan = listOf(" Pengarsipan",  " Inventarisasi", " Penggandaan", " Pengolahan Data", " Tata Usaha"),
        tipeScoring = "STANDAR",
        jawabanBenar = " Pengarsipan",
        pembahasan = "Pengarsipan adalah proses pengelolaan dokumen secara sistematis agar efisien saat diperlukan kembali."
    ),
    QuestionEntity(
        idSoal = "ADM_02",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam manajemen kantor, prinsip 'Efisiensi' berarti...",
        pilihan = listOf(  " Menyelesaikan pekerjaan dengan biaya semurah mungkin",  " Menyelesaikan pekerjaan dengan hasil maksimal menggunakan sumber daya minimal", " Bekerja secepat mungkin tanpa melihat hasil", " Menggunakan alat tercanggih", " Mempekerjakan banyak staf"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menyelesaikan pekerjaan dengan hasil maksimal menggunakan sumber daya minimal",
        pembahasan = "Efisiensi menekankan perbandingan terbaik antara input (sumber daya) dan output (hasil)."
    ),
    QuestionEntity(
        idSoal = "ADM_03",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Fungsi manajemen menurut Henry Fayol yang mencakup pemberian instruksi dan arahan kepada bawahan agar tujuan tercapai adalah...",
        pilihan = listOf(  " Planning",  " Organizing", " Commanding/Directing", " Coordinating", " Controlling"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Commanding/Directing",
        pembahasan = "Directing adalah pengarahan agar karyawan bekerja sesuai dengan tujuan organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_04",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Sistem penyimpanan arsip berdasarkan abjad yang disusun dari A sampai Z disebut...",
        pilihan = listOf(  " Sistem Subjek",  " Sistem Kronologis", " Sistem Geografis", " Sistem Alfabetis", " Sistem Numerik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Sistem Alfabetis",
        pembahasan = "Sistem alfabetis menggunakan susunan abjad (nama orang, nama instansi) sebagai dasar penyimpanan."
    ),
    QuestionEntity(
        idSoal = "ADM_05",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Gaya kepemimpinan yang cenderung mengambil keputusan sendiri tanpa melibatkan bawahan adalah gaya...",
        pilihan = listOf(  " Demokratis",  " Delegatif", " Otoriter", " Situasional", " Laissez-faire"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Otoriter",
        pembahasan = "Gaya otoriter memusatkan kekuasaan dan pengambilan keputusan sepenuhnya pada pemimpin."
    ),
    QuestionEntity(
        idSoal = "ADM_06",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Kegiatan menyiapkan sarana dan prasarana yang diperlukan dalam rapat disebut...",
        pilihan = listOf(  " Agenda rapat",  " Notulensi", " Persiapan rapat", " Evaluasi rapat", " Pelaksanaan rapat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Persiapan rapat",
        pembahasan = "Persiapan rapat meliputi penyiapan tempat, alat tulis, peralatan presentasi, hingga konsumsi."
    ),
    QuestionEntity(
        idSoal = "ADM_07",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dokumen yang memuat ringkasan jalannya rapat, keputusan yang diambil, dan siapa penanggung jawabnya disebut...",
        pilihan = listOf(  " Undangan",  " Laporan", " Notula/Notulensi", " Agenda", " Memo"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Notula/Notulensi",
        pembahasan = "Notula adalah rekaman tertulis dari apa yang dibahas dan diputuskan dalam rapat."
    ),
    QuestionEntity(
        idSoal = "ADM_08",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Teknik delegasi yang baik adalah...",
        pilihan = listOf(  " Memberikan tugas sulit kepada bawahan lalu lepas tangan",  " Memberikan tanggung jawab dan wewenang yang seimbang", " Mendelegasikan semua pekerjaan agar pemimpin santai", " Hanya memberikan perintah lisan", " Menahan informasi agar bawahan bergantung pada atasan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memberikan tanggung jawab dan wewenang yang seimbang",
        pembahasan = "Delegasi yang efektif harus disertai dengan wewenang yang cukup untuk melaksanakan tanggung jawab tersebut."
    ),
    QuestionEntity(
        idSoal = "ADM_09",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Fungsi dari 'Petty Cash' (Kas Kecil) dalam administrasi kantor adalah...",
        pilihan = listOf(  " Membayar gaji karyawan",  " Membiayai pengeluaran rutin kantor yang jumlahnya relatif kecil", " Investasi jangka panjang perusahaan", " Membeli aset gedung", " Membayar hutang bank"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membiayai pengeluaran rutin kantor yang jumlahnya relatif kecil",
        pembahasan = "Kas kecil digunakan untuk pengeluaran mendadak atau rutin yang tidak praktis jika menggunakan cek/transfer."
    ),
    QuestionEntity(
        idSoal = "ADM_10",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Surat yang bersifat pribadi namun menyangkut urusan kantor disebut...",
        pilihan = listOf(  " Surat Pribadi",  " Surat Resmi", " Surat Setengah Resmi", " Surat Niaga", " Surat Edaran"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Surat Setengah Resmi",
        pembahasan = "Surat setengah resmi biasanya digunakan untuk keperluan yang bersifat pribadi namun berkaitan dengan instansi."
    ),
    QuestionEntity(
        idSoal = "ADM_11",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Proses pemecahan masalah dengan mencari akar penyebab utama disebut...",
        pilihan = listOf(  " Brainstorming",  " Root Cause Analysis", " Delegasi", " Benchmarking", " Forecasting"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Root Cause Analysis",
        pembahasan = "Root Cause Analysis (RCA) bertujuan menemukan sumber masalah agar tidak terulang."
    ),
    QuestionEntity(
        idSoal = "ADM_12",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Alat kantor yang digunakan untuk melubangi kertas agar dapat dimasukkan ke dalam map snelhecter disebut...",
        pilihan = listOf(  " Stapler",  " Perforator", " Cutter", " Paper Clip", " Binder Clip"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Perforator",
        pembahasan = "Perforator adalah alat pelubang kertas standar untuk administrasi."
    ),
    QuestionEntity(
        idSoal = "ADM_13",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Manakah yang termasuk dalam indikator keberhasilan sebuah tim kerja?",
        pilihan = listOf(  " Seringnya mengadakan rapat",  " Adanya rasa saling percaya dan komunikasi terbuka", " Adanya kompetisi antar anggota", " Kepatuhan mutlak pada atasan", " Minimnya umpan balik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Adanya rasa saling percaya dan komunikasi terbuka",
        pembahasan = "Kepercayaan dan komunikasi terbuka adalah fondasi *teamwork* yang efektif."
    ),
    QuestionEntity(
        idSoal = "ADM_14",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam mengelola jadwal pimpinan, prioritas utama harus diberikan pada...",
        pilihan = listOf(  " Jadwal yang paling mudah dikerjakan",  " Jadwal yang paling mendesak dan penting", " Jadwal yang paling lama", " Jadwal rapat rutin", " Jadwal yang diminta atasan untuk ditunda"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Jadwal yang paling mendesak dan penting",
        pembahasan = "Menggunakan matriks Eisenhower (Penting & Mendesak) adalah kunci manajemen waktu."
    ),
    QuestionEntity(
        idSoal = "ADM_15",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Langkah awal dalam pengurusan surat masuk adalah...",
        pilihan = listOf(  " Pengarahan",  " Penyimpanan", " Penerimaan", " Penyortiran", " Pencatatan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Penerimaan",
        pembahasan = "Surat masuk harus diterima terlebih dahulu sebelum diproses ke tahap sortir/pencatatan."
    ),
    QuestionEntity(
        idSoal = "ADM_16",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Kemampuan untuk mempengaruhi orang lain agar bekerja sama mencapai tujuan organisasi disebut...",
        pilihan = listOf(  " Manajemen",  " Kepemimpinan", " Organisasi", " Administrasi", " Koordinasi"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kepemimpinan",
        pembahasan = "Kepemimpinan (Leadership) adalah inti dari pengaruh dalam organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_17",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Metode penyimpanan arsip berdasarkan wilayah atau tempat disebut...",
        pilihan = listOf(  " Sistem Subjek",  " Sistem Kronologis", " Sistem Geografis", " Sistem Alfabetis", " Sistem Numerik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Sistem Geografis",
        pembahasan = "Sistem geografis mengelompokkan dokumen berdasarkan lokasi/wilayah asal atau tujuan."
    ),
    QuestionEntity(
        idSoal = "ADM_18",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Conflict Management'?",
        pilihan = listOf(  " Menghindari konflik sama sekali",  " Mengatasi dan mengarahkan konflik menuju hasil positif", " Menghukum orang yang berkonflik", " Menunggu konflik reda dengan sendirinya", " Mengganti staf yang berkonflik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengatasi dan mengarahkan konflik menuju hasil positif",
        pembahasan = "Manajemen konflik bukan untuk menghilangkan konflik, tapi mengelolanya agar produktif."
    ),
    QuestionEntity(
        idSoal = "ADM_19",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Surat yang dikirim ke berbagai pihak dengan isi yang sama disebut...",
        pilihan = listOf(  " Surat Dinas",  " Surat Edaran", " Surat Niaga", " Surat Perintah", " Surat Tugas"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Surat Edaran",
        pembahasan = "Surat edaran digunakan untuk memberitahukan informasi yang sama kepada banyak pihak."
    ),
    QuestionEntity(
        idSoal = "ADM_20",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Perencanaan strategis biasanya dilakukan untuk jangka waktu...",
        pilihan = listOf(  " Jangka sangat pendek (harian)",  " Jangka pendek (bulanan)", " Jangka menengah (1-3 tahun)", " Jangka panjang (3-5 tahun atau lebih)", " Jangka tidak terbatas"),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Jangka panjang (3-5 tahun atau lebih)",
        pembahasan = "Strategis mencakup visi jangka panjang organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_21",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam penulisan surat dinas, bagian yang berisi pokok pembicaraan surat adalah...",
        pilihan = listOf(  " Pembuka",  " Isi Surat", " Penutup", " Salam Pembuka", " Tembusan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Isi Surat",
        pembahasan = "Inti informasi surat terletak pada bagian isi."
    ),
    QuestionEntity(
        idSoal = "ADM_22",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Perubahan perilaku individu akibat interaksi dalam kelompok kerja disebut...",
        pilihan = listOf(  " Dinamika kelompok",  " Kepemimpinan", " Organisasi", " Administrasi", " Komunikasi"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Dinamika kelompok",
        pembahasan = "Dinamika kelompok mempelajari kekuatan-kekuatan yang mempengaruhi interaksi dalam kelompok."
    ),
    QuestionEntity(
        idSoal = "ADM_23",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Kertas yang digunakan untuk memisahkan antar bagian arsip dalam folder disebut...",
        pilihan = listOf(  " Guide/Sekat",  " Label", " Hang Map", " Ordner", " Stapler"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Guide/Sekat",
        pembahasan = "Guide berfungsi sebagai penunjuk kategori atau batas arsip."
    ),
    QuestionEntity(
        idSoal = "ADM_24",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Tahap evaluasi dalam fungsi manajemen disebut...",
        pilihan = listOf(  " Planning",  " Organizing", " Actuating", " Coordinating", " Controlling"),
        tipeScoring = "STANDAR",
        jawabanBenar = "E. Controlling",
        pembahasan = "Controlling adalah tahap pengawasan dan evaluasi untuk memastikan hasil sesuai rencana."
    ),
    QuestionEntity(
        idSoal = "ADM_25",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Siapakah yang bertugas mencatat jalannya rapat?",
        pilihan = listOf(  " Ketua",  " Notulis", " Moderator", " Peserta", " Pimpinan Rapat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Notulis",
        pembahasan = "Notulis adalah orang yang ditugaskan secara khusus untuk mendokumentasikan rapat."
    ),

QuestionEntity(
        idSoal = "ADM_26",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam komunikasi bisnis, hal pertama yang harus diperhatikan agar pesan tersampaikan dengan efektif adalah...",
        pilihan = listOf(  " Menggunakan bahasa yang formal",  " Memahami audiens (penerima pesan)", " Menggunakan media yang mahal", " Pesan yang panjang dan detail", " Kecepatan pengiriman pesan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memahami audiens (penerima pesan)",
        pembahasan = "Pemahaman audiens adalah kunci agar pesan disesuaikan dengan kebutuhan dan latar belakang penerima."
    ),
    QuestionEntity(
        idSoal = "ADM_27",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Proses penarikan calon karyawan yang memenuhi syarat untuk mengisi jabatan dalam organisasi disebut...",
        pilihan = listOf(  " Seleksi",  " Rekrutmen", " Penempatan", " Pelatihan", " Pengembangan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Rekrutmen",
        pembahasan = "Rekrutmen adalah upaya menarik minat calon pelamar, sedangkan seleksi adalah proses penyaringannya."
    ),
    QuestionEntity(
        idSoal = "ADM_28",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Sikap seorang sekretaris/staf administrasi yang menjaga rahasia jabatan atau perusahaan disebut...",
        pilihan = listOf(  " Loyalitas",  " Integritas", " Kerahasiaan (Confidentiality)", " Profesionalisme", " Etika"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Kerahasiaan (Confidentiality)",
        pembahasan = "Menjaga rahasia perusahaan adalah kewajiban mutlak dalam profesi kesekretariatan dan administrasi."
    ),
    QuestionEntity(
        idSoal = "ADM_29",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Bentuk komunikasi yang dilakukan antara atasan dan bawahan dalam satu organisasi adalah komunikasi...",
        pilihan = listOf(  " Horizontal",  " Vertikal", " Eksternal", " Diagonal", " Informal"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Vertikal",
        pembahasan = "Komunikasi vertikal melibatkan aliran informasi ke atas (laporan) atau ke bawah (instruksi)."
    ),
    QuestionEntity(
        idSoal = "ADM_30",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Metode penilaian kinerja karyawan yang dilakukan oleh atasan, rekan kerja, bawahan, dan diri sendiri disebut...",
        pilihan = listOf(" MBO (Management by Objectives)",  " 360-Degree Feedback", " Ranking", " Checklist", " Essay Appraisal"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. 360-Degree Feedback",
        pembahasan = "Metode 360 derajat memberikan perspektif menyeluruh tentang kinerja karyawan dari berbagai sudut pandang."
    ),
    QuestionEntity(
        idSoal = "ADM_31",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Fungsi utama dari 'Agenda Surat Keluar' adalah...",
        pilihan = listOf(" Mencatat surat masuk", " Menyimpan arsip surat", " Mencatat surat yang dikirim keluar", " Menggandakan surat", " Membuat konsep surat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Mencatat surat yang dikirim keluar",
        pembahasan = "Agenda surat keluar berfungsi sebagai kontrol dan histori korespondensi keluar instansi."
    ),
    QuestionEntity(
        idSoal = "ADM_32",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Salah satu teknik mengelola waktu yang efektif adalah 'Pareto Principle' (Aturan 80/20), yang berarti...",
        pilihan = listOf(" 80% hasil berasal dari 20% upaya", " 80% waktu digunakan untuk 20% tugas", " Harus mengerjakan 80 tugas dalam 20 menit", " 20% hasil dari 80% upaya", " Membagi waktu 80% kerja, 20% istirahat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. 80% hasil berasal dari 20% upaya",
        pembahasan = "Fokus pada 20% kegiatan yang memberikan dampak terbesar bagi organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_33",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam korespondensi, 'CC' (Carbon Copy) pada surat email berarti...",
        pilihan = listOf(" Penerima utama", " Penerima tembusan", " Penerima rahasia", " Lampiran", " Judul surat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Penerima tembusan",
        pembahasan = "CC digunakan agar pihak lain juga mengetahui isi surat tersebut sebagai informasi."
    ),
    QuestionEntity(
        idSoal = "ADM_34",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Kepuasan kerja karyawan sangat dipengaruhi oleh hal-hal berikut, KECUALI...",
        pilihan = listOf(" Kompensasi yang adil", " Lingkungan kerja yang kondusif", " Kesempatan promosi", " Tekanan kerja yang tidak masuk akal", " Hubungan antar rekan kerja"),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Tekanan kerja yang tidak masuk akal",
        pembahasan = "Tekanan berlebihan biasanya menurunkan kepuasan kerja."
    ),
    QuestionEntity(
        idSoal = "ADM_35",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Pengambilan keputusan yang bersifat 'Programmed Decision' biasanya digunakan untuk...",
        pilihan = listOf(" Masalah baru yang kompleks", " Masalah rutin dan berulang", " Kondisi krisis perusahaan", " Masalah yang tidak pernah terjadi sebelumnya", " Keputusan yang melibatkan pihak eksternal"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Masalah rutin dan berulang",
        pembahasan = "Keputusan terprogram adalah keputusan yang sudah ada prosedur standar (SOP)-nya."
    ),
    QuestionEntity(
        idSoal = "ADM_36",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Conflict of Interest' dalam dunia kerja?",
        pilihan = listOf(" Perdebatan pendapat saat rapat", " Persaingan sehat antar karyawan", " Situasi di mana kepentingan pribadi bertentangan dengan tugas profesional", " Ketidaksepakatan dengan atasan", " Kompetisi antar perusahaan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Situasi di mana kepentingan pribadi bertentangan dengan tugas profesional",
        pembahasan = "Bentuk pelanggaran etika serius jika kepentingan pribadi mengganggu keputusan objektif kantor."
    ),
    QuestionEntity(
        idSoal = "ADM_37",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Bahasa tubuh (body language) termasuk dalam kategori komunikasi...",
        pilihan = listOf(" Verbal", " Non-verbal", " Formal", " Tertulis", " Elektronik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Non-verbal",
        pembahasan = "Komunikasi non-verbal mencakup gestur, ekspresi wajah, dan postur tubuh."
    ),
    QuestionEntity(
        idSoal = "ADM_38",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam klasifikasi arsip, arsip dinamis adalah arsip yang...",
        pilihan = listOf(" Masih sering digunakan untuk kegiatan operasional kantor", " Sudah tidak bernilai guna", " Hanya digunakan untuk sejarah", " Disimpan di museum", " Harus dimusnahkan segera"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Masih sering digunakan untuk kegiatan operasional kantor",
        pembahasan = "Arsip dinamis terbagi atas aktif dan inaktif yang masih dibutuhkan secara berkesinambungan."
    ),
    QuestionEntity(
        idSoal = "ADM_39",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Koordinasi antar bagian bertujuan untuk...",
        pilihan = listOf(" Menghilangkan bagian yang tidak perlu", " Menyatukan aktivitas agar tidak terjadi tumpang tindih (overlap)", " Memperbanyak rapat", " Menambah beban kerja", " Memonopoli informasi"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menyatukan aktivitas agar tidak terjadi tumpang tindih (overlap)",
        pembahasan = "Koordinasi memastikan sinkronisasi kerja antar unit."
    ),
    QuestionEntity(
        idSoal = "ADM_40",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Surat yang dikirim oleh kantor kepada pihak lain yang berada di luar kantor disebut...",
        pilihan = listOf(" Surat Masuk", " Surat Internal", " Surat Keluar", " Memo", " Nota Dinas"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Surat Keluar",
        pembahasan = "Surat keluar adalah surat yang dikeluarkan instansi untuk pihak eksternal."
    ),
    QuestionEntity(
        idSoal = "ADM_41",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Job Description'?",
        pilihan = listOf(" Dokumen berisi kualifikasi pelamar", " Dokumen berisi rincian tugas, tanggung jawab, dan wewenang suatu jabatan", " Dokumen berisi gaji karyawan", " Dokumen penilaian kinerja", " Daftar nama karyawan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Dokumen berisi rincian tugas, tanggung jawab, dan wewenang suatu jabatan",
        pembahasan = "Job description adalah pedoman teknis apa yang harus dilakukan pemangku jabatan."
    ),
    QuestionEntity(
        idSoal = "ADM_42",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Tingkatan manajemen yang bertugas merumuskan visi dan kebijakan jangka panjang adalah...",
        pilihan = listOf(" Top Management", " Middle Management", " Lower/First-line Management", " Staff Management", " Operational Management"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Top Management",
        pembahasan = "Manajemen puncak (Direksi, CEO) fokus pada strategi dan visi jangka panjang."
    ),
    QuestionEntity(
        idSoal = "ADM_43",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Alat yang digunakan untuk menyimpan dokumen/surat yang berukuran besar atau banyak dalam satu map (ordner) adalah...",
        pilihan = listOf(" Snelhecter", " Map Folder", " Ordner", " Stapler", " Paper Clip"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Ordner",
        pembahasan = "Ordner adalah map besar dengan penjepit besi yang kuat untuk menyimpan dokumen dalam volume besar."
    ),
    QuestionEntity(
        idSoal = "ADM_44",
        kategori = "TKB",
        subKategori = "Administrasi Bisnis",
        pertanyaan = "Mendengarkan dengan tujuan untuk memahami informasi yang disampaikan pembicara disebut...",
        pilihan = listOf(" Active Listening", " Passive Listening", " Selective Listening", " Hearing", " Ignoring"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Active Listening",
        pembahasan = "Active listening adalah keterampilan kunci bagi staf administrasi untuk menangkap instruksi dengan benar."
    ),
    QuestionEntity(
        idSoal = "ADM_45",
        kategori = "TKB",
        subKategori = "Etika Administrasi",
        pertanyaan = "Apa yang sebaiknya dilakukan jika atasan memberikan tugas yang melanggar hukum?",
        pilihan = listOf(" Mengerjakannya karena patuh", " Mengabaikannya saja", " Melaporkan kepada pihak berwenang atau menolak dengan sopan", " Mengerjakannya setengah hati", " Meminta rekan kerja mengerjakan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Melaporkan kepada pihak berwenang atau menolak dengan sopan",
        pembahasan = "Etika profesi mewajibkan kepatuhan pada hukum di atas perintah atasan."
    ),
    QuestionEntity(
        idSoal = "ADM_46",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Manakah dari berikut ini yang merupakan hambatan dalam komunikasi organisasi?",
        pilihan = listOf(" Perbedaan budaya atau persepsi", " Saluran yang jelas", " Umpan balik yang cepat", " Keterbukaan informasi", " Kejelasan tujuan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Perbedaan budaya atau persepsi",
        pembahasan = "Perbedaan latar belakang dan persepsi sering menyebabkan salah paham (noise) dalam komunikasi."
    ),
    QuestionEntity(
        idSoal = "ADM_47",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa tujuan dibuatnya buku agenda?",
        pilihan = listOf(" Menghitung keuntungan", " Mengontrol arus masuk dan keluar surat", " Menyimpan arsip dokumen", " Menilai kinerja staf", " Mengganti sistem komputer"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengontrol arus masuk dan keluar surat",
        pembahasan = "Agenda adalah alat kontrol utama administrasi persuratan."
    ),
    QuestionEntity(
        idSoal = "ADM_48",
        kategori = "TKB",
        subKategori = "Administrasi Administrasi Perkantoran",
        pertanyaan = "Proses memberikan keterampilan baru kepada karyawan agar dapat bekerja lebih efektif disebut...",
        pilihan = listOf(" Orientasi", " Pelatihan (Training)", " Promosi", " Mutasi", " PHK"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pelatihan (Training)",
        pembahasan = "Training fokus pada peningkatan *skill* saat ini."
    ),
    QuestionEntity(
        idSoal = "ADM_49",
        kategori = "TKB",
        subKategori = "Administrasi Manajerial",
        pertanyaan = "Fungsi *Organizing* dalam manajemen mencakup...",
        pilihan = listOf(" Menentukan tujuan masa depan", " Mengelompokkan tugas dan menetapkan otoritas", " Memberikan motivasi", " Mengawasi kinerja", " Membuat laporan keuangan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengelompokkan tugas dan menetapkan otoritas",
        pembahasan = "Organizing adalah tentang struktur dan pembagian kerja."
    ),
    QuestionEntity(
        idSoal = "ADM_50",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang harus dilakukan sekretaris saat menerima telepon dari klien yang sedang marah?",
        pilihan = listOf(" Memutuskan sambungan", " Memarahinya balik", " Mendengarkan dengan tenang, empati, dan mencari solusi", " Menyerahkan telepon kepada rekan kerja", " Pura-pura tidak mendengar"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Mendengarkan dengan tenang, empati, dan mencari solusi",
        pembahasan = "Profesionalisme diuji saat menangani situasi krisis/komplain pelanggan."
    ),

QuestionEntity(
        idSoal = "ADM_51",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Langkah pertama yang paling krusial dalam menghadapi krisis reputasi perusahaan adalah...",
        pilihan = listOf(" Menyalahkan pihak luar", " Segera mengakui masalah dan mengambil tanggung jawab", " Mendiamkan isu sampai reda sendiri", " Mengganti semua staf humas", " Membayar media untuk tutup mulut"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Segera mengakui masalah dan mengambil tanggung jawab",
        pembahasan = "Transparansi dan tanggung jawab adalah fondasi pemulihan kepercayaan publik."
    ),
    QuestionEntity(
        idSoal = "ADM_52",
        kategori = "TKB",
        subKategori = "Analisis Administrasi",
        pertanyaan = "Dalam analisis SWOT, faktor internal yang dapat memberikan keuntungan bagi organisasi disebut...",
        pilihan = listOf(" Strengths (Kekuatan)", " Weaknesses (Kelemahan)", " Opportunities (Peluang)", " Threats (Ancaman)", " External Factors"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Strengths (Kekuatan)",
        pembahasan = "Strengths dan Weaknesses adalah analisis internal, sedangkan Opportunities dan Threats bersifat eksternal."
    ),
    QuestionEntity(
        idSoal = "ADM_53",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Analisis 'Cost-Benefit' digunakan untuk...",
        pilihan = listOf(" Menghitung jumlah karyawan", " Membandingkan biaya yang dikeluarkan dengan keuntungan yang diharapkan", " Menilai kepribadian calon pemimpin", " Mengatur jadwal harian", " Menyusun surat dinas"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membandingkan biaya yang dikeluarkan dengan keuntungan yang diharapkan",
        pembahasan = "Tujuan utama analisis ini adalah memastikan efisiensi finansial sebelum proyek dijalankan."
    ),
    QuestionEntity(
        idSoal = "ADM_54",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Business Continuity Plan' (BCP)?",
        pilihan = listOf(" Rencana ekspansi bisnis ke luar negeri", " Dokumen untuk melamar kerja", " Rencana untuk menjaga operasional bisnis tetap berjalan saat terjadi gangguan", " Rencana pengurangan karyawan", " Laporan laba rugi tahunan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Rencana untuk menjaga operasional bisnis tetap berjalan saat terjadi gangguan",
        pembahasan = "BCP memastikan organisasi tetap tangguh meski diterpa bencana atau krisis."
    ),
    QuestionEntity(
        idSoal = "ADM_55",
        kategori = "TKB",
        subKategori = "Analisis Administrasi",
        pertanyaan = "Manakah yang termasuk dalam faktor eksternal analisis PESTEL?",
        pilihan = listOf(" Budaya kerja internal", " Politik dan Ekonomi", " Motivasi staf", " Gaji karyawan", " Struktur organisasi"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Politik dan Ekonomi",
        pembahasan = "PESTEL mencakup faktor Politik, Ekonomi, Sosial, Teknologi, Environmental, dan Legal."
    ),
    QuestionEntity(
        idSoal = "ADM_56",
        kategori = "TKB",
        subKategori = "Manajerial Administrasi",
        pertanyaan = "Delegasi wewenang yang efektif harus disertai dengan...",
        pilihan = listOf(" Pengawasan total tanpa kepercayaan", " Pendelegasian tanggung jawab (accountability)", " Pemberian gaji tambahan secara instan", " Pengambilan alih tugas kembali", " Pengabaian hasil akhir"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pendelegasian tanggung jawab (accountability)",
        pembahasan = "Pendelegasian tugas tanpa dibarengi pendelegasian tanggung jawab akan menyebabkan kekacauan."
    ),
    QuestionEntity(
        idSoal = "ADM_57",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Sistem penyimpanan arsip yang disusun berdasarkan abjad disebut...",
        pilihan = listOf(" Sistem Kronologis", " Sistem Subjek", " Sistem Abjad (Alphabetical)", " Sistem Wilayah", " Sistem Nomor"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Sistem Abjad (Alphabetical)",
        pembahasan = "Sistem abjad biasanya digunakan untuk nama individu atau nama perusahaan."
    ),
    QuestionEntity(
        idSoal = "ADM_58",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Dalam manajemen krisis, 'Stakeholders' meliputi...",
        pilihan = listOf(" Hanya direksi", " Hanya karyawan", " Pihak-pihak yang berkepentingan atau terdampak oleh organisasi", " Hanya investor", " Hanya pemerintah"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Pihak-pihak yang berkepentingan atau terdampak oleh organisasi",
        pembahasan = "Stakeholders bisa mencakup pelanggan, karyawan, investor, hingga masyarakat umum."
    ),
    QuestionEntity(
        idSoal = "ADM_59",
        kategori = "TKB",
        subKategori = "Analisis Administrasi",
        pertanyaan = "Tujuan dari 'Benchmarking' dalam bisnis adalah...",
        pilihan = listOf(" Meniru kompetitor secara ilegal", " Membandingkan kinerja organisasi dengan standar terbaik di industri", " Menurunkan harga produk secara drastis", " Mengurangi jumlah pemasok", " Memperbanyak jumlah kantor cabang"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membandingkan kinerja organisasi dengan standar terbaik di industri",
        pembahasan = "Benchmarking adalah alat perbaikan berkelanjutan dengan mencontoh praktik terbaik."
    ),
    QuestionEntity(
        idSoal = "ADM_60",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Keputusan yang diambil berdasarkan intuisi atau pengalaman masa lalu tanpa prosedur formal disebut...",
        pilihan = listOf(" Keputusan Rasional", " Keputusan Terprogram", " Keputusan Non-Terprogram (Heuristik)", " Keputusan Kolektif", " Keputusan Otoriter"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Keputusan Non-Terprogram (Heuristik)",
        pembahasan = "Sering digunakan untuk situasi unik dan mendesak yang belum ada pedomannya."
    ),
    QuestionEntity(
        idSoal = "ADM_61",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa fungsi utama dari 'Buku Tamu' di kantor?",
        pilihan = listOf(" Mencatat jumlah uang kas", " Mencatat identitas dan keperluan pengunjung", " Menyimpan arsip rahasia", " Menjadwalkan rapat internal", " Mengganti kartu identitas karyawan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mencatat identitas dan keperluan pengunjung",
        pembahasan = "Buku tamu merupakan bagian dari aspek keamanan dan administrasi umum."
    ),
    QuestionEntity(
        idSoal = "ADM_62",
        kategori = "TKB",
        subKategori = "Manajerial Administrasi",
        pertanyaan = "Gaya kepemimpinan yang melibatkan bawahan dalam pengambilan keputusan adalah...",
        pilihan = listOf(" Otoriter", " Demokratis", " Laissez-faire", " Birokratis", " Diktator"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Demokratis",
        pembahasan = "Kepemimpinan demokratis meningkatkan komitmen tim melalui partisipasi."
    ),
    QuestionEntity(
        idSoal = "ADM_63",
        kategori = "TKB",
        subKategori = "Analisis Administrasi",
        pertanyaan = "Istilah 'Blue Ocean Strategy' merujuk pada...",
        pilihan = listOf(" Memenangkan persaingan di pasar yang sudah ada", " Menciptakan ruang pasar baru yang belum ada pesaingnya", " Menurunkan harga produk sampai merugi", " Mengakuisisi perusahaan lawan", " Fokus pada pelanggan kelas atas saja"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menciptakan ruang pasar baru yang belum ada pesaingnya",
        pembahasan = "Blue ocean mencari inovasi nilai (value innovation) daripada kompetisi berdarah (red ocean)."
    ),
    QuestionEntity(
        idSoal = "ADM_64",
        kategori = "TKB",
        subKategori = "Etika Administrasi",
        pertanyaan = "Whistleblowing adalah tindakan...",
        pilihan = listOf(" Membocorkan rahasia negara ke musuh", " Melaporkan tindakan ilegal atau tidak etis di dalam organisasi", " Menghasut rekan kerja untuk demo", " Menyebarkan gosip kantor", " Mengambil cuti tanpa izin"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Melaporkan tindakan ilegal atau tidak etis di dalam organisasi",
        pembahasan = "Whistleblowing adalah mekanisme kontrol etis internal/eksternal yang penting."
    ),
    QuestionEntity(
        idSoal = "ADM_65",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Risk Mitigation'?",
        pilihan = listOf(" Mengabaikan risiko yang muncul", " Mengambil semua risiko sekaligus", " Mengurangi dampak atau kemungkinan terjadinya risiko", " Menyalahkan orang lain atas risiko", " Menjual perusahaan jika ada risiko"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Mengurangi dampak atau kemungkinan terjadinya risiko",
        pembahasan = "Mitigasi bertujuan mengontrol efek negatif dari potensi ancaman."
    ),
    QuestionEntity(
        idSoal = "ADM_66",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa kelemahan utama dari 'Groupthink' dalam pengambilan keputusan?",
        pilihan = listOf(" Terlalu banyak ide", " Proses menjadi sangat cepat", " Menekan kreativitas dan persetujuan buta demi harmoni", " Terlalu banyak perdebatan", " Keputusan menjadi sangat objektif"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Menekan kreativitas dan persetujuan buta demi harmoni",
        pembahasan = "Groupthink berbahaya karena mengabaikan pemikiran kritis demi kesepakatan kelompok."
    ),
    QuestionEntity(
        idSoal = "ADM_67",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Dalam manajemen dokumen elektronik, sistem 'Version Control' berfungsi untuk...",
        pilihan = listOf(" Menghapus file secara otomatis", " Melacak perubahan dan menjaga riwayat versi dokumen", " Mengunci dokumen agar tidak bisa dibuka", " Mengubah format file menjadi gambar", " Mempercepat koneksi internet"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Melacak perubahan dan menjaga riwayat versi dokumen",
        pembahasan = "Sangat penting agar tidak terjadi kebingungan saat ada revisi dokumen."
    ),
    QuestionEntity(
        idSoal = "ADM_68",
        kategori = "TKB",
        subKategori = "Manajerial Administrasi",
        pertanyaan = "Apa peran utama seorang manajer dalam fungsi 'Controlling'?",
        pilihan = listOf(" Menentukan rencana masa depan", " Memotivasi bawahan", " Memastikan kinerja sesuai dengan standar yang ditetapkan", " Merekrut staf baru", " Menentukan visi perusahaan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Memastikan kinerja sesuai dengan standar yang ditetapkan",
        pembahasan = "Controlling mencakup monitoring, evaluasi, dan perbaikan."
    ),
    QuestionEntity(
        idSoal = "ADM_69",
        kategori = "TKB",
        subKategori = "Analisis Administrasi",
        pertanyaan = "Analisis PESTEL (Teknologi) berfokus pada...",
        pilihan = listOf(" Perkembangan tren inovasi dan digitalisasi", " Jumlah penduduk", " Tingkat inflasi", " Hukum ketenagakerjaan", " Budaya masyarakat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Perkembangan tren inovasi dan digitalisasi",
        pembahasan = "Faktor teknologi menilai bagaimana teknologi baru mempengaruhi operasi bisnis."
    ),
    QuestionEntity(
        idSoal = "ADM_70",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Talent Management'?",
        pilihan = listOf(" Proses mencari artis untuk iklan", " Proses menarik, mengembangkan, dan mempertahankan talenta terbaik", " Proses memecat karyawan yang malas", " Proses penggajian karyawan", " Proses membuat jadwal shift"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Proses menarik, mengembangkan, dan mempertahankan talenta terbaik",
        pembahasan = "Strategi SDM modern berfokus pada pengembangan aset manusia sebagai keunggulan kompetitif."
    ),
    QuestionEntity(
        idSoal = "ADM_71",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Metode 'Decision Tree' membantu dalam pengambilan keputusan dengan cara...",
        pilihan = listOf(" Memvisualisasikan berbagai alternatif dan konsekuensinya", " Mengundi keputusan secara acak", " Menyerahkan keputusan ke pihak luar", " Membuat aturan yang kaku", " Mengabaikan data statistik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Memvisualisasikan berbagai alternatif dan konsekuensinya",
        pembahasan = "Pohon keputusan membantu melihat probabilitas hasil dari setiap opsi."
    ),
    QuestionEntity(
        idSoal = "ADM_72",
        kategori = "TKB",
        subKategori = "Etika Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Akuntabilitas'?",
        pilihan = listOf(" Kewajiban untuk bertanggung jawab atas hasil kerja", " Kemampuan untuk menghitung uang", " Kemampuan untuk berbicara di depan umum", " Sikap ramah kepada klien", " Ketepatan waktu kerja"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Kewajiban untuk bertanggung jawab atas hasil kerja",
        pembahasan = "Akuntabilitas adalah integritas dalam mempertanggungjawabkan setiap tindakan profesional."
    ),
    QuestionEntity(
        idSoal = "ADM_73",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Dalam menghadapi media saat krisis, juru bicara (spokesperson) harus...",
        pilihan = listOf(" Berbicara tanpa persiapan", " Memberikan informasi yang jujur dan konsisten", " Menyembunyikan fakta sebanyak mungkin", " Menghindari wartawan", " Menggunakan bahasa yang ambigu"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memberikan informasi yang jujur dan konsisten",
        pembahasan = "Konsistensi pesan adalah kunci agar spekulasi negatif tidak berkembang."
    ),
    QuestionEntity(
        idSoal = "ADM_74",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa keuntungan menggunakan sistem penyimpanan 'Sentralisasi' (terpusat)?",
        pilihan = listOf(" Memudahkan duplikasi arsip", " Penghematan ruang, peralatan, dan keseragaman sistem", " Setiap divisi bisa menyimpan sesuka hati", " Mempercepat hilangnya dokumen", " Tidak perlu ada petugas arsip"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Penghematan ruang, peralatan, dan keseragaman sistem",
        pembahasan = "Sentralisasi memungkinkan kontrol lebih baik dibandingkan sistem desentralisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_75",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa itu 'Key Performance Indicator' (KPI)?",
        pilihan = listOf(" Daftar barang inventaris", " Ukuran kuantitatif untuk mengevaluasi keberhasilan organisasi/individu", " Biaya iklan produk", " Nama proyek baru", " Jadwal libur karyawan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Ukuran kuantitatif untuk mengevaluasi keberhasilan organisasi/individu",
        pembahasan = "KPI adalah tolok ukur sukses atau tidaknya strategi yang dijalankan."
    ),

QuestionEntity(
        idSoal = "ADM_76",
        kategori = "TKB",
        subKategori = "Manajemen Administrasi",
        pertanyaan = "Menurut model John Kotter, langkah pertama dalam memimpin perubahan adalah...",
        pilihan = listOf(" Membentuk koalisi yang kuat", " Menciptakan urgensi (sense of urgency)", " Mengomunikasikan visi", " Merayakan kemenangan jangka pendek", " Melembagakan perubahan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menciptakan urgensi (sense of urgency)",
        pembahasan = "Perubahan dimulai dengan menyadarkan semua pihak bahwa ada kebutuhan mendesak untuk berubah."
    ),
    QuestionEntity(
        idSoal = "ADM_77",
        kategori = "TKB",
        subKategori = "Administrasi Strategis",
        pertanyaan = "Gaya kepemimpinan yang fokus pada pemberian penghargaan dan hukuman untuk memotivasi bawahan disebut...",
        pilihan = listOf(" Kepemimpinan Transformasional"," Kepemimpinan Transaksional", " Kepemimpinan Laissez-faire", " Kepemimpinan Situasional", " Kepemimpinan Karismatik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kepemimpinan Transaksional",
        pembahasan = "Transaksional berbasis pada pertukaran (reward/punishment) antara pemimpin dan pengikut."
    ),
    QuestionEntity(
        idSoal = "ADM_78",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Good Corporate Governance (GCG) memiliki prinsip dasar TARIF, yaitu...",
        pilihan = listOf(" Transparansi, Akuntabilitas, Responsibilitas, Independensi, Fairness"," Total, Aksi, Respon, Informasi, Fokus", " Terbuka, Aman, Rapi, Indah, Formal", " Tepat, Akurat, Resmi, Integritas, Filosofis", " Teknis, Administratif, Regulasi, Investasi, Finansial"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Transparansi, Akuntabilitas, Responsibilitas, Independensi, Fairness",
        pembahasan = "TARIF adalah pilar utama tata kelola yang baik dalam organisasi modern."
    ),
    QuestionEntity(
        idSoal = "ADM_79",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Mengapa karyawan sering menolak perubahan (resistance to change)?",
        pilihan = listOf(" Karena perubahan selalu menyenangkan", " Takut kehilangan kendali, ketidakpastian, dan kenyamanan status quo", " Karena perubahan selalu membawa bonus besar", " Karena karyawan tidak suka bekerja", " Karena perubahan terlalu mudah"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Takut kehilangan kendali, ketidakpastian, dan kenyamanan status quo",
        pembahasan = "Ketakutan akan hal yang tidak diketahui adalah alasan utama resistensi manusia."
    ),
    QuestionEntity(
        idSoal = "ADM_80",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Ciri khas dari kepemimpinan transformasional adalah...",
        pilihan = listOf(" Menekankan pada prosedur rutin", " Menginspirasi dan memotivasi pengikut untuk melampaui kepentingan pribadi", " Memberikan hukuman berat", " Mengambil keputusan sendirian", " Fokus pada tugas administratif harian"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menginspirasi dan memotivasi pengikut untuk melampaui kepentingan pribadi",
        pembahasan = "Transformasional berfokus pada visi dan perubahan mindset pengikut."
    ),
    QuestionEntity(
        idSoal = "ADM_81",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa fungsi utama dari 'Standard Operating Procedure' (SOP)?",
        pilihan = listOf(" Membatasi kreativitas karyawan", " Memberikan panduan kerja yang seragam, efektif, dan efisien", " Menambah tumpukan kertas di kantor", " Mempersulit birokrasi", " Menentukan gaji karyawan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memberikan panduan kerja yang seragam, efektif, dan efisien",
        pembahasan = "SOP menjamin konsistensi kualitas hasil kerja."
    ),
    QuestionEntity(
        idSoal = "ADM_82",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Span of Control'?",
        pilihan = listOf(" Jarak kantor ke rumah", " Jumlah bawahan yang berada di bawah pengawasan langsung seorang manajer", " Jangkauan promosi jabatan", " Luas wilayah pemasaran", " Waktu kerja seorang manajer"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Jumlah bawahan yang berada di bawah pengawasan langsung seorang manajer",
        pembahasan = "Rentang kendali yang terlalu lebar atau sempit akan mempengaruhi efektivitas manajemen."
    ),
    QuestionEntity(
        idSoal = "ADM_83",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Transparansi dalam administrasi publik berarti...",
        pilihan = listOf(" Memberikan akses informasi kepada publik terkait proses pengambilan keputusan", " Menutup semua informasi dari publik", " Hanya memberikan informasi kepada atasan", " Mengumumkan gaji setiap karyawan ke medsos", " Menghapus semua dokumen"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Memberikan akses informasi kepada publik terkait proses pengambilan keputusan",
        pembahasan = "Transparansi adalah lawan dari korupsi dan kolusi."
    ),
    QuestionEntity(
        idSoal = "ADM_84",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Apa yang dimaksud dengan 'Unfreezing' dalam model perubahan Kurt Lewin?",
        pilihan = listOf(" Membekukan situasi yang ada", " Proses membuang perilaku lama dan mempersiapkan diri untuk berubah", " Menerapkan sistem baru", " Menilai hasil perubahan", " Mengulang cara lama"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Proses membuang perilaku lama dan mempersiapkan diri untuk berubah",
        pembahasan = "Tahap pertama adalah mencairkan status quo agar siap menerima perubahan."
    ),
    QuestionEntity(
        idSoal = "ADM_85",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Analisis yang digunakan untuk mengukur kesehatan keuangan organisasi adalah...",
        pilihan = listOf(" Analisis Rasio Keuangan", " Analisis SWOT", " Analisis PESTEL", " Analisis Jabatan", " Analisis Pasar"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Analisis Rasio Keuangan",
        pembahasan = "Rasio seperti likuiditas, solvabilitas, dan profitabilitas adalah alat utama analisis keuangan."
    ),
    QuestionEntity(
        idSoal = "ADM_86",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa itu 'Disposisi' dalam administrasi surat menyurat?",
        pilihan = listOf(" Membuang surat", " Petunjuk tertulis pimpinan mengenai tindak lanjut suatu surat", " Menggandakan surat", " Menyimpan surat di arsip", " Menulis ulang isi surat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Petunjuk tertulis pimpinan mengenai tindak lanjut suatu surat",
        pembahasan = "Disposisi adalah perintah pimpinan untuk memproses surat tersebut oleh unit terkait."
    ),
    QuestionEntity(
        idSoal = "ADM_87",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Dalam manajemen, 'Networking' bermanfaat untuk...",
        pilihan = listOf(" Mendapatkan gosip terbaru", " Membangun hubungan profesional dan akses informasi/sumber daya", " Membuang waktu saat jam kantor", " Menghindari pekerjaan", " Meminta sumbangan pribadi"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membangun hubungan profesional dan akses informasi/sumber daya",
        pembahasan = "Jaringan profesional adalah aset strategis bagi karier dan organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_88",
        kategori = "TKB",
        subKategori = "Kepemimpinan Strategis",
        pertanyaan = "Kepemimpinan situasional menekankan bahwa pemimpin harus...",
        pilihan = listOf(" Selalu menggunakan gaya otoriter", " Menyesuaikan gaya kepemimpinan dengan tingkat kematangan bawahan", " Selalu mengikuti keinginan bawahan", " Mengubah gaya setiap hari", " Tidak perlu memimpin"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menyesuaikan gaya kepemimpinan dengan tingkat kematangan bawahan",
        pembahasan = "Tidak ada satu gaya yang cocok untuk semua situasi (Situational Leadership Theory oleh Hersey-Blanchard)."
    ),
    QuestionEntity(
        idSoal = "ADM_89",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Apa itu 'Whistleblowing System'?",
        pilihan = listOf(" Alat untuk meniup peluit saat rapat", " Sistem untuk melaporkan pelanggaran secara aman dan rahasia", " Sistem keamanan gedung", " Sistem absensi digital", " Sistem inventaris barang"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Sistem untuk melaporkan pelanggaran secara aman dan rahasia",
        pembahasan = "Sistem ini melindungi pelapor agar berani mengungkap kebenaran."
    ),
    QuestionEntity(
        idSoal = "ADM_90",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Apa langkah akhir dalam model perubahan Kurt Lewin?",
        pilihan = listOf(" Unfreezing", " Changing", " Refreezing (pembekuan kembali dalam kondisi baru)", " Evaluation", " Planning"),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Refreezing (pembekuan kembali dalam kondisi baru)",
        pembahasan = "Refreezing bertujuan untuk mengintegrasikan perubahan menjadi budaya kerja baru."
    ),
    QuestionEntity(
        idSoal = "ADM_91",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa yang dimaksud dengan 'Dead Files' (Arsip Mati)?",
        pilihan = listOf(" Arsip yang sudah tidak digunakan lagi dan dapat dimusnahkan/disimpan di depo arsip", " Arsip yang sedang diproses", " Arsip rahasia", " Arsip yang sering dibuka", " Arsip digital yang rusak"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Arsip yang sudah tidak digunakan lagi dan dapat dimusnahkan/disimpan di depo arsip",
        pembahasan = "Arsip statis/mati sudah mencapai masa retensi akhir."
    ),
    QuestionEntity(
        idSoal = "ADM_92",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Manakah yang merupakan elemen komunikasi efektif?",
        pilihan = listOf(" Pengirim, Pesan, Media, Penerima, Umpan Balik", " Pengirim dan Penerima saja", " Hanya Media", " Hanya Pesan", " Menggunakan bahasa asing yang rumit"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Pengirim, Pesan, Media, Penerima, Umpan Balik",
        pembahasan = "Tanpa umpan balik, komunikasi tidak dapat diverifikasi keefektifannya."
    ),
    QuestionEntity(
        idSoal = "ADM_93",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Analisis 'Five Forces Porter' digunakan untuk menganalisis...",
        pilihan = listOf(" Kondisi kesehatan karyawan", " Kekuatan kompetitif dalam suatu industri", " Keuangan negara", " Peraturan pemerintah", " Jadwal rapat"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kekuatan kompetitif dalam suatu industri",
        pembahasan = "Porter's 5 Forces: Persaingan, Ancaman Pendatang Baru, Pemasok, Pembeli, dan Substitusi."
    ),
    QuestionEntity(
        idSoal = "ADM_94",
        kategori = "TKB",
        subKategori = "Kepemimpinan Strategis",
        pertanyaan = "Apa itu 'Vision Statement' dalam organisasi?",
        pilihan = listOf(" Rincian gaji karyawan", " Gambaran cita-cita atau masa depan yang ingin dicapai organisasi", " Daftar barang kantor", " Aturan berpakaian", " Nama pemilik perusahaan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Gambaran cita-cita atau masa depan yang ingin dicapai organisasi",
        pembahasan = "Visi memberikan arah strategis jangka panjang."
    ),
    QuestionEntity(
        idSoal = "ADM_95",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Mengapa etika kerja penting bagi staf administrasi?",
        pilihan = listOf(" Agar terlihat rajin oleh bos", " Membangun kredibilitas, kepercayaan, dan efisiensi kerja", " Agar dipromosikan lebih cepat", " Hanya formalitas saja", " Untuk menghindari pekerjaan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Membangun kredibilitas, kepercayaan, dan efisiensi kerja",
        pembahasan = "Etika adalah fondasi kepercayaan pemangku kepentingan kepada organisasi."
    ),
    QuestionEntity(
        idSoal = "ADM_96",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Apa yang dimaksud dengan 'Time Management Matrix' Eisenhower?",
        pilihan = listOf(" Alat untuk mengukur durasi kerja", " Matriks pembagian tugas berdasarkan prioritas (Penting vs Mendesak)", " Jadwal rapat bulanan", " Daftar libur karyawan", " Program aplikasi komputer"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Matriks pembagian tugas berdasarkan prioritas (Penting vs Mendesak)",
        pembahasan = "Membantu manajer fokus pada pekerjaan yang bernilai tinggi (Penting & Tidak Mendesak)."
    ),
    QuestionEntity(
        idSoal = "ADM_97",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Apa yang dimaksud dengan 'Responsibility' dalam GCG?",
        pilihan = listOf(" Perusahaan harus patuh pada aturan dan prinsip korporasi yang sehat", " Perusahaan harus bisa mempertanggungjawabkan kinerjanya", " Perusahaan harus adil pada pemegang saham", " Perusahaan harus transparan", " Perusahaan harus bebas dari konflik"),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Perusahaan harus patuh pada aturan dan prinsip korporasi yang sehat",
        pembahasan = "Responsibility berkaitan dengan ketaatan hukum dan tanggung jawab sosial."
    ),
    QuestionEntity(
        idSoal = "ADM_98",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa fungsi dari 'Label' pada map arsip?",
        pilihan = listOf(" Sebagai hiasan", " Sebagai penanda isi/keterangan arsip agar mudah dicari", " Sebagai pengikat map", " Sebagai pelindung kertas", " Sebagai alat hitung"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Sebagai penanda isi/keterangan arsip agar mudah dicari",
        pembahasan = "Label adalah pintu utama pencarian dokumen dengan sistem indeks."
    ),
    QuestionEntity(
        idSoal = "ADM_99",
        kategori = "TKB",
        subKategori = "Administrasi Perkantoran",
        pertanyaan = "Dalam pengambilan keputusan, 'Brainstorming' bertujuan untuk...",
        pilihan = listOf(" Mengkritik pendapat orang lain", " Mengumpulkan sebanyak mungkin ide kreatif tanpa penilaian awal", " Memilih satu ide yang paling benar", " Mengurangi waktu rapat", " Memaksakan kehendak pimpinan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengumpulkan sebanyak mungkin ide kreatif tanpa penilaian awal",
        pembahasan = "Kreativitas muncul saat ide dibebaskan dari penghakiman (judgement)."
    ),
    QuestionEntity(
        idSoal = "ADM_100",
        kategori = "TKB",
        subKategori = "Administrasi",
        pertanyaan = "Apa itu 'Corporate Culture'?",
        pilihan = listOf(" Jenis produk perusahaan", " Nilai-nilai, norma, dan keyakinan yang dianut bersama dalam organisasi", " Struktur gedung kantor", " Jumlah karyawan", " Harga saham perusahaan"),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Nilai-nilai, norma, dan keyakinan yang dianut bersama dalam organisasi",
        pembahasan = "Budaya organisasi adalah 'cara kita melakukan sesuatu di sini' (the way we do things here)."
    )
	)
}