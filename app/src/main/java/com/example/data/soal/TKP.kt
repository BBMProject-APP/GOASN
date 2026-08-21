package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalTKP {
    val daftarSoal = listOf(
    QuestionEntity(
        idSoal = "tkp_1",
        kategori = "TKP",
        subKategori = "Pelayanan Publik",
        pertanyaan = "Anda sedang melayani antrean warga yang sangat padat di loket pendaftaran. Tiba-tiba ada seorang bapak tua yang memotong antrean dengan alasan rumahnya sangat jauh dan dia sudah kelelahan. Sikap Anda adalah...",
        pilihan = listOf(
            " Memarahinya di depan umum agar dia tahu rasa dan kembali ke antrean paling belakang",
            " Melayaninya terlebih dahulu karena merasa kasihan melihat kondisinya yang sudah tua",
            " Memintanya dengan sopan untuk tetap mengantre, lalu menawarkan kursi prioritas agar beliau bisa duduk menunggu dengan nyaman",
            " Mengabaikannya dan tetap melayani warga yang mengantre sesuai urutan nomor",
            " Memanggil petugas keamanan (Satpam) untuk mengusir bapak tersebut dari area loket"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
            " Memarahinya di depan umum agar dia tahu rasa dan kembali ke antrean paling belakang" to 1,
            " Melayaninya terlebih dahulu karena merasa kasihan melihat kondisinya yang sudah tua" to 3,
            " Memintanya dengan sopan untuk tetap mengantre, lalu menawarkan kursi prioritas agar beliau bisa duduk menunggu dengan nyaman" to 5,
            " Mengabaikannya dan tetap melayani warga yang mengantre sesuai urutan nomor" to 4,
            " Memanggil petugas keamanan (Satpam) untuk mengusir bapak tersebut dari area loket" to 2
        ),
        pembahasan = "Aspek Pelayanan Publik. Poin tertinggi (5) ada pada pilihan C karena Anda tetap menjaga ketertiban prosedur antrean bagi warga lain, tanpa mengabaikan rasa kemanusiaan dengan memberikan solusi kursi prioritas."
    ),

    QuestionEntity(
        idSoal = "tkp_jejaring_2",
        kategori = "TKP",
        subKategori = "Jejaring Kerja",
        pertanyaan = "Instansi Anda baru saja membentuk tim lintas divisi untuk menyelesaikan proyek strategis nasional. Anda ditunjuk sebagai anggota tim, namun Anda belum mengenal satu pun anggota dari divisi lain. Langkah awal yang akan Anda lakukan adalah...",
        pilihan = listOf(
            " Menunggu anggota lain menyapa Anda terlebih dahulu saat rapat perdana",
            " Berkenalan secara proaktif dengan seluruh anggota tim, bertukar kontak, dan mencoba memahami latar belakang keahlian mereka",
            " Fokus mengerjakan tugas mandiri yang diberikan oleh ketua tim tanpa perlu terlalu akrab dengan anggota lain",
            " Meminta ketua tim untuk memindahkan Anda ke tim yang anggotanya sudah Anda kenal",
            " Mengusulkan agenda makan bersama di luar jam kerja agar suasana langsung cair tanpa membahas pekerjaan"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
            " Menunggu anggota lain menyapa Anda terlebih dahulu saat rapat perdana" to 2,
            " Berkenalan secara proaktif dengan seluruh anggota tim, bertukar kontak, dan mencoba memahami latar belakang keahlian mereka" to 5,
            " Fokus mengerjakan tugas mandiri yang diberikan oleh ketua tim tanpa perlu terlalu akrab dengan anggota lain" to 3,
            " Meminta ketua tim untuk memindahkan Anda ke tim yang anggotanya sudah Anda kenal" to 1,
            " Mengusulkan agenda makan bersama di luar jam kerja agar suasana langsung cair tanpa membahas pekerjaan" to 4
        ),
        pembahasan = "Aspek Jejaring Kerja. Poin tertinggi (5) menunjukkan sikap proaktif dalam membangun hubungan kerja yang positif, terbuka, dan berorientasi pada kolaborasi tim yang efektif."
    ),

    QuestionEntity(
        idSoal = "tkp_sosbud_3",
        kategori = "TKP",
        subKategori = "Sosbud",
        pertanyaan = "Anda baru saja dimutasi ke kantor cabang di daerah pedalaman yang masyarakatnya memegang teguh adat istiadat tertentu. Suatu hari, Anda diundang ke acara syukuran desa yang menyajikan makanan tradisional khas daerah tersebut, namun Anda kurang menyukai aromanya. Sikap Anda...",
        pilihan = listOf(
            " Menolak undangan tersebut dengan alasan sibuk menyelesaikan pekerjaan kantor",
             " Menghadiri acara tersebut, duduk di pojokan, dan menolak dengan tegas saat disodori makanan",
            " Datang menghadiri acara, mengapresiasi keramahan warga, dan mencicipi makanan tersebut sedikit sebagai bentuk penghormatan",
            " Menghadiri acara dan menceramahi warga bahwa adat tersebut sudah tidak relevan dengan zaman modern",
            " Menugaskan staf asli daerah tersebut untuk mewakili Anda menghadiri acara syukuran"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
          " Menolak undangan tersebut dengan alasan sibuk menyelesaikan pekerjaan kantor" to 2,
             " Menghadiri acara tersebut, duduk di pojokan, and menolak dengan tegas saat disodori makanan" to 3,
            " Datang menghadiri acara, mengapresiasi keramahan warga, dan mencicipi makanan tersebut sedikit sebagai bentuk penghormatan" to 5,
            " Menghadiri acara dan menceramahi warga bahwa adat tersebut sudah tidak relevan dengan zaman modern" to 1,
            " Menugaskan staf asli daerah tersebut untuk mewakili Anda menghadiri acara syukuran" to 4
        ),
        pembahasan = "Aspek Sosbud. Poin tertinggi (5) mencerminkan sikap toleransi, adaptasi, dan respek yang tinggi terhadap keberagaman budaya serta adat istiadat masyarakat setempat."
    ),

    QuestionEntity(
        idSoal = "tkp_tik_4",
        kategori = "TKP",
        subKategori = "Teknologi Informasi dan Komunikasi",
        pertanyaan = "Pimpinan instansi memutuskan untuk mengubah sistem pelaporan kinerja dari yang semula manual cetak kertas (hardcopy) menjadi berbasis aplikasi digital. Beberapa rekan kerja senior mengeluh karena kesulitan mengoperasikannya. Sikap Anda dalam menghadapi situasi ini adalah...",
        pilihan = listOf(
          " Ikut mengeluh bersama rekan kerja senior karena merasa sistem lama sebenarnya sudah cukup baik",
             " Mempelajari aplikasi tersebut secara mandiri, lalu menawarkan bantuan secara sabar untuk mengajari rekan senior yang kesulitan",
            " Menggunakan aplikasi tersebut untuk diri sendiri saja dan membiarkan rekan senior mengurus masalah mereka sendiri",
            " Mengusulkan kepada pimpinan agar sistem manual tetap dipertahankan khusus untuk pegawai senior",
            " Mengambil alih tugas pengisian aplikasi milik semua rekan senior agar pekerjaan kantor tidak terhambat"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
          " Ikut mengeluh bersama rekan kerja senior karena merasa sistem lama sebenarnya sudah cukup baik" to 1,
             " Mempelajari aplikasi tersebut secara mandiri, lalu menawarkan bantuan secara sabar untuk mengajari rekan senior yang kesulitan" to 5,
            " Menggunakan aplikasi tersebut untuk diri sendiri saja dan membiarkan rekan senior mengurus masalah mereka sendiri" to 3,
            " Mengusulkan kepada pimpinan agar sistem manual tetap dipertahankan khusus untuk pegawai senior" to 2,
            " Mengambil alih tugas pengisian aplikasi milik semua rekan senior agar pekerjaan kantor tidak terhambat" to 4
        ),
        pembahasan = "Aspek TIK. Poin 5 menunjukkan kemauan tinggi untuk beradaptasi dengan teknologi baru sekaligus memiliki jiwa kepemimpinan kelompok untuk membantu akselerasi digital di lingkungan kerja."
    ),

    QuestionEntity(
        idSoal = "tkp_profesional_5",
        kategori = "TKP",
        subKategori = "Profesionalisme",
        pertanyaan = "Hari ini adalah batas akhir pengumpulan laporan realisasi anggaran divisi Anda. Pada jam 15.30, komputer tempat Anda menyimpan data tiba-tiba mengalami kerusakan total (*blue screen*), padahal kantor tutup jam 16.00. Sikap Anda...",
        pilihan = listOf(
          " Menangis karena panik dan memutuskan untuk mengerjakannya besok pagi saja",
             " Melaporkan kerusakan komputer kepada atasan dan meminta izin untuk memperpanjang tenggat waktu hingga minggu depan",
            " Menghubungi tim IT, lalu segera mencari komputer cadangan atau meminjam laptop rekan kerja untuk menyusun ulang data penting berdasarkan catatan sekunder agar laporan tetap selesai hari ini",
            " Menyalahkan tim IT kantor karena tidak merawat fasilitas komputer dengan baik",
            " Pulang ke rumah tepat waktu pada jam 16.00 karena kerusakan komputer di luar kendali Anda"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
          " Menangis karena panik dan memutuskan untuk mengerjakannya besok pagi saja" to 2,
             " Melaporkan kerusakan komputer kepada atasan dan meminta izin untuk memperpanjang tenggat waktu hingga minggu depan" to 3,
            " Menghubungi tim IT, lalu segera mencari komputer cadangan atau meminjam laptop rekan kerja untuk menyusun ulang data penting berdasarkan catatan sekunder agar laporan tetap selesai hari ini" to 5,
            " Menyalahkan tim IT kantor karena tidak merawat fasilitas komputer dengan baik" to 1,
            " Pulang ke rumah tepat waktu pada jam 16.00 karena kerusakan komputer di luar kendali Anda" to 4
        ),
        pembahasan = "Aspek Profesionalisme. Poin 5 mencerminkan tanggung jawab penuh terhadap tugas, daya tahan stres yang kuat, dan fokus pada solusi kreatif di bawah tekanan waktu."
    ),

    QuestionEntity(
        idSoal = "tkp_radikalisme_6",
        kategori = "TKP",
        subKategori = "Anti Radikalisme",
        pertanyaan = "Di grup WhatsApp internal kantor yang berisi rekan kerja sehobi, salah seorang rekan mengunggah sebuah video ceramah yang isinya secara terang-terangan mengajak masyarakat untuk tidak mematuhi hukum pemerintah yang sah karena dinilai tidak sesuai ideologi tertentu. Sikap Anda...",
        pilihan = listOf(
          " Langsung keluar dari grup WhatsApp tersebut tanpa memberikan penjelasan apa pun",
             " Menyukai (*like*) video tersebut karena merasa penyampai ceramah cukup berani",
            " Menegur rekan tersebut di dalam grup secara sopan namun tegas bahwa konten tersebut tidak pantas dibagikan, serta mengingatkan komitmen sebagai ASN pendukung NKRI",
            " Membiarkan saja video tersebut karena menganggap itu bagian dari kebebasan berpendapat",
            " Mengunduh video tersebut dan menyebarkannya kembali ke grup keluarga Anda"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Langsung keluar dari grup WhatsApp tersebut tanpa memberikan penjelasan apa pun" to 3,
             " Menyukai (*like*) video tersebut karena merasa penyampai ceramah cukup berani" to 1,
            " Menegur rekan tersebut di dalam grup secara sopan namun tegas bahwa konten tersebut tidak pantas dibagikan, serta mengingatkan komitmen sebagai ASN pendukung NKRI" to 5,
            " Membiarkan saja video tersebut karena menganggap itu bagian dari kebebasan berpendapat" to 4,
            " Mengunduh video tersebut dan menyebarkannya kembali ke grup keluarga Anda" to 2
        ),
        pembahasan = "Aspek Anti Radikalisme. ASN wajib setia pada ideologi negara. Poin 5 menuntut keberanian untuk meluruskan dan membentengi lingkungan sekitar dari pengaruh paham radikal destruktif secara persuasif."
    ),

    QuestionEntity(
        idSoal = "tkp_pelayanan_7",
        kategori = "TKP",
        subKategori = "Pelayanan Publik",
        pertanyaan = "Seorang warga datang ke loket Anda dengan marah-marah sambil menggebrak meja, karena dokumen perizinannya belum selesai diproses sejak seminggu yang lalu akibat adanya kendala sistem di pusat. Sikap Anda mendapati warga tersebut adalah...",
        pilihan = listOf(
           " Ikut menggebrak meja agar warga tersebut tahu bahwa Anda tidak takut gertakan",
             " Mendengarkan keluhannya dengan tenang, meminta maaf atas keterlambatan, menjelaskan kendala yang terjadi secara transparan, dan memberikan estimasi waktu penyelesaian yang jelas",
            " Memanggil pihak kepolisian untuk mengamankan warga tersebut atas tuduhan perbuatan tidak menyenangkan",
            " Meninggalkan loket begitu saja dan menyuruh rekan kerja lain untuk melayaninya",
            " Memberikan uang pribadi Anda kepada warga tersebut agar dia diam dan pulang"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Ikut menggebrak meja agar warga tersebut tahu bahwa Anda tidak takut gertakan" to 1,
             " Mendengarkan keluhannya dengan tenang, meminta maaf atas keterlambatan, menjelaskan kendala yang terjadi secara transparan, dan memberikan estimasi waktu penyelesaian yang jelas" to 5,
            " Memanggil pihak kepolisian untuk mengamankan warga tersebut atas tuduhan perbuatan tidak menyenangkan" to 2,
            " Meninggalkan loket begitu saja dan menyuruh rekan kerja lain untuk melayaninya" to 3,
            " Memberikan uang pribadi Anda kepada warga tersebut agar dia diam dan pulang" to 4
        ),
        pembahasan = "Aspek Pelayanan Publik. Menghadapi keluhan pelanggan yang emosional membutuhkan kontrol diri (*emotional control*), empati, serta penjelasan yang solutif-edukatif (Poin 5)."
    ),

    QuestionEntity(
        idSoal = "tkp_jejaring_8",
        kategori = "TKP",
        subKategori = "Jejaring Kerja",
        pertanyaan = "Rekan satu divisi Anda yang bertugas memegang data laporan bulanan mendadak harus cuti darurat selama 3 hari karena orang tuanya sakit keras. Padahal, esok hari ada evaluasi dari kementerian terkait data tersebut. Tindakan Anda...",
        pilihan = listOf(
           " Menghubungi rekan yang sedang cuti tersebut berkali-kali via telepon agar dia tetap mengirimkan datanya saat itu juga",
             " Meminta atasan untuk membatalkan agenda evaluasi dengan kementerian",
            " Berkoordinasi dengan anggota tim lain untuk berbagi tugas mencari berkas cadangan di folder bersama (*shared drive*) dan menyusun materi presentasi semaksimal mungkin guna menyelamatkan nama baik divisi",
            " Menunggu sampai rekan tersebut masuk kerja kembali dan pasrah menerima teguran dari kementerian",
            " Mengeluh kepada divisi lain mengenai ketidakprofesionalan rekan kerja Anda yang mengambil cuti mendadak"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Menghubungi rekan yang sedang cuti tersebut berkali-kali via telepon agar dia tetap mengirimkan datanya saat itu juga" to 2,
             " Meminta atasan untuk membatalkan agenda evaluasi dengan kementerian" to 3,
            " Berkoordinasi dengan anggota tim lain untuk berbagi tugas mencari berkas cadangan di folder bersama (*shared drive*) dan menyusun materi presentasi semaksimal mungkin guna menyelamatkan nama baik divisi" to 5,
            " Menunggu sampai rekan tersebut masuk kerja kembali dan pasrah menerima teguran dari kementerian" to 4,
            " Mengeluh kepada divisi lain mengenai ketidakprofesionalan rekan kerja Anda yang mengambil cuti mendadak" to 1
        ),
        pembahasan = "Aspek Jejaring Kerja. Kerja tim yang solid diuji saat salah satu pilar berhalangan. Opsi C (poin 5) menunjukkan kelenturan koordinasi internal tim untuk menyelesaikan hambatan operasional bersama."
    ),

    QuestionEntity(
        idSoal = "tkp_sosbud_9",
        kategori = "TKP",
        subKategori = "Sosbud",
        pertanyaan = "Di instansi tempat Anda bekerja, lingkungan kerja didominasi oleh rekan-rekan dari suku tertentu, sedangkan Anda berasal dari suku minoritas. Kadang kala saat jam istirahat, mereka berkomunikasi menggunakan bahasa daerah mereka yang tidak Anda pahami. Sikap Anda menghadapi ini adalah...",
        pilihan = listOf(
           " Tersinggung dan melaporkan mereka ke atasan dengan tuduhan diskriminasi kesukuan",
             " Mengisolasi diri dan mencari ruang istirahat lain yang sepi agar tidak mendengar percakapan mereka",
            " Menyikapi hal tersebut dengan santai, ikut bergabung dalam obrolan, serta dengan senang hati meminta mereka mengajarkan beberapa kosakata daerah tersebut agar komunikasi mencair",
            " Menuntut kantor mengeluarkan aturan keras larangan penggunaan bahasa daerah di area kerja",
            " Membalas dengan berbicara menggunakan bahasa daerah Anda sendiri dengan suara kencang"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Tersinggung dan melaporkan mereka ke atasan dengan tuduhan diskriminasi kesukuan" to 2,
             " Mengisolasi diri dan mencari ruang istirahat lain yang sepi agar tidak mendengar percakapan mereka" to 3,
            " Menyikapi hal tersebut dengan santai, ikut bergabung dalam obrolan, serta dengan senang hati meminta mereka mengajarkan beberapa kosakata daerah tersebut agar komunikasi mencair" to 5,
            " Menuntut kantor mengeluarkan aturan keras larangan penggunaan bahasa daerah di area kerja" to 1,
            " Membalas dengan berbicara menggunakan bahasa daerah Anda sendiri dengan suara kencang" to 4
        ),
        pembahasan = "Aspek Sosbud. Poin 5 memperlihatkan keterbukaan kultural (*cultural openness*). Alih-alih merasa terasing, Anda menjadikan perbedaan tersebut sebagai jembatan sosiologis untuk belajar hal baru."
    ),

    QuestionEntity(
        idSoal = "tkp_tik_10",
        kategori = "TKP",
        subKategori = "Teknologi Informasi dan Komunikasi",
        pertanyaan = "Sebagai seorang pegawai instansi pelayanan, Anda melihat ada celah (*bug*) keamanan pada web portal pendaftaran internal kantor yang bisa berpotensi membocorkan data pribadi pemohon. Tindakan pertama yang paling tepat adalah...",
        pilihan = listOf(
           " Menyebarkan informasi celah keamanan tersebut di akun media sosial pribadi agar sistem cepat diperbaiki",
             " Mengabaikan penemuan tersebut karena tugas utama Anda bukan di bagian IT",
            " Segera mendokumentasikan temuan celah tersebut secara detail lalu melaporkannya secara resmi kepada penanggung jawab IT kantor agar bisa langsung ditangani secara rahasia",
            " Memanfaatkan celah tersebut untuk mengubah data kerabat Anda agar cepat lolos verifikasi",
            " Mendiamkannya dan baru berbicara jika ada insiden kebocoran data yang terjadi di kemudian hari"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Menyebarkan informasi celah keamanan tersebut di akun media sosial pribadi agar sistem cepat diperbaiki" to 2,
             " Mengabaikan penemuan tersebut karena tugas utama Anda bukan di bagian IT" to 4,
            " Segera mendokumentasikan temuan celah tersebut secara detail lalu melaporkannya secara resmi kepada penanggung jawab IT kantor agar bisa langsung ditangani secara rahasia" to 5,
            " Memanfaatkan celah tersebut untuk mengubah data kerabat Anda agar cepat lolos verifikasi" to 1,
            " Mendiamkannya dan baru berbicara jika ada insiden kebocoran data yang terjadi di kemudian hari" to 3
        ),
        pembahasan = "Aspek TIK & Keamanan Data. Menemukan kerentanan sistem harus disikapi secara prosedural dan etis melalui jalur komunikasi internal guna mencegah risiko kebocoran meluas (Poin 5)."
    ),

    QuestionEntity(
        idSoal = "tkp_profesional_11",
        kategori = "TKP",
        subKategori = "Profesionalisme",
        pertanyaan = "Anda baru saja ditunjuk sebagai ketua panitia sebuah seminar nasional kantor. Dua hari menjelang acara, salah satu pembicara utama mengonfirmasi batal hadir secara mendadak karena alasan kesehatan. Respons tindakan Anda adalah...",
        pilihan = listOf(
           " Membatalkan acara seminar tersebut dan mengembalikan dana kontribusi peserta",
             " Memaksa pembicara yang sakit tersebut untuk tetap hadir secara daring meskipun kondisinya kritis",
            " Segera mengadakan rapat kilat dengan panitia untuk mencari pembicara pengganti yang berkompeten sebidang, atau menyiapkan opsi penyesuaian susunan acara alternatif agar seminar berjalan sukses",
            " Marah-marah kepada sekretaris panitia karena dinilai tidak becus menjaga komitmen pembicara",
            " Pasrah dan membiarkan panggung kosong saat sesi pembicara tersebut tiba"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Membatalkan acara seminar tersebut dan mengembalikan dana kontribusi peserta" to 4,
             " Memaksa pembicara yang sakit tersebut untuk tetap hadir secara daring meskipun kondisinya kritis" to 2,
            " Segera mengadakan rapat kilat dengan panitia untuk mencari pembicara pengganti yang berkompeten sebidang, atau menyiapkan opsi penyesuaian susunan acara alternatif agar seminar berjalan sukses" to 5,
            " Marah-marah kepada sekretaris panitia karena dinilai tidak becus menjaga komitmen pembicara" to 1,
            " Pasrah dan membiarkan panggung kosong saat sesi pembicara tersebut tiba" to 3
        ),
        pembahasan = "Aspek Profesionalisme. Poin tertinggi (5) mencerminkan ketangkasan manajemen krisis (*crisis management*) seorang profesional dalam menjaga keberlangsungan tujuan organisasi/acara."
    ),

    QuestionEntity(
        idSoal = "tkp_radikalisme_12",
        kategori = "TKP",
        subKategori = "Anti Radikalisme",
        pertanyaan = "Seorang sahabat karib Anda sejak masa sekolah sering membagikan opini di media sosial pribadi yang menjurus pada pembenaran aksi kekerasan demi membela kepentingan kelompok keagamaan tertentu. Sikap Anda sebagai ASN adalah...",
        pilihan = listOf(
           " Ikut menyebarkan opininya demi menjaga tali solidaritas pertemanan masa lalu",
             " Mengajaknya berdiskusi secara personal/empati, mengingatkan bahaya pemikiran radikal, serta mempertegas posisi Anda yang menolak segala bentuk ekstremisme kekerasan",
            " Memutus tali silaturahmi secara total dan memblokir kontaknya tanpa memberi tahu letak kesalahannya",
            " Melaporkan akun pribadinya secara anonim ke divisi kejahatan siber tanpa mencoba menegurnya terlebih dahulu",
            " Membela teman Anda tersebut mati-matian ketika netizen lain mulai merundungnya di kolom komentar"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Ikut menyebarkan opininya demi menjaga tali solidaritas pertemanan masa lalu" to 1,
             " Mengajaknya berdiskusi secara personal/empati, mengingatkan bahaya pemikiran radikal, serta mempertegas posisi Anda yang menolak segala bentuk ekstremisme kekerasan" to 5,
            " Memutus tali silaturahmi secara total dan memblokir kontaknya tanpa memberi tahu letak kesalahannya" to 3,
            " Melaporkan akun pribadinya secara anonim ke divisi kejahatan siber tanpa mencoba menegurnya terlebih dahulu" to 4,
            " Membela teman Anda tersebut mati-matian ketika netizen lain mulai merundungnya di kolom komentar" to 2
        ),
        pembahasan = "Aspek Anti Radikalisme. Pendekatan persuasif-edukatif secara personal kepada lingkaran terdekat (Poin 5) bernilai tinggi karena berpotensi meredam penyebaran sel radikalisme secara dini tanpa kehilangan objektivitas hukum."
    ),

    QuestionEntity(
        idSoal = "tkp_pelayanan_13",
        kategori = "TKP",
        subKategori = "Pelayanan Publik",
        pertanyaan = "Instansi tempat Anda bekerja menerapkan sistem survei kepuasan pelanggan digital melalui tablet. Di akhir bulan, indeks nilai kepuasan pelayanan pada loket Anda dinilai menurun karena keluhan waktu tunggu yang dinilai terlalu lama. Resonansi sikap Anda...",
        pilihan = listOf(
           " Menganggap hasil survei tersebut tidak akurat karena bisa saja diisi secara asal oleh warga",
             " Meminta bagian IT untuk menghapus data ulasan negatif khusus pada loket Anda",
            " Melakukan evaluasi mendalam terhadap manajemen kerja harian Anda, mencari letak ketidakefektifan proses verifikasi data, dan berdiskusi dengan atasan untuk perbaikan alur pelayanan",
            " Menyalahkan warga yang dinilai lambat saat menyiapkan berkas persyaratan pendaftaran",
            " Bekerja seperti biasa tanpa melakukan perubahan apa pun karena merasa sudah bekerja maksimal"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Menganggap hasil survei tersebut tidak akurat karena bisa saja diisi secara asal oleh warga" to 2,
             " Meminta bagian IT untuk menghapus data ulasan negatif khusus pada loket Anda" to 1,
            " Melakukan evaluasi mendalam terhadap manajemen kerja harian Anda, mencari letak ketidakefektifan proses verifikasi data, dan berdiskusi dengan atasan untuk perbaikan alur pelayanan" to 5,
            " Menyalahkan warga yang dinilai lambat saat menyiapkan berkas persyaratan pendaftaran" to 3,
            " Bekerja seperti biasa tanpa melakukan perubahan apa pun karena merasa sudah bekerja maksimal" to 4
        ),
        pembahasan = "Aspek Pelayanan Publik. Poin 5 memperlihatkan sikap berorientasi pada kepuasan pelanggan (*customer satisfaction oriented*) serta kemauan berbenah melalui umpan balik (*feedback*) publik."
    ),

    QuestionEntity(
        idSoal = "tkp_jejaring_14",
        kategori = "TKP",
        subKategori = "Jejaring Kerja",
        pertanyaan = "Divisi Anda sedang merancang SOP koordinasi pengawasan antar-lembaga. Rekan kerja Anda memberikan usulan alur birokrasi yang menurut Anda terlalu berbelit-belit dan tidak efektif. Cara Anda menyikapinya adalah...",
        pilihan = listOf(
           " Langsung memotong pembicaraannya dan menolak usulan tersebut di depan seluruh audiens rapat",
             " Menerima usulan tersebut mentah-mentah demi menghindari perdebatan internal divisi",
            " Mendengarkan seluruh gagasannya sampai selesai, lalu menyampaikan saran perbaikan secara logis dan menyodorkan opsi komparatif alur yang lebih efisien tanpa menjatuhkan argumennya",
            " Membicarakan kelemahan ide rekan tersebut di belakangnya bersama pegawai divisi lain",
            " Meminta atasan langsung mengambil keputusan sepihak tanpa perlu mendengar opini rekan Anda"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Langsung memotong pembicaraannya dan menolak usulan tersebut di depan seluruh audiens rapat" to 2,
             " Menerima usulan tersebut mentah-mentah demi menghindari perdebatan internal divisi" to 3,
            " Mendengarkan seluruh gagasannya sampai selesai, lalu menyampaikan saran perbaikan secara logis dan menyodorkan opsi komparatif alur yang lebih efisien tanpa menjatuhkan argumennya" to 5,
            " Membicarakan kelemahan ide rekan tersebut di belakangnya bersama pegawai divisi lain" to 1,
            " Meminta atasan langsung mengambil keputusan sepihak tanpa perlu mendengar opini rekan Anda" to 4
        ),
        pembahasan = "Aspek Jejaring Kerja. Menghargai perbedaan pendapat mitra kerja dan mampu mengomunikasikan gagasan alternatif secara asertif-konstruktif merupakan kunci kolaborasi (Poin 5)."
    ),

    QuestionEntity(
        idSoal = "tkp_sosbud_15",
        kategori = "TKP",
        subKategori = "Sosbud",
        pertanyaan = "Kantor Anda menerima program magang mahasiswa dari berbagai universitas luar daerah dengan latar belakang keyakinan yang heterogen. Kebetulan salah satu mahasiswa magang di ruangan Anda membutuhkan ruang kecil dan waktu luang ekstra untuk beribadah di sela jam kerja. Tindakan Anda adalah...",
        pilihan = listOf(
           " Melarang mahasiswa tersebut beribadah di jam kerja karena statusnya hanya anak magang",
             " Membantu mengarahkannya ke fasilitas ruang ibadah kantor terdekat yang tenang dan memastikan hak ibadahnya terpenuhi tanpa mengganggu target tugas magangnya",
            " Mengabaikan kebutuhannya dan tetap menumpuknya dengan tugas-tugas lapangan",
            " Meminta universitas penanggung jawab menarik mahasiswa tersebut karena dinilai merepotkan kantor",
            " Menyuruhnya beribadah di area parkir terbuka kantor karena mushala utama sedang direnovasi"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Melarang mahasiswa tersebut beribadah di jam kerja karena statusnya hanya anak magang" to 1,
             " Membantu mengarahkannya ke fasilitas ruang ibadah kantor terdekat yang tenang dan memastikan hak ibadahnya terpenuhi tanpa mengganggu target tugas magangnya" to 5,
            " Mengabaikan kebutuhannya dan tetap menumpuknya dengan tugas-tugas lapangan" to 3,
            " Meminta universitas penanggung jawab menarik mahasiswa tersebut karena dinilai merepotkan kantor" to 2,
            " Menyuruhnya beribadah di area parkir terbuka kantor karena mushala utama sedang direnovasi" to 4
        ),
        pembahasan = "Aspek Sosbud. Poin tertinggi (5) mencerminkan implementasi nilai toleransi beragama dan penciptaan inklusivitas sosial yang harmonis di area kerja birokrasi."
    ),

    QuestionEntity(
        idSoal = "tkp_tik_16",
        kategori = "TKP",
        subKategori = "Teknologi Informasi dan Komunikasi",
        pertanyaan = "Anda mendapati bahwa sistem komputasi data internal kementerian sering mengalami perlambatan (*lag*) hebat pada jam-jam sibuk akibat penumpukan fail laporan lama. Anda memiliki ide skema restrukturisasi basis data berbasis awan (*cloud*). Cara Anda mengeksekusi ide ini...",
        pilihan = listOf(
           " Memendam ide tersebut karena khawatir akan menambah beban kerja harian Anda pribadi",
             " Langsung mencoba mengubah konfigurasi server kantor secara diam-diam di malam hari",
            " Menyusun draf rancangan inovasi arsitektur cloud tersebut secara matang, lalu mempresentasikannya kepada kepala divisi IT kantor agar dapat dikaji kelayakannya secara resmi",
            " Mengkritik kinerja tim IT di grup koordinasi besar tanpa memberikan draf solusi operasional",
            " Menyarankan kantor membeli komputer server baru berspesifikasi mahal sebagai satu-satunya jalan"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Memendam ide tersebut karena khawatir akan menambah beban kerja harian Anda pribadi" to 3,
             " Langsung mencoba mengubah konfigurasi server kantor secara diam-diam di malam hari" to 1,
            " Menyusun draf rancangan inovasi arsitektur cloud tersebut secara matang, lalu mempresentasikannya kepada kepala divisi IT kantor agar dapat dikaji kelayakannya secara resmi" to 5,
            " Mengkritik kinerja tim IT di grup koordinasi besar tanpa memberikan draf solusi operasional" to 2,
            " Menyarankan kantor membeli komputer server baru berspesifikasi mahal sebagai satu-satunya jalan" to 4
        ),
        pembahasan = "Aspek TIK & Inovasi. Mengajukan ide pemanfaatan teknologi modern harus dilakukan secara struktural, ilmiah, and bertanggung jawab demi efisiensi jangka panjang lembaga (Poin 5)."
    ),

    QuestionEntity(
        idSoal = "tkp_profesional_17",
        kategori = "TKP",
        subKategori = "Profesionalisme",
        pertanyaan = "Anda ditugaskan mengikuti diklat teknis kedinasan di luar kota selama seminggu. Namun, di waktu yang bersamaan, anak Anda sedang mengalami demam ringan di rumah di bawah pengawasan pasangan Anda. Sikap Anda adalah...",
        pilihan = listOf(
           " Mengajukan pembatalan tugas diklat secara mendadak agar bisa menemani anak di rumah",
             " Tetap berangkat mengikuti diklat dengan komitmen penuh, sembari memantau kondisi perkembangan kesehatan anak secara berkala via panggilan video di luar jam sesi pelatihan",
            " Membawa serta anak dan pasangan ikut masuk ke dalam ruang kelas diklat agar bisa Anda awasi langsung",
            " Berangkat diklat tetapi tidak fokus mengikuti materi karena pikiran terus melayang ke rumah",
            " Menolak mengerjakan tugas diklat yang diberikan oleh instruktur sebagai bentuk protes batin"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Mengajukan pembatalan tugas diklat secara mendadak agar bisa menemani anak di rumah" to 3,
             " Tetap berangkat mengikuti diklat dengan komitmen penuh, sembari memantau kondisi perkembangan kesehatan anak secara berkala via panggilan video di luar jam sesi pelatihan" to 5,
            " Membawa serta anak dan pasangan ikut masuk ke dalam ruang kelas diklat agar bisa Anda awasi langsung" to 1,
            " Berangkat diklat tetapi tidak fokus mengikuti materi karena pikiran terus melayang ke rumah" to 4,
            " Menolak mengerjakan tugas diklat yang diberikan oleh instruktur sebagai bentuk protes batin" to 2
        ),
        pembahasan = "Aspek Profesionalisme. Poin 5 memperlihatkan kemampuan manajemen peran (*role management*) yang seimbang. Tugas kedinasan dipenuhi dengan tanggung jawab penuh, sementara urusan domestik dikelola dengan memanfaatkan teknologi komunikasi."
    ),

    QuestionEntity(
        idSoal = "tkp_radikalisme_18",
        kategori = "TKP",
        subKategori = "Anti Radikalisme",
        pertanyaan = "Sebuah organisasi kemasyarakatan lokal yang baru berdiri di sekitar lingkungan tempat tinggal Anda terindikasi mulai menyebarkan ajaran eksklusivisme, dengan melarang anggotanya berinteraksi sosial dengan tetangga yang berbeda keyakinan. Langkah Anda sebagai bagian dari masyarakat...",
        pilihan = listOf(
           " Segera bergabung dengan organisasi tersebut agar tidak dicap tidak agamis oleh pengurusnya",
             " Mengajak pengurus RT dan tokoh masyarakat setempat untuk menggalakkan kembali kegiatan kerja bakti dan ronda malam inklusif, guna menjaga kerukunan warga serta melaporkan potensi intoleransi ke pihak berwenang",
            " Melakukan aksi demonstrasi sepihak di depan sekretariat organisasi tersebut bersama keluarga Anda",
            " Membiarkan saja aktivitas mereka selama keluarga inti Anda tidak diganggu",
            " Pindah rumah ke kompleks lain yang lebih homogen untuk menghindari gesekan sosial"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Segera bergabung dengan organisasi tersebut agar tidak dicap tidak agamis oleh pengurusnya" to 1,
             " Mengajak pengurus RT dan tokoh masyarakat setempat untuk menggalakkan kembali kegiatan kerja bakti dan ronda malam inklusif, guna menjaga kerukunan warga serta melaporkan potensi intoleransi ke pihak berwenang" to 5,
            " Melakukan aksi demonstrasi sepihak di depan sekretariat organisasi tersebut bersama keluarga Anda" to 2,
            " Membiarkan saja aktivitas mereka selama keluarga inti Anda tidak diganggu" to 4,
            " Pindah rumah ke kompleks lain yang lebih homogen untuk menghindari gesekan sosial" to 3
        ),
        pembahasan = "Aspek Anti Radikalisme. Menjaga ketahanan sosial dari infiltrasi intoleransi/radikalisme dilakukan secara kolektif-struktural lewat penguatan simpul komunitas lokal (Poin 5)."
    ),

    QuestionEntity(
        idSoal = "tkp_pelayanan_19",
        kategori = "TKP",
        subKategori = "Pelayanan Publik",
        pertanyaan = "Saat jam pelayanan hampir selesai pada jam 15.55 (kantor tutup jam 16.00), datang seorang penyandang disabilitas (tunanetra) yang membutuhkan bantuan darurat untuk mengurus surat keterangan administrasi penting yang harus diserahkan besok pagi. Sikap Anda...",
        pilihan = listOf(
           " Memintanya pulang dan datang lagi besok pagi karena jam operasional komputer pelayanan akan otomatis terkunci 5 menit lagi",
             " Menyambutnya dengan ramah, mendampingi proses pengisian formulirnya secara langsung, dan menyelesaikan pengurusan dokumen tersebut hingga tuntas meskipun harus melewati jam pulang kantor beberapa menit",
            " Menyuruh satpam kantor untuk melayani proses pengisian dokumen bapak tersebut",
            " Menggerutu sepanjang proses pelayanan agar bapak tersebut merasa tidak enak hati",
            " Menerima berkasnya lalu meletakkannya di tumpukan paling bawah untuk dikerjakan lusa"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
           " Memintanya pulang dan datang lagi besok pagi karena jam operasional komputer pelayanan akan otomatis terkunci 5 menit lagi" to 3,
             " Menyambutnya dengan ramah, mendampingi proses pengisian formulirnya secara langsung, dan menyelesaikan pengurusan dokumen tersebut hingga tuntas meskipun harus melewati jam pulang kantor beberapa menit" to 5,
            " Menyuruh satpam kantor untuk melayani proses pengisian dokumen bapak tersebut" to 2,
            " Menggerutu sepanjang proses pelayanan agar bapak tersebut merasa tidak enak hati" to 1,
            " Menerima berkasnya lalu meletakkannya di tumpukan paling bawah untuk dikerjakan lusa" to 4
        ),
        pembahasan = "Aspek Pelayanan Publik. Pelayanan prima prima prioritas tinggi (*extra-mile service*) bagi kelompok rentan/disabilitas bernilai poin tertinggi (5), sekalipun menuntut sedikit pengorbanan waktu pribadi."
    ),

    QuestionEntity(
        idSoal = "tkp_jejaring_20",
        kategori = "TKP",
        subKategori = "Jejaring Kerja",
        pertanyaan = "Instansi Anda sedang mengadakan evaluasi tahunan kementerian. Divisi Anda dikritik tajam oleh divisi audit internal karena keterlambatan penyerahan berkas fisik. Kepala divisi Anda tampak emosional menanggapi hal tersebut. Tindakan Anda sebagai staf di divisi tersebut adalah...",
        pilihan = listOf(
            " Kompori kepala divisi Anda untuk balik menyerang kesalahan divisi audit",
             " Mengamankan seluruh dokumen pendukung, menganalisis titik sumbatan birokrasi internal divisi secara objektif, lalu menyodorkan matriks perbaikan kepada kepala divisi Anda sebagai bahan tanggapan resmi yang elegan",
            " Diam saja dan berpura-pura sibuk merapikan meja kerja agar tidak dilibatkan dalam konflik",
            " Membocorkan perselisihan rapat tersebut ke akun gosip media sosial luar",
            " Menyalahkan staf magang di divisi Anda sebagai kambing hitam keterlambatan berkas"
        ),
        tipeScoring = "SKALA",
        jawabanBenar = "",
        skalaPoin = mapOf(
            " Kompori kepala divisi Anda untuk balik menyerang kesalahan divisi audit" to 2,
            " Mengamankan seluruh dokumen pendukung, menganalisis titik sumbatan birokrasi internal divisi secara objektif, lalu menyodorkan matriks perbaikan kepada kepala divisi Anda sebagai bahan tanggapan resmi yang elegan" to 5,
            " Diam saja dan berpura-pura sibuk merapikan meja kerja agar tidak dilibatkan dalam konflik" to 4,
            " Membocorkan perselisihan rapat tersebut ke akun gosip media sosial luar" to 1,
            " Menyalahkan staf magang di divisi Anda sebagai kambing hitam keterlambatan berkas" to 3
        ),
        pembahasan = "Aspek Jejaring Kerja & Kontrol Emosi. Menjadi penengah yang konstruktif melalui penyajian data analitis substantif (Poin 5) membantu meredakan ketegangan antar-unit kerja demi kemajuan kelembagaan."
    )

)
}