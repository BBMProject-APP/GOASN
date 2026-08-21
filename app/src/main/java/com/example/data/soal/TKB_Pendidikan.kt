package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalPendidikan {
    val daftarSoal = listOf(
        QuestionEntity(
            idSoal = "EDU_01",
            kategori = "TKB",
            subKategori = "Pendidikan-Filosofi Pendidikan",
            pertanyaan = "Menurut Ki Hadjar Dewantara, pendidikan adalah 'tuntunan'. Apa maksud dari pernyataan tersebut?",
            pilihan = listOf(  " Menuntut siswa untuk mengikuti kehendak guru", " Memberikan tuntunan terhadap segala kekuatan kodrat yang dimiliki anak agar mencapai keselamatan dan kebahagiaan", " Memaksa anak untuk mencapai standar nilai tertentu", " Mengarahkan anak menjadi tenaga kerja profesional", " Memberikan materi pelajaran sebanyak-banyaknya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan tuntunan terhadap segala kekuatan kodrat yang dimiliki anak agar mencapai keselamatan dan kebahagiaan",
            pembahasan = "Pendidikan menurut KHD adalah menuntun, bukan menuntut."
        ),
        QuestionEntity(
            idSoal = "EDU_02",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Dalam Kurikulum Merdeka, apa yang dimaksud dengan 'Pembelajaran Berdiferensiasi'?",
            pilihan = listOf(  " Pembelajaran dengan nilai yang sama untuk semua siswa", " Pembelajaran yang disesuaikan dengan kebutuhan, minat, dan profil belajar siswa", " Pembelajaran yang hanya fokus pada siswa berprestasi", " Pembelajaran yang dilakukan secara klasikal tanpa perbedaan", " Pembelajaran yang hanya menggunakan satu metode"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pembelajaran yang disesuaikan dengan kebutuhan, minat, dan profil belajar siswa",
            pembahasan = "Diferensiasi mengakui bahwa setiap anak unik dalam cara belajarnya."
        ),
        QuestionEntity(
            idSoal = "EDU_03",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Model pembelajaran yang memberikan masalah nyata untuk dipecahkan siswa disebut...",
            pilihan = listOf(  " Discovery Learning", " Problem Based Learning (PBL)", " Direct Instruction", " Lecture method", " Drill method"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Problem Based Learning (PBL)",
            pembahasan = "PBL menggunakan masalah autentik sebagai konteks bagi siswa untuk belajar."
        ),
        QuestionEntity(
            idSoal = "EDU_04",
            kategori = "TKB",
            subKategori = "Pendidikan-Asesmen",
            pertanyaan = "Asesmen yang dilakukan di tengah proses pembelajaran untuk memperbaiki kualitas pembelajaran disebut...",
            pilihan = listOf(  " Asesmen Sumatif", " Asesmen Formatif", " Asesmen Diagnostik", " Asesmen Nasional", " Ujian Akhir"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Asesmen Formatif",
            pembahasan = "Formatif berfungsi sebagai umpan balik untuk perbaikan berkelanjutan."
        ),
        QuestionEntity(
            idSoal = "EDU_05",
            kategori = "TKB",
            subKategori = "Pendidikan-Teknologi Pendidikan",
            pertanyaan = "Pemanfaatan 'Blended Learning' dalam kelas bertujuan untuk...",
            pilihan = listOf(  " Menggantikan peran guru sepenuhnya", " Menggabungkan pembelajaran tatap muka dengan daring", " Menambah beban kerja siswa", " Menghilangkan kebutuhan buku teks", " Membuat pembelajaran lebih lama"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menggabungkan pembelajaran tatap muka dengan daring",
            pembahasan = "Blended learning mengoptimalkan kelebihan tatap muka dan fleksibilitas daring."
        ),
        QuestionEntity(
            idSoal = "EDU_06",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Teori 'Zona Perkembangan Proksimal' (ZPD) dikemukakan oleh...",
            pilihan = listOf(  " Jean Piaget", " Lev Vygotsky", " B.F. Skinner", " Howard Gardner", " Albert Bandura"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Lev Vygotsky",
            pembahasan = "ZPD adalah jarak antara kemampuan anak sendiri dan potensi yang bisa dicapai dengan bantuan (scaffolding)."
        ),
        QuestionEntity(
            idSoal = "EDU_07",
            kategori = "TKB",
            subKategori = "Pendidikan-Profil Pelajar Pancasila",
            pertanyaan = "Salah satu dimensi Profil Pelajar Pancasila adalah 'Bernalar Kritis'. Apa indikatornya?",
            pilihan = listOf(  " Menghafal materi dengan cepat", " Memperoleh dan memproses informasi serta menganalisisnya secara objektif", " Mampu berbicara dengan bahasa asing", " Selalu mengikuti perintah guru", " Memiliki nilai ujian yang tinggi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memperoleh dan memproses informasi serta menganalisisnya secara objektif",
            pembahasan = "Bernalar kritis melibatkan proses evaluasi informasi yang masuk."
        ),
        QuestionEntity(
            idSoal = "EDU_08",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Tindakan guru yang paling efektif saat menghadapi siswa yang mengganggu di kelas adalah...",
            pilihan = listOf(  " Mengeluarkan siswa dari kelas", " Memberikan hukuman fisik", " Mencari akar masalah dan melakukan pendekatan persuasif", " Mengabaikan perilaku tersebut", " Memarahi siswa di depan teman-temannya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Mencari akar masalah dan melakukan pendekatan persuasif",
            pembahasan = "Pendekatan positif dan solutif lebih efektif dalam manajemen kelas modern."
        ),
        QuestionEntity(
            idSoal = "EDU_09",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Apa yang dimaksud dengan 'Capaian Pembelajaran' (CP) dalam Kurikulum Merdeka?",
            pilihan = listOf(  " Rencana kegiatan harian guru", " Kompetensi pembelajaran yang harus dicapai siswa pada setiap fase perkembangan"," Daftar nilai yang harus dicapai", " Kumpulan soal ujian", " Buku pegangan siswa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kompetensi pembelajaran yang harus dicapai siswa pada setiap fase perkembangan",
            pembahasan = "CP menjadi acuan utama dalam merancang alur tujuan pembelajaran."
        ),
        QuestionEntity(
            idSoal = "EDU_10",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Metode pembelajaran di mana siswa belajar dalam kelompok kecil dengan tugas yang saling bergantung disebut...",
            pilihan = listOf(  " Cooperative Learning", " Individu Learning"," Lecture", " Drill", " Demonstrasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Cooperative Learning",
            pembahasan = "Kerja sama antar siswa adalah kunci dari pembelajaran kooperatif."
        ),
        QuestionEntity(
            idSoal = "EDU_11",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoran",
            pertanyaan = "Seorang guru yang profesional harus memiliki kompetensi...",
            pilihan = listOf(  " Pedagogik, Kepribadian, Sosial, Profesional", " Akademik, Teknis, Seni, Politik"," Mengajar, Menghukum, Menilai, Mengatur", " Cerdas, Pintar, Kaya, Kuat", " Disiplin, Cepat, Tepat, Akurat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Pedagogik, Kepribadian, Sosial, Profesional",
            pembahasan = "Ini adalah 4 kompetensi utama guru sesuai UU Guru dan Dosen."
        ),
        QuestionEntity(
            idSoal = "EDU_12",
            kategori = "TKB",
            subKategori = "Pendidikan-Asesmen",
            pertanyaan = "Apa fungsi dari 'Asesmen Diagnostik Non-Kognitif' di awal pembelajaran?",
            pilihan = listOf(  " Mengukur nilai matematika siswa", " Mengetahui kesejahteraan psikososial dan gaya belajar siswa"," Menyeleksi siswa pintar", " Memberikan nilai rapor", " Menentukan kelulusan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengetahui kesejahteraan psikososial dan gaya belajar siswa",
            pembahasan = "Kesejahteraan psikologis siswa sangat menentukan kesiapan mereka belajar."
        ),
        QuestionEntity(
            idSoal = "EDU_13",
            kategori = "TKB",
            subKategori = "Pendidikan-Filosofi Pendidikan",
            pertanyaan = "Semboyan pendidikan Ki Hadjar Dewantara 'Ing Ngarso Sung Tulodo' berarti...",
            pilihan = listOf(" Di depan memberi teladan", " Di tengah membangun semangat"," Di belakang memberi dorongan", " Di depan memimpin rapat", " Di belakang mengikuti perintah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Di depan memberi teladan",
            pembahasan = "Guru adalah contoh nyata bagi peserta didiknya."
        ),
        QuestionEntity(
            idSoal = "EDU_14",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Dalam 'Flipped Classroom', apa yang dilakukan siswa di rumah?",
            pilihan = listOf(" Mengerjakan ujian berat", " Mempelajari materi (teori) secara mandiri"," Tidak melakukan apa-apa", " Belajar bersama guru melalui telepon", " Mengulang materi yang sudah lupa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mempelajari materi (teori) secara mandiri",
            pembahasan = "Kelas digunakan untuk diskusi dan aplikasi, bukan sekadar ceramah."
        ),
        QuestionEntity(
            idSoal = "EDU_15",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Proyek Penguatan Profil Pelajar Pancasila (P5) lebih menekankan pada...",
            pilihan = listOf(" Hafalan materi ujian", " Pengembangan karakter dan kompetensi melalui pembelajaran berbasis proyek"," Penyelesaian soal-soal matematika", " Latihan upacara bendera", " Belajar di dalam kelas saja"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pengembangan karakter dan kompetensi melalui pembelajaran berbasis proyek",
            pembahasan = "P5 memberikan ruang bagi siswa bereksplorasi di luar kelas."
        ),
        QuestionEntity(
            idSoal = "EDU_16",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Apa yang dimaksud dengan motivasi intrinsik dalam belajar?",
            pilihan = listOf(" Belajar karena takut dimarahi orang tua", " Belajar karena ingin mendapat hadiah"," Belajar karena keinginan dari dalam diri sendiri untuk tahu/berkembang", " Belajar karena perintah guru", " Belajar karena ingin pamer nilai"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Belajar karena keinginan dari dalam diri sendiri untuk tahu/berkembang",
            pembahasan = "Motivasi intrinsik adalah bahan bakar utama pembelajaran sepanjang hayat."
        ),
        QuestionEntity(
            idSoal = "EDU_17",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Apa yang dimaksud dengan 'Scaffolding' dalam proses belajar?",
            pilihan = listOf(" Hukuman bagi siswa yang lambat", " Memberikan bantuan bertahap hingga siswa bisa mandiri"," Menambah beban tugas", " Mempercepat waktu belajar", " Mengurangi materi pelajaran"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan bantuan bertahap hingga siswa bisa mandiri",
            pembahasan = "Bantuan diberikan saat siswa kesulitan dan ditarik perlahan saat siswa sudah menguasai."
        ),
        QuestionEntity(
            idSoal = "EDU_18",
            kategori = "TKB",
            subKategori = "Pendidikan-Asesmen",
            pertanyaan = "Apa keunggulan dari asesmen berbasis portofolio?",
            pilihan = listOf(" Menilai hasil karya siswa secara autentik dan berkelanjutan", " Penilaian sangat cepat dan mudah"," Tidak memerlukan ketelitian guru", " Hanya menilai satu aspek nilai", " Sangat murah biaya cetaknya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Menilai hasil karya siswa secara autentik dan berkelanjutan",
            pembahasan = "Portofolio menunjukkan perkembangan siswa dari waktu ke waktu."
        ),
        QuestionEntity(
            idSoal = "EDU_19",
            kategori = "TKB",
            subKategori = "Pendidikan-Filosofi Pendidikan",
            pertanyaan = "Apa yang dimaksud dengan 'Kodrat Zaman' dalam pemikiran Ki Hadjar Dewantara?",
            pilihan = listOf(" Mengikuti perkembangan zaman yang terus berubah", " Harus kembali ke zaman kuno"," Menolak teknologi modern", " Fokus hanya pada budaya tradisional", " Tidak perlu memperhatikan dunia luar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Mengikuti perkembangan zaman yang terus berubah",
            pembahasan = "Pendidikan harus dinamis menyesuaikan tuntutan zaman."
        ),
        QuestionEntity(
            idSoal = "EDU_20",
            kategori = "TKB",
            subKategori = "Pendidikan-Teknologi Pendidikan",
            pertanyaan = "Apa manfaat utama penggunaan platform digital (seperti PMM) bagi guru?",
            pilihan = listOf(" Menambah beban pekerjaan", " Sebagai sarana berbagi praktik baik dan pengembangan diri"," Hanya untuk mencari data", " Sebagai syarat kenaikan kelas siswa", " Hanya untuk bermain game"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sebagai sarana berbagi praktik baik dan pengembangan diri",
            pembahasan = "Platform Merdeka Mengajar (PMM) mendukung kolaborasi antar guru."
        ),
        QuestionEntity(
            idSoal = "EDU_21",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Apa tujuan dari metode 'Brainstorming' di kelas?",
            pilihan = listOf(" Menguji hafalan", " Mengumpulkan sebanyak mungkin ide kreatif dari siswa"," Menilai kedisiplinan", " Mengatur tata letak kelas", " Memberikan perintah tegas"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengumpulkan sebanyak mungkin ide kreatif dari siswa",
            pembahasan = "Brainstorming merangsang kemampuan berpikir divergen."
        ),
        QuestionEntity(
            idSoal = "EDU_22",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoran",
            pertanyaan = "Bagaimana sikap guru saat mendapati ada perbedaan pendapat di antara siswa?",
            pilihan = listOf(" Memihak salah satu", " Menganggapnya gangguan"," Menghargai perbedaan dan mengarahkannya menjadi bahan diskusi konstruktif", " Melarang siswa berpendapat", " Menghukum siswa yang tidak setuju"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Menghargai perbedaan dan mengarahkannya menjadi bahan diskusi konstruktif",
            pembahasan = "Perbedaan adalah ruang belajar untuk demokrasi."
        ),
        QuestionEntity(
            idSoal = "EDU_23",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Apa perbedaan utama Modul Ajar dengan RPP?",
            pilihan = listOf(" Modul ajar lebih lengkap dengan materi, media, dan asesmen", " RPP hanya untuk kepala sekolah", " Modul ajar tidak perlu ditulis", " RPP lebih sulit dibuat", " Sama saja"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Modul ajar lebih lengkap dengan materi, media, dan asesmen",
            pembahasan = "Modul ajar adalah RPP plus yang sangat komprehensif."
        ),
        QuestionEntity(
            idSoal = "EDU_24",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Siswa yang memiliki kecerdasan kinestetik cenderung belajar dengan...",
            pilihan = listOf(" Membaca buku", " Mendengar lagu", " Melakukan gerakan atau aktivitas fisik", " Melihat gambar", " Berdiskusi tenang"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Melakukan gerakan atau aktivitas fisik",
            pembahasan = "Pembelajaran berbasis pengalaman fisik sangat efektif bagi mereka."
        ),
        QuestionEntity(
            idSoal = "EDU_25",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Apa yang dimaksud dengan 'Iklim Kelas yang Positif'?",
            pilihan = listOf(" Kelas yang tenang dan sunyi tanpa suara", " Lingkungan kelas yang aman, nyaman, dan mendukung siswa untuk belajar", " Kelas yang penuh dengan hiasan mahal", " Kelas dengan guru yang galak", " Kelas yang tidak pernah belajar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Lingkungan kelas yang aman, nyaman, dan mendukung siswa untuk belajar",
            pembahasan = "Keamanan psikologis siswa adalah prasyarat belajar yang efektif."
        ),
        QuestionEntity(
            idSoal = "EDU_26",
            kategori = "TKB",
            subKategori = "Pendidikan-Evaluasi Pembelajaran",
            pertanyaan = "Apa perbedaan mendasar antara Asesmen of Learning dan Asesmen for Learning?",
            pilihan = listOf(" Of Learning untuk perbaikan, For Learning untuk pelaporan", " Of Learning untuk pelaporan (sumatif), For Learning untuk perbaikan (formatif)", " Tidak ada perbedaan", " For Learning hanya untuk guru, Of Learning untuk siswa", " Of Learning dilakukan tiap hari"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Of Learning untuk pelaporan (sumatif), For Learning untuk perbaikan (formatif)",
            pembahasan = "Asesmen for learning berfokus pada perkembangan saat proses, sedangkan of learning pada hasil akhir."
        ),
        QuestionEntity(
            idSoal = "EDU_27",
            kategori = "TKB",
            subKategori = "Pendidikan-Pendidikan Karakter",
            pertanyaan = "Apa strategi terbaik untuk menanamkan nilai kejujuran di sekolah?",
            pilihan = listOf(" Memberi sanksi berat bagi yang tidak jujur", " Keteladanan guru dan menciptakan budaya sekolah yang transparan", " Memasang poster tentang kejujuran", " Meminta siswa menghafal definisi jujur", " Mengawasi siswa dengan CCTV 24 jam"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Keteladanan guru dan menciptakan budaya sekolah yang transparan",
            pembahasan = "Karakter tidak bisa diajarkan melalui teks saja, melainkan melalui habituasi dan keteladanan."
        ),
        QuestionEntity(
            idSoal = "EDU_28",
            kategori = "TKB",
            subKategori = "Pendidikan-Literasi-Numerasi",
            pertanyaan = "Apa fokus utama dari literasi dalam pendidikan modern?",
            pilihan = listOf(" Kemampuan mengeja kata dengan benar", " Kemampuan memahami, menggunakan, dan merefleksikan berbagai jenis teks", " Kemampuan menulis kaligrafi", " Kemampuan membaca cepat saja", " Kemampuan menghafal isi buku"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kemampuan memahami, menggunakan, dan merefleksikan berbagai jenis teks",
            pembahasan = "Literasi adalah kemampuan bernalar kritis menggunakan teks."
        ),
        QuestionEntity(
            idSoal = "EDU_29",
            kategori = "TKB",
            subKategori = "Pendidikan-Evaluasi Pembelajaran",
            pertanyaan = "Apa yang dimaksud dengan validitas dalam sebuah tes?",
            pilihan = listOf(" Tes dapat menghasilkan skor yang konsisten", " Tes mengukur apa yang seharusnya diukur", " Tes mudah dikerjakan siswa", " Tes mengandung banyak gambar", " Tes dibuat oleh guru senior"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Tes mengukur apa yang seharusnya diukur",
            pembahasan = "Validitas memastikan instrumen penilaian tepat sasaran pada kompetensi yang diuji."
        ),
        QuestionEntity(
            idSoal = "EDU_30",
            kategori = "TKB",
            subKategori = "Pendidikan-Pendidikan Karakter",
            pertanyaan = "Apa itu Profil Pelajar Pancasila dimensi 'Gotong Royong'?",
            pilihan = listOf(" Kemampuan bekerja sendiri", " Kemampuan melakukan kegiatan secara bersama-sama dengan sukarela", " Membagi tugas agar cepat selesai", " Mengandalkan ketua kelompok", " Menghindari konflik"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kemampuan melakukan kegiatan secara bersama-sama dengan sukarela",
            pembahasan = "Kolaborasi, kepedulian, dan berbagi adalah elemen kunci gotong royong."
        ),
        QuestionEntity(
            idSoal = "EDU_31",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Pendekatan *Student-Centered Learning* (SCL) artinya...",
            pilihan = listOf(" Guru adalah pusat sumber ilmu", " Siswa sebagai subjek aktif yang terlibat dalam proses belajar", " Siswa hanya mendengarkan ceramah", " Belajar dilakukan di luar sekolah saja", " Guru menentukan semua topik"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Siswa sebagai subjek aktif yang terlibat dalam proses belajar",
            pembahasan = "SCL menempatkan siswa sebagai pusat eksplorasi dan konstruksi pengetahuan."
        ),
        QuestionEntity(
            idSoal = "EDU_32",
            kategori = "TKB",
            subKategori = "Pendidikan-Literasi-Numerasi",
            pertanyaan = "Apa yang dimaksud dengan numerasi?",
            pilihan = listOf(" Kemampuan menghitung dengan kalkulator", " Kemampuan mengaplikasikan konsep bilangan dan simbol dalam kehidupan sehari-hari", " Menghafal rumus matematika", " Mahir dalam pelajaran matematika", " Kemampuan memenangkan lomba matematika"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kemampuan mengaplikasikan konsep bilangan dan simbol dalam kehidupan sehari-hari",
            pembahasan = "Numerasi bukan tentang rumus rumit, tapi bagaimana logika matematika dipakai memecahkan masalah nyata."
        ),
        QuestionEntity(
            idSoal = "EDU_33",
            kategori = "TKB",
            subKategori = "Pendidikan-Evaluasi Pembelajaran",
            pertanyaan = "Apa itu reliabilitas tes?",
            pilihan = listOf(" Keakuratan hasil tes", " Konsistensi hasil tes dari waktu ke waktu", " Tingkat kesulitan tes", " Jumlah soal dalam tes", " Keindahan tampilan tes"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Konsistensi hasil tes dari waktu ke waktu",
            pembahasan = "Tes yang reliabel memberikan hasil yang serupa jika dilakukan dalam kondisi yang sama."
        ),
        QuestionEntity(
            idSoal = "EDU_34",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Apa dampak dari pemberian umpan balik (feedback) yang konstruktif bagi siswa?",
            pilihan = listOf(" Siswa merasa minder", " Siswa memahami kelebihan dan area yang perlu ditingkatkan", " Siswa menjadi malas belajar", " Siswa takut bertanya", " Tidak ada dampak berarti"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Siswa memahami kelebihan dan area yang perlu ditingkatkan",
            pembahasan = "Umpan balik yang efektif harus spesifik, tepat waktu, dan berorientasi pada pengembangan."
        ),
        QuestionEntity(
            idSoal = "EDU_35",
            kategori = "TKB",
            subKategori = "Pendidikan-Filosofi Pendidikan",
            pertanyaan = "Pendidikan yang memerdekakan menurut Ki Hadjar Dewantara adalah pendidikan yang...",
            pilihan = listOf(" Membebaskan siswa dari aturan", " Membangun kemampuan siswa secara lahir dan batin agar tidak bergantung pada orang lain", " Membiarkan siswa belajar sesuka hati", " Menghapus kurikulum sekolah", " Tidak memerlukan guru"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Membangun kemampuan siswa secara lahir dan batin agar tidak bergantung pada orang lain",
            pembahasan = "Kemerdekaan belajar berarti kemandirian dalam berpikir dan bertindak."
        ),
        QuestionEntity(
            idSoal = "EDU_36",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Apa itu teori *Growth Mindset* (Pola Pikir Berkembang) dari Carol Dweck?",
            pilihan = listOf(" Keyakinan bahwa bakat adalah bawaan lahir dan tidak bisa berubah", " Keyakinan bahwa kemampuan dapat ditingkatkan melalui usaha dan latihan", " Keyakinan bahwa orang pintar tidak perlu belajar", " Keyakinan bahwa kegagalan adalah akhir segalanya", " Keyakinan bahwa usia membatasi belajar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Keyakinan bahwa kemampuan dapat ditingkatkan melalui usaha dan latihan",
            pembahasan = "Growth mindset sangat krusial dalam menghadapi tantangan belajar."
        ),
        QuestionEntity(
            idSoal = "EDU_37",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Apa fungsi utama dari Kurikulum Operasional Satuan Pendidikan (KOSP)?",
            pilihan = listOf(" Menggantikan peran pemerintah pusat", " Menyesuaikan kurikulum dengan kebutuhan dan konteks karakteristik satuan pendidikan", " Sebagai syarat formalitas saja", " Untuk menentukan biaya sekolah", " Agar seragam dengan sekolah lain"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menyesuaikan kurikulum dengan kebutuhan dan konteks karakteristik satuan pendidikan",
            pembahasan = "KOSP adalah kurikulum yang dikembangkan oleh sekolah masing-masing."
        ),
        QuestionEntity(
            idSoal = "EDU_38",
            kategori = "TKB",
            subKategori = "Pendidikan-Teknologi Pendidikan",
            pertanyaan = "Apa yang dimaksud dengan *Learning Management System* (LMS)?",
            pilihan = listOf(" Aplikasi chat guru", " Platform untuk mengelola dan mendistribusikan materi pembelajaran secara daring", " Database nilai manual", " Komputer untuk administrasi guru", " Mesin fotokopi digital"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Platform untuk mengelola dan mendistribusikan materi pembelajaran secara daring",
            pembahasan = "Contoh LMS populer: Google Classroom, Moodle, Canvas."
        ),
        QuestionEntity(
            idSoal = "EDU_39",
            kategori = "TKB",
            subKategori = "Pendidikan-Asesmen",
            pertanyaan = "Apa yang dimaksud dengan asesmen otentik?",
            pilihan = listOf(" Asesmen yang hanya menggunakan pilihan ganda", " Asesmen yang mengukur kinerja nyata atau produk siswa dalam konteks dunia nyata", " Asesmen yang dikerjakan dengan mencontek", " Asesmen yang diberikan oleh pengawas luar", " Asesmen yang hanya ada di universitas"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Asesmen yang mengukur kinerja nyata atau produk siswa dalam konteks dunia nyata",
            pembahasan = "Siswa didorong mendemonstrasikan kompetensi, bukan hanya memilih jawaban."
        ),
        QuestionEntity(
            idSoal = "EDU_40",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Mengapa penting bagi guru untuk melakukan refleksi setelah mengajar?",
            pilihan = listOf(" Untuk mengisi jam kerja", " Untuk mengevaluasi keefektifan pengajaran dan melakukan perbaikan", " Agar bisa pulang lebih cepat", " Untuk memenuhi syarat administrasi saja", " Agar disukai kepala sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Untuk mengevaluasi keefektifan pengajaran dan melakukan perbaikan",
            pembahasan = "Refleksi adalah jantung dari pengembangan profesionalisme guru."
        ),
        QuestionEntity(
            idSoal = "EDU_41",
            kategori = "TKB",
            subKategori = "Pendidikan-Pendidikan Karakter",
            pertanyaan = "Apa yang dimaksud dengan Profil Pelajar Pancasila dimensi 'Berkebinekaan Global'?",
            pilihan = listOf(" Mempertahankan budaya lokal tanpa peduli dunia luar", " Memahami budaya sendiri dan mampu berinteraksi dengan budaya lain secara positif", " Harus tinggal di luar negeri", " Belajar bahasa asing saja", " Mengabaikan identitas bangsa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memahami budaya sendiri dan mampu berinteraksi dengan budaya lain secara positif",
            pembahasan = "Globalisasi membutuhkan sikap terbuka yang tetap berakar pada budaya bangsa."
        ),
        QuestionEntity(
            idSoal = "EDU_42",
            kategori = "TKB",
            subKategori = "Pendidikan-Literasi-Numerasi",
            pertanyaan = "Apa peran guru dalam meningkatkan literasi siswa di semua mata pelajaran?",
            pilihan = listOf(" Hanya guru Bahasa Indonesia yang bertanggung jawab", " Mengintegrasikan aktivitas membaca dan analisis teks di setiap mapel", " Memberikan PR membaca di rumah saja", " Tidak perlu karena sudah ada perpustakaan", " Menganggap literasi tidak penting"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengintegrasikan aktivitas membaca dan analisis teks di setiap mapel",
            pembahasan = "Literasi adalah kemampuan lintas mata pelajaran (transdisipliner)."
        ),
        QuestionEntity(
            idSoal = "EDU_43",
            kategori = "TKB",
            subKategori = "Pendidikan-Evaluasi Pembelajaran",
            pertanyaan = "Apa fungsi rubrik dalam penilaian?",
            pilihan = listOf(" Untuk memperumit penilaian", " Memberikan panduan kriteria penilaian yang objektif dan jelas", " Sebagai hiasan dokumen", " Untuk menambah lembar kerja", " Untuk menentukan siapa yang paling populer"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan panduan kriteria penilaian yang objektif dan jelas",
            pembahasan = "Rubrik membantu guru objektif dan siswa memahami ekspektasi tugas."
        ),
        QuestionEntity(
            idSoal = "EDU_44",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Siswa dengan gaya belajar visual lebih mudah memahami materi jika...",
            pilihan = listOf(" Dijelaskan dengan kata-kata saja", " Menggunakan gambar, diagram, atau video", " Melakukan eksperimen fisik", " Mendengarkan rekaman suara", " Membaca teks tanpa gambar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menggunakan gambar, diagram, atau video",
            pembahasan = "Visual learner memproses informasi melalui persepsi penglihatan."
        ),
        QuestionEntity(
            idSoal = "EDU_45",
            kategori = "TKB",
            subKategori = "Pendidikan-Strategi Pembelajaran",
            pertanyaan = "Apa itu metode 'Inquiry Based Learning'?",
            pilihan = listOf(" Pembelajaran melalui ceramah panjang", " Pembelajaran yang mendorong siswa untuk bertanya, meneliti, dan bereksplorasi", " Pembelajaran yang hanya fokus pada ujian", " Pembelajaran yang dilakukan oleh guru saja", " Pembelajaran tanpa alat bantu"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pembelajaran yang mendorong siswa untuk bertanya, meneliti, dan bereksplorasi",
            pembahasan = "Inquiry membangun rasa ingin tahu dan kemampuan berpikir ilmiah."
        ),
        QuestionEntity(
            idSoal = "EDU_46",
            kategori = "TKB",
            subKategori = "Pendidikan-Manajemen Kelas",
            pertanyaan = "Apa kunci keberhasilan pembagian kelompok yang heterogen?",
            pilihan = listOf(" Kelompok berdasarkan kesamaan nilai", " Kelompok dengan latar belakang kemampuan dan karakteristik beragam", " Kelompok berdasarkan pertemanan saja", " Kelompok berdasarkan jenis kelamin", " Kelompok berdasarkan rumah terdekat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kelompok dengan latar belakang kemampuan dan karakteristik beragam",
            pembahasan = "Heterogenitas mendorong *peer-tutoring* (tutor sebaya) yang efektif."
        ),
        QuestionEntity(
            idSoal = "EDU_47",
            kategori = "TKB",
            subKategori = "Pendidikan-Filosofi Pendidikan",
            pertanyaan = "Apa makna semboyan 'Tut Wuri Handayani'?",
            pilihan = listOf(" Di depan memberi contoh", " Di tengah membangun semangat", " Di belakang memberikan dorongan dan arahan", " Di belakang mengatur segalanya", " Di depan memegang kendali"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Di belakang memberikan dorongan dan arahan",
            pembahasan = "Guru berperan sebagai penyemangat yang membiarkan siswa mandiri bereksplorasi."
        ),
        QuestionEntity(
            idSoal = "EDU_48",
            kategori = "TKB",
            subKategori = "Pendidikan-Kurikulum",
            pertanyaan = "Apa yang dimaksud dengan 'Alur Tujuan Pembelajaran' (ATP)?",
            pilihan = listOf(" Rangkaian tujuan pembelajaran yang disusun secara sistematis dan logis di dalam fase", " Daftar nama siswa", " Jadwal pelajaran sekolah", " Harga buku cetak", " Daftar tugas guru"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Rangkaian tujuan pembelajaran yang disusun secara sistematis dan logis di dalam fase",
            pembahasan = "ATP membantu guru memetakan perjalanan belajar siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_49",
            kategori = "TKB",
            subKategori = "Pendidikan-Teknologi Pendidikan",
            pertanyaan = "Apa manfaat utama penggunaan alat peraga (media) dalam pembelajaran?",
            pilihan = listOf(" Membuat kelas menjadi ramai", " Mengonkretkan konsep abstrak agar lebih mudah dipahami", " Memperpanjang waktu mengajar", " Menghilangkan peran guru", " Meningkatkan biaya sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengonkretkan konsep abstrak agar lebih mudah dipahami",
            pembahasan = "Media bantu sangat efektif untuk menurunkan tingkat abstraksi materi."
        ),
        QuestionEntity(
            idSoal = "EDU_49",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoran",
            pertanyaan = "Apa yang harus dilakukan guru jika melihat diskriminasi di sekolah?",
            pilihan = listOf(" Mendiamkannya", " Melakukan edukasi dan intervensi demi keadilan serta inklusivitas", " Mengikuti arus", " Melaporkan tanpa tindakan", " Menganggap hal biasa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melakukan edukasi dan intervensi demi keadilan serta inklusivitas",
            pembahasan = "Guru adalah penjaga nilai keadilan dan hak asasi di sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_50",
            kategori = "TKB",
            subKategori = "Pendidikan-Psikologi Pendidikan",
            pertanyaan = "Faktor apa yang paling berpengaruh pada keberhasilan belajar siswa menurut pandangan konstruktivisme?",
            pilihan = listOf(" Kemampuan guru dalam ceramah", " Kemampuan siswa mengaitkan pengetahuan baru dengan pengetahuan lama", " Keindahan ruang kelas", " Banyaknya buku yang dibaca", " Lamanya waktu belajar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kemampuan siswa mengaitkan pengetahuan baru dengan pengetahuan lama",
            pembahasan = "Konstruktivisme berargumen bahwa pengetahuan dibentuk secara aktif oleh si pembelajar."
        ),

        QuestionEntity(
            idSoal = "EDU_51",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Berdasarkan UU No. 14 Tahun 2005, guru adalah...",
            pilihan = listOf(" Pegawai pemerintah yang bertugas di sekolah", " Pendidik profesional dengan tugas utama mendidik, mengajar, membimbing, mengarahkan, melatih, menilai, dan mengevaluasi", " Pengajar yang hanya fokus pada transfer ilmu", " Orang yang memiliki gelar sarjana pendidikan", " Pemimpin di lingkungan sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pendidik profesional dengan tugas utama mendidik, mengajar, membimbing, mengarahkan, melatih, menilai, dan mengevaluasi",
            pembahasan = "Definisi guru mencakup peran yang luas, tidak hanya sekadar mengajar."
        ),
        QuestionEntity(
            idSoal = "EDU_52",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Apa fungsi utama dari Kalender Pendidikan (Kaldik) di sekolah?",
            pilihan = listOf(" Menentukan hari libur guru", " Pedoman pengaturan waktu untuk kegiatan pembelajaran selama satu tahun ajaran", " Syarat administratif untuk kepala sekolah", " Daftar hari raya nasional saja", " Hiasan dinding kantor guru"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pedoman pengaturan waktu untuk kegiatan pembelajaran selama satu tahun ajaran",
            pembahasan = "Kaldik krusial untuk sinkronisasi seluruh agenda kegiatan sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_53",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa yang dimaksud dengan *Game-Based Learning*?",
            pilihan = listOf(" Bermain game saat jam kosong", " Menggunakan mekanika dan elemen game untuk mencapai tujuan pembelajaran", " Membuat siswa membuat game sendiri", " Mengganti pelajaran dengan game sepanjang hari", " Menghukum siswa dengan game"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menggunakan mekanika dan elemen game untuk mencapai tujuan pembelajaran",
            pembahasan = "Game-based learning meningkatkan motivasi dan keterlibatan aktif siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_54",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Apa tujuan dari sistem Zonasi dalam Penerimaan Peserta Didik Baru (PPDB)?",
            pilihan = listOf(" Mempersulit akses sekolah", " Pemerataan akses dan kualitas pendidikan di sekolah negeri", " Menambah beban orang tua", " Mengurangi jumlah siswa sekolah", " Memilih siswa berdasarkan nilai saja"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pemerataan akses dan kualitas pendidikan di sekolah negeri",
            pembahasan = "Zonasi bertujuan menghilangkan kastanisasi sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_55",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Dokumen yang memuat perencanaan dan pembagian tugas guru dalam satu tahun adalah...",
            pilihan = listOf(" Jadwal Pelajaran", " Rencana Kerja Sekolah (RKS)", " Buku Kas", " Arsip Siswa", " Inventaris barang"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Rencana Kerja Sekolah (RKS)",
            pembahasan = "RKS adalah dokumen strategis untuk operasional sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_56",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa keunggulan metode *Project Based Learning* (PjBL)?",
            pilihan = listOf(" Siswa lebih banyak menghafal", " Mengembangkan keterampilan berpikir kritis, kolaborasi, dan kreativitas melalui proyek", " Mengurangi tugas siswa", " Membuat sekolah lebih murah", " Menghilangkan ujian"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengembangkan keterampilan berpikir kritis, kolaborasi, dan kreativitas melalui proyek",
            pembahasan = "PjBL mendekatkan siswa dengan kompleksitas dunia nyata."
        ),
        QuestionEntity(
            idSoal = "EDU_57",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "UU No. 20 Tahun 2003 mengatur tentang...",
            pilihan = listOf(" Sistem Pendidikan Nasional", " Guru dan Dosen", " Perlindungan Anak", " Aparatur Sipil Negara", " Keuangan Negara"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Sistem Pendidikan Nasional",
            pembahasan = "UU Sisdiknas adalah payung hukum utama pendidikan di Indonesia."
        ),
        QuestionEntity(
            idSoal = "EDU_58",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Apa manfaat utama dari supervisi akademik yang dilakukan oleh kepala sekolah?",
            pilihan = listOf(" Mencari kesalahan guru", " Membantu guru dalam meningkatkan kualitas pembelajaran", " Memarahi guru yang terlambat", " Menambah beban administratif guru", " Mengganti jadwal mengajar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Membantu guru dalam meningkatkan kualitas pembelajaran",
            pembahasan = "Supervisi adalah proses pembimbingan dan pengembangan profesional guru."
        ),
        QuestionEntity(
            idSoal = "EDU_59",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa yang dimaksud dengan *Adaptive Learning*?",
            pilihan = listOf(" Belajar di tempat adaptasi", " Pembelajaran yang disesuaikan secara real-time dengan kemampuan siswa menggunakan teknologi", " Siswa harus beradaptasi dengan materi sulit", " Guru yang harus beradaptasi dengan keinginan siswa", " Sekolah yang sering pindah lokasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pembelajaran yang disesuaikan secara real-time dengan kemampuan siswa menggunakan teknologi",
            pembahasan = "Teknologi AI sering digunakan dalam sistem ini untuk memberikan konten yang sesuai."
        ),
        QuestionEntity(
            idSoal = "EDU_60",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Apa itu RKAS dalam manajemen sekolah?",
            pilihan = listOf(" Rencana Kegiatan dan Anggaran Sekolah", " Rencana Kelompok Belajar Siswa", " Rapat Kerja Akhir Semester", " Registrasi Kelas Awal Semester", " Rancangan Kurikulum Akademik Sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Rencana Kegiatan dan Anggaran Sekolah",
            pembahasan = "RKAS adalah dokumen perencanaan keuangan yang wajib disusun sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_61",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Fungsi dari arsip dalam administrasi sekolah adalah...",
            pilihan = listOf(" Sebagai tumpukan kertas", " Sebagai pusat memori, bukti sejarah, dan data pendukung kebijakan", " Untuk memenuhi syarat gudang", " Sebagai bahan bakar pembakaran", " Untuk pajangan di ruang TU"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sebagai pusat memori, bukti sejarah, dan data pendukung kebijakan",
            pembahasan = "Arsip yang tertata adalah kunci efisiensi sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_62",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa itu metode *Blended Learning* yang paling efektif?",
            pilihan = listOf(" Hanya memberikan tugas via internet", " Integrasi tatap muka untuk diskusi dan daring untuk konten mendalam", " Menghapus kelas tatap muka", " Belajar dengan televisi saja", " Menggunakan buku tanpa internet"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Integrasi tatap muka untuk diskusi dan daring untuk konten mendalam",
            pembahasan = "Blended learning adalah kombinasi sinergis, bukan sekadar pelengkap."
        ),
        QuestionEntity(
            idSoal = "EDU_63",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Siapa yang berhak menetapkan kurikulum tingkat satuan pendidikan?",
            pilihan = listOf(" Pemerintah pusat saja", " Dinas Pendidikan", " Satuan pendidikan (sekolah) dengan mengacu pada standar nasional", " Orang tua siswa", " Komite sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Satuan pendidikan (sekolah) dengan mengacu pada standar nasional",
            pembahasan = "Kemandirian sekolah dalam kurikulum adalah prinsip otonomi pendidikan."
        ),
        QuestionEntity(
            idSoal = "EDU_64",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Penyusunan jadwal pelajaran harus mempertimbangkan...",
            pilihan = listOf(" Kenyamanan guru", " Ketersediaan ruang, beban mengajar, dan efektivitas psikologis siswa", " Keinginan orang tua", " Hari libur panjang", " Letak kantin"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Ketersediaan ruang, beban mengajar, dan efektivitas psikologis siswa",
            pembahasan = "Jadwal harus mendukung efektivitas belajar, bukan sekadar membagi jam."
        ),
        QuestionEntity(
            idSoal = "EDU_65",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa manfaat penggunaan video pembelajaran bagi siswa?",
            pilihan = listOf(" Membuat siswa mengantuk", " Memberikan visualisasi yang mempermudah pemahaman konsep", " Menggantikan guru", " Menambah biaya operasional", " Menghilangkan peran buku"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan visualisasi yang mempermudah pemahaman konsep",
            pembahasan = "Visualisasi sangat efektif untuk materi yang abstrak atau kompleks."
        ),
        QuestionEntity(
            idSoal = "EDU_66",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Apa yang dimaksud dengan Guru Penggerak dalam kebijakan Kemendikbudristek?",
            pilihan = listOf(" Guru yang paling sibuk", " Guru yang memimpin perubahan ekosistem pendidikan untuk mewujudkan pembelajaran berpusat pada siswa", " Guru yang mengajar paling banyak", " Guru yang paling pintar komputer", " Guru yang disukai siswa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Guru yang memimpin perubahan ekosistem pendidikan untuk mewujudkan pembelajaran berpusat pada siswa",
            pembahasan = "Guru Penggerak adalah agen transformasi pendidikan."
        ),
        QuestionEntity(
            idSoal = "EDU_67",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Tujuan dari penilaian kinerja guru (PKG) adalah...",
            pilihan = listOf(" Memberhentikan guru", " Menilai kompetensi guru dalam menjalankan tugas profesionalnya", " Mencari guru terbaik saja", " Formalitas administrasi", " Menambah beban kerja"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menilai kompetensi guru dalam menjalankan tugas profesionalnya",
            pembahasan = "PKG adalah dasar pengembangan karier dan perbaikan kualitas guru."
        ),
        QuestionEntity(
            idSoal = "EDU_68",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa itu *Microlearning*?",
            pilihan = listOf(" Belajar di ruangan kecil", " Penyampaian materi pembelajaran dalam porsi kecil dan singkat", " Belajar memakai mikroskop", " Belajar hanya 1 menit sehari", " Belajar materi yang tidak penting"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Penyampaian materi pembelajaran dalam porsi kecil dan singkat",
            pembahasan = "Microlearning membantu retensi informasi dengan beban kognitif yang rendah."
        ),
        QuestionEntity(
            idSoal = "EDU_69",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Apa kewajiban guru sesuai kode etik profesi?",
            pilihan = listOf(" Mengikuti perintah atasan secara buta", " Menjunjung tinggi martabat profesi dan menunaikan kewajiban dengan dedikasi", " Mendapatkan gaji setinggi-tingginya", " Memilih murid yang kaya", " Mengabaikan siswa yang lambat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menjunjung tinggi martabat profesi dan menunaikan kewajiban dengan dedikasi",
            pembahasan = "Kode etik adalah kompas moral bagi perilaku profesional guru."
        ),
        QuestionEntity(
            idSoal = "EDU_70",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Apa fungsi utama Buku Penghubung sekolah dengan orang tua?",
            pilihan = listOf(" Untuk komplain", " Sarana komunikasi perkembangan belajar dan perilaku siswa", " Tempat mencatat belanja", " Hiasan meja", " Untuk tugas guru saja"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sarana komunikasi perkembangan belajar dan perilaku siswa",
            pembahasan = "Sinergi guru dan orang tua adalah kunci keberhasilan pendidikan siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_71",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa tujuan dari *E-Portfolio* bagi siswa?",
            pilihan = listOf(" Membuat tugas terlihat keren", " Mendokumentasikan dan memamerkan hasil karya/perkembangan siswa secara digital", " Menghabiskan kuota internet", " Memaksa siswa punya laptop", " Hanya untuk nilai tambahan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mendokumentasikan dan memamerkan hasil karya/perkembangan siswa secara digital",
            pembahasan = "E-portfolio membangun refleksi dan jejak digital prestasi siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_72",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Apa yang dimaksud dengan Wajib Belajar 12 Tahun?",
            pilihan = listOf(" Belajar di sekolah selama 12 jam", " Kewajiban warga negara menempuh pendidikan dasar hingga menengah atas", " Belajar 12 mata pelajaran", " Belajar hanya 12 bulan", " Kewajiban guru mengajar 12 tahun"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kewajiban warga negara menempuh pendidikan dasar hingga menengah atas",
            pembahasan = "Pemerintah menjamin akses pendidikan hingga level SMA/SMK."
        ),
        QuestionEntity(
            idSoal = "EDU_73",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Sekolah",
            pertanyaan = "Apa peran Komite Sekolah dalam manajemen sekolah?",
            pilihan = listOf(" Mengatur semua urusan keuangan", " Memberikan pertimbangan, dukungan, dan pengawasan dalam peningkatan mutu", " Mengganti kepala sekolah", " Memaksa siswa masuk sekolah", " Menjadi guru tamu setiap hari"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan pertimbangan, dukungan, dan pengawasan dalam peningkatan mutu",
            pembahasan = "Komite adalah representasi masyarakat yang mendukung sekolah."
        ),
        QuestionEntity(
            idSoal = "EDU_74",
            kategori = "TKB",
            subKategori = "Pendidikan-Inovasi Pedagogik",
            pertanyaan = "Apa itu *Design Thinking* dalam pembelajaran?",
            pilihan = listOf(" Menggambar kelas yang indah", " Pendekatan memecahkan masalah kompleks dengan berempati pada pengguna (siswa)", " Membuat desain baju siswa", " Mengganti kursi kelas", " Menghapus ujian"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pendekatan memecahkan masalah kompleks dengan berempati pada pengguna (siswa)",
            pembahasan = "Empati adalah langkah awal dalam merancang solusi pembelajaran yang tepat."
        ),
        QuestionEntity(
            idSoal = "EDU_75",
            kategori = "TKB",
            subKategori = "Pendidikan-Perundangan",
            pertanyaan = "Hak guru untuk mendapatkan perlindungan dalam menjalankan tugas diatur dalam...",
            pilihan = listOf(" Peraturan sekolah saja", " UU Guru dan Dosen serta UU Perlindungan Anak", " Kebijakan ketua RT", " Peraturan keluarga", " Tidak ada perlindungannya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. UU Guru dan Dosen serta UU Perlindungan Anak",
            pembahasan = "Guru berhak atas perlindungan hukum dan profesi saat menjalankan tugasnya."
        ),
        QuestionEntity(
            idSoal = "EDU_76",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Dalam sebuah diskusi kelas, seorang siswa terus memotong pembicaraan temannya. Tindakan yang paling tepat adalah...",
            pilihan = listOf(" Mendiamkan siswa tersebut", " Menegur dengan keras di depan kelas", " Menjelaskan pentingnya mendengarkan orang lain dan memberi giliran bicara secara tertib", " Mengeluarkan siswa dari kelas", " Memberi nilai jelek"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Menjelaskan pentingnya mendengarkan orang lain dan memberi giliran bicara secara tertib",
            pembahasan = "Pendidikan karakter di kelas harus bersifat edukatif dan membangun."
        ),
        QuestionEntity(
            idSoal = "EDU_77",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Apa tindakan yang paling etis jika guru melakukan kesalahan dalam penyampaian materi?",
            pilihan = listOf(" Berpura-pura tidak tahu", " Mengakui kesalahan di depan kelas dan memberikan klarifikasi/pembetulan", " Menyalahkan buku teks", " Menghukum siswa yang protes", " Mengganti topik bahasan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengakui kesalahan di depan kelas dan memberikan klarifikasi/pembetulan",
            pembahasan = "Integritas guru adalah model kejujuran bagi siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_78",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa fokus dari Pendidikan 5.0 (Society 5.0)?",
            pilihan = listOf(" Fokus pada teknologi tanpa manusia", " Integrasi teknologi dalam kehidupan manusia untuk kualitas hidup yang lebih baik", " Menghapus sekolah fisik", " Mengganti semua guru dengan robot", " Hanya menggunakan komputer"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Integrasi teknologi dalam kehidupan manusia untuk kualitas hidup yang lebih baik",
            pembahasan = "Society 5.0 menempatkan manusia sebagai pusat, dengan teknologi sebagai pendukung."
        ),
        QuestionEntity(
            idSoal = "EDU_79",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Apa yang harus dilakukan guru saat murid mengalami kesulitan belajar yang persisten?",
            pilihan = listOf(" Membiarkannya karena murid berbeda-beda", " Melakukan diagnosis, pemberian intervensi/bimbingan, dan komunikasi dengan orang tua", " Langsung memberikan nilai tidak lulus", " Menyarankan pindah sekolah", " Memberikan tugas tambahan yang lebih sulit"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melakukan diagnosis, pemberian intervensi/bimbingan, dan komunikasi dengan orang tua",
            pembahasan = "Dukungan berkelanjutan adalah kunci mengatasi kesulitan belajar."
        ),
        QuestionEntity(
            idSoal = "EDU_80",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Guru menerima hadiah berharga dari orang tua siswa menjelang pembagian rapor. Apa tindakan yang benar?",
            pilihan = listOf(" Menerima dengan senang hati", " Menerima secara diam-diam", " Menolak dengan sopan dan menjelaskan pentingnya objektivitas profesional", " Menerima dan memberikannya ke kepala sekolah", " Menerima dan dibagi ke guru lain"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Menolak dengan sopan dan menjelaskan pentingnya objektivitas profesional",
            pembahasan = "Menjaga profesionalisme adalah harga mati untuk menghindari konflik kepentingan."
        ),
        QuestionEntity(
            idSoal = "EDU_81",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa itu *Computational Thinking* yang mulai diintegrasikan ke kurikulum?",
            pilihan = listOf(" Berpikir harus menggunakan komputer", " Metode pemecahan masalah dengan logika pemrosesan data (dekomposisi, pengenalan pola, abstraksi, algoritma)", " Belajar bahasa pemrograman saja", " Menghitung cepat tanpa kalkulator", " Berpikir tentang matematika"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Metode pemecahan masalah dengan logika pemrosesan data (dekomposisi, pengenalan pola, abstraksi, algoritma)",
            pembahasan = "Berpikir komputasional adalah skill literasi masa depan."
        ),
        QuestionEntity(
            idSoal = "EDU_82",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Bagaimana menanggapi kasus perundungan (bullying) di lingkungan sekolah?",
            pilihan = listOf(" Menganggapnya hal wajar", " Melakukan penanganan serius, edukasi, dan penegakan aturan sekolah secara tegas", " Memberi tahu orang tua lalu berhenti di situ", " Membiarkan siswa menyelesaikannya sendiri", " Memindahkan kelas korban"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melakukan penanganan serius, edukasi, dan penegakan aturan sekolah secara tegas",
            pembahasan = "Sekolah harus menjadi zona aman (safe space) bagi setiap siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_83",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Apa yang dimaksud dengan menjaga netralitas dalam politik praktis di lingkungan sekolah?",
            pilihan = listOf(" Tidak memihak kandidat politik manapun agar fokus pada tugas pendidikan", " Mengajak siswa memilih kandidat tertentu", " Memasang spanduk politik di sekolah", " Menjadi tim sukses kandidat di kelas", " Menggunakan anggaran sekolah untuk kampanye"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Tidak memihak kandidat politik manapun agar fokus pada tugas pendidikan",
            pembahasan = "Sekolah adalah netral sebagai sarana pendidikan, bukan tempat kampanye."
        ),
        QuestionEntity(
            idSoal = "EDU_84",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Pemanfaatan AI (Artificial Intelligence) oleh guru yang paling tepat adalah...",
            pilihan = listOf(" Menggunakan AI untuk membuat soal ujian siswa", " Menggunakan AI sebagai asisten untuk efisiensi administrasi dan media belajar kreatif", " Menggantikan guru untuk mengajar sepenuhnya", " Menggunakan AI untuk mengerjakan tugas siswa", " Tidak perlu menggunakan AI"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menggunakan AI sebagai asisten untuk efisiensi administrasi dan media belajar kreatif",
            pembahasan = "AI adalah alat bantu, bukan pengganti peran humanis seorang guru."
        ),
        QuestionEntity(
            idSoal = "EDU_85",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Siswa merasa bosan dengan metode ceramah yang terus-menerus. Apa tindakan kreatif guru?",
            pilihan = listOf(" Memarahi siswa", " Mengganti metode dengan diskusi, simulasi, atau bermain peran", " Menambah tugas menulis", " Memberi waktu tidur", " Mengancam dengan ujian"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengganti metode dengan diskusi, simulasi, atau bermain peran",
            pembahasan = "Variasi metode adalah kunci memelihara antusiasme belajar."
        ),
        QuestionEntity(
            idSoal = "EDU_86",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Seorang guru membagikan foto siswa di media sosial tanpa izin orang tua. Apa kesalahannya?",
            pilihan = listOf(" Tidak ada kesalahan", " Melanggar privasi dan hak perlindungan data siswa", " Hanya masalah selera", " Karena fotonya tidak bagus", " Karena kurang banyak yang like"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melanggar privasi dan hak perlindungan data siswa",
            pembahasan = "Digital ethics adalah bagian dari keprofesionalan guru masa kini."
        ),
        QuestionEntity(
            idSoal = "EDU_87",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa itu 'Pembelajaran Kolaboratif'?",
            pilihan = listOf(" Siswa mengerjakan tugas masing-masing", " Proses belajar di mana siswa bekerja sama mencapai tujuan pembelajaran bersama", " Guru mengajar sendirian", " Siswa hanya mendengarkan", " Kompetisi antar siswa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Proses belajar di mana siswa bekerja sama mencapai tujuan pembelajaran bersama",
            pembahasan = "Kolaborasi membangun komunikasi dan empati."
        ),
        QuestionEntity(
            idSoal = "EDU_88",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Ada siswa dari keluarga kurang mampu yang tidak bisa membeli perlengkapan sekolah. Langkah guru yang bijak adalah...",
            pilihan = listOf(" Membiarkannya", " Menertawakan", " Melakukan koordinasi dengan sekolah, komunitas, atau pihak terkait untuk memberikan bantuan", " Menyuruh berhenti sekolah", " Meminta siswa bekerja dulu"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Melakukan koordinasi dengan sekolah, komunitas, atau pihak terkait untuk memberikan bantuan",
            pembahasan = "Inklusivitas adalah jiwa dari pendidik yang peduli."
        ),
        QuestionEntity(
            idSoal = "EDU_89",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Apa fungsi utama dari refleksi kritis bagi seorang guru?",
            pilihan = listOf(" Untuk mencari alasan kegagalan", " Meningkatkan kualitas diri dan pembelajaran secara berkelanjutan", " Untuk menunjukkan kehebatan guru", " Untuk administrasi sekolah", " Untuk mengeluh"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Meningkatkan kualitas diri dan pembelajaran secara berkelanjutan",
            pembahasan = "Guru pembelajar adalah guru yang terus berefleksi."
        ),
        QuestionEntity(
            idSoal = "EDU_90",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa yang dimaksud dengan 'Literasi Digital' bagi siswa?",
            pilihan = listOf(" Mahir bermain game", " Kecakapan menggunakan media digital secara cerdas, aman, dan bertanggung jawab", " Bisa mengetik cepat", " Bisa ganti wallpaper HP", " Punya banyak akun medsos"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kecakapan menggunakan media digital secara cerdas, aman, dan bertanggung jawab",
            pembahasan = "Literasi digital melibatkan pemahaman akan keamanan dan etika online."
        ),
        QuestionEntity(
            idSoal = "EDU_91",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Siswa bertanya tentang hal yang tidak dikuasai oleh guru saat itu juga. Tindakan guru yang profesional adalah...",
            pilihan = listOf(" Memarahi siswa", " Mengakui bahwa itu di luar materi, lalu berjanji untuk mencari tahu dan membahasnya di pertemuan berikutnya", " Menjawab asal-asalan", " Mengalihkan pembicaraan", " Meminta siswa mencari sendiri"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengakui bahwa itu di luar materi, lalu berjanji untuk mencari tahu dan membahasnya di pertemuan berikutnya",
            pembahasan = "Kerendahan hati dan kemauan belajar adalah nilai edukatif."
        ),
        QuestionEntity(
            idSoal = "EDU_92",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Mengapa penting menjaga hubungan baik dengan rekan sejawat?",
            pilihan = listOf(" Untuk sekadar berbagi makan siang", " Membangun kolaborasi profesional dan ekosistem sekolah yang harmonis", " Untuk saling menutupi kesalahan", " Untuk bergosip", " Agar bisa bolos bersama"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Membangun kolaborasi profesional dan ekosistem sekolah yang harmonis",
            pembahasan = "Kolaborasi guru adalah fondasi budaya sekolah yang maju."
        ),
        QuestionEntity(
            idSoal = "EDU_93",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa manfaat pembelajaran berbasis inkuiri?",
            pilihan = listOf(" Guru tidak perlu menyiapkan apa-apa", " Merangsang rasa ingin tahu, nalar kritis, dan keterlibatan aktif siswa", " Menghilangkan kebutuhan buku", " Mempersingkat waktu sekolah", " Menggantikan ujian"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Merangsang rasa ingin tahu, nalar kritis, dan keterlibatan aktif siswa",
            pembahasan = "Inkuiri menempatkan siswa sebagai penemu ilmu bagi dirinya."
        ),
        QuestionEntity(
            idSoal = "EDU_94",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Siswa mengalami stres berat karena tekanan akademik. Apa peran guru?",
            pilihan = listOf(" Memberi tugas lebih banyak", " Memberikan dukungan emosional, memberikan pengertian, dan berdiskusi dengan orang tua", " Mengabaikannya", " Memberi nilai buruk", " Meminta siswa pindah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan dukungan emosional, memberikan pengertian, dan berdiskusi dengan orang tua",
            pembahasan = "Kesejahteraan psikologis (well-being) harus diprioritaskan di atas angka."
        ),
        QuestionEntity(
            idSoal = "EDU_95",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Bagaimana bersikap saat terjadi perbedaan paham dalam rapat sekolah?",
            pilihan = listOf(" Keluar ruangan", " Mendengarkan pendapat lain, berargumentasi secara sopan, dan mengutamakan kepentingan siswa", " Memaksa pendapat sendiri", " Diam saja", " Membentak"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mendengarkan pendapat lain, berargumentasi secara sopan, dan mengutamakan kepentingan siswa",
            pembahasan = "Profesionalisme diuji saat terjadi perbedaan pendapat."
        ),
        QuestionEntity(
            idSoal = "EDU_96",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Apa itu 'Pembelajaran Berpusat pada Siswa' (Student-Centered)?",
            pilihan = listOf(" Guru adalah sumber tunggal", " Siswa ikut terlibat merancang dan aktif dalam proses belajar", " Siswa hanya menjadi penonton", " Kurikulum yang kaku", " Sekolah yang menentukan semuanya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Siswa ikut terlibat merancang dan aktif dalam proses belajar",
            pembahasan = "Memberi otonomi kepada siswa membuat mereka lebih bertanggung jawab atas belajar mereka."
        ),
        QuestionEntity(
            idSoal = "EDU_97",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Apa yang harus dilakukan jika ada siswa yang sangat tertutup dan jarang berkomunikasi?",
            pilihan = listOf(" Membiarkannya", " Melakukan pendekatan personal, memberikan ruang, dan merangsang partisipasinya secara perlahan", " Memaksa siswa untuk maju ke depan", " Menilai siswa tersebut bodoh", " Mengabaikan keberadaannya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melakukan pendekatan personal, memberikan ruang, dan merangsang partisipasinya secara perlahan",
            pembahasan = "Siswa introvert membutuhkan kenyamanan psikologis untuk berpartisipasi."
        ),
        QuestionEntity(
            idSoal = "EDU_98",
            kategori = "TKB",
            subKategori = "Pendidikan-Administrasi Perkantoranonal",
            pertanyaan = "Guru memberikan bimbingan belajar gratis kepada siswa di luar jam sekolah. Apa pandangan etika guru?",
            pilihan = listOf(" Sangat mulia dan menunjukkan dedikasi (selama tidak melanggar aturan)", " Melanggar aturan", " Tidak penting", " Menambah beban siswa", " Membahayakan sekolah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Sangat mulia dan menunjukkan dedikasi (selama tidak melanggar aturan)",
            pembahasan = "Kepedulian terhadap kemajuan siswa di luar jam resmi adalah bentuk dedikasi tinggi."
        ),
        QuestionEntity(
            idSoal = "EDU_99",
            kategori = "TKB",
            subKategori = "Pendidikan-Tren Pendidikan",
            pertanyaan = "Manfaat dari 'Asesmen Formatif' secara berkelanjutan adalah...",
            pilihan = listOf(" Guru punya banyak nilai", " Siswa dan guru dapat memantau progres dan memperbaiki kualitas belajar", " Memberatkan siswa", " Menghabiskan waktu", " Menambah kertas"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Siswa dan guru dapat memantau progres dan memperbaiki kualitas belajar",
            pembahasan = "Umpan balik terus menerus mencegah ketertinggalan siswa."
        ),
        QuestionEntity(
            idSoal = "EDU_100",
            kategori = "TKB",
            subKategori = "Pendidikan-Studi Kasus",
            pertanyaan = "Pesan terakhir untuk seorang pendidik hebat adalah...",
            pilihan = listOf(" Berhenti belajar setelah jadi guru", " Teruslah berinovasi, menjaga integritas, dan selalu berorientasi pada kepentingan siswa", " Fokus pada gaji saja", " Fokus pada administrasi saja", " Jangan pedulikan siswa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Teruslah berinovasi, menjaga integritas, dan selalu berorientasi pada kepentingan siswa",
            pembahasan = "Pendidikan adalah perjuangan tanpa henti demi masa depan yang lebih baik."
        )
    )
}