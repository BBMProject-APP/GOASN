package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalEkonomi {
    val daftarSoal = listOf(
	QuestionEntity(
        idSoal = "TKB_eko_01",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Menurut Kerangka Konseptual Pelaporan Keuangan (PSAK/IFRS), karakteristik kualitatif fundamental yang wajib dipenuhi agar informasi keuangan berguna bagi pengambilan keputusan adalah...",
        pilihan = listOf(
            " Keterbandingan (Comparability) dan Ketepatwaktuan (Timeliness)",
             " Relevansi (Relevance) dan Representasi Tepat (Faithful Representation)",
            " Keterpahaman (Understandability) dan Keterverifikasian (Verifiability)",
            " Konsistensi (Consistency) dan Materialitas (Materiality)",
            " Konservatisme (Conservatism) dan Transparansi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Relevansi (Relevance) dan Representasi Tepat (Faithful Representation)",
        skalaPoin = null,
        pembahasan = "Karakteristik kualitatif laporan keuangan dibagi menjadi dua: Fundamental (Relevansi dan Representasi Tepat) serta Peningkat/Enhancing (Keterbandingan, Keterverifikasian, Ketepatwaktuan, dan Keterpahaman)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_02",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Perusahaan membeli sebuah mesin pabrik seharga Rp120.000.000 dengan estimasi masa manfaat 5 tahun dan nilai residu Rp20.000.000. Jika perusahaan menggunakan metode penyusutan Saldo Menurun Ganda (Double Declining Balance Method), berapakah beban penyusutan pada tahun pertama?",
        pilihan = listOf(
            " Rp20.000.000",
             " Rp24.000.000",
            " Rp40.000.000",
            " Rp48.000.000",
            " Rp50.000.000"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Rp48.000.000",
        skalaPoin = null,
        pembahasan = "Tarif saldo menurun ganda = 2 x (100% / 5 tahun) = 40%. " +
                "Pada metode ini, nilai residu diabaikan di tahun pertama. " +
                "Beban penyusutan tahun ke-1 = 40% x Rp120.000.000 = Rp48.000.000."

    ),

    QuestionEntity(
        idSoal = "TKB_eko_03",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Di dalam laporan arus kas (Statement of Cash Flows), aktivitas pembayaran dividen tunai kepada pemegang saham dan pelunasan utang obligasi jangka panjang diklasifikasikan ke dalam...",
        pilihan = listOf(
            " Aktivitas Operasi (Operating Activities)",
            " Aktivitas Investasi (Investing Activities)",
            " Aktivitas Pendanaan / Pembiayaan (Financing Activities)",
            " Aktivitas Non-Kas (Non-Cash Activities)",
            " Aktivitas Penyesuaian Ekuitas"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Aktivitas Pendanaan / Pembiayaan (Financing Activities)",
        skalaPoin = null,
        pembahasan = "Aktivitas Pendanaan (Financing) berkaitan dengan transaksi yang memengaruhi modal saham dan pinjaman jangka panjang perusahaan, seperti menerbitkan saham, membayar dividen, serta membayar pokok utang/obligasi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_04",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Apabila sebuah perusahaan mencatat persediaan menggunakan metode FIFO (First-In, First-Out) dalam kondisi ekonomi yang sedang mengalami inflasi (harga barang cenderung naik), dampak yang akan terjadi pada laporan keuangan adalah...",
        pilihan = listOf(
            " Nilai persediaan akhir menjadi lebih rendah dan Harga Pokok Penjualan (HPP) menjadi lebih tinggi",
             " Nilai persediaan akhir menjadi lebih tinggi dan Laba Bersih menjadi lebih rendah",
            " Nilai persediaan akhir menjadi lebih tinggi dan Harga Pokok Penjualan (HPP) menjadi lebih rendah",
            " Harga Pokok Penjualan (HPP) menjadi lebih tinggi dan Laba Bersih menjadi lebih tinggi",
            " Tidak ada pengaruh terhadap nilai HPP maupun laba perusahaan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Nilai persediaan akhir menjadi lebih tinggi dan Harga Pokok Penjualan (HPP) menjadi lebih rendah",
        skalaPoin = null,
        pembahasan = "Saat inflasi, metode FIFO membebankan biaya perolehan lama yang lebih murah ke HPP, sehingga HPP menjadi rendah dan Laba Bersih meningkat. Sementara itu, persediaan akhir dinilai dengan harga beli baru yang lebih tinggi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_05",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Pada tanggal 1 September 2025, PT Bersama menerima pendapatan sewa gedung untuk masa 1 tahun sebesar Rp24.000.000 dan mencatatnya dengan pendekatan neraca (akun Pendapatan Sewa Diterima di Muka). Berapakah saldo akun Pendapatan Sewa Diterima di Muka setelah jurnal penyesuaian pada 31 Desember 2025?",
        pilihan = listOf(
            " Rp8.000.000",
             " Rp10.000.000",
            " Rp14.000.000",
            " Rp16.000.000",
            " Rp18.000.000"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Rp16.000.000",
        skalaPoin = null,
        pembahasan = "Masa sewa yang sudah dijalani (September–Desember) = 4 bulan. " +
                "Nilai yang diakui jadi pendapatan = (4/12) x Rp24.000.000 = Rp8.000.000. " +
                "Maka, sisa pendapatan diterima di muka yang belum menjadi hak perusahaan adalah Rp24.000.000 - Rp8.000.000 = Rp16.000.000."    ),

    QuestionEntity(
        idSoal = "TKB_eko_06",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Akun kontra (contra account) di dalam struktur laporan posisi keuangan yang berfungsi sebagai pengurang langsung atas saldo piutang usaha bruto adalah...",
        pilihan = listOf(
            " Beban Kerugian Piutang (Bad Debt Expense)",
             " Cadangan Kerugian Penurunan Nilai Piutang (Allowance for Doubtful Accounts)",
            " Piutang Tak Tertagih Diretur",
            " Akumulasi Penyusutan Piutang",
            " Utang Usaha Terkait"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Cadangan Kerugian Penurunan Nilai Piutang (Allowance for Doubtful Accounts)",
        skalaPoin = null,
        pembahasan = "Allowance for Doubtful Accounts adalah akun kontra aset yang dipasangkan dengan Piutang Usaha untuk menyajikan nilai realisasi bersih (Net Realizable Value) dari piutang yang diperkirakan benar-benar bisa ditagih."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_07",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "PT Semesta menerbitkan 1.000 lembar obligasi dengan nilai nominal Rp1.000.000 per lembar. Obligasi tersebut laku dijual dengan total harga Rp1.050.000.000. Selisih lebih sebesar Rp50.000.000 di dalam pencatatan akuntansi diakui sebagai...",
        pilihan = listOf(
            " Diskonto Obligasi (Discount on Bonds Payable)",
             " Premium Obligasi / Agio Obligasi (Premium on Bonds Payable)",
            " Pendapatan Bunga Ditangguhkan",
            " Keuntungan Penjualan Obligasi (Gain on Sale)",
            " Modal Saham Tambahan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Premium Obligasi / Agio Obligasi (Premium on Bonds Payable)",
        skalaPoin = null,
        pembahasan = "Premium (Agio) obligasi terjadi apabila harga jual obligasi lebih tinggi daripada nilai nominalnya. Hal ini biasanya dipicu karena tingkat suku bunga nominal obligasi lebih tinggi daripada tingkat suku bunga pasar."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_08",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Prinsip dasar akuntansi yang mengharuskan pengakuan beban dilakukan pada periode yang sama dengan periode pengakuan pendapatan yang dihasilkan oleh beban tersebut dikenal dengan istilah...",
        pilihan = listOf(
            " Historical Cost Principle",
             " Revenue Recognition Principle",
            " Matching Principle (Prinsip Penandingan)",
            " Full Disclosure Principle",
            " Going Concern Principle"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Matching Principle (Prinsip Penandingan)",
        skalaPoin = null,
        pembahasan = "Matching Principle menyatakan bahwa beban harus ditandingkan dengan pendapatan dalam periode akuntansi yang sama agar penentuan laba/rugi bersih perusahaan menjadi akurat dan akomodatif terhadap asas akrual."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_09",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Di dalam akuntansi investasi saham metode ekuitas (Equity Method), apabila perusahaan asosiasi melaporkan perolehan laba bersih, perusahaan investor akan mencatat transaksi tersebut dengan cara...",
        pilihan = listOf(
            " Mendebit Kas dan Mengkredit Pendapatan Dividen",
             " Mendebit Investasi pada Saham dan Mengkredit Pendapatan Investasi",
            " Mendebit Pendapatan Investasi dan Mengkredit Investasi pada Saham",
            " Hanya mencatatnya dalam memo tanpa jurnal akuntansi",
            " Mendebit Kas dan Mengkredit Investasi pada Saham"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mendebit Investasi pada Saham dan Mengkredit Pendapatan Investasi",
        skalaPoin = null,
        pembahasan = "Pada metode ekuitas, nilai investasi investor disesuaikan secara proporsional dengan performa perusahaan anak/asosiasi. Jika perusahaan investasi mendapat laba, nilai investasi investor bertambah (Debit) dan diakui sebagai pendapatan investasi (Kredit)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_10",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Manakah kelompok akun di bawah ini yang seluruhnya memiliki saldo normal di sisi debit?",
        pilihan = listOf(
            " Kas, Piutang Usaha, Pendapatan Diterima di Muka, Beban Gaji",
             " Persediaan, Peralatan, Prive (Drawing), Beban Sewa",
            " Tanah, Utang Usaha, Modal Saham, Akumulasi Penyusutan",
            " Kas, Perlengkapan, Pendapatan Jasa, Beban Iklan",
            " Piutang Usaha, Saham Biasa, Retur Penjualan, Sewa Dibayar di Muka"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Persediaan, Peralatan, Prive (Drawing), Beban Sewa",
        skalaPoin = null,
        pembahasan = "Akun kelompok Aset (Persediaan, Peralatan), akun pengurang Ekuitas (Prive/Drawing), serta kelompok Beban memiliki saldo normal di sisi debit (bertambah di debit, berkurang di kredit)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_11",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Kondisi di mana sebuah perusahaan membeli kembali saham miliknya yang telah beredar di pasar modal disebut...",
        pilihan = listOf(
            " Saham Preferen (Preferred Stock)",
             " Saham Portofolio",
            " Saham Tresuri (Treasury Stock)",
            " Saham Agio",
            " Saham Dilusian"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Saham Tresuri (Treasury Stock)",
        skalaPoin = null,
        pembahasan = "Saham Tresuri adalah saham milik perusahaan penerbit yang dibeli kembali dari pasar dan dipegang atas nama perusahaan sendiri, tidak memiliki hak suara, tidak mendapat dividen, dan disajikan sebagai pengurang total ekuitas."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_12",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Berdasarkan PSAK 1, laporan keuangan yang lengkap setidaknya harus menyajikan komponen-komponen berikut, kecuali...",
        pilihan = listOf(
            " Laporan Posisi Keuangan dan Laporan Laba Rugi Komprehensif",
             " Laporan Perubahan Ekuitas dan Laporan Arus Kas",
            " Catatan atas Laporan Keuangan (CALK)",
            " Laporan Realisasi Anggaran (LRA) Perusahaan Bisnis Swasta",
            " Informasi Komparatif periode sebelumnya"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Laporan Realisasi Anggaran (LRA) Perusahaan Bisnis Swasta",
        skalaPoin = null,
        pembahasan = "Laporan Realisasi Anggaran (LRA) hanya merupakan komponen wajib dalam Laporan Keuangan Pemerintah/Sektor Publik (SAP), bukan untuk perusahaan bisnis komersial komersial berbasis PSAK/IFRS umum."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_13",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Pengeluaran kas yang dilakukan perusahaan untuk memperpanjang masa manfaat atau meningkatkan kapasitas efisiensi suatu aset tetap harus diperlakukan secara akuntansi sebagai...",
        pilihan = listOf(
            " Pengeluaran Pendapatan (Revenue Expenditure) dan langsung dibebankan",
             " Pengeluaran Modal (Capital Expenditure) dan dikapitalisasi ke nilai aset tetap terkait",
            " Kerugian Luar Biasa (Extraordinary Loss)",
            " Biaya Operasional Ditangguhkan",
            " Pengurangan saldo modal pemilik"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pengeluaran Modal (Capital Expenditure) dan dikapitalisasi ke nilai aset tetap terkait",
        skalaPoin = null,
        pembahasan = "Capital Expenditure adalah pengeluaran yang memberi manfaat ekonomi lebih dari satu periode akuntansi, sehingga nilainya harus didebit ke akun aset terkait (dikapitalisasi) dan didepresiasi secara bertahap."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_14",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Di dalam proses rekonsiliasi bank, jika bank membebankan biaya administrasi bulanan yang baru diketahui perusahaan saat menerima rekening koran, tindakan penyesuaian yang harus dilakukan perusahaan adalah...",
        pilihan = listOf(
            " Menambah saldo kas menurut catatan bank",
             " Mengurangi saldo kas menurut catatan bank",
            " Menambah saldo kas menurut catatan perusahaan",
            " Mengurangi saldo kas menurut catatan perusahaan",
            " Tidak perlu melakukan penyesuaian apa pun"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Mengurangi saldo kas menurut catatan perusahaan",
        skalaPoin = null,
        pembahasan = "Biaya administrasi bank sudah dipotong oleh bank namun belum dicatat oleh buku perusahaan. Oleh karena itu, dalam rekonsiliasi, transaksi ini harus mengurangi saldo buku kas perusahaan dan dibuatkan jurnal penyesuaian."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_15",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Aset tidak berwujud (Intangible Asset) yang mencerminkan kelebihan harga beli di atas nilai wajar aset bersih teridentifikasi saat proses akuisisi perusahaan lain disebut...",
        pilihan = listOf(
            " Hak Paten",
             " Hak Cipta (Copyright)",
            " Goodwill",
            " Merek Dagang (Trademark)",
            " Waralaba (Franchise)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Goodwill",
        skalaPoin = null,
        pembahasan = "Goodwill timbul dari faktor reputasi, sinergi usaha, atau basis pelanggan yang baik. Goodwill hanya boleh diakui dan dicatat dalam laporan keuangan jika diperoleh melalui proses pembelian entitas lain."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_16",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Klausa pengukuran akuntansi yang menyatakan bahwa transaksi keuangan harus diukur dan dicatat menggunakan asumsi daya beli mata uang stabil serta mengabaikan faktor inflasi/deflasi adalah...",
        pilihan = listOf(
            " Economic Entity Assumption",
             " Monetary Unit Assumption",
            " Periodicity Assumption",
            " Going Concern Assumption",
            " Accrual Basis Assumption"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Monetary Unit Assumption",
        skalaPoin = null,
        pembahasan = "Monetary Unit Assumption menetapkan bahwa uang adalah denominator umum dari aktivitas ekonomi dan menyediakan basis yang tepat untuk pengukuran analisis akuntansi dengan menganggap nilainya konstan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_17",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Manakah di bawah ini jurnal penutup (closing entry) yang benar untuk menutup akun Beban Iklan pada akhir periode akuntansi?",
        pilihan = listOf(
            " Debit: Beban Iklan; Kredit: Ikhtisar Laba Rugi",
             " Debit: Ikhtisar Laba Rugi; Kredit: Beban Iklan",
            " Debit: Modal; Kredit: Beban Iklan",
            " Debit: Beban Iklan; Kredit: Modal",
            " Debit: Ikhtisar Laba Rugi; Kredit: Kas"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Debit: Ikhtisar Laba Rugi; Kredit: Beban Iklan",
        skalaPoin = null,
        pembahasan = "Beban memiliki saldo normal debit. Untuk menutupnya (menjadikan saldonya nol), akun Beban Iklan harus dikredit, dan akun tandingannya mendebit akun sementara yaitu Ikhtisar Laba Rugi (Income Summary)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_18",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Jika total aset sebuah perusahaan meningkat sebesar Rp50.000.000 selama periode berjalan, dan total liabilitas (utang) meningkat sebesar Rp20.000.000 pada periode yang sama, berapakah perubahan pada total ekuitas perusahaan?",
        pilihan = listOf(
            " Meningkat sebesar Rp70.000.000",
             " Menurun sebesar Rp30.000.000",
            " Meningkat sebesar Rp30.000.000",
            " Menurun sebesar Rp70.000.000",
            " Tetap tidak mengalami perubahan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Meningkat sebesar Rp30.000.000",
        skalaPoin = null,
        pembahasan = "Persamaan dasar akuntansi: Perubahan Aset = Perubahan Liabilitas + Perubahan Ekuitas. " +
                "Maka, Rp50.000.000 = Rp20.000.000 + Perubahan Ekuitas. " +
                "Didapat Perubahan Ekuitas = Rp30.000.000 (meningkat)."    ),

    QuestionEntity(
        idSoal = "TKB_eko_19",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Sistem pencatatan persediaan di mana mutasi keluar-masuk persediaan barang dagang dicatat secara kontinu dan seketika pada saat transaksi terjadi dinamakan...",
        pilihan = listOf(
            " Sistem Periodik (Periodic Inventory System)",
             " Sistem Fisik (Physical Inventory System)",
            " Sistem Perpetual (Perpetual Inventory System)",
            " Sistem Taksiran (Estimating System)",
            " Sistem Just-In-Time"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Sistem Perpetual (Perpetual Inventory System)",
        skalaPoin = null,
        pembahasan = "Sistem Perpetual langsung memperbarui akun Persediaan Barang Dagang dan HPP setiap kali terjadi pembelian atau penjualan, sehingga nilai persediaan bisa diketahui setiap saat tanpa harus menunggu stok opname fisik."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_20",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Jika sebuah perusahaan memiliki Rasio Lancar (Current Ratio) sebesar 2,5, hal ini mengindikasikan bahwa perusahaan tersebut...",
        pilihan = listOf(
            " Memiliki utang jangka panjang yang sangat besar dibandingkan modalnya",
             " Mampu membayar liabilitas jangka pendeknya dengan menggunakan aset lancar yang dimilikinya",
            " Mengalami inefisiensi dalam penagihan piutang usaha harian",
            " Menghasilkan laba kotor sebesar 25% dari total penjualan",
            " Menggunakan sistem pendanaan eksternal yang agresif"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mampu membayar liabilitas jangka pendeknya dengan menggunakan aset lancar yang dimilikinya",
        skalaPoin = null,
        pembahasan = "Rasio Lancar dihitung dengan rumus (Aset Lancar / Liabilitas Lancar). " +
                "Rasio 2,5 berarti setiap Rp1 utang lancar dijamin oleh Rp2,5 aset lancar, " +
                "menunjukkan tingkat likuiditas jangka pendek yang baik."    ),

    QuestionEntity(
        idSoal = "TKB_eko_21",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam pelaporan keuangan, liabilitas kontinjensi (contingent liability) wajib dicatat dan diakui sebagai utang di neraca apabila memenuhi dua syarat, yaitu...",
        pilihan = listOf(
            " Kemungkinan terjadinya kecil (remote) dan nilainya dapat diestimasi",
             " Kemungkinan terjadinya cukup besar (probable) dan nilainya dapat diestimasi dengan andal",
            " Kemungkinan terjadinya besar (probable) tanpa perlu tahu kepastian nilainya",
            " Telah disetujui oleh dewan komisaris dan dewan direksi perusahaan",
            " Melibatkan sengketa hukum pidana internasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kemungkinan terjadinya cukup besar (probable) dan nilainya dapat diestimasi dengan andal",
        skalaPoin = null,
        pembahasan = "Sesuai PSAK 57, jika kewajiban potensial bersifat *probable* dan nilainya dapat diestimasi secara andal, maka wajib diakui sebagai provisi (utang) di neraca. Jika salah satu syarat tidak terpenuhi, cukup diungkapkan dalam CALK."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_22",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Laba komprehensif lain (Other Comprehensive Income - OCI) mencakup pos pendapatan dan beban yang tidak diakui dalam laba rugi berjalan. Contoh pos yang masuk ke OCI adalah...",
        pilihan = listOf(
            " Pendapatan penjualan barang dagang",
             " Beban administrasi dan umum",
            " Keuntungan tidak terealisasi (unrealized gain) dari penyesuaian nilai wajar investasi aset keuangan tersedia untuk dijual",
            " Keuntungan terealisasi dari penjualan tanah",
            " Kerugian akibat penurunan nilai persediaan barang usang"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Keuntungan tidak terealisasi (unrealized gain) dari penyesuaian nilai wajar investasi aset keuangan tersedia untuk dijual",
        skalaPoin = null,
        pembahasan = "OCI menampung keuntungan/kerugian yang belum terealisasi (*unrealized*), seperti penyesuaian nilai wajar investasi kategori FVOCI (Fair Value through OCI) atau surplus revaluasi aset tetap."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_23",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Koreksi kesalahan pencatatan akuntansi periode lalu yang baru ditemukan pada periode berjalan harus diselesaikan dengan metode...",
        pilihan = listOf(
            " Penyesuaian prospektif pada laporan keuangan tahun berjalan dan masa depan",
             " Penyajian kembali secara retrospektif (retrospective restatement) pada saldo laba awal periode",
            " Membebankannya langsung sebagai beban operasional lain-lain tahun berjalan",
            " Menghapus akun modal pemilik secara langsung",
            " Menunggu hingga siklus audit tahunan berikutnya berakhir"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Penyajian kembali secara retrospektif (retrospective restatement) pada saldo laba awal periode",
        skalaPoin = null,
        pembahasan = "Sesuai PSAK 25, koreksi kesalahan material periode lalu diselesaikan secara retrospektif dengan memodifikasi angka komparatif periode lalu dan menyesuaikan saldo awal Retained Earnings (Saldo Laba) periode paling awal yang disajikan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_24",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Ketika obligasi diterbitkan di antara tanggal pembayaran bunga, pembeli obligasi diharuskan membayar harga obligasi ditambah dengan...",
        pilihan = listOf(
            " Premium obligasi masa depan",
             " Bunga akrual (bunga berjalan) sejak tanggal pembayaran bunga terakhir hingga tanggal transaksi",
            " Diskonto obligasi amortisasi",
            " Biaya penjaminan emisi efek total",
            " Komisi broker yang dihitung proporsional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Bunga akrual (bunga berjalan) sejak tanggal pembayaran bunga terakhir hingga tanggal transaksi",
        skalaPoin = null,
        pembahasan = "Pembeli membayar bunga berjalan agar pada tanggal pembayaran bunga resmi berikutnya, perusahaan penerbit dapat membayarkan bunga penuh untuk satu periode penuh kepada pemegang obligasi tersebut tanpa perlu memecah perhitungan hari."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_25",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Metode penilaian persediaan yang menurunkan nilai persediaan ke harga pasar apabila biaya perolehan persediaan lebih tinggi daripada nilai realisasi bersihnya disebut...",
        pilihan = listOf(
            " Lower of Cost or Market (LCM) / Nilai Terendah antara Biaya Perolehan dan Nilai Realisasi Netto",
             " Historical Cost Valuation",
            " Fair Value Valuation",
            " Net Present Value Comparison",
            " Standard Cost Method"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Lower of Cost or Market (LCM) / Nilai Terendah antara Biaya Perolehan dan Nilai Realisasi Netto",
        skalaPoin = null,
        pembahasan = "Asas konservatisme mendasari aturan LCM/NRV ini. Jika nilai jual bersih barang persediaan turun di bawah harga belinya (akibat rusak atau usang), nilai persediaan harus diturunkan dan selisihnya diakui sebagai kerugian."
    ),

QuestionEntity(
        idSoal = "TKB_eko_26",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Di dalam analisis biaya-volume-laba (CVP), titik di mana total pendapatan sama dengan total biaya (laba sama dengan nol) disebut sebagai...",
        pilihan = listOf(
            " Margin of Safety",
             " Break Even Point (BEP)",
            " Contribution Margin Ratio",
            " Operating Leverage",
            " Target Profit Point"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Break Even Point (BEP)",
        skalaPoin = null,
        pembahasan = "BEP adalah titik impas. Pada posisi ini, perusahaan tidak mengalami laba dan tidak mengalami rugi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_27",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Metode penentuan harga pokok produk yang membebankan seluruh biaya produksi, baik biaya variabel maupun biaya tetap, ke dalam harga pokok produk disebut...",
        pilihan = listOf(
            " Variable Costing",
             " Direct Costing",
            " Absorption Costing (Full Costing)",
            " Target Costing",
            " Activity Based Costing"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Absorption Costing (Full Costing)",
        skalaPoin = null,
        pembahasan = "Absorption costing mengakui biaya tetap produksi sebagai bagian dari harga pokok barang (inventoriable cost), berbeda dengan Variable Costing yang memperlakukan biaya tetap sebagai beban periode."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_28",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam Auditing, bukti yang memiliki tingkat reliabilitas paling tinggi bagi seorang auditor adalah...",
        pilihan = listOf(
            " Bukti yang diperoleh secara lisan dari manajemen",
             " Bukti yang dibuat oleh pihak internal perusahaan",
            " Bukti yang diperoleh langsung oleh auditor dari pihak eksternal (konfirmasi pihak ketiga)",
            " Fotokopi dokumen yang diberikan klien",
            " Estimasi perhitungan internal auditor"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Bukti yang diperoleh langsung oleh auditor dari pihak eksternal (konfirmasi pihak ketiga)",
        skalaPoin = null,
        pembahasan = "Bukti audit yang diperoleh langsung oleh auditor dari pihak ketiga yang independen (seperti konfirmasi bank atau piutang) memiliki tingkat objektivitas dan reliabilitas tertinggi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_29",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Biaya yang jumlah totalnya tetap meskipun tingkat volume produksi berubah (dalam rentang relevan tertentu) disebut...",
        pilihan = listOf(
            " Biaya Variabel",
             " Biaya Semi-Variabel",
            " Biaya Tetap (Fixed Cost)",
            " Biaya Diferensial",
            " Biaya Marginal"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Biaya Tetap (Fixed Cost)",
        skalaPoin = null,
        pembahasan = "Fixed cost (seperti sewa gedung atau gaji manajer) tidak berubah totalnya meski volume produksi naik atau turun, namun biaya tetap per unit akan berubah mengikuti perubahan volume produksi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_30",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Selisih antara harga jual per unit dengan biaya variabel per unit disebut sebagai...",
        pilihan = listOf(
            " Laba Kotor",
             " Margin Kontribusi (Contribution Margin)",
            " Margin Laba Bersih",
            " Markup",
            " Beban Operasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Margin Kontribusi (Contribution Margin)",
        skalaPoin = null,
        pembahasan = "Margin kontribusi adalah jumlah yang tersedia untuk menutup biaya tetap dan menyumbang laba bagi perusahaan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_31",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam auditing, pernyataan auditor yang menyatakan bahwa laporan keuangan disajikan secara wajar dalam semua hal yang material sesuai dengan kerangka pelaporan keuangan disebut...",
        pilihan = listOf(
            " Opini Wajar Tanpa Pengecualian (Unqualified Opinion)",
             " Opini Wajar Dengan Pengecualian (Qualified Opinion)",
            " Opini Tidak Wajar (Adverse Opinion)",
            " Pernyataan Tidak Memberikan Pendapat (Disclaimer of Opinion)",
            " Opini Bias"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Opini Wajar Tanpa Pengecualian (Unqualified Opinion)",
        skalaPoin = null,
        pembahasan = "Opini 'clean' atau Wajar Tanpa Pengecualian adalah target tertinggi dalam audit, menyatakan laporan keuangan bebas dari salah saji material."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_32",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Metode alokasi biaya di mana biaya overhead dibebankan ke produk berdasarkan aktivitas yang dikonsumsi produk tersebut disebut...",
        pilihan = listOf(
            " Job Order Costing",
             " Process Costing",
            " Activity Based Costing (ABC)",
            " Standard Costing",
            " Target Costing"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Activity Based Costing (ABC)",
        skalaPoin = null,
        pembahasan = "ABC mengidentifikasi aktivitas-aktivitas pemicu biaya (cost drivers) sehingga pembebanan overhead menjadi lebih akurat dibandingkan metode tradisional."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_33",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Biaya yang telah terjadi di masa lalu dan tidak dapat diubah oleh keputusan yang dibuat di masa sekarang atau masa depan disebut...",
        pilihan = listOf(
            " Opportunity Cost",
             " Sunk Cost",
            " Relevant Cost",
            " Incremental Cost",
            " Avoidable Cost"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Sunk Cost",
        skalaPoin = null,
        pembahasan = "Sunk cost (biaya tertanam) harus diabaikan dalam pengambilan keputusan manajerial karena tidak relevan terhadap keputusan masa depan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_34",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam audit internal, risiko bahwa auditor tidak dapat mendeteksi salah saji material yang ada dalam asersi disebut sebagai...",
        pilihan = listOf(
            " Risiko Inheren (Inherent Risk)",
             " Risiko Pengendalian (Control Risk)",
            " Risiko Deteksi (Detection Risk)",
            " Risiko Audit",
            " Risiko Bisnis"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Risiko Deteksi (Detection Risk)",
        skalaPoin = null,
        pembahasan = "Risiko deteksi berkaitan dengan prosedur audit yang dilakukan auditor; semakin efektif prosedur tersebut, semakin rendah risiko deteksinya."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_35",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Biaya yang harus dikorbankan karena memilih satu alternatif daripada alternatif lainnya disebut...",
        pilihan = listOf(
            " Biaya Eksplisit",
             " Biaya Implisit",
            " Biaya Peluang (Opportunity Cost)",
            " Biaya Marginal",
            " Biaya Terbenam"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Biaya Peluang (Opportunity Cost)",
        skalaPoin = null,
        pembahasan = "Opportunity cost adalah nilai dari manfaat yang hilang (terbaik berikutnya) ketika kita memilih suatu tindakan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_36",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dokumen yang menjadi dasar utama bagi auditor untuk menilai keandalan catatan akuntansi klien adalah...",
        pilihan = listOf(
            " Neraca Saldo",
             " Kertas Kerja Auditor (Audit Working Papers)",
            " Laporan Keuangan Tahunan",
            " Bukti Pendukung (Voucher, Faktur, Kontrak)",
            " Anggaran Perusahaan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Bukti Pendukung (Voucher, Faktur, Kontrak)",
        skalaPoin = null,
        pembahasan = "Audit working papers adalah tempat mencatat, namun bukti primer (source documents) adalah dasar verifikasi auditor."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_37",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Tujuan utama dari pengujian pengendalian (test of controls) oleh auditor adalah untuk...",
        pilihan = listOf(
            " Memastikan angka-angka dalam laporan keuangan sudah tepat",
             " Menilai efektivitas operasional sistem pengendalian internal klien",
            " Menentukan tingkat keuntungan perusahaan",
            " Menggantikan tugas departemen akuntansi klien",
            " Menilai kepatuhan pajak perusahaan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menilai efektivitas operasional sistem pengendalian internal klien",
        skalaPoin = null,
        pembahasan = "Pengujian pengendalian dilakukan untuk memastikan prosedur yang dibuat oleh manajemen perusahaan memang berjalan dengan baik dan konsisten."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_38",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Analisis yang dilakukan untuk mengetahui seberapa jauh penjualan dapat turun sebelum perusahaan mulai mengalami kerugian disebut...",
        pilihan = listOf(
            " Analisis Sensitivitas",
             " Margin of Safety",
            " Analisis Varians",
            " Analisis Rasio Likuiditas",
            " Analisis Tren"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Margin of Safety",
        skalaPoin = null,
        pembahasan = "Margin of Safety menunjukkan penyangga (buffer) antara penjualan aktual dengan titik impas (BEP)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_39",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam akuntansi biaya, biaya bahan baku dan biaya tenaga kerja langsung sering disebut sebagai...",
        pilihan = listOf(
            " Prime Cost (Biaya Utama)",
             " Conversion Cost (Biaya Konversi)",
            " Overhead Pabrik",
            " Period Cost",
            " Sunk Cost"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Prime Cost (Biaya Utama)",
        skalaPoin = null,
        pembahasan = "Prime cost adalah total biaya utama untuk memproduksi barang (Bahan Langsung + Tenaga Kerja Langsung)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_40",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Penyimpangan antara anggaran (budget) dengan realisasi aktual yang dianalisis untuk kepentingan pengendalian manajemen disebut...",
        pilihan = listOf(
            " Margin",
             " Varians (Variance)",
            " Selisih Nilai Wajar",
            " Depresiasi",
            " Inflasi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Varians (Variance)",
        skalaPoin = null,
        pembahasan = "Analisis varians membantu manajemen melakukan evaluasi kinerja (Management by Exception) dengan membandingkan apa yang direncanakan dengan apa yang terjadi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_41",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Siapakah yang memiliki tanggung jawab utama atas penyusunan laporan keuangan sesuai dengan standar akuntansi yang berlaku?",
        pilihan = listOf(
            " Auditor Eksternal",
             " Auditor Internal",
            " Manajemen Perusahaan",
            " Pemegang Saham",
            " Pemerintah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Manajemen Perusahaan",
        skalaPoin = null,
        pembahasan = "Manajemen bertanggung jawab atas penyajian laporan keuangan; auditor hanya bertanggung jawab untuk memberikan opini atas kewajaran laporan tersebut."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_42",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Salah satu metode dalam audit untuk mendapatkan bukti dengan cara mengamati secara langsung proses yang dilakukan klien adalah...",
        pilihan = listOf(
            " Inspeksi",
             " Observasi",
            " Konfirmasi",
            " Re-kalkulasi",
            " Analitis"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Observasi",
        skalaPoin = null,
        pembahasan = "Observasi (seperti menyaksikan stok opname) memberikan bukti langsung mengenai prosedur yang dilakukan pada waktu tersebut."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_43",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Pemisahan tugas (segregation of duties) adalah prosedur pengendalian internal yang bertujuan untuk...",
        pilihan = listOf(
            " Meningkatkan jumlah karyawan",
             " Mencegah terjadinya fraud atau kesalahan dengan memisahkan otoritas, pencatatan, dan penyimpanan aset",
            " Menurunkan biaya gaji",
            " Mempermudah proses audit",
            " Menambah birokrasi perusahaan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mencegah terjadinya fraud atau kesalahan dengan memisahkan otoritas, pencatatan, dan penyimpanan aset",
        skalaPoin = null,
        pembahasan = "Pemisahan tugas memastikan tidak ada satu orang pun yang memiliki kontrol penuh atas satu siklus transaksi dari awal hingga akhir."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_44",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam akuntansi biaya, biaya tenaga kerja langsung dan biaya overhead pabrik disebut sebagai...",
        pilihan = listOf(
            " Prime Cost",
             " Conversion Cost (Biaya Konversi)",
            " Fixed Cost",
            " Sunk Cost",
            " Opportunity Cost"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Conversion Cost (Biaya Konversi)",
        skalaPoin = null,
        pembahasan = "Conversion cost adalah biaya yang dikeluarkan untuk mengubah (mengkonversi) bahan baku menjadi barang jadi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_45",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Auditor dapat melakukan prosedur analitis untuk membandingkan data keuangan saat ini dengan periode sebelumnya. Tujuan utamanya adalah...",
        pilihan = listOf(
            " Menghitung pajak penghasilan",
             " Mengidentifikasi fluktuasi yang tidak biasa atau hubungan yang tidak konsisten",
            " Menggantikan pengujian substantif",
            " Mengurangi gaji staf akuntansi",
            " Membuat rencana bisnis baru"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengidentifikasi fluktuasi yang tidak biasa atau hubungan yang tidak konsisten",
        skalaPoin = null,
        pembahasan = "Prosedur analitis (seperti analisis rasio) membantu auditor menemukan 'red flags' atau area yang memerlukan pemeriksaan lebih mendalam (audit substantif)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_46",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Manakah yang merupakan komponen biaya tetap (fixed cost) dalam jangka pendek?",
        pilihan = listOf(
            " Upah lembur buruh",
             " Biaya bahan baku",
            " Biaya depresiasi bangunan pabrik (garis lurus)",
            " Biaya bahan penolong",
            " Biaya energi listrik produksi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Biaya depresiasi bangunan pabrik (garis lurus)",
        skalaPoin = null,
        pembahasan = "Depresiasi garis lurus menghasilkan nilai beban yang sama setiap periode terlepas dari seberapa banyak barang yang diproduksi."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_47",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Tingkat risiko di mana auditor bersedia menerima bahwa laporan keuangan mungkin mengandung salah saji material setelah audit selesai disebut...",
        pilihan = listOf(
            " Detection Risk",
             " Audit Risk",
            " Inherent Risk",
            " Control Risk",
            " Business Risk"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Audit Risk",
        skalaPoin = null,
        pembahasan = "Risiko audit adalah risiko bahwa auditor memberikan opini yang salah (misalnya, bilang Wajar Tanpa Pengecualian padahal ada salah saji material)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_48",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Biaya yang berubah sebanding dengan perubahan volume produksi disebut...",
        pilihan = listOf(
            " Biaya Variabel",
             " Biaya Tetap",
            " Biaya Semi-Variabel",
            " Biaya Tertanam",
            " Biaya Diferensial"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Biaya Variabel",
        skalaPoin = null,
        pembahasan = "Biaya variabel (seperti bahan baku) totalnya meningkat jika produksi meningkat, namun per unitnya cenderung tetap."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_49",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Proses yang dilakukan manajemen untuk memastikan tujuan operasional tercapai dengan efisien, aset terjaga, dan laporan keuangan akurat disebut...",
        pilihan = listOf(
            " Audit Eksternal",
             " Pengendalian Internal (Internal Control)",
            " Manajemen Strategis",
            " Analisis Anggaran",
            " Laporan Kinerja"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pengendalian Internal (Internal Control)",
        skalaPoin = null,
        pembahasan = "Pengendalian internal (kerangka COSO) meliputi lingkungan pengendalian, penilaian risiko, aktivitas pengendalian, informasi dan komunikasi, serta pemantauan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_50",
        kategori = "TKB",
        subKategori = "Ekonomi dan Akuntansi",
        pertanyaan = "Dalam audit, 'materialitas' (materiality) adalah suatu konsep yang berkaitan dengan...",
        pilihan = listOf(
            " Jumlah uang yang disetorkan ke bank",
             " Besarnya nilai yang jika salah saji dapat memengaruhi keputusan ekonomi pemakai laporan keuangan",
            " Jumlah kertas kerja yang harus dibuat",
            " Keahlian teknis staf auditor",
            " Biaya audit yang dibayarkan klien"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Besarnya nilai yang jika salah saji dapat memengaruhi keputusan ekonomi pemakai laporan keuangan",
        skalaPoin = null,
        pembahasan = "Materialitas adalah konsep subjektif namun mendasar; auditor harus menentukan ambang batas yang signifikan bagi investor atau kreditur."
    ),

QuestionEntity(
        idSoal = "TKB_eko_51",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Hukum permintaan (Law of Demand) menyatakan bahwa dalam kondisi ceteris paribus, jika harga suatu barang naik, maka...",
        pilihan = listOf(
            " Jumlah barang yang diminta akan meningkat",
             " Jumlah barang yang diminta akan menurun",
            " Jumlah barang yang ditawarkan akan menurun",
            " Penawaran barang akan bergeser ke kanan",
            " Pendapatan konsumen akan meningkat"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Jumlah barang yang diminta akan menurun",
        skalaPoin = null,
        pembahasan = "Hubungan antara harga dan jumlah barang yang diminta berbanding terbalik (negatif). Saat harga naik, konsumen cenderung mengurangi pembelian barang tersebut."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_52",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam teori perilaku konsumen, titik di mana konsumen memperoleh kepuasan maksimal dari mengonsumsi kombinasi dua barang dengan anggaran terbatas disebut...",
        pilihan = listOf(
            " Kurva Indiferen (Indifference Curve)",
             " Garis Anggaran (Budget Line)",
            " Keseimbangan Konsumen (Consumer Equilibrium)",
            " Marginal Utility",
            " Total Utility"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Keseimbangan Konsumen (Consumer Equilibrium)",
        skalaPoin = null,
        pembahasan = "Keseimbangan konsumen terjadi saat kurva indiferen bersinggungan dengan garis anggaran (budget line), di mana rasio marginal utility terhadap harga untuk kedua barang adalah sama."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_53",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Jika elastisitas harga permintaan suatu barang adalah -2,0, maka dapat disimpulkan bahwa permintaan barang tersebut bersifat...",
        pilihan = listOf(
            " Inelastis",
             " Elastis",
            " Elastis Uniter",
            " Inelastis Sempurna",
            " Elastis Sempurna"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Elastis",
        skalaPoin = null,
        pembahasan = "Nilai elastisitas > 1 (dalam nilai mutlak) menunjukkan bahwa permintaan bersifat elastis, artinya perubahan harga akan berdampak signifikan terhadap perubahan jumlah yang diminta."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_54",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Struktur pasar di mana terdapat banyak penjual dan pembeli, produk bersifat homogen, dan tidak ada hambatan untuk masuk ke pasar (free entry/exit) disebut...",
        pilihan = listOf(
            " Monopoli",
             " Oligopoli",
            " Persaingan Monopolistik",
            " Persaingan Sempurna",
            " Monopsoni"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "D. Persaingan Sempurna",
        skalaPoin = null,
        pembahasan = "Pada persaingan sempurna, penjual adalah *price taker* (pengikut harga) karena barang yang dijual sangat identik di pasar."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_55",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Manakah di bawah ini yang merupakan ciri khas dari struktur pasar monopoli?",
        pilihan = listOf(
            " Banyak perusahaan menjual produk yang sama",
             " Hanya ada satu penjual yang menguasai pasar untuk produk yang tidak memiliki substitusi dekat",
            " Perusahaan memiliki kebebasan mutlak untuk keluar masuk pasar",
            " Penjual memiliki sedikit kontrol atas harga",
            " Produk bersifat sangat terdiferensiasi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Hanya ada satu penjual yang menguasai pasar untuk produk yang tidak memiliki substitusi dekat",
        skalaPoin = null,
        pembahasan = "Monopoli dicirikan oleh *barriers to entry* yang tinggi dan penjual tunggal yang memiliki kekuatan pasar (*price maker*) yang signifikan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_56",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam teori produksi, 'The Law of Diminishing Marginal Returns' menyatakan bahwa jika satu input variabel ditambah terus-menerus sementara input lainnya tetap, maka...",
        pilihan = listOf(
            " Output total akan terus meningkat secara proporsional",
             " Output marginal pada akhirnya akan menurun",
            " Biaya produksi per unit akan selalu turun",
            " Efisiensi produksi akan meningkat tanpa batas",
            " Produksi akan selalu mencapai titik optimal"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Output marginal pada akhirnya akan menurun",
        skalaPoin = null,
        pembahasan = "Pada awalnya penambahan input mungkin menambah output dengan cepat, namun seiring berjalannya waktu, tambahan output (marginal product) akan berkurang karena keterbatasan faktor produksi tetap (misal: luas lahan)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_57",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Apa yang terjadi pada keseimbangan harga dan jumlah barang di pasar jika terjadi peningkatan penawaran (supply) sementara permintaan (demand) tetap?",
        pilihan = listOf(
            " Harga naik, jumlah barang naik",
             " Harga turun, jumlah barang naik",
            " Harga naik, jumlah barang turun",
            " Harga turun, jumlah barang turun",
            " Tidak ada perubahan pada harga maupun jumlah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Harga turun, jumlah barang naik",
        skalaPoin = null,
        pembahasan = "Peningkatan penawaran (kurva bergeser ke kanan) akan menciptakan surplus barang pada harga lama, sehingga harga akan turun dan jumlah yang terjual meningkat."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_58",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Pasar di mana terdapat sedikit perusahaan yang mendominasi pasar dan tindakan satu perusahaan akan memengaruhi perusahaan lainnya disebut...",
        pilihan = listOf(
            " Persaingan Sempurna",
             " Oligopoli",
            " Monopolistik",
            " Monopsoni",
            " Oligopsoni"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Oligopoli",
        skalaPoin = null,
        pembahasan = "Oligopoli ditandai oleh interdependensi antarperusahaan, seperti industri telekomunikasi atau otomotif."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_59",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Barang yang jumlah permintaannya justru turun ketika pendapatan konsumen meningkat disebut sebagai...",
        pilihan = listOf(
            " Barang Normal",
             " Barang Mewah",
            " Barang Inferior",
            " Barang Substitusi",
            " Barang Komplementer"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Barang Inferior",
        skalaPoin = null,
        pembahasan = "Contoh barang inferior adalah barang kebutuhan dasar berkualitas rendah yang ditinggalkan konsumen saat daya beli mereka meningkat."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_60",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Tingkat elastisitas silang antara dua barang komplementer (saling melengkapi) adalah...",
        pilihan = listOf(
            " Positif",
             " Negatif",
            " Nol",
            " Satu",
            " Tak terhingga"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Negatif",
        skalaPoin = null,
        pembahasan = "Jika harga barang A naik, permintaan barang B (pasangannya) akan turun, sehingga elastisitas silangnya bernilai negatif."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_61",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam jangka panjang, perusahaan pada pasar persaingan sempurna akan memperoleh laba sebesar...",
        pilihan = listOf(
            " Laba supernormal (di atas rata-rata)",
             " Laba normal (nol dalam istilah ekonomi)",
            " Rugi besar",
            " Laba yang tidak terbatas",
            " Margin laba yang sangat tinggi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Laba normal (nol dalam istilah ekonomi)",
        skalaPoin = null,
        pembahasan = "Karena adanya kemudahan keluar-masuk pasar, jika ada laba supernormal, perusahaan baru akan masuk, menambah penawaran, dan menurunkan harga hingga laba kembali normal."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_62",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Kegagalan pasar (market failure) dapat terjadi karena beberapa faktor berikut, kecuali...",
        pilihan = listOf(
            " Keberadaan eksternalitas",
             " Monopoli alami",
            " Barang publik",
            " Informasi asimetris",
            " Persaingan yang sangat ketat"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "E. Persaingan yang sangat ketat",
        skalaPoin = null,
        pembahasan = "Persaingan ketat (persaingan sempurna) justru dianggap pasar yang paling efisien, bukan penyebab kegagalan pasar."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_63",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Apa yang dimaksud dengan elastisitas pendapatan (income elasticity) bernilai positif (>0)?",
        pilihan = listOf(
            " Barang tersebut adalah barang inferior",
             " Barang tersebut adalah barang normal",
            " Barang tersebut tidak memiliki permintaan",
            " Barang tersebut bersifat inelastis",
            " Tidak ada korelasi antara pendapatan dan permintaan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Barang tersebut adalah barang normal",
        skalaPoin = null,
        pembahasan = "Untuk barang normal, peningkatan pendapatan akan diikuti oleh peningkatan permintaan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_64",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Manakah di bawah ini yang paling tepat menggambarkan kurva permintaan bagi perusahaan individu dalam pasar persaingan sempurna?",
        pilihan = listOf(
            " Menurun dari kiri atas ke kanan bawah (downward sloping)",
             " Horizontal (perfectly elastic)",
            " Vertikal (perfectly inelastic)",
            " Melengkung ke atas",
            " Berbentuk U"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Horizontal (perfectly elastic)",
        skalaPoin = null,
        pembahasan = "Perusahaan individu harus menerima harga pasar, sehingga kurva permintaan untuk satu perusahaan tersebut berbentuk horizontal pada tingkat harga pasar."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_65",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Eksternalitas negatif terjadi ketika...",
        pilihan = listOf(
            " Aktivitas ekonomi memberikan manfaat bagi pihak ketiga",
             " Aktivitas ekonomi menimbulkan biaya bagi pihak ketiga yang tidak terlibat dalam transaksi",
            " Pemerintah mengenakan pajak yang tinggi",
            " Perusahaan mendapatkan keuntungan yang sangat besar",
            " Harga barang meningkat tajam"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Aktivitas ekonomi menimbulkan biaya bagi pihak ketiga yang tidak terlibat dalam transaksi",
        skalaPoin = null,
        pembahasan = "Contoh klasik eksternalitas negatif adalah polusi industri yang merugikan kesehatan masyarakat di sekitar pabrik."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_66",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam struktur pasar monopolistik, perusahaan melakukan diferensiasi produk untuk...",
        pilihan = listOf(
            " Menghilangkan pesaing sepenuhnya",
             " Memperoleh kekuatan monopoli parsial dan mengurangi elastisitas permintaan",
            " Menurunkan biaya produksi secara drastis",
            " Menghindari pajak pemerintah",
            " Menciptakan barang publik"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Memperoleh kekuatan monopoli parsial dan mengurangi elastisitas permintaan",
        skalaPoin = null,
        pembahasan = "Diferensiasi (branding, fitur unik) membuat produk terasa berbeda di mata konsumen, sehingga mereka tidak mudah berpindah ke barang lain jika harga naik."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_67",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Kurva kemungkinan produksi (Production Possibility Frontier - PPF) menunjukkan...",
        pilihan = listOf(
            " Tingkat harga optimal barang",
             " Batas maksimum kombinasi output yang dapat diproduksi dengan sumber daya yang ada",
            " Keuntungan yang didapat perusahaan",
            " Tingkat kepuasan konsumen tertinggi",
            " Garis biaya produksi minimal"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Batas maksimum kombinasi output yang dapat diproduksi dengan sumber daya yang ada",
        skalaPoin = null,
        pembahasan = "Setiap titik di kurva PPF menunjukkan efisiensi penggunaan sumber daya. Titik di dalam kurva menunjukkan ketidakefisienan/pengangguran sumber daya."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_68",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Apa yang dimaksud dengan elastisitas permintaan inelastis?",
        pilihan = listOf(
            " Persentase perubahan jumlah diminta lebih besar daripada persentase perubahan harga",
             " Persentase perubahan jumlah diminta lebih kecil daripada persentase perubahan harga",
            " Persentase perubahan jumlah diminta sama dengan persentase perubahan harga",
            " Perubahan harga tidak memengaruhi jumlah permintaan sama sekali",
            " Jumlah permintaan berubah sangat tajam akibat perubahan harga"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Persentase perubahan jumlah diminta lebih kecil daripada persentase perubahan harga",
        skalaPoin = null,
        pembahasan = "Inelastis berarti konsumen kurang sensitif terhadap perubahan harga (contoh: barang kebutuhan pokok seperti garam)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_69",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Kondisi di mana penjual memiliki informasi yang lebih banyak daripada pembeli mengenai kualitas produk disebut...",
        pilihan = listOf(
            " Moral hazard",
             " Adverse selection",
            " Informasi asimetris",
            " Eksternalitas",
            " Public goods problem"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Informasi asimetris",
        skalaPoin = null,
        pembahasan = "Contoh umum informasi asimetris adalah pasar mobil bekas, di mana penjual lebih tahu kondisi mesin daripada pembeli."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_70",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam ekonomi, barang publik (public goods) memiliki karakteristik...",
        pilihan = listOf(
            " Eksklusif dan kompetitif",
             " Non-eksklusif dan non-kompetitif",
            " Eksklusif dan non-kompetitif",
            " Non-eksklusif dan kompetitif",
            " Hanya dimiliki oleh pemerintah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Non-eksklusif dan non-kompetitif",
        skalaPoin = null,
        pembahasan = "Non-eksklusif artinya sulit melarang orang menggunakan barang tersebut, non-kompetitif artinya penggunaan oleh satu orang tidak mengurangi ketersediaan bagi orang lain (contoh: lampu jalan)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_71",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Metode penentuan harga di mana perusahaan membebankan harga yang berbeda kepada konsumen yang berbeda untuk barang yang sama disebut...",
        pilihan = listOf(
            " Penetapan harga predator",
             " Diskriminasi harga (price discrimination)",
            " Penentuan harga mark-up",
            " Penetapan harga marginal",
            " Penentuan harga kompetitif"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Diskriminasi harga (price discrimination)",
        skalaPoin = null,
        pembahasan = "Tujuannya adalah menangkap *consumer surplus* sebanyak mungkin (contoh: tiket pesawat atau diskon pelajar)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_72",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Apa yang terjadi jika pemerintah menetapkan harga tertinggi (price ceiling) di bawah harga keseimbangan pasar?",
        pilihan = listOf(
            " Terjadi surplus barang",
             " Terjadi kekurangan/kelangkaan barang (shortage)",
            " Pasar menjadi lebih efisien",
            " Penjual akan meningkatkan produksi",
            " Tidak akan ada perubahan"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Terjadi kekurangan/kelangkaan barang (shortage)",
        skalaPoin = null,
        pembahasan = "Harga di bawah keseimbangan akan menstimulasi permintaan (naik) tetapi menekan penawaran (turun), sehingga timbul kekurangan."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_73",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Dalam teori permainan (game theory), kondisi di mana setiap pemain memilih strategi terbaiknya dengan mempertimbangkan strategi pemain lain disebut...",
        pilihan = listOf(
            " Dominant Strategy",
             " Nash Equilibrium",
            " Pareto Optimal",
            " Prisoner's Dilemma",
            " Zero-Sum Game"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Nash Equilibrium",
        skalaPoin = null,
        pembahasan = "Keseimbangan Nash terjadi ketika tidak ada pemain yang dapat memperbaiki keadaannya dengan mengubah strateginya secara sepihak."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_74",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Perusahaan yang dapat memproduksi seluruh output pasar dengan biaya rata-rata yang lebih rendah dibandingkan jika ada dua atau lebih perusahaan di pasar disebut...",
        pilihan = listOf(
            " Monopoli paksaan",
             " Monopoli alami (natural monopoly)",
            " Monopoli pemerintah",
            " Kartel",
            " Perusahaan kompetitif"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Monopoli alami (natural monopoly)",
        skalaPoin = null,
        pembahasan = "Biasanya terjadi pada industri dengan skala ekonomi yang sangat besar (seperti jaringan air bersih atau listrik)."
    ),

    QuestionEntity(
        idSoal = "TKB_eko_75",
        kategori = "TKB",
        subKategori = "Ekonomi Mikro",
        pertanyaan = "Total Utility (TU) mencapai titik maksimum ketika...",
        pilihan = listOf(
            " Marginal Utility (MU) positif",
             " Marginal Utility (MU) sama dengan nol",
            " Marginal Utility (MU) negatif",
            " Marginal Utility (MU) meningkat",
            " Total Utility (TU) sama dengan Marginal Utility (MU)"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Marginal Utility (MU) sama dengan nol",
        skalaPoin = null,
        pembahasan = "Ketika MU = 0, tambahan konsumsi tidak lagi menambah total kepuasan. Jika MU menjadi negatif, Total Utility justru akan menurun."
    ),

QuestionEntity(
        idSoal = "TKB_makro_76",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Produk Domestik Bruto (PDB) nominal mengukur nilai output barang dan jasa akhir pada...",
        pilihan = listOf(
            " Harga tahun dasar",
             " Harga yang berlaku saat ini",
            " Harga konstan",
            " Harga pasar dunia",
            " Nilai tukar PPP"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Harga yang berlaku saat ini",
        skalaPoin = null,
        pembahasan = "PDB Nominal menggunakan harga yang berlaku saat ini, sehingga belum disesuaikan dengan inflasi. PDB Riil lah yang menggunakan harga tahun dasar."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_77",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Tingkat pengangguran yang terjadi karena pergeseran struktur ekonomi (misalnya munculnya teknologi baru yang menggantikan tenaga kerja manual) disebut...",
        pilihan = listOf(
            " Pengangguran Frictional",
             " Pengangguran Cyclical",
            " Pengangguran Struktural",
            " Pengangguran Musiman",
            " Pengangguran Sukarela"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Pengangguran Struktural",
        skalaPoin = null,
        pembahasan = "Pengangguran struktural terjadi karena adanya ketidakcocokan antara keahlian tenaga kerja dengan kebutuhan industri akibat perubahan struktur ekonomi."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_78",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Dalam kebijakan moneter, jika Bank Sentral melakukan 'Open Market Operation' dengan menjual surat berharga pemerintah, maka tujuannya adalah...",
        pilihan = listOf(
            " Menambah jumlah uang beredar",
             " Mengurangi jumlah uang beredar",
            " Menurunkan suku bunga",
            " Mendorong investasi secara agresif",
            " Memicu inflasi"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Mengurangi jumlah uang beredar",
        skalaPoin = null,
        pembahasan = "Penjualan surat berharga akan menyerap uang dari masyarakat ke Bank Sentral, sehingga jumlah uang beredar di pasar berkurang."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_79",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Kurva Philips (Phillips Curve) menggambarkan hubungan jangka pendek antara...",
        pilihan = listOf(
            " Inflasi dan Pengangguran",
             " Pertumbuhan Ekonomi dan Suku Bunga",
            " Tabungan dan Investasi",
            " Ekspor dan Impor",
            " Pajak dan Pengeluaran Pemerintah"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Inflasi dan Pengangguran",
        skalaPoin = null,
        pembahasan = "Kurva Philips menunjukkan adanya *trade-off* (hubungan terbalik) antara inflasi dan pengangguran dalam jangka pendek."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_80",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Dalam model IS-LM, apa yang terjadi pada kurva IS jika pemerintah meningkatkan pengeluaran (G)?",
        pilihan = listOf(
            " Kurva IS bergeser ke kiri",
             " Kurva IS bergeser ke kanan",
            " Kurva IS tidak bergerak",
            " Kurva LM bergeser ke kanan",
            " Kurva LM bergeser ke kiri"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kurva IS bergeser ke kanan",
        skalaPoin = null,
        pembahasan = "Peningkatan pengeluaran pemerintah (ekspansi fiskal) akan meningkatkan permintaan agregat, yang menggeser kurva IS ke kanan."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_81",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Fenomena di mana kenaikan pengeluaran pemerintah menyebabkan penurunan investasi swasta akibat naiknya suku bunga disebut...",
        pilihan = listOf(
            " Crowding out effect",
             " Multiplier effect",
            " Accelerator effect",
            " Inflationary gap",
            " Liquidity trap"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Crowding out effect",
        skalaPoin = null,
        pembahasan = "Pemerintah yang berutang besar untuk membiayai pengeluaran dapat menaikkan suku bunga, yang pada akhirnya membebani investor swasta."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_82",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Salah satu fungsi uang adalah sebagai 'penyimpan nilai' (store of value). Maksudnya adalah...",
        pilihan = listOf(
            " Uang dapat digunakan sebagai alat pembayaran sah",
             " Uang dapat digunakan untuk mengukur nilai barang",
            " Uang dapat digunakan untuk menunda daya beli ke masa depan",
            " Uang mempermudah transaksi barter",
            " Uang dapat dipecah menjadi unit kecil"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Uang dapat digunakan untuk menunda daya beli ke masa depan",
        skalaPoin = null,
        pembahasan = "Sebagai penyimpan nilai, uang memungkinkan pemiliknya untuk menyimpan kekayaan saat ini dan digunakan di masa mendatang."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_83",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Menurut teori pertumbuhan ekonomi Solow, pertumbuhan ekonomi jangka panjang pada akhirnya ditentukan oleh...",
        pilihan = listOf(
            " Akumulasi modal saja",
             " Pertumbuhan penduduk",
            " Kemajuan teknologi (total factor productivity)",
            " Kebijakan proteksi perdagangan",
            " Defisit anggaran"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Kemajuan teknologi (total factor productivity)",
        skalaPoin = null,
        pembahasan = "Model Solow menunjukkan bahwa akumulasi modal memiliki *diminishing returns*, sehingga hanya kemajuan teknologi yang bisa menjaga pertumbuhan berkelanjutan."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_84",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Perdagangan internasional didasarkan pada 'teori keunggulan komparatif' yang dicetuskan oleh...",
        pilihan = listOf(
            " Adam Smith",
             " David Ricardo",
            " John Maynard Keynes",
            " Milton Friedman",
            " Alfred Marshall"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. David Ricardo",
        skalaPoin = null,
        pembahasan = "David Ricardo menyatakan negara sebaiknya berspesialisasi pada produk dengan *opportunity cost* paling rendah."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_85",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Jika suatu negara menerapkan kebijakan tarif impor yang tinggi, dampak langsung yang diharapkan adalah...",
        pilihan = listOf(
            " Peningkatan daya saing produk dalam negeri",
             " Penurunan harga barang impor",
            " Peningkatan volume perdagangan internasional",
            " Peningkatan efisiensi industri domestik secara otomatis",
            " Pengurangan utang luar negeri"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Peningkatan daya saing produk dalam negeri",
        skalaPoin = null,
        pembahasan = "Tarif membuat harga barang impor lebih mahal, sehingga produk lokal menjadi lebih kompetitif bagi konsumen domestik."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_86",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Apa yang dimaksud dengan 'Stagflasi'?",
        pilihan = listOf(
            " Inflasi tinggi disertai pertumbuhan ekonomi tinggi",
             " Inflasi tinggi disertai pengangguran tinggi",
            " Inflasi nol disertai pertumbuhan stabil",
            " Pengangguran rendah disertai inflasi rendah",
            " Deflasi disertai pertumbuhan ekonomi cepat"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Inflasi tinggi disertai pengangguran tinggi",
        skalaPoin = null,
        pembahasan = "Stagflasi adalah kondisi ekonomi yang sulit karena menggabungkan stagnasi ekonomi (pengangguran) dan inflasi secara bersamaan."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_87",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Kebijakan fiskal ekspansif dilakukan pemerintah dengan cara...",
        pilihan = listOf(
            " Menaikkan pajak dan mengurangi pengeluaran",
             " Menurunkan pajak dan menambah pengeluaran",
            " Menjual surat berharga pemerintah",
            " Menaikkan suku bunga acuan",
            " Mengurangi jumlah uang beredar"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Menurunkan pajak dan menambah pengeluaran",
        skalaPoin = null,
        pembahasan = "Tujuannya untuk meningkatkan permintaan agregat dan mendorong pertumbuhan ekonomi."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_88",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Neraca pembayaran (Balance of Payments) yang mencatat aliran masuk dan keluar investasi serta aset keuangan disebut...",
        pilihan = listOf(
            " Neraca Perdagangan",
             " Neraca Berjalan (Current Account)",
            " Neraca Modal (Capital Account)",
            " Neraca Jasa",
            " Neraca Transfer"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Neraca Modal (Capital Account)",
        skalaPoin = null,
        pembahasan = "Neraca modal mencatat transaksi aset finansial antarnegara, berbeda dengan neraca berjalan yang mencatat barang dan jasa."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_89",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Apa efek dari depresiasi mata uang domestik terhadap ekspor negara tersebut?",
        pilihan = listOf(
            " Ekspor menjadi lebih mahal bagi orang asing",
             " Ekspor menjadi lebih murah bagi orang asing",
            " Ekspor tidak terpengaruh",
            " Ekspor akan berhenti",
            " Mengurangi volume ekspor"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Ekspor menjadi lebih murah bagi orang asing",
        skalaPoin = null,
        pembahasan = "Nilai tukar yang melemah membuat barang domestik lebih murah di pasar internasional, sehingga meningkatkan daya saing ekspor."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_90",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Perhitungan PDB dengan menjumlahkan seluruh pengeluaran konsumsi, investasi, pengeluaran pemerintah, dan ekspor neto disebut...",
        pilihan = listOf(
            " Pendekatan Produksi",
             " Pendekatan Pendapatan",
            " Pendekatan Pengeluaran",
            " Pendekatan Nilai Tambah",
            " Pendekatan Biaya"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Pendekatan Pengeluaran",
        skalaPoin = null,
        pembahasan = "Rumus PDB: Y = C + I + G + (X - M)."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_91",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Kecenderungan masyarakat untuk mengonsumsi setiap tambahan unit pendapatan disebut...",
        pilihan = listOf(
            " Marginal Propensity to Save (MPS)",
             " Marginal Propensity to Consume (MPC)",
            " Average Propensity to Consume (APC)",
            " Multiplier",
            " Marginal Efficiency of Capital"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Marginal Propensity to Consume (MPC)",
        skalaPoin = null,
        pembahasan = "MPC (ΔC/ΔY) menunjukkan seberapa besar tambahan konsumsi akibat tambahan pendapatan."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_92",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Dalam kebijakan moneter, 'Cash Reserve Ratio' (Cadangan Wajib Minimum) yang dinaikkan akan mengakibatkan...",
        pilihan = listOf(
            " Jumlah uang beredar meningkat",
             " Kemampuan bank untuk memberikan kredit berkurang",
            " Suku bunga turun",
            " Investasi meningkat",
            " Inflasi meningkat"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Kemampuan bank untuk memberikan kredit berkurang",
        skalaPoin = null,
        pembahasan = "Bank harus menyimpan lebih banyak dana di Bank Sentral, sehingga likuiditas untuk disalurkan sebagai kredit menjadi berkurang."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_93",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Fungsi utama Bank Sentral dalam perekonomian adalah sebagai...",
        pilihan = listOf(
            " Pengelola pajak negara",
             " Pihak yang menetapkan kebijakan fiskal",
            " Lender of last resort dan pengendali moneter",
            " Penjamin seluruh simpanan nasabah",
            " Pembuat peraturan bisnis internasional"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Lender of last resort dan pengendali moneter",
        skalaPoin = null,
        pembahasan = "Bank Sentral bertanggung jawab atas stabilitas moneter dan penyediaan likuiditas dalam kondisi krisis."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_94",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Kurva Engel (Engel Curve) menunjukkan hubungan antara...",
        pilihan = listOf(
            " Harga dan jumlah barang diminta",
             " Pendapatan dan jumlah konsumsi barang",
            " Suku bunga dan investasi",
            " Inflasi dan pengangguran",
            " Upah dan tenaga kerja"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pendapatan dan jumlah konsumsi barang",
        skalaPoin = null,
        pembahasan = "Kurva Engel memetakan bagaimana konsumsi terhadap suatu barang berubah seiring dengan perubahan tingkat pendapatan konsumen."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_95",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Kelemahan utama dari perhitungan PDB adalah...",
        pilihan = listOf(
            " Tidak mengukur transaksi pasar",
             " Tidak mencakup barang ilegal dan kegiatan non-pasar (seperti pekerjaan rumah tangga)",
            " Terlalu fokus pada pemerataan pendapatan",
            " Menggunakan harga tahun dasar yang salah",
            " Tidak menghitung ekspor"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Tidak mencakup barang ilegal dan kegiatan non-pasar (seperti pekerjaan rumah tangga)",
        skalaPoin = null,
        pembahasan = "PDB memiliki keterbatasan dalam mengukur kesejahteraan riil karena tidak menangkap kegiatan ekonomi informal atau non-pasar."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_96",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Dalam sistem nilai tukar 'Floating Exchange Rate', harga mata uang ditentukan oleh...",
        pilihan = listOf(
            " Keputusan pemerintah secara sepihak",
             " Intervensi Bank Sentral secara tetap",
            " Mekanisme pasar (permintaan dan penawaran)",
            " Perjanjian internasional yang tidak boleh berubah",
            " Standar emas"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "C. Mekanisme pasar (permintaan dan penawaran)",
        skalaPoin = null,
        pembahasan = "Pada sistem kurs mengambang, nilai tukar dibiarkan berfluktuasi sesuai dinamika pasar global."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_97",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Deflasi adalah kondisi di mana...",
        pilihan = listOf(
            " Inflasi melambat",
             " Terjadi penurunan harga secara umum dan terus-menerus",
            " Suku bunga sangat tinggi",
            " Nilai tukar mata uang sangat stabil",
            " Pengangguran mencapai titik nol"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Terjadi penurunan harga secara umum dan terus-menerus",
        skalaPoin = null,
        pembahasan = "Deflasi berbahaya karena dapat menyebabkan penundaan konsumsi (konsumen menunggu harga lebih murah), yang melumpuhkan ekonomi."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_98",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Apa yang dimaksud dengan 'Multiplier' dalam ekonomi?",
        pilihan = listOf(
          " Perbandingan antara perubahan output dengan perubahan variabel eksogen (seperti pengeluaran pemerintah)",
             " Jumlah pajak yang dikumpulkan pemerintah",
            " Kecepatan uang beredar di masyarakat",
            " Rasio antara utang dan PDB",
            " Tingkat pertumbuhan penduduk"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "A. Perbandingan antara perubahan output dengan perubahan variabel eksogen (seperti pengeluaran pemerintah)",
        skalaPoin = null,
        pembahasan = "Efek pengganda menjelaskan bagaimana suntikan pengeluaran menciptakan dampak yang lebih besar pada PDB total melalui putaran konsumsi."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_99",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Tujuan utama kebijakan ekonomi makro adalah...",
        pilihan = listOf(
          " Memaksimalkan laba satu perusahaan",
             " Pertumbuhan ekonomi, stabilitas harga, dan penyerapan tenaga kerja",
            " Penghapusan seluruh persaingan pasar",
            " Penguasaan pasar oleh satu perusahaan",
            " Menghilangkan pajak sama sekali"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Pertumbuhan ekonomi, stabilitas harga, dan penyerapan tenaga kerja",
        skalaPoin = null,
        pembahasan = "Tiga pilar utama ini merupakan target kebijakan pemerintah untuk menjaga kesejahteraan ekonomi nasional."
    ),

    QuestionEntity(
        idSoal = "TKB_makro_100",
        kategori = "TKB",
        subKategori = "Ekonomi Makro",
        pertanyaan = "Dalam neraca perdagangan, jika nilai ekspor lebih kecil daripada nilai impor, maka disebut...",
        pilihan = listOf(
          " Surplus perdagangan",
             " Defisit perdagangan",
            " Keseimbangan perdagangan",
            " Neraca positif",
            " Pertumbuhan ekspor"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Defisit perdagangan",
        skalaPoin = null,
        pembahasan = "Defisit terjadi ketika arus keluar uang untuk membayar impor lebih besar daripada arus masuk uang dari ekspor."
    )
	)
}