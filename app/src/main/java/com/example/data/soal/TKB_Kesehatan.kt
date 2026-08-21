package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalKesehatan {
    val daftarSoal = listOf(
        QuestionEntity(
            idSoal = "MED_01",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Definisi sehat menurut WHO tahun 1948 adalah...",
            pilihan = listOf(  " Tidak adanya penyakit atau kelemahan", " Keadaan sehat fisik, mental, dan sosial secara utuh, bukan hanya bebas dari penyakit", " Kemampuan tubuh untuk melawan infeksi", " Keseimbangan metabolisme dalam tubuh", " Keadaan di mana seseorang dapat bekerja dengan optimal"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Keadaan sehat fisik, mental, dan sosial secara utuh, bukan hanya bebas dari penyakit",
            pembahasan = "Definisi ini menekankan holistik, mencakup aspek fisik, mental, dan sosial."
        ),
        QuestionEntity(
            idSoal = "MED_02",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Apa yang dimaksud dengan 'Endemi'?",
            pilihan = listOf(  " Penyakit yang menyebar luas ke seluruh dunia", " Penyakit yang muncul tiba-tiba dalam jumlah banyak di suatu wilayah", " Penyakit yang secara konstan ada di suatu wilayah geografis tertentu", " Penyakit yang hanya menyerang hewan", " Penyakit yang baru pertama kali ditemukan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Penyakit yang secara konstan ada di suatu wilayah geografis tertentu",
            pembahasan = "Endemi merujuk pada keberadaan penyakit yang stabil di wilayah tertentu."
        ),
        QuestionEntity(
            idSoal = "MED_03",
            kategori = "TKB",
            subKategori = "Kesehatan-Patologi",
            pertanyaan = "Proses kematian sel yang terprogram secara genetik disebut...",
            pilihan = listOf(  " Nekrosis", " Apoptosis", " Atrofi", " Hipertrofi", " Inflamasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Apoptosis",
            pembahasan = "Apoptosis adalah 'kematian sel terprogram' yang penting untuk menjaga homeostasis."
        ),
        QuestionEntity(
            idSoal = "MED_04",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Pencegahan primer dalam kesehatan masyarakat bertujuan untuk...",
            pilihan = listOf(  " Menyembuhkan penyakit yang sudah ada", " Mencegah timbulnya penyakit sebelum terjadi (promosi & proteksi)", " Mendeteksi penyakit sedini mungkin", " Rehabilitasi pasca sakit", " Mengurangi kecacatan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mencegah timbulnya penyakit sebelum terjadi (promosi & proteksi)",
            pembahasan = "Pencegahan primer berfokus pada upaya sebelum munculnya agen penyakit."
        ),
        QuestionEntity(
            idSoal = "MED_05",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Faktor penyebab penyakit dalam segitiga epidemiologi meliputi...",
            pilihan = listOf(" Host, Agent, Environment", " Virus, Bakteri, Jamur", " Genetik, Lingkungan, Pola Makan", " Usia, Jenis Kelamin, Ras", " Vaksin, Obat, Gizi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Host, Agent, Environment",
            pembahasan = "Interaksi antara inang (host), agen, dan lingkungan adalah dasar epidemiologi."
        ),
        QuestionEntity(
            idSoal = "MED_06",
            kategori = "TKB",
            subKategori = "Kesehatan-Patologi",
            pertanyaan = "Respon jaringan terhadap cedera yang ditandai dengan kemerahan, panas, nyeri, dan bengkak adalah...",
            pilihan = listOf("Infeksi", " Inflamasi", " Neoplasia", " Nekrosis", " Degenerasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Inflamasi",
            // 🎯 KOREKSI: Mengubah "cedera/iritan" menjadi "cedera atau iritan" untuk menghindari error pembacaan parser
            pembahasan = "Inflamasi adalah respon protektif tubuh terhadap cedera atau iritan."
        ),
        QuestionEntity(
            idSoal = "MED_07",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Apa yang dimaksud dengan Imunisasi?",
            // 🎯 KOREKSI: Pastikan tidak ada spasi gaib berlebih di dalam tanda kutip list pilihan
            pilihan = listOf("Pemberian obat antibiotik", "Proses pemberian kekebalan tubuh terhadap penyakit", "Pengobatan tradisional", "Tindakan pembedahan", "Diet nutrisi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Proses pemberian kekebalan tubuh terhadap penyakit",
            pembahasan = "Imunisasi merangsang sistem imun untuk mengenali dan melawan patogen."
        ),
        QuestionEntity(
            idSoal = "MED_08",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Ukuran kejadian penyakit baru dalam populasi pada periode waktu tertentu disebut...",
            pilihan = listOf(  " Prevalensi", " Insidensi", " Mortalitas", " Morbiditas", " Attack Rate"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Insidensi",
            pembahasan = "Insidensi mengukur kasus baru, sedangkan prevalensi mengukur kasus total (baru + lama)."
        ),
        QuestionEntity(
            idSoal = "MED_09",
            kategori = "TKB",
            subKategori = "Kesehatan-Anatomi",
            pertanyaan = "Bagian jantung yang menerima darah kaya oksigen dari paru-paru adalah...",
            pilihan = listOf(  " Atrium kanan", " Ventrikel kanan", " Atrium kiri", " Ventrikel kiri", " Arteri pulmonalis"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Atrium kiri",
            pembahasan = "Darah dari paru-paru melalui vena pulmonalis masuk ke atrium kiri."
        ),
        QuestionEntity(
            idSoal = "MED_10",
            kategori = "TKB",
            subKategori = "Kesehatan-Fisiologi",
            pertanyaan = "Organ utama dalam sistem ekskresi yang menyaring darah adalah...",
            pilihan = listOf(  " Hati", " Paru-paru", " Ginjal", " Usus besar", " Kulit"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Ginjal",
            pembahasan = "Ginjal menyaring produk sisa metabolisme dari darah menjadi urin."
        ),
        QuestionEntity(
            idSoal = "MED_11",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Program 'PHBS' di rumah tangga adalah singkatan dari...",
            pilihan = listOf(  " Perilaku Hidup Bersih dan Sehat", " Penanganan Hidup Berbasis Strategis", " Pusat Hidup Bersih dan Sehat", " Pertolongan Hidup Bersih dan Selamat", " Pola Hidup Bersih dan Serasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Perilaku Hidup Bersih dan Sehat",
            pembahasan = "PHBS merupakan program preventif utama di Indonesia."
        ),
        QuestionEntity(
            idSoal = "MED_12",
            kategori = "TKB",
            subKategori = "Kesehatan-Patologi",
            pertanyaan = "Penyakit yang disebabkan oleh pertumbuhan sel yang tidak terkendali (abnormal) disebut...",
            pilihan = listOf(  " Infeksi", " Kanker (Neoplasia Maligna)", " Autoimun", " Defisiensi nutrisi", " Penyakit bawaan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kanker (Neoplasia Maligna)",
            pembahasan = "Neoplasia maligna adalah pertumbuhan sel yang menginvasi jaringan sekitar."
        ),
        QuestionEntity(
            idSoal = "MED_13",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Vektor penyakit Malaria adalah...",
            pilihan = listOf(  " Nyamuk Aedes aegypti", " Nyamuk Anopheles", " Lalat tsetse", " Kutu manusia", " Kecoa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Nyamuk Anopheles",
            pembahasan = "Anopheles betina adalah vektor perantara plasmodium penyebab malaria."
        ),
        QuestionEntity(
            idSoal = "MED_14",
            kategori = "TKB",
            subKategori = "Kesehatan-Anatomi",
            pertanyaan = "Pembuluh darah yang membawa darah dari jantung ke seluruh tubuh adalah...",
            pilihan = listOf(  " Vena", " Kapiler", " Arteri", " Venula", " Sinus"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Arteri",
            pembahasan = "Arteri membawa darah kaya oksigen menjauhi jantung (kecuali arteri pulmonalis)."
        ),
        QuestionEntity(
            idSoal = "MED_15",
            kategori = "TKB",
            subKategori = "Kesehatan-Fisiologi",
            pertanyaan = "Fungsi utama sel darah merah (eritrosit) adalah...",
            pilihan = listOf(  " Membekukan darah", " Melawan infeksi", " Mengangkut oksigen ke jaringan", " Menghasilkan hormon", " Mengatur suhu tubuh"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Mengangkut oksigen ke jaringan",
            pembahasan = "Hemoglobin dalam eritrosit mengikat oksigen."
        ),
        QuestionEntity(
            idSoal = "MED_16",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Apa itu 'Pandemi'?",
            pilihan = listOf(  " Wabah terbatas di satu desa", " Wabah yang menyebar luas melampaui batas negara atau benua", " Penyakit genetik", " Penyakit kronis", " Penyakit menular seksual"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Wabah yang menyebar luas melampaui batas negara atau benua",
            pembahasan = "Pandemi adalah skala epidemi yang global."
        ),
        QuestionEntity(
            idSoal = "MED_17",
            kategori = "TKB",
            subKategori = "Kesehatan-Patologi",
            pertanyaan = "Kondisi di mana tubuh kekurangan oksigen pada jaringan disebut...",
            pilihan = listOf(  " Anemia", " Hipoksia", " Iskemik", " Nekrosis", " Sianosis"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Hipoksia",
            pembahasan = "Hipoksia adalah defisiensi oksigen di tingkat seluler."
        ),
        QuestionEntity(
            idSoal = "MED_18",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Transmisi penyakit melalui kontak langsung dengan cairan tubuh disebut...",
            pilihan = listOf(  " Airborne", " Droplet", " Kontak langsung (Direct contact)", " Vektor-borne", " Vehicle-borne"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Kontak langsung (Direct contact)",
            pembahasan = "Bersentuhan atau paparan cairan tubuh adalah cara penularan kontak langsung."
        ),
        QuestionEntity(
            idSoal = "MED_19",
            kategori = "TKB",
            subKategori = "Kesehatan-Anatomi",
            pertanyaan = "Tulang terpanjang dan terkuat dalam tubuh manusia adalah...",
            pilihan = listOf(  " Humerus", " Femur", " Tibia", " Radius", " Sternum"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Femur",
            pembahasan = "Femur adalah tulang paha yang menopang berat badan."
        ),
        QuestionEntity(
            idSoal = "MED_20",
            kategori = "TKB",
            subKategori = "Kesehatan-Fisiologi",
            pertanyaan = "Hormon yang mengatur kadar gula darah adalah...",
            pilihan = listOf(  " Adrenalin", " Insulin", " Tiroksin", " Estrogen", " Kortisol"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Insulin",
            pembahasan = "Insulin diproduksi pankreas untuk menurunkan gula darah."
        ),
        QuestionEntity(
            idSoal = "MED_21",
            kategori = "TKB",
            subKategori = "Kesehatan-Kesehatan Masyarakat",
            pertanyaan = "Tujuan utama program sanitasi lingkungan adalah...",
            pilihan = listOf(  " Menambah populasi nyamuk", " Memutus rantai penularan penyakit berbasis lingkungan", " Membangun gedung tinggi", " Menambah penggunaan pestisida", " Mengganti air bersih dengan air laut"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memutus rantai penularan penyakit berbasis lingkungan",
            pembahasan = "Sanitasi yang baik mengurangi sarang penyakit."
        ),
        QuestionEntity(
            idSoal = "MED_22",
            kategori = "TKB",
            subKategori = "Kesehatan-Patologi",
            pertanyaan = "Apa yang terjadi pada jaringan saat mengalami atrofi?",
            pilihan = listOf(  " Sel menjadi lebih besar", " Sel menjadi lebih kecil/menciut", " Sel berubah bentuk", " Sel mati total", " Sel membelah diri tak terkendali"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sel menjadi lebih kecil/menciut",
            pembahasan = "Atrofi adalah penurunan ukuran sel karena kurangnya stimulasi atau nutrisi."
        ),
        QuestionEntity(
            idSoal = "MED_23",
            kategori = "TKB",
            subKategori = "Kesehatan-Epidemiologi",
            pertanyaan = "Penyakit zoonosis adalah penyakit yang...",
            pilihan = listOf(  " Hanya menyerang manusia", " Hanya menyerang tanaman", " Dapat menular dari hewan ke manusia", " Berasal dari luar angkasa", " Penyakit karena polusi suara"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Dapat menular dari hewan ke manusia",
            pembahasan = "Contoh zoonosis: Rabies, Flu Burung."
        ),
        QuestionEntity(
            idSoal = "MED_24",
            kategori = "TKB",
            subKategori = "Kesehatan-Anatomi",
            pertanyaan = "Otak besar manusia terbagi menjadi dua bagian besar yang disebut...",
            pilihan = listOf(  " Serebelum", " Hemisfer serebri", " Medula oblongata", " Pons", " Hipotalamus"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Hemisfer serebri",
            pembahasan = "Hemisfer kiri dan kanan."
        ),
        QuestionEntity(
            idSoal = "MED_25",
            kategori = "TKB",
            subKategori = "Kesehatan-Fisiologi",
            pertanyaan = "Organ tubuh yang berfungsi sebagai 'filter' racun utama adalah...",
            pilihan = listOf(  " Jantung", " Hati (Liver)", " Paru-paru", " Pankreas", " Usus"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Hati (Liver)",
            pembahasan = "Hati melakukan detoksifikasi darah sebelum dialirkan ke seluruh tubuh."
        ),

        QuestionEntity(
            idSoal = "MED_26",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Obat yang berfungsi untuk meredakan nyeri tanpa menyebabkan hilangnya kesadaran disebut...",
            pilihan = listOf(  " Anestetik", " Analgesik", " Antibiotik", " Antipsikotik", " Antasida"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Analgesik",
            pembahasan = "Analgesik bekerja spesifik pada reseptor nyeri (seperti paracetamol atau ibuprofen)."
        ),
        QuestionEntity(
            idSoal = "MED_27",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Langkah pertama dalam melakukan RJP (Resusitasi Jantung Paru) pada pasien tidak sadar adalah...",
            pilihan = listOf(  " Memberikan napas buatan", " Cek respon dan pastikan keamanan (3A: Aman Diri, Aman Pasien, Aman Lingkungan)", " Memberikan injeksi adrenalin", " Melakukan intubasi", " Memeriksa tekanan darah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Cek respon dan pastikan keamanan (3A: Aman Diri, Aman Pasien, Aman Lingkungan)",
            pembahasan = "Keamanan penolong dan lingkungan adalah prioritas mutlak dalam prosedur dasar hidup."
        ),
        QuestionEntity(
            idSoal = "MED_28",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Antibiotik bekerja dengan cara...",
            pilihan = listOf(  " Membunuh virus secara langsung", " Menghambat pertumbuhan atau membunuh bakteri", " Meningkatkan daya tahan tubuh terhadap jamur", " Mengurangi demam", " Menetralkan asam lambung"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menghambat pertumbuhan atau membunuh bakteri",
            pembahasan = "Antibiotik tidak efektif terhadap virus."
        ),
        QuestionEntity(
            idSoal = "MED_29",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Tujuan dari sterilisasi alat medis adalah...",
            pilihan = listOf(  " Membersihkan debu agar terlihat mengkilap", " Menghilangkan semua bentuk kehidupan mikroorganisme termasuk spora", " Menghilangkan bau tidak sedap", " Memperbaiki fungsi mekanik alat", " Mengganti warna alat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menghilangkan semua bentuk kehidupan mikroorganisme termasuk spora",
            pembahasan = "Sterilisasi adalah standar tertinggi dalam pencegahan infeksi nosokomial."
        ),
        QuestionEntity(
            idSoal = "MED_30",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Apa tindakan yang dilakukan jika menemukan pasien dengan pendarahan hebat?",
            pilihan = listOf(  " Memberikan air minum", " Melakukan penekanan langsung (direct pressure) pada luka", " Dibiarkan sampai berhenti sendiri", " Menunggu dokter datang tanpa tindakan", " Menutup luka dengan plester biasa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melakukan penekanan langsung (direct pressure) pada luka",
            pembahasan = "Tekanan langsung adalah cara paling efektif menghentikan perdarahan eksternal."
        ),
        QuestionEntity(
            idSoal = "MED_31",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Istilah 'Farmakodinamik' merujuk pada...",
            pilihan = listOf(  " Apa yang tubuh lakukan pada obat", " Apa yang obat lakukan pada tubuh", " Cara obat diserap oleh tubuh", " Cara obat dikeluarkan dari tubuh", " Cara obat diracik di laboratorium"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Apa yang obat lakukan pada tubuh",
            pembahasan = "Farmakokinetik adalah apa yang tubuh lakukan pada obat; Farmakodinamik adalah efek obat pada tubuh."
        ),
        QuestionEntity(
            idSoal = "MED_32",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Tanda-tanda klinis syok anafilaktik yang paling fatal adalah...",
            pilihan = listOf(  " Gatal-gatal pada kulit", " Bersin-bersin", " Sumbatan jalan napas (edema laring) dan hipotensi berat", " Demam ringan", " Nyeri perut"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Sumbatan jalan napas (edema laring) dan hipotensi berat",
            pembahasan = "Anafilaksis adalah reaksi alergi berat yang mengancam nyawa karena gagal napas dan sirkulasi."
        ),
        QuestionEntity(
            idSoal = "MED_33",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Apa fungsi utama dari pemberian oksigen pada pasien sesak napas?",
            pilihan = listOf(  " Memberikan rasa nyaman", " Meningkatkan saturasi oksigen darah dan memenuhi kebutuhan jaringan", " Mengurangi rasa nyeri", " Menurunkan tekanan darah", " Mempercepat detak jantung"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Meningkatkan saturasi oksigen darah dan memenuhi kebutuhan jaringan",
            pembahasan = "Oksigenasi diberikan untuk mengatasi hipoksia."
        ),
        QuestionEntity(
            idSoal = "MED_34",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Efek samping umum dari penggunaan antibiotik spektrum luas yang terlalu sering adalah...",
            pilihan = listOf(" Resistensi antibiotik", " Pertumbuhan rambut berlebih", " Peningkatan kecerdasan", " Penurunan berat badan drastis", " Mata menjadi kuning"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Resistensi antibiotik",
            pembahasan = "Penyalahgunaan antibiotik menyebabkan bakteri bermutasi dan kebal terhadap obat."
        ),
        QuestionEntity(
            idSoal = "MED_35",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Apa yang dimaksud dengan 'Triage' di unit gawat darurat?",
            pilihan = listOf(" Proses pendaftaran pasien", " Proses penentuan prioritas penanganan pasien berdasarkan tingkat kegawatannya", " Proses pembayaran administrasi", " Proses pemulangan pasien", " Proses pembedahan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Proses penentuan prioritas penanganan pasien berdasarkan tingkat kegawatannya",
            pembahasan = "Triage (merah, kuning, hijau, hitam) bertujuan menyelamatkan nyawa sebanyak mungkin dengan sumber daya terbatas."
        ),
        QuestionEntity(
            idSoal = "MED_36",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Rute pemberian obat 'Intravena' (IV) memiliki keunggulan...",
            pilihan = listOf(" Mudah dilakukan sendiri", " Efek obat sangat cepat dirasakan (bioavailabilitas 100%)", " Tidak menimbulkan nyeri", " Murah harganya", " Efeknya bertahan sangat lama"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Efek obat sangat cepat dirasakan (bioavailabilitas 100%)",
            pembahasan = "IV langsung masuk ke aliran darah tanpa proses absorpsi di saluran cerna."
        ),
        QuestionEntity(
            idSoal = "MED_37",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Apa fungsi utama dari 'Catheter' urin?",
            pilihan = listOf(" Mengeluarkan feses", " Mengeluarkan urin dari kandung kemih bagi pasien yang tidak mampu berkemih mandiri"," Membersihkan ginjal", " Memberikan nutrisi", " Mengambil sampel darah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengeluarkan urin dari kandung kemih bagi pasien yang tidak mampu berkemih mandiri",
            pembahasan = "Kateterisasi digunakan untuk drainase urin atau pemantauan produksi urin."
        ),
        QuestionEntity(
            idSoal = "MED_38",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Gejala klasik serangan jantung (miokard infark) adalah...",
            pilihan = listOf(" Nyeri dada sebelah kiri seperti tertindih beban berat, menjalar ke lengan/leher", " Gatal di kaki"," Sakit kepala hebat", " Nyeri lutut", " Sesak saat berjalan jauh"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Nyeri dada sebelah kiri seperti tertindih beban berat, menjalar ke lengan/leher",
            pembahasan = "Angina pektoris atau infark miokard ditandai dengan nyeri dada khas (retrosternal)."
        ),
        QuestionEntity(
            idSoal = "MED_39",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Contoh obat Antasida berfungsi untuk...",
            pilihan = listOf(" Menurunkan tekanan darah", " Menetralkan asam lambung yang berlebih"," Mencegah infeksi bakteri", " Mengobati depresi", " Meredakan nyeri sendi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menetralkan asam lambung yang berlebih",
            pembahasan = "Antasida bersifat basa dan menetralkan asam lambung (HCl)."
        ),
        QuestionEntity(
            idSoal = "MED_40",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Apa yang dimaksud dengan 'Asepsis'?",
            pilihan = listOf(" Kondisi yang penuh kuman", " Upaya untuk mencegah masuknya mikroorganisme patogen"," Tindakan operasi besar", " Penggunaan antibiotik dosis tinggi", " Pembersihan ruangan dengan air sabun biasa"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Upaya untuk mencegah masuknya mikroorganisme patogen",
            pembahasan = "Teknik aseptik wajib digunakan dalam prosedur medis untuk mencegah kontaminasi."
        ),
        QuestionEntity(
            idSoal = "MED_41",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Apa yang dilakukan jika pasien mengalami kejang?",
            pilihan = listOf(" Memasukkan benda keras ke mulut", " Memegang tangan pasien dengan kuat agar tidak bergerak"," Melindungi kepala, memiringkan tubuh, dan menjauhkan dari benda berbahaya", " Mengikat pasien ke tempat tidur", " Membentak pasien agar sadar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Melindungi kepala, memiringkan tubuh, dan menjauhkan dari benda berbahaya",
            pembahasan = "Tindakan paling utama adalah mencegah cedera fisik selama kejang berlangsung."
        ),
        QuestionEntity(
            idSoal = "MED_42",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Apa kepanjangan dari 'OTC' dalam obat-obatan?",
            pilihan = listOf(" Over The Counter (Obat bebas)", " On The Care (Obat resep)"," Only To Consume", " Official Treatment Center", " Out To Clinic"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Over The Counter (Obat bebas)",
            pembahasan = "Obat OTC adalah obat yang dapat dibeli tanpa resep dokter."
        ),
        QuestionEntity(
            idSoal = "MED_43",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Bagaimana cara melakukan cuci tangan yang benar sesuai standar WHO?",
            pilihan = listOf(" Cukup dengan air mengalir saja", " Menggunakan sabun dengan 6 langkah selama 20-30 detik"," Cukup menggunakan tisu basah", " Tidak perlu dicuci jika pakai sarung tangan", " Dengan alkohol saja selama 5 detik"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menggunakan sabun dengan 6 langkah selama 20-30 detik",
            pembahasan = "Cuci tangan adalah langkah paling efektif mencegah infeksi silang di RS."
        ),
        QuestionEntity(
            idSoal = "MED_44",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Pada kasus tenggelam, tindakan yang paling utama setelah pasien dievakuasi ke darat adalah...",
            pilihan = listOf(" Memukul punggung pasien", " Mengecek kesadaran dan jalan napas (ABC: Airway, Breathing, Circulation)"," Meminta pasien minum", " Menjemur pasien di bawah matahari", " Langsung dibawa pulang"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Mengecek kesadaran dan jalan napas (ABC: Airway, Breathing, Circulation)",
            pembahasan = "Prioritas utama selalu pada patensi jalan napas dan status pernapasan."
        ),
        QuestionEntity(
            idSoal = "MED_45",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Apa yang dimaksud dengan 'Dosis Letal' (LD50)?",
            pilihan = listOf(" Dosis yang menyembuhkan 50% pasien", " Dosis yang menyebabkan kematian pada 50% populasi subjek uji"," Dosis yang efektif bagi 50% pasien", " Dosis untuk bayi", " Dosis maksimal per hari"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Dosis yang menyebabkan kematian pada 50% populasi subjek uji",
            pembahasan = "LD50 digunakan untuk mengukur toksisitas suatu zat."
        ),
        QuestionEntity(
            idSoal = "MED_46",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Apa fungsi utama dari pemberian kompres hangat pada area tubuh yang bengkak?",
            pilihan = listOf(" Meningkatkan aliran darah untuk mempercepat penyembuhan", " Mencegah bengkak bertambah besar"," Membekukan jaringan", " Menghentikan pendarahan", " Menghilangkan sensasi saraf"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Meningkatkan aliran darah untuk mempercepat penyembuhan",
            pembahasan = "Panas menyebabkan vasodilatasi (pelebaran pembuluh darah)."
        ),
        QuestionEntity(
            idSoal = "MED_47",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Apa itu 'Hipotermia'?",
            pilihan = listOf(" Suhu tubuh di atas 40 derajat Celsius", " Suhu tubuh di bawah 35 derajat Celsius"," Keadaan kekurangan darah", " Keadaan kelebihan cairan", " Suhu tubuh normal"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Suhu tubuh di bawah 35 derajat Celsius",
            pembahasan = "Hipotermia adalah kondisi darurat akibat kehilangan panas tubuh yang ekstrem."
        ),
        QuestionEntity(
            idSoal = "MED_48",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmakologi",
            pertanyaan = "Penggunaan kortikosteroid dalam jangka panjang dapat menyebabkan...",
            pilihan = listOf(" Penurunan berat badan", " Peningkatan daya ingat"," Penekanan sistem imun dan sindrom Cushing", " Peningkatan pertumbuhan rambut", " Penglihatan menjadi lebih tajam"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Penekanan sistem imun dan sindrom Cushing",
            pembahasan = "Kortikosteroid memiliki efek samping sistemik yang serius jika digunakan tanpa pengawasan."
        ),
        QuestionEntity(
            idSoal = "MED_49",
            kategori = "TKB",
            subKategori = "Kesehatan-Prosedur Klinis",
            pertanyaan = "Apa tujuan dari 'Pemasangan Infus'?",
            pilihan = listOf(" Menambah volume darah", " Pemberian cairan, elektrolit, atau obat secara langsung ke sirkulasi darah"," Mengganti sistem pencernaan", " Membersihkan darah", " Mencegah infeksi kulit"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Pemberian cairan, elektrolit, atau obat secara langsung ke sirkulasi darah",
            pembahasan = "Infus (terapi cairan intravena) adalah prosedur standar untuk mengganti cairan tubuh yang hilang."
        ),
        QuestionEntity(
            idSoal = "MED_50",
            kategori = "TKB",
            subKategori = "Kesehatan-Kegawatdaruratan",
            pertanyaan = "Apa langkah jika seseorang mengalami sumbatan jalan napas karena benda asing (Choking)?",
            pilihan = listOf(" Memberikan air minum", " Membiarkan saja", " Melakukan manuver Heimlich", " Meminta pasien tidur", " Menepuk punggung saat pasien sadar penuh"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Melakukan manuver Heimlich",
            pembahasan = "Manuver Heimlich menggunakan tekanan abdominal untuk mengeluarkan benda asing."
        ),

        QuestionEntity(
            idSoal = "MED_51",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit Tuberkulosis (TBC) terutama menyerang organ...",
            pilihan = listOf(" Jantung", " Paru-paru", " Ginjal", " Hati", " Otak"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Paru-paru",
            pembahasan = "TBC paru adalah bentuk paling umum dari infeksi Mycobacterium tuberculosis."
        ),
        QuestionEntity(
            idSoal = "MED_52",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Diabetes Melitus tipe 2 ditandai dengan...",
            pilihan = listOf(" Produksi insulin yang berlebih", " Resistensi insulin dan defisiensi insulin relatif", " Ketiadaan total insulin sejak lahir", " Infeksi bakteri di pankreas", " Kelebihan produksi hormon tiroid"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Resistensi insulin dan defisiensi insulin relatif",
            pembahasan = "Tubuh tidak menggunakan insulin secara efektif (resistensi) seiring berjalannya waktu."
        ),
        QuestionEntity(
            idSoal = "MED_53",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Apa prinsip 'Autonomy' dalam etika medis?",
            pilihan = listOf(" Kewajiban untuk berbuat baik", " Menghormati hak pasien untuk menentukan keputusannya sendiri", " Kewajiban untuk tidak mencelakai", " Bersikap adil kepada semua pasien", " Menjaga rahasia medis"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menghormati hak pasien untuk menentukan keputusannya sendiri",
            pembahasan = "Pasien berhak mendapatkan informasi (Informed Consent) dan memutuskan tindakannya sendiri."
        ),
        QuestionEntity(
            idSoal = "MED_54",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Virus HIV menyerang sistem tubuh bagian...",
            pilihan = listOf(" Sistem Pencernaan", " Sistem Imun (Sel CD4)", " Sistem Saraf Pusat", " Sistem Respirasi", " Sistem Muskuloskeletal"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sistem Imun (Sel CD4)",
            pembahasan = "HIV merusak sel darah putih (limfosit T helper/CD4) yang menjaga kekebalan."
        ),
        QuestionEntity(
            idSoal = "MED_55",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Faktor risiko utama Hipertensi adalah...",
            pilihan = listOf(" Konsumsi garam berlebih, obesitas, dan kurang aktivitas", " Kurang konsumsi gula", " Sering terpapar sinar matahari", " Sering berolahraga berat", " Minum air putih yang banyak"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Konsumsi garam berlebih, obesitas, dan kurang aktivitas",
            pembahasan = "Gaya hidup sedentari dan pola makan tinggi natrium adalah pemicu utama."
        ),
        QuestionEntity(
            idSoal = "MED_56",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Apa yang dimaksud dengan 'Non-Maleficence'?",
            pilihan = listOf(" Melakukan tindakan medis sebanyak mungkin", " Kewajiban untuk tidak merugikan atau mencelakai pasien", " Mengutamakan kenyamanan petugas medis", " Menghindari pasien yang sulit", " Memberikan semua obat yang tersedia"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kewajiban untuk tidak merugikan atau mencelakai pasien",
            pembahasan = "First, do no harm (Primum non nocere)."
        ),
        QuestionEntity(
            idSoal = "MED_57",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit Demam Berdarah Dengue (DBD) disebabkan oleh...",
            pilihan = listOf(" Bakteri", " Parasit", " Virus Dengue", " Jamur", " Racun serangga"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Virus Dengue",
            pembahasan = "Virus Dengue ditularkan melalui gigitan nyamuk Aedes aegypti."
        ),
        QuestionEntity(
            idSoal = "MED_58",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Apa yang dimaksud dengan Stroke?",
            pilihan = listOf(" Gangguan fungsi otak akibat terganggunya aliran darah ke otak", " Penyakit paru-paru kronis", " Peradangan pada sendi", " Kelainan tulang belakang", " Gangguan pada pendengaran"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Gangguan fungsi otak akibat terganggunya aliran darah ke otak",
            pembahasan = "Bisa berupa sumbatan (iskemik) atau pecahnya pembuluh darah (hemoragik)."
        ),
        QuestionEntity(
            idSoal = "MED_59",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Kewajiban menjaga rahasia pasien disebut...",
            pilihan = listOf(" Anonimitas", " Konfidensialitas", " Integritas", " Akuntabilitas", " Empati"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Konfidensialitas",
            pembahasan = "Dokter/tenaga medis wajib menjaga data medis pasien sebagai hak privasi."
        ),
        QuestionEntity(
            idSoal = "MED_60",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit Menular Seksual (PMS) yang disebabkan oleh bakteri Treponema pallidum adalah...",
            pilihan = listOf(" Gonore", " Sifilis", " HIV", " Herpes", " Hepatitis B"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sifilis",
            pembahasan = "Sifilis dikenal dengan istilah 'raja singa' yang disebabkan Treponema pallidum."
        ),
        QuestionEntity(
            idSoal = "MED_61",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Gejala khas pada penyakit Asma adalah...",
            pilihan = listOf(" Nyeri hebat di perut", " Sesak napas dan mengi (wheezing) akibat penyempitan saluran napas", " Demam tinggi", " Pendarahan pada gusi", " Pembengkakan kaki"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sesak napas dan mengi (wheezing) akibat penyempitan saluran napas",
            pembahasan = "Asma adalah inflamasi kronis saluran napas yang bersifat reversibel."
        ),
        QuestionEntity(
            idSoal = "MED_62",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Prinsip 'Beneficence' berarti tenaga medis harus...",
            pilihan = listOf(" Mengutamakan kepentingan pasien dan bertindak untuk kebaikan pasien", " Mengikuti semua kemauan keluarga pasien", " Memilih pasien yang kaya saja", " Bekerja sesingkat mungkin", " Menyerahkan keputusan kepada orang lain"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Mengutamakan kepentingan pasien dan bertindak untuk kebaikan pasien",
            pembahasan = "Tindakan medis harus memberikan manfaat bagi kesehatan pasien."
        ),
        QuestionEntity(
            idSoal = "MED_63",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Apa pencegahan terbaik untuk penyakit Hepatitis B?",
            pilihan = listOf(" Minum antibiotik rutin", " Vaksinasi Hepatitis B", " Menghindari makan daging", " Berjemur tiap pagi", " Tidur yang cukup"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Vaksinasi Hepatitis B",
            pembahasan = "Vaksinasi adalah proteksi utama melawan infeksi virus Hepatitis B."
        ),
        QuestionEntity(
            idSoal = "MED_64",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Apa yang terjadi pada penyakit Gout (Asam Urat)?",
            pilihan = listOf(" Penumpukan kristal asam urat pada sendi", " Penurunan kalsium pada tulang", " Infeksi jamur pada kulit", " Kerusakan saraf mata", " Kelainan pembekuan darah"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Penumpukan kristal asam urat pada sendi",
            pembahasan = "Kristal urat menyebabkan peradangan akut dan nyeri hebat pada sendi."
        ),
        QuestionEntity(
            idSoal = "MED_65",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Tindakan medis yang dilakukan tanpa persetujuan pasien atau keluarga (kecuali darurat) dapat melanggar...",
            pilihan = listOf(" Kode Etik dan hukum tentang Informed Consent", " SOP rumah sakit", " Peraturan pemerintah", " Kebijakan direktur", " Prosedur administrasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Kode Etik dan hukum tentang Informed Consent",
            pembahasan = "Hak pasien untuk menyetujui tindakan adalah mutlak sesuai etika dan hukum."
        ),
        QuestionEntity(
            idSoal = "MED_66",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit Malaria ditularkan melalui gigitan nyamuk Anopheles. Apa penyebab Malaria?",
            pilihan = listOf(" Virus", " Bakteri", " Protozoa (Plasmodium)", " Jamur", " Cacing"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Protozoa (Plasmodium)",
            pembahasan = "Plasmodium adalah parasit bersel satu (protozoa)."
        ),
        QuestionEntity(
            idSoal = "MED_67",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Apa itu 'Obesitas'?",
            pilihan = listOf(" Kondisi berat badan kurang dari normal", " Penumpukan lemak tubuh yang berlebihan sehingga mengganggu kesehatan", " Pertumbuhan tinggi badan yang cepat", " Kurangnya asupan protein", " Penyakit kulit kronis"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Penumpukan lemak tubuh yang berlebihan sehingga mengganggu kesehatan",
            pembahasan = "Dihitung berdasarkan indeks massa tubuh (IMT)."
        ),
        QuestionEntity(
            idSoal = "MED_68",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Jika dokter memiliki hubungan keluarga dekat dengan pasien, dalam etika medis disarankan untuk...",
            pilihan = listOf(" Tetap merawat pasien tersebut", " Menghindari menjadi dokter penanggung jawab untuk menjaga objektivitas", " Memberikan diskon khusus", " Melakukan tindakan tanpa rekam medis", " Meminta perawat saja yang menangani"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menghindari menjadi dokter penanggung jawab untuk menjaga objektivitas",
            pembahasan = "Untuk menjaga objektivitas dan profesionalisme, disarankan menghindari konflik kepentingan."
        ),
        QuestionEntity(
            idSoal = "MED_69",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit menular yang memiliki gejala bercak putih pada kulit dan mati rasa (baal) adalah...",
            pilihan = listOf(" Psoriasis", " Kusta (Lepra)", " Eksim", " Jerawat", " Alergi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Kusta (Lepra)",
            pembahasan = "Lepra menyerang saraf tepi dan kulit."
        ),
        QuestionEntity(
            idSoal = "MED_70",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Penyakit Jantung Koroner disebabkan oleh...",
            pilihan = listOf(" Penyempitan arteri koroner akibat penumpukan plak (aterosklerosis)", " Infeksi kuman di jantung", " Kelemahan otot jantung bawaan", " Kekurangan vitamin C", " Terlalu banyak minum kopi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Penyempitan arteri koroner akibat penumpukan plak (aterosklerosis)",
            pembahasan = "Plak kolesterol menghambat aliran darah ke otot jantung."
        ),
        QuestionEntity(
            idSoal = "MED_71",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Prinsip 'Justice' dalam etik medis adalah...",
            pilihan = listOf(" Bertindak adil dalam distribusi sumber daya medis", " Memilih pasien yang bisa membayar", " Selalu mendahulukan atasan", " Mempercepat prosedur karena alasan pribadi", " Menyembunyikan diagnosis pasien"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Bertindak adil dalam distribusi sumber daya medis",
            pembahasan = "Keadilan berarti memberikan layanan tanpa diskriminasi."
        ),
        QuestionEntity(
            idSoal = "MED_72",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Cara terbaik untuk mencegah penularan penyakit saluran pernapasan (seperti Influenza) adalah...",
            pilihan = listOf(" Menutup mulut saat batuk dan mencuci tangan", " Menghindari mandi", " Menutup pintu rapat-rapat", " Minum air es", " Tidur di lantai"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Menutup mulut saat batuk dan mencuci tangan",
            pembahasan = "Etika batuk dan kebersihan tangan adalah protokol standar pencegahan droplet."
        ),
        QuestionEntity(
            idSoal = "MED_73",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Tidak Menular",
            pertanyaan = "Apa penyebab utama penyakit Osteoporosis?",
            pilihan = listOf(" Infeksi bakteri pada tulang", " Berkurangnya kepadatan massa tulang", " Kelebihan kalsium dalam tubuh", " Pertumbuhan tulang yang berlebih", " Sering memakai sepatu hak tinggi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Berkurangnya kepadatan massa tulang",
            pembahasan = "Osteoporosis sering terjadi pada lansia akibat penurunan kadar hormon dan penyerapan kalsium."
        ),
        QuestionEntity(
            idSoal = "MED_74",
            kategori = "TKB",
            subKategori = "Kesehatan-Etika Medis",
            pertanyaan = "Apa yang harus dilakukan jika melihat rekan sejawat melakukan malpraktik?",
            pilihan = listOf(" Mendiamkannya agar tidak ada masalah", " Melaporkannya melalui mekanisme yang benar (misal: Komite Etik)", " Menyebarkannya ke media sosial", " Mengancam rekan tersebut", " Meminta bagian dari keuntungan rekan tersebut"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Melaporkannya melalui mekanisme yang benar (misal: Komite Etik)",
            pembahasan = "Integritas profesi menuntut tindakan korektif melalui jalur resmi."
        ),
        QuestionEntity(
            idSoal = "MED_75",
            kategori = "TKB",
            subKategori = "Kesehatan-Penyakit Menular",
            pertanyaan = "Penyakit Hepatitis A biasanya menular melalui...",
            pilihan = listOf(" Gigitan nyamuk", " Makanan atau minuman yang terkontaminasi feses (Fecal-Oral)", " Kontak udara", " Luka terbuka", " Keringat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Makanan atau minuman yang terkontaminasi feses (Fecal-Oral)",
            pembahasan = "Hepatitis A erat kaitannya dengan kebersihan sanitasi makanan."
        ),

        QuestionEntity(
            idSoal = "MED_76",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa fungsi utama dari Rekam Medis (Medical Record)?",
            pilihan = listOf(" Sebagai arsip dokumen agar kantor terlihat penuh", " Sebagai bukti tertulis pelayanan kesehatan yang diberikan (legalitas dan informasi klinis)", " Sebagai koleksi pribadi dokter", " Sebagai syarat kenaikan pangkat", " Sebagai pajangan di ruang administrasi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Sebagai bukti tertulis pelayanan kesehatan yang diberikan (legalitas dan informasi klinis)",
            pembahasan = "Rekam medis adalah dokumen hukum dan basis data klinis yang krusial."
        ),
        QuestionEntity(
            idSoal = "MED_77",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa yang dimaksud dengan 'Dosis Maksimum'?",
            pilihan = listOf(" Dosis terkecil yang memberikan efek", " Dosis tertinggi yang masih aman diberikan kepada pasien dalam sekali pemberian atau sehari", " Dosis yang selalu diberikan pada anak-anak", " Dosis yang tidak memiliki efek samping", " Dosis yang harus dihabiskan dalam sebulan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Dosis tertinggi yang masih aman diberikan kepada pasien dalam sekali pemberian atau sehari",
            pembahasan = "Melampaui dosis maksimum berisiko menimbulkan toksisitas."
        ),
        QuestionEntity(
            idSoal = "MED_78",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa itu 'Infeksi Nosokomial'?",
            pilihan = listOf(" Penyakit yang dibawa pasien dari rumah", " Infeksi yang didapat pasien selama masa perawatan di rumah sakit", " Penyakit genetik", " Penyakit akibat kecelakaan kerja", " Penyakit yang menular melalui udara luar RS"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Infeksi yang didapat pasien selama masa perawatan di rumah sakit",
            pembahasan = "Pencegahan infeksi nosokomial adalah indikator utama mutu layanan RS."
        ),
        QuestionEntity(
            idSoal = "MED_79",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Pasien datang dengan luka bakar akibat air panas, langkah awal yang tepat adalah...",
            pilihan = listOf(" Mengoleskan pasta gigi", " Mengoleskan mentega", " Mengalirkan air dingin (bukan es) pada area luka selama 10-20 menit", " Memecahkan gelembung luka", " Membalut dengan kain kotor"),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Mengalirkan air dingin (bukan es) pada area luka selama 10-20 menit",
            pembahasan = "Pendinginan cepat menghentikan proses perambatan panas pada jaringan."
        ),
        QuestionEntity(
            idSoal = "MED_80",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa fungsi dari sistem 'FIFO' di instalasi farmasi?",
            pilihan = listOf(" First In, First Out (barang yang pertama datang, pertama keluar)", " Fast In, Fast Out", " Fine In, Fine Out", " First In, Follow Out", " Fit In, Fit Out"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. First In, First Out (barang yang pertama datang, pertama keluar)",
            pembahasan = "FIFO memastikan rotasi stok untuk mencegah obat kedaluwarsa."
        ),
        QuestionEntity(
            idSoal = "MED_81",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa itu 'Informed Consent'?",
            pilihan = listOf(" Formulir pendaftaran", " Persetujuan tindakan medis setelah pasien mendapat penjelasan yang memadai", " Surat keterangan sakit", " Tagihan pembayaran RS", " Daftar riwayat hidup pasien"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Persetujuan tindakan medis setelah pasien mendapat penjelasan yang memadai",
            pembahasan = "Informed consent adalah bukti nyata penghormatan atas otonomi pasien."
        ),
        QuestionEntity(
            idSoal = "MED_82",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Pada pasien dengan patah tulang terbuka, prioritas utama adalah...",
            pilihan = listOf(" Memasang gips", " Menghentikan perdarahan dan mencegah infeksi/syok", " Menunggu tulang menyambung sendiri", " Memijat area patah", " Mengabaikannya"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menghentikan perdarahan dan mencegah infeksi/syok",
            pembahasan = "Stabilitas sirkulasi dan pencegahan infeksi adalah prioritas sebelum reduksi tulang."
        ),
        QuestionEntity(
            idSoal = "MED_83",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa yang dimaksud dengan efek 'Placebo'?",
            pilihan = listOf(" Obat yang sangat mahal", " Zat inert (tidak memiliki efek farmakologis) yang diberikan seolah-olah sebagai obat", " Obat untuk sakit kepala", " Obat racikan", " Alat kesehatan"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Zat inert (tidak memiliki efek farmakologis) yang diberikan seolah-olah sebagai obat",
            pembahasan = "Placebo sering digunakan dalam uji klinis untuk membandingkan efektivitas obat asli."
        ),
        QuestionEntity(
            idSoal = "MED_84",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Indikator efisiensi tempat tidur di RS disebut...",
            pilihan = listOf(" BOR (Bed Occupancy Rate)", " LOS (Length of Stay)", " TOI (Turn Over Interval)", " BTO (Bed Turn Over)", " Semua jawaban benar"),
            tipeScoring = "STANDAR",
            jawabanBenar = "E. Semua jawaban benar",
            pembahasan = "Semua parameter tersebut digunakan untuk mengukur kinerja manajemen RS."
        ),
        QuestionEntity(
            idSoal = "MED_85",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Tindakan pertama jika pasien tersedak dan masih sadar adalah...",
            pilihan = listOf(" Memberi minum air sebanyak-banyaknya", " Memberikan pukulan di punggung (back blows) atau manuver Heimlich", " Membiarkannya batuk sendiri", " Memberi napas buatan", " Meminta pasien tidur"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memberikan pukulan di punggung (back blows) atau manuver Heimlich",
            pembahasan = "Bantuan fisik diperlukan jika batuk tidak efektif mengeluarkan benda asing."
        ),
        QuestionEntity(
            idSoal = "MED_86",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa kegunaan dari etiket berwarna biru pada obat?",
            pilihan = listOf(" Untuk obat luar (pemakaian luar)", " Untuk obat dalam (diminum)", " Untuk obat keras", " Untuk obat herbal", " Untuk obat injeksi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Untuk obat luar (pemakaian luar)",
            pembahasan = "Putih untuk obat dalam (oral), biru untuk obat luar."
        ),
        QuestionEntity(
            idSoal = "MED_87",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa tugas dari komite medik di rumah sakit?",
            pilihan = listOf(" Menjaga standar profesionalisme dan mutu profesi medis", " Mengatur kantin RS", " Mengurus kebersihan taman", " Memperbaiki lift RS", " Menjaga parkiran"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Menjaga standar profesionalisme dan mutu profesi medis",
            pembahasan = "Komite medik bertanggung jawab pada kredensialing dan etika dokter."
        ),
        QuestionEntity(
            idSoal = "MED_88",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Apa yang harus dilakukan jika ditemukan pasien tidak sadar dan tidak bernapas?",
            pilihan = listOf(" Segera mencari bantuan medis dan mulai RJP (Resusitasi Jantung Paru)", " Membiarkan saja", " Berteriak meminta tolong tanpa tindakan", " Memberi minum", " Mengukur tekanan darah dulu"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Segera mencari bantuan medis dan mulai RJP (Resusitasi Jantung Paru)",
            pembahasan = "Respon cepat adalah kunci dalam henti jantung (cardiac arrest)."
        ),
        QuestionEntity(
            idSoal = "MED_89",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa itu 'Interaksi Obat'?",
            pilihan = listOf(" Obat yang diminum bersamaan yang saling mempengaruhi efektivitas atau toksisitasnya", " Obat yang diminum dengan air", " Obat yang rasanya enak", " Obat yang mahal", " Obat yang diresepkan dokter"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Obat yang diminum bersamaan yang saling mempengaruhi efektivitas atau toksisitasnya",
            pembahasan = "Interaksi obat bisa menguntungkan (sinergis) atau merugikan (antagonis/toksik)."
        ),
        QuestionEntity(
            idSoal = "MED_90",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa yang dimaksud dengan 'Hospital Bye-Laws'?",
            pilihan = listOf(" Peraturan internal rumah sakit", " Daftar harga obat", " Menu makanan pasien", " Jadwal shift karyawan", " Nama dokter"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Peraturan internal rumah sakit",
            pembahasan = "Hospital Bye-Laws mengatur tata kelola klinis dan manajerial RS."
        ),
        QuestionEntity(
            idSoal = "MED_91",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Bagaimana cara menangani pasien yang pingsan karena dehidrasi?",
            pilihan = listOf(" Membiarkan pasien berdiri", " Memosisikan pasien berbaring, kaki ditinggikan, dan beri minum jika sadar", " Memaksa pasien jalan", " Meninggalkan pasien sendiri", " Memberi kopi"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memosisikan pasien berbaring, kaki ditinggikan, dan beri minum jika sadar",
            pembahasan = "Posisi trendelenburg (kaki lebih tinggi) membantu aliran darah ke otak."
        ),
        QuestionEntity(
            idSoal = "MED_92",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa arti simbol lingkaran merah dengan huruf 'K' di kemasan obat?",
            pilihan = listOf(" Obat Bebas", " Obat Keras", " Obat Herbal", " Obat Narkotika", " Obat Psikotropika"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Obat Keras",
            pembahasan = "Obat keras hanya bisa didapat dengan resep dokter."
        ),
        QuestionEntity(
            idSoal = "MED_93",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa itu 'Safety Patient' (Keselamatan Pasien)?",
            pilihan = listOf(" Sistem yang mencegah terjadinya cedera akibat kesalahan pelayanan medis", " Sistem keamanan CCTV", " Sistem parkir RS", " Sistem penggajian", " Sistem pengadaan barang"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Sistem yang mencegah terjadinya cedera akibat kesalahan pelayanan medis",
            pembahasan = "Tujuannya adalah menciptakan budaya keselamatan (no harm)."
        ),
        QuestionEntity(
            idSoal = "MED_94",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Gejala pasien keracunan makanan biasanya meliputi...",
            pilihan = listOf(" Mual, muntah, diare, dan nyeri perut", " Rambut rontok", " Telinga berdenging", " Mata merah", " Jari tangan kaku"),
            tipeScoring = "STANDAR",
            jawabanBenar = " Mual, muntah, diare, dan nyeri perut",
            pembahasan = "Gejala gastrointestinal adalah respon tubuh membuang racun."
        ),
        QuestionEntity(
            idSoal = "MED_95",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa tujuan dari 'Pencampuran obat (Compounding)'?",
            pilihan = listOf(" Agar obat lebih murah", " Menyesuaikan dosis/sediaan untuk kebutuhan khusus pasien", " Mengganti warna obat", " Menambah volume cairan", " Menambah rasa manis"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Menyesuaikan dosis/sediaan untuk kebutuhan khusus pasien",
            pembahasan = "Terutama penting untuk pasien anak atau geriatri yang memerlukan dosis presisi."
        ),
        QuestionEntity(
            idSoal = "MED_96",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Fungsi dari Instalasi Gawat Darurat (IGD) adalah...",
            pilihan = listOf(" Memberikan pelayanan medis segera pada pasien gawat darurat", " Tempat istirahat perawat", " Tempat menyimpan arsip", " Tempat rapat direksi", " Ruang tunggu keluarga"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Memberikan pelayanan medis segera pada pasien gawat darurat",
            pembahasan = "IGD adalah gerbang utama pelayanan 24 jam untuk kondisi kritis."
        ),
        QuestionEntity(
            idSoal = "MED_97",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Jika pasien mengeluh sakit kepala sangat hebat yang belum pernah dirasakan sebelumnya (Thunderclap headache), tindakan yang tepat adalah...",
            pilihan = listOf(" Menyuruh pasien tidur", " Segera bawa ke IGD karena curiga perdarahan otak/stroke", " Memberi aspirin", " Mengabaikannya", " Memberi minum teh"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Segera bawa ke IGD karena curiga perdarahan otak/stroke",
            pembahasan = "Sakit kepala mendadak dan hebat adalah tanda bahaya (red flag) yang membutuhkan evaluasi segera."
        ),
        QuestionEntity(
            idSoal = "MED_98",
            kategori = "TKB",
            subKategori = "Kesehatan-Farmasi Klinis",
            pertanyaan = "Apa fungsi dari 'Monitoring Efek Samping Obat' (MESO)?",
            pilihan = listOf(" Mencegah, mendeteksi, dan menilai efek samping obat", " Menambah harga obat", " Mengganti dokter", " Menambah beban pasien", " Mengurangi produksi obat"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Mencegah, mendeteksi, dan menilai efek samping obat",
            pembahasan = "MESO penting untuk keamanan penggunaan obat jangka panjang."
        ),
        QuestionEntity(
            idSoal = "MED_99",
            kategori = "TKB",
            subKategori = "Kesehatan-Manajemen RS",
            pertanyaan = "Apa yang dimaksud dengan 'Akreditasi Rumah Sakit'?",
            pilihan = listOf(" Pengakuan resmi atas standar mutu pelayanan rumah sakit", " Pendaftaran pegawai baru", " Pembelian alat baru", " Perbaikan gedung", " Pengecatan ulang"),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Pengakuan resmi atas standar mutu pelayanan rumah sakit",
            pembahasan = "Akreditasi menjamin standar layanan berfokus pada keselamatan pasien."
        ),
        QuestionEntity(
            idSoal = "MED_100",
            kategori = "TKB",
            subKategori = "Kesehatan-Simulasi Kasus",
            pertanyaan = "Jika perawat menyadari ada kesalahan dosis obat yang telah diberikan ke pasien, tindakan yang paling etis adalah...",
            pilihan = listOf(" Menunggu apakah pasien bereaksi buruk", " Segera melaporkan ke atasan/dokter untuk tindakan koreksi dan memonitor pasien", " Berpura-pura tidak terjadi apa-apa", " Menghapus rekam medis", " Mengancam pasien agar diam"),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Segera melaporkan ke atasan/dokter untuk tindakan koreksi dan memonitor pasien",
            pembahasan = "Kejujuran (disclosure) dan tindakan cepat untuk keselamatan pasien adalah wajib."
        )
    )
}