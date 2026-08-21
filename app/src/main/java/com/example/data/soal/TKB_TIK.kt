package com.example.data.soal // Sesuaikan nama package Anda
import com.example.data.model.QuestionEntity

object SoalTIK {
    val daftarSoal = listOf(
        QuestionEntity(
            idSoal = "TKB_tik_01",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Di dalam model OSI (Open Systems Interconnection), proses enkripsi dan kompresi data terjadi pada layer...",
            pilihan = listOf(
                "Application Layer",
                "Presentation Layer",
               "Session Layer",
                "Transport Layer",
                "Network Layer"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Presentation Layer",
            skalaPoin = null,
            pembahasan = "Presentation Layer bertanggung jawab untuk menyajikan data ke Application Layer, termasuk melakukan fungsi enkripsi/dekripsi, kompresi/dekompresi, dan translasi format data (seperti ASCII ke EBCDIC)."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_02",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Protokol routing yang termasuk dalam kategori Link-State Routing Protocol dan menggunakan algoritma Dijkstra untuk menentukan rute terpendek adalah...",
            pilihan = listOf(
                "RIP (Routing Information Protocol)",
                "EIGRP (Enhanced Interior Gateway Routing Protocol)",
                "OSPF (Open Shortest Path First)",
                "BGP (Border Gateway Protocol)",
                "IS-IS (Intermediate System to Intermediate System)"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. OSPF (Open Shortest Path First)",
            skalaPoin = null,
            pembahasan = "OSPF adalah contoh protokol routing Link-State yang membangun peta topologi jaringannya sendiri dan menggunakan algoritma Shortest Path First (SPF) atau Dijkstra untuk menghitung jalur terbaik."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_03",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Sebuah network administrator ingin membagi segmen jaringan dengan IP Address 192.168.1.0/26. Berapakah jumlah host valid maksimal yang dapat digunakan pada setiap subnet?",
            pilihan = listOf(
                "30 host",
                "32 host",
                "62 host",
                "64 host",
                "126 host"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. 62 host",
            skalaPoin = null,
            pembahasan = "Prefiks /26 memiliki subnet mask 255.255.255.192. Jumlah total IP per subnet adalah $2^{(32-26)} = 2^6 = 64$. Jumlah host valid dikurangi 2 (Network Address dan Broadcast Address), sehingga $64 - 2 = 62$ host."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_04",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Jenis serangan siber yang memanipulasi entri cache pada DNS server lokal agar pengguna diarahkan ke situs web palsu (malicious) disebut...",
            pilihan = listOf(
                "DNS Spoofing / Poisoning",
                "DDoS Attack",
                "Man-in-the-Middle Attack",
                "SQL Injection",
                "Phishing"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. DNS Spoofing / Poisoning",
            skalaPoin = null,
            pembahasan = "DNS Poisoning terjadi saat penyerang memasukkan data identitas palsu ke dalam cache DNS, sehingga permintaan URL yang valid akan diarahkan ke IP Address palsu milik penyerang."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_05",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Dalam arsitektur sistem keamanan jaringan komputer, teknologi firewall yang bekerja dengan cara memeriksa riwayat koneksi aktif dan status paket data yang lewat dinamakan...",
            pilihan = listOf(
                "Packet Filtering Firewall",
                "Circuit-Level Gateway",
                "Application Gateway (Proxy)",
                "Stateful Inspection Firewall",
                "Next-Generation Firewall"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. Stateful Inspection Firewall",
            skalaPoin = null,
            pembahasan = "Stateful Inspection Firewall melacak status koneksi yang melewatinya (seperti TCP handshake) dan memastikan paket data yang masuk merupakan bagian dari koneksi yang sah dan sudah diinisiasi sebelumnya."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_06",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Manakah di bawah ini yang merupakan port default dan jenis protokol transport yang digunakan oleh layanan Secure Shell (SSH)?",
            pilihan = listOf(
                "Port 21 / UDP",
                "Port 22 / TCP",
                "Port 23 / TCP",
                "Port 25 / UDP",
                "Port 443 / TCP"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Port 22 / TCP",
            skalaPoin = null,
            pembahasan = "SSH menggunakan port default 22 dan mengandalkan protokol TCP pada Transport Layer untuk memastikan pengiriman data remote terminal yang andal (reliable) dan terenkripsi."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_07",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Metode autentikasi yang memanfaatkan kriptografi asimetris di mana pengguna menyimpan kunci privat lokal dan server menyimpan kunci publik terdaftar disebut...",
            pilihan = listOf(
                "Username & Password",
                "Biometric Authentication",
                "SSH Key-Based Authentication",
                "OAuth 2.0 Token",
                "MAC Address Filtering"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. SSH Key-Based Authentication",
            skalaPoin = null,
            pembahasan = "Autentikasi berbasis kunci (Key-Based) menggunakan sepasang kunci kriptografi (public dan private key). Server memverifikasi kecocokan digital signature yang dibuat oleh private key milik user."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_08",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Teknologi routing IPv6 menggunakan mekanisme khusus untuk memetakan IPv6 Address ke MAC Address lokal sebagai pengganti protokol ARP pada IPv4. Protokol ini disebut...",
            pilihan = listOf(
                "ICMPv6 Neighbor Discovery Protocol (NDP)",
                "DHCPv6 Static Binding",
                "Anycast Resolution Protocol",
                "Link-Local Address Mapping",
                "NAT64 Protocol"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. ICMPv6 Neighbor Discovery Protocol (NDP)",
            skalaPoin = null,
            pembahasan = "Pada IPv6, fungsionalitas ARP digantikan oleh Neighbor Discovery Protocol (NDP) yang memanfaatkan pesan ICMPv6 (Neighbor Solicitation dan Neighbor Advertisement) untuk menemukan alamat link-layer tetangga."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_09",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Di dalam konsep CIA Triad keamanan informasi, teknik implementasi digital signature (tanda tangan digital) utamanya bertujuan untuk menjamin aspek...",
            pilihan = listOf(
                "Confidentiality dan Availability",
                "Integrity dan Non-Repudiation (Nir-penyangkalan)",
                "Availability dan Scalability",
                "Confidentiality dan Privasi",
                "Accountability dan Redundansi"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Integrity dan Non-Repudiation (Nir-penyangkalan)",
            skalaPoin = null,
            pembahasan = "Digital Signature menjamin bahwa isi pesan tidak mengalami modifikasi di tengah jalan (Integrity) dan memastikan pengirim tidak dapat menyangkal bahwa dialah yang mengirim dokumen tersebut (Non-Repudiation)."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_10",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Perangkat jaringan yang bekerja pada Layer 2 (Data Link) model OSI dan berfungsi membagi domain tabrakan (collision domain) per port namun tetap berada dalam satu broadcast domain adalah...",
            pilihan = listOf(
                "Hub",
                "Repeater",
                "Switch",
                "Router",
                "Gateway"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. Switch",
            skalaPoin = null,
            pembahasan = "Switch mengisolasi collision domain pada setiap port-nya menggunakan tabel MAC Address. Namun, secara default, seluruh port pada switch unmanaged tetap berada dalam satu Broadcast Domain yang sama."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_11",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Tipe rekaman DNS (DNS Record Type) yang berfungsi untuk memetakan sebuah nama domain ke alamat IPv6 (128-bit) dinamakan...",
            pilihan = listOf(
                "A Record",
                "AAAA Record",
                "CNAME Record",
                "MX Record",
                "PTR Record"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. AAAA Record",
            skalaPoin = null,
            pembahasan = "Record 'A' memetakan domain ke IPv4, sedangkan Record 'AAAA' (Quad-A) digunakan khusus untuk memetakan nama host/domain ke alamat IPv6."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_12",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Dalam arsitektur TLS/SSL, proses negosiasi parameter keamanan, algoritma enkripsi (cipher suite), dan pertukaran kunci antara client dan server dinamakan fase...",
            pilihan = listOf(
                "TLS Record Phase",
                "TLS Handshake Phase",
                "Key Streaming Phase",
                "Session Layer Binding",
                "Certificate Authority Validation"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. TLS Handshake Phase",
            skalaPoin = null,
            pembahasan = "Fase TLS Handshake terjadi sebelum transmisi data aplikasi dimulai. Di fase ini, client dan server menyepakati versi protokol, cipher suite, dan melakukan autentikasi sertifikat digital."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_13",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Metode enkripsi simetris modern yang menggunakan ukuran blok data 128-bit dan panjang kunci pilihan 128, 192, atau 256-bit, serta menjadi standar global saat ini adalah...",
            pilihan = listOf(
                "DES (Data Encryption Standard)",
                "3DES",
                "RSA",
                "AES (Advanced Encryption Standard)",
                "Blowfish"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. AES (Advanced Encryption Standard)",
            skalaPoin = null,
            pembahasan = "AES adalah standar enkripsi simetris berbasis algoritma Rijndael yang diadopsi oleh pemerintah AS untuk menggantikan DES yang sudah usang dan rentan dibongkar."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_14",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Sebuah teknik virtualisasi jaringan yang memungkinkan pembuatan beberapa jaringan broadcast lokal virtual yang terisolasi secara logika dalam satu infrastruktur switch fisik yang sama disebut...",
            pilihan = listOf(
                "VPN (Virtual Private Network)",
                "VLAN (Virtual Local Area Network)",
                "NAT (Network Address Translation)",
                "WAN Optimization",
                "Software-Defined Networking"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. VLAN (Virtual Local Area Network)",
            skalaPoin = null,
            pembahasan = "VLAN bekerja pada OSI Layer 2 untuk mengelompokkan host secara logis meskipun terhubung ke switch fisik yang sama, sehingga domain broadcast terisolasi demi keamanan dan efisiensi."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_15",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Dalam protokol TCP, proses penutupan koneksi secara normal dan dua arah melibatkan pertukaran paket flag kontrol dengan urutan...",
            pilihan = listOf(
                "SYN - SYN-ACK - ACK",
                "FIN - ACK - FIN - ACK",
                "RST - RST-ACK - FIN",
                "PUSH - ACK - PUSH - ACK",
                "FIN - SYN - FIN - ACK"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. FIN - ACK - FIN - ACK",
            skalaPoin = null,
            pembahasan = "Proses pemutusan koneksi TCP menggunakan pola 4-Way Handshake: Pihak A mengirim FIN, Pihak B membalas ACK, kemudian Pihak B mengirim FIN miliknya sendiri, dan diakhiri ACK dari Pihak A."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_16",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Pada jaringan nirkabel (Wireless), standar keamanan enkripsi Wi-Fi yang menggunakan protokol barunya GCMP-256 dan Simultaneous Authentication of Equals (SAE) untuk menangkal serangan kamus adalah...",
            pilihan = listOf(
                "WEP",
                "WPA",
                "WPA2-PSK",
                "WPA3",
                "IEEE 802.1X"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. WPA3",
            skalaPoin = null,
            pembahasan = "WPA3 memperkenalkan fitur SAE (Simultaneous Authentication of Equals) sebagai pengganti PSK pada WPA2, guna memberikan proteksi yang lebih kuat terhadap serangan brute force offline."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_17",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Alat baris perintah (CLI) pada sistem operasi Linux/Windows yang digunakan untuk mendeteksi rute lompatan (hop) dan mengukur latensi jalur paket menuju host tujuan adalah...",
            pilihan = listOf(
                "ping / nslookup",
                "traceroute / tracert",
                "netstat / ipconfig",
                "nmap / dig",
                "route add / tcpdump"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. traceroute / tracert",
            skalaPoin = null,
            pembahasan = "`traceroute` (Linux) atau `tracert` (Windows) memanfaatkan manipulasi nilai TTL (Time-To-Live) paket IP untuk memetakan setiap router intermediate yang dilewati menuju destinasi."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_18",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Jenis penyerangan keamanan siber di mana penyerang mengirimkan paket data ping (ICMP Echo Request) berukuran raksasa yang melebihi batas maksimal spesifikasi protokol IP (65.535 byte) disebut...",
            pilihan = listOf(
                "Ping of Death",
                "Smurf Attack",
                "Syn Flooding",
                "Replay Attack",
                "Buffer Overflow"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "A. Ping of Death",
            skalaPoin = null,
            pembahasan = "Ping of Death adalah serangan DoS warisan lama di mana paket ICMP berukuran di atas batas standar terfragmentasi, dan saat dirakit kembali di sisi korban, sistem operasi mengalami crash/hang karena buffer overflow."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_19",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Protokol manajemen jaringan yang bekerja di Layer Aplikasi untuk mengumpulkan, mengatur, dan memantau informasi kinerja perangkat seperti router, switch, dan server dinamakan...",
            pilihan = listOf(
                "SMTP",
                "SNMP (Simple Network Management Protocol)",
                "DHCP",
                "LDAP",
                "IMAP"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. SNMP (Simple Network Management Protocol)",
            skalaPoin = null,
            pembahasan = "SNMP digunakan oleh administrator untuk memantau status kesehatan hardware jaringan, utilitas bandwidth, dan log performa melalui skema agen-manajer dan MIB (Management Information Base)."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_20",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Kategori arsitektur jaringan nirkabel seluler yang mengimplementasikan virtualisasi fungsi jaringan penuh, arsitektur open-source pada interface radio, serta pemisahan unit kontroler dan unit radio disebut...",
            pilihan = listOf(
                "Standalone 5G",
                "Open RAN (Radio Access Network)",
                "Core Network Infrastructure",
                "LTE-Advanced",
                "Software Defined Wireless"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Open RAN (Radio Access Network)",
            skalaPoin = null,
            pembahasan = "Open RAN adalah konsep disagregasi hardware dan software pada sistem pemancar seluler, memungkinkan operator mencampur elemen hardware dari berbagai vendor menggunakan standar interkoneksi terbuka."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_21",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Fungsi utama dari protokol NAT (Network Address Translation) jenis 'Masquerading' atau PAT (Port Address Translation) di router gerbang internet adalah...",
            pilihan = listOf(
                "Mengubah alamat IPv6 menjadi IPv4 secara otomatis",
                "Memetakan banyak alamat IP privat ke satu alamat IP publik menggunakan kombinasi nomor port yang unik",
                "Mengenkripsi lalu lintas data lokal menuju server luar",
                "Menghalangi serangan malware masuk ke dalam sistem operasi",
                "Mengalokasikan konfigurasi IP dinamis ke komputer klien"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Memetakan banyak alamat IP privat ke satu alamat IP publik menggunakan kombinasi nomor port yang unik",
            skalaPoin = null,
            pembahasan = "PAT atau NAT Masquerade menghemat penggunaan IP publik dengan cara melekatkan nomor port unik asal (source port) ke paket data, sehingga ratusan host lokal bisa berbagi satu IP publik eksternal yang sama."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_22",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Metode kendali akses media pada standar ethernet kabel (IEEE 802.3) yang berfungsi mendeteksi bentrokan data dan memerintahkan pengiriman ulang paket setelah waktu acak (backoff) berakhir disebut...",
            pilihan = listOf(
                "CSMA/CA",
                "CSMA/CD",
                "Token Passing",
                "Polling",
                "TDMA"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. CSMA/CD",
            skalaPoin = null,
            pembahasan = "CSMA/CD (Carrier Sense Multiple Access with Collision Detection) digunakan pada media kabel Ethernet bersama (shared medium) untuk mendeteksi tabrakan transmisi data. Sedangkan CSMA/CA digunakan pada Wi-Fi nirkabel."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_23",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Dalam arsitektur VPN, protokol enkripsi enkapsulasi data yang bekerja langsung pada Network Layer (Layer 3) model OSI guna menjamin keamanan paket IP secara end-to-end adalah...",
            pilihan = listOf(
                "L2TP",
                "PPTP",
                "IPsec",
                "SSL/TLS",
                "OpenVPN"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. IPsec",
            skalaPoin = null,
            pembahasan = "IPsec (Internet Protocol Security) diimplementasikan pada Layer 3 untuk mengamankan komunikasi data IP melalui mekanisme enkapsulasi AH (Authentication Header) dan ESP (Encapsulating Security Payload)."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_24",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Konsep keamanan siber yang menerapkan prinsip ketat 'never trust, always verify', di mana setiap permintaan akses dari dalam maupun luar jaringan wajib diautentikasi dan diotorisasi penuh dinamakan...",
            pilihan = listOf(
                "Perimeter Defense System",
                "Zero Trust Architecture",
                "Defense in Depth",
                "Network Segmentation",
                "Role-Based Access Control"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Zero Trust Architecture",
            skalaPoin = null,
            pembahasan = "Zero Trust membuang asumsi lama bahwa segala sesuatu di dalam jaringan internal otomatis aman. Setiap koneksi, perangkat, dan user dianggap berisiko tinggi hingga terbukti legal lewat verifikasi berlapis."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_25",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Protokol manajemen alokasi IP Address otomatis yang memanfaatkan mekanisme komunikasi client-server berupa rangkaian paket pesan DISCOVER, OFFER, REQUEST, dan ACK adalah...",
            pilihan = listOf(
                "DNS",
                "SNMP",
                "DHCP",
                "FTP",
                "NTP"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. DHCP",
            skalaPoin = null,
            pembahasan = "Proses penugasan IP Address oleh DHCP Server melalui 4 langkah (DORA): Client menyiarkan Discover, Server membalas Offer, Client mengirim Request konfirmasi, dan Server memfinalisasi dengan Acknowledge."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_26",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Serangan keamanan siber di mana pelaku menyusupkan skrip berbahaya (malicious script) seperti JavaScript ke dalam halaman web yang sah, sehingga skrip tereksekusi di browser pengguna lain dinamakan...",
            pilihan = listOf(
                "SQL Injection",
                "Cross-Site Scripting (XSS)",
                "CSRF (Cross-Site Request Forgery)",
                "Directory Traversal",
                "Command Injection"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. Cross-Site Scripting (XSS)",
            skalaPoin = null,
            pembahasan = "XSS mengeksploitasi kerentanan validasi input situs web, menyebabkan kode berbahaya dieksekusi di sisi klien (client-side) untuk mencuri cookie session, token token, atau kredensial pengguna."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_27",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Untuk menghubungkan dua autonomous system (AS) berskala sangat besar yang berbeda wilayah di infrastruktur internet global, jenis protokol routing dinamik yang wajib digunakan adalah...",
            pilihan = listOf(
                "OSPF",
                "RIP",
                "BGP (Border Gateway Protocol)",
                "EIGRP",
                "Static Route"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. BGP (Border Gateway Protocol)",
            skalaPoin = null,
            pembahasan = "BGP adalah jenis Path-Vector Routing Protocol yang dikategorikan sebagai Exterior Gateway Protocol (EGP). BGP merupakan tulang punggung inti yang merutekan paket data antar-ISP di jaringan internet dunia."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_28",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Algoritma fungsi hash satu arah yang menghasilkan nilai keluaran berukuran tetap sebesar 256-bit dan banyak digunakan sebagai standar verifikasi integritas file atau transaksi blockchain adalah...",
            pilihan = listOf(
                "MD5",
                "SHA-1",
                "SHA-256",
                "CRC32",
                "Blowfish"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "C. SHA-256",
            skalaPoin = null,
            pembahasan = "SHA-256 (bagian dari keluarga SHA-2) menghasilkan nilai hash unik 256-bit (32 byte). Enkripsi hash ini kebal terhadap kelemahan tabrakan (collision vulnerabilities) yang dialami oleh MD5 dan SHA-1."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_29",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Pada arsitektur jaringan serat optik, perangkat aktif yang ditempatkan di sisi sentral penyedia layanan (provider) untuk memproses data upstream dan downstream menuju pelanggan disebut...",
            pilihan = listOf(
                "ONT (Optical Network Terminal)",
                "OLT (Optical Line Terminal)",
                "ODN (Optical Distribution Network)",
                "ODC (Optical Distribution Cabinet)",
                "SFP Transceiver"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "B. OLT (Optical Line Terminal)",
            skalaPoin = null,
            pembahasan = "OLT berada di kantor pusat operator (CO) untuk mengontrol aliran data pada jaringan optik pasif (PON). Di sisi pengguna, unit penerimanya disebut ONT atau ONU."
        ),

        QuestionEntity(
            idSoal = "TKB_tik_30",
            kategori = "TKB",
            subKategori = "TIK",
            pertanyaan = "Jenis malware yang menyandera data komputer pengguna dengan enkripsi kuat tingkat tinggi, lalu menuntut tebusan uang kripto agar kunci dekripsinya diberikan disebut...",
            pilihan = listOf(
                "Spyware",
                "Trojan Horse",
                "Worm",
                "Ransomware",
                "Rootkit"
            ),
            tipeScoring = "STANDAR",
            jawabanBenar = "D. Ransomware",
            skalaPoin = null,
            pembahasan = "Ransomware (seperti WannaCry atau LockBit) mengunci akses file berharga milik korban dan memaksa mereka membayar tebusan finansial untuk mendapatkan kunci pemulihan data."
        ),

                QuestionEntity(
                idSoal = "TKB_tik_31",
        kategori = "TKB",
        subKategori = "TIK",
        pertanyaan = "Proses mendesain struktur database dengan menghilangkan redundansi data dan mencegah anomali pembaruan (update, insert, delete anomalies) disebut...",
        pilihan = listOf(
            "Denormalisasi",
            "Normalisasi",
            "Indeksasi",
            "Replikasi",
            "Migrasi Data"
        ),
        tipeScoring = "STANDAR",
        jawabanBenar = "B. Normalisasi",
        skalaPoin = null,
        pembahasan = "Normalisasi adalah teknik analisis data yang mengorganisasikan atribut data dengan cara mengelompokkan data ke dalam tabel-tabel untuk meminimalkan redundansi dan menjaga integritas data."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_32",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Sebuah tabel relasional dikatakan memenuhi syarat bentuk normal ketiga (3NF) apabila tabel tersebut telah memenuhi syarat 2NF dan...",
    pilihan = listOf(
    "Tidak memiliki nilai atribut bernilai ganda (multivalued)",
    "Setiap atribut bukan kunci bergantung penuh pada primary key",
    "Tidak terdapat ketergantungan transitif (transitive dependency) antar-atribut bukan kunci",
    "Memiliki superkey yang unik di setiap baris data",
    "Semua kolom bertipe data primitif"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Tidak terdapat ketergantungan transitif (transitive dependency) antar-atribut bukan kunci",
    skalaPoin = null,
    pembahasan = "Syarat 3NF adalah sudah berada di bentuk 2NF dan menghilangkan ketergantungan transitif, artinya atribut non-primary key tidak boleh bergantung pada atribut non-primary key lainnya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_33",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam konsep transaksi database relasional, karakteristik ACID wajib dipenuhi. Aspek yang menjamin bahwa seluruh rangkaian operasi dalam satu transaksi harus sukses semua atau gagal sekaligus (all-or-nothing) disebut...",
    pilihan = listOf(
    "Atomicity",
    "Consistency",
    "Isolation",
    "Durability",
    "Authencity"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "A. Atomicity",
    skalaPoin = null,
    pembahasan = "Atomicity memastikan bahwa modifikasi data dalam satu unit transaksi diperlakukan sebagai operasi tunggal. Jika ada satu bagian operasi yang gagal, maka seluruh transaksi akan dibatalkan (*rollback*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_34",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Perintah SQL di bawah ini yang dikategorikan ke dalam Data Definition Language (DDL) untuk memanipulasi struktur objek database adalah...",
    pilihan = listOf(
    "INSERT, UPDATE, DELETE",
    "SELECT, JOIN, WHERE",
    "CREATE, ALTER, DROP",
    "GRANT, REVOKE",
    "COMMIT, ROLLBACK"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. CREATE, ALTER, DROP",
    skalaPoin = null,
    pembahasan = "DDL (Data Definition Language) digunakan untuk mendefinisikan dan mengubah skema/struktur database, seperti membuat tabel baru (CREATE), mengubah kolom (ALTER), atau menghapus tabel (DROP)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_35",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Manakah query SQL yang paling tepat untuk menampilkan data nama pegawai (kolom 'nama') yang memiliki gaji (kolom 'gaji') di atas 5.000.000 dan diurutkan berdasarkan gaji tertinggi?",
    pilihan = listOf(
    "SELECT nama FROM pegawai WHERE gaji > 5000000 ORDER BY gaji ASC;",
    "SELECT nama FROM pegawai HAVING gaji > 5000000 ORDER BY gaji DESC;",
    "SELECT nama FROM pegawai WHERE gaji > 5000000 ORDER BY gaji DESC;",
    "SELECT nama FROM pegawai WHERE gaji > 5000000 GROUP BY gaji;",
    "SELECT nama ORDER BY gaji DESC FROM pegawai WHERE gaji > 5000000;"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. SELECT nama FROM pegawai WHERE gaji > 5000000 ORDER BY gaji DESC;",
    skalaPoin = null,
    pembahasan = "Klausa WHERE digunakan untuk memfilter baris kondisi awal, dan ORDER BY dengan parameter DESC digunakan untuk mengurutkan hasil secara menurun (dari terbesar ke terkecil)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_36",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis operasi JOIN dalam SQL yang mengembalikan semua baris dari tabel sebelah kiri (left table), beserta baris yang cocok dari tabel sebelah kanan, dan mengisi nilai NULL jika tidak ada pencocokan adalah...",
    pilihan = listOf(
    "INNER JOIN",
    "RIGHT JOIN",
    "FULL OUTER JOIN",
    "LEFT JOIN",
    "CROSS JOIN"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. LEFT JOIN",
    skalaPoin = null,
    pembahasan = "LEFT JOIN (atau Left Outer Join) mempertahankan seluruh record dari tabel kiri, serta mengambil record tabel kanan yang berelasi. Jika tabel kanan tidak memiliki relasi yang cocok, kolomnya diisi NULL."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_37",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam manajemen database, objek skema database berupa fungsi prosedural yang tersimpan di dalam server database dan dapat dieksekusi secara otomatis ketika terjadi event INSERT, UPDATE, atau DELETE pada suatu tabel disebut...",
    pilihan = listOf(
    "Stored Procedure",
    "View",
    "Trigger",
    "Index",
    "Sequence"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Trigger",
    skalaPoin = null,
    pembahasan = "Trigger adalah blok kode SQL khusus yang berjalan secara otomatis (*fired*) sebagai respons terhadap event manipulasi data (DML) tertentu pada tabel yang diawasi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_38",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Struktur data indeks pada relational database modern (seperti PostgreSQL atau MySQL InnoDB) yang paling umum digunakan untuk mempercepat proses pencarian rentang data (range query) secara efisien adalah...",
    pilihan = listOf(
    "Hash Table Index",
    "B-Tree / B+ Tree Index",
    "Binary Search Tree",
    "Inverted Index",
    "Bitmap Index"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. B-Tree / B+ Tree Index",
    skalaPoin = null,
    pembahasan = "B+ Tree menjaga data tetap terurut dan seimbang, menjadikannya sangat efisien untuk operasi pencarian data spesifik (point query) maupun operasi pencarian rentang (range query)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_39",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis database NoSQL yang menyimpan datanya dalam format dokumen semi-terstruktur (seperti JSON atau BSON) dan menggunakan key unik untuk mengakses dokumen tersebut adalah...",
    pilihan = listOf(
    "Key-Value Store (e.g., Redis)",
    "Document-Oriented Database (e.g., MongoDB)",
    "Wide-Column Store (e.g., Cassandra)",
    "Graph Database (e.g., Neo4j)",
    "Relational Database"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Document-Oriented Database (e.g., MongoDB)",
    skalaPoin = null,
    pembahasan = "Document Store seperti MongoDB mengorganisasikan data ke dalam koleksi dokumen fleksibel berbentuk format JSON/BSON tanpa membutuhkan skema tabel yang kaku (schemaless)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_40",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Berdasarkan Teorema CAP (CAP Theorem) dalam sistem database terdistribusi, apabila terjadi pemisahan jaringan (Partition Tolerance), sistem hanya bisa memilih keseimbangan antara...",
    pilihan = listOf(
    "Cost dan Performance",
    "Consistency dan Availability",
    "Concurrency dan Durability",
    "Atomicity dan Isolation",
    "Security dan Scalability"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Consistency dan Availability",
    skalaPoin = null,
    pembahasan = "Teorema CAP menyatakan bahwa sistem data terdistribusi tidak mungkin menjamin ketiga sifat sekaligus: Consistency, Availability, dan Partition Tolerance. Jika terjadi Network Partition (P), sistem harus memilih fokus ke C atau A."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_41",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Kondisi fenomena pembacaan data dalam transaksi konkurensi di mana Transaksi A membaca data yang telah diubah oleh Transaksi B, namun Transaksi B kemudian melakukan Rollback, sehingga data yang dibaca Transaksi A menjadi tidak valid disebut...",
    pilihan = listOf(
    "Dirty Read",
    "Non-Repeatable Read",
    "Phantom Read",
    "Lost Update",
    "Deadlock"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "A. Dirty Read",
    skalaPoin = null,
    pembahasan = "Dirty Read terjadi ketika suatu transaksi membaca data uncommitted (belum dikukuhkan) dari transaksi lain yang berjalan bersamaan, sehingga berisiko membaca data palsu jika transaksi lain tersebut batal/rollback."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_42",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Tingkat isolasi transaksi (Transaction Isolation Level) tertinggi di SQL standar yang sepenuhnya mengeliminasi masalah Dirty Read, Non-Repeatable Read, dan Phantom Read dengan cara mengunci baris data secara ketat adalah...",
    pilihan = listOf(
    "Read Uncommitted",
    "Read Committed",
    "Repeatable Read",
    "Serializable",
    "Snapshot Isolation"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. Serializable",
    skalaPoin = null,
    pembahasan = "Serializable mengasumsikan transaksi dieksekusi secara berurutan (*serial*), mengunci rentang data secara total untuk mencegah segala bentuk anomali konkurensi, meski berdampak pada penurunan performa."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_43",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Teknik optimasi database yang dilakukan dengan cara membagi satu tabel besar secara horizontal ke dalam beberapa node server database fisik yang berbeda dinamakan...",
    pilihan = listOf(
    "Partitioning Vertical",
    "Sharding (Horizontal Partitioning)",
    "Indexing",
    "Normalisasi",
    "Data Purging"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Sharding (Horizontal Partitioning)",
    skalaPoin = null,
    pembahasan = "Sharding memecah baris data tabel besar ke beberapa server database terpisah menggunakan kunci sharding (shard key) tertentu untuk mencapai skalabilitas horizontal (scale-out)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_44",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam pengolahan Big Data, sebuah repositori penyimpanan terpusat berskala besar yang digunakan untuk menampung data mentah (raw data) dalam format aslinya (terstruktur, semi-terstruktur, maupun tidak terstruktur) disebut...",
    pilihan = listOf(
    "Data Warehouse",
    "Data Mart",
    "Data Lake",
    "Relational DBMS",
    "Operational Data Store"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Data Lake",
    skalaPoin = null,
    pembahasan = "Data Lake menampung data mentah tanpa skema yang ditentukan terlebih dahulu (*schema-on-read*). Berbeda dengan Data Warehouse yang menuntut data terstruktur dan bersih sebelum disimpan (*schema-on-write*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_45",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Fungsi agregasi dalam SQL yang digunakan untuk menghitung jumlah total baris atau kemunculan data berdasarkan kriteria tertentu adalah...",
    pilihan = listOf(
    "SUM()",
    "COUNT()",
    "AVG()",
    "TOTAL()",
    "MAX()"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. COUNT()",
    skalaPoin = null,
    pembahasan = "Fungsi `COUNT()` mengembalikan jumlah baris data yang cocok dengan kriteria. Sementara `SUM()` digunakan untuk menghitung total akumulasi nilai numerik dari suatu kolom."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_46",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Klausa dalam perintah SQL SELECT yang wajib digunakan apabila kita ingin memfilter hasil ekstraksi data yang menggunakan fungsi agregasi (seperti COUNT atau SUM) adalah...",
    pilihan = listOf(
    "WHERE",
    "ORDER BY",
    "HAVING",
    "LIKE",
    "IN"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. HAVING",
    skalaPoin = null,
    pembahasan = "Klausa WHERE tidak dapat memproses kondisi fungsi agregasi secara langsung. Oleh karena itu, klausa HAVING digunakan sebagai pengganti WHERE untuk memfilter grup data hasil agregasi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_47",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metode replikasi database di mana data ditulis ke server utama (Master/Primary) dan server replika (Slave/Secondary) secara bersamaan, dan transaksi baru dianggap selesai jika seluruh server sukses menulis data dinamakan...",
    pilihan = listOf(
    "Asynchronous Replication",
    "Synchronous Replication",
    "Snapshot Replication",
    "Statement-Based Replication",
    "Row-Based Replication"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Synchronous Replication",
    skalaPoin = null,
    pembahasan = "Synchronous Replication menjamin konsistensi data instan antar-node karena transaksi menunggu konfirmasi penulisan dari server replika sebelum menyatakan status sukses ke aplikasi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_48",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Konsep desain skema data warehouse yang terdiri dari satu tabel fakta (fact table) terpusat berukuran besar yang dikelilingi oleh tabel-tabel dimensi (dimension tables) secara langsung tanpa normalisasi lanjutan dinamakan...",
    pilihan = listOf(
    "Snowflake Schema",
    "Star Schema",
    "Galaxy Schema",
    "Relational Schema",
    "Hierarchy Schema"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Star Schema",
    skalaPoin = null,
    pembahasan = "Star Schema berbentuk menyerupai bintang karena tabel dimensi langsung terhubung ke pusat tabel fakta tanpa percabangan. Jika tabel dimensinya dinormalisasi lagi menjadi bertingkat, namanya menjadi *Snowflake Schema*."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_49",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam SQL, operator logika yang digunakan untuk mencari kecocokan pola teks tertentu (pattern matching) dengan bantuan wildcard seperti tanda persen (%) dinamakan...",
    pilihan = listOf(
    "BETWEEN",
    "IN",
    "LIKE",
    "EXISTS",
    "MATCH"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. LIKE",
    skalaPoin = null,
    pembahasan = "Operator `LIKE` digunakan bersama wildcard `%` (mewakili banyak karakter) atau `_` (mewakili satu karakter) untuk mencari string teks spesifik, misalnya `LIKE 'A%'` untuk teks berawalan huruf A."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_50",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Komponen arsitektur DBMS yang bertugas menganalisis, merestrukturisasi, dan menentukan rencana eksekusi query (query execution plan) paling efisien dengan biaya komputasi terendah disebut...",
    pilihan = listOf(
    "Query Parser",
    "Query Optimizer",
    "Transaction Manager",
    "Storage Engine",
    "Buffer Manager"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Query Optimizer",
    skalaPoin = null,
    pembahasan = "Query Optimizer mengevaluasi berbagai skema pencarian algoritma dan pemanfaatan indeks yang tersedia untuk menghasilkan strategi eksekusi query (*Execution Plan*) tercepat."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_51",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Teknik manipulasi database di mana data transaksi lama yang sudah jarang diakses dipindahkan secara permanen dari media penyimpanan utama (OLTP) menuju media penyimpanan sekunder jangka panjang untuk menghemat resource disebut...",
    pilihan = listOf(
    "Data Purging",
    "Data Archiving",
    "Data Indexing",
    "Data Masking",
    "Data Mining"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Data Archiving",
    skalaPoin = null,
    pembahasan = "Data Archiving memindahkan data historis tidak aktif ke storage lain secara aman untuk mengurangi beban kerja operasional mesin produksi data utama tanpa menghilangkan data tersebut."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_52",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Istilah kunci dalam tabel database relasional yang digunakan untuk menghubungkan satu tabel dengan primary key di tabel lain (menjaga referential integrity) dinamakan...",
    pilihan = listOf(
    "Candidate Key",
    "Composite Key",
    "Foreign Key",
    "Alternate Key",
    "Super Key"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Foreign Key",
    skalaPoin = null,
    pembahasan = "Foreign Key (Kunci Asing) menciptakan hubungan logis antara baris di dua tabel yang berbeda dengan mereferensikan kolom Primary Key dari tabel induk."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_53",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam pemrosesan data, sistem OLTP (Online Transaction Processing) dirancang khusus untuk menangani skenario kerja berupa...",
    pilihan = listOf(
    "Analisis data historis skala besar untuk keperluan bisnis intelijen",
    "Transaksi operasional harian bervolume tinggi dengan query baca-tulis sederhana yang cepat",
    "Pembersihan data kotor secara berkala menggunakan framework Hadoop",
    "Pelatihan model machine learning berbasis deep learning",
    "Penyimpanan arsip log server statis"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Transaksi operasional harian bervolume tinggi dengan query baca-tulis sederhana yang cepat",
    skalaPoin = null,
    pembahasan = "OLTP berfokus pada kecepatan transaksi real-time jangka pendek seperti insert/update data (contoh: transaksi ATM atau e-commerce). Kebalikannya adalah OLAP yang berfokus pada analisis data kompleks."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_54",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Untuk menghapus seluruh baris data dari sebuah tabel dengan cara cepat tanpa mencatat log penghapusan per baris di transaction log, perintah SQL yang digunakan adalah...",
    pilihan = listOf(
    "DELETE FROM nama_tabel;",
    "DROP TABLE nama_tabel;",
    "TRUNCATE TABLE nama_tabel;",
    "REMOVE ALL FROM nama_tabel;",
    "CLEAR TABLE nama_tabel;"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. TRUNCATE TABLE nama_tabel;",
    skalaPoin = null,
    pembahasan = "`TRUNCATE` bekerja dengan cara merilis alokasi halaman data tabel tersebut. Operasi ini jauh lebih cepat daripada `DELETE` karena tidak memproses penghapusan satu per satu dan melewati mekanisme logging ekstensif."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_55",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis database NoSQL yang memetakan relasi entitas data menggunakan simpul (nodes), tepi penunjuk hubungan (edges), dan properti (properties) adalah...",
    pilihan = listOf(
    "Document Store",
    "Key-Value Store",
    "Graph Database",
    "Wide-Column Database",
    "Time-Series Database"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Graph Database",
    skalaPoin = null,
    pembahasan = "Graph Database (seperti Neo4j) sangat dioptimalkan untuk mengeksplorasi hubungan data kompleks berkonektivitas tinggi secara cepat, seperti jaringan sosial atau sistem deteksi fraud perbankan."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_56",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Konsep arsitektur di mana logika pembacaan data (Read) dipisahkan secara total dari logika penulisan/pembaruan data (Write/Command) untuk mengoptimalkan performa aplikasi skala besar disebut...",
    pilihan = listOf(
    "MVC Architecture",
    "Microservices",
    "CQRS (Command Query Responsibility Segregation)",
    "Monolithic Architecture",
    "Event-Driven Design"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. CQRS (Command Query Responsibility Segregation)",
    skalaPoin = null,
    pembahasan = "CQRS memisahkan jalur eksekusi model data antara modifikasi data (Command) dan pembacaan data (Query), bahkan sering kali menggunakan model penyimpanan database fisik yang berbeda untuk keduanya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_57",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Kondisi eror sistem database di mana dua transaksi atau lebih saling menunggu kunci data (lock) yang dipegang oleh transaksi lainnya secara melingkar sehingga tidak ada transaksi yang bisa berjalan disebut...",
    pilihan = listOf(
    "Race Condition",
    "Deadlock",
    "Starvation",
    "Thread Leak",
    "Overflow"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Deadlock",
    skalaPoin = null,
    pembahasan = "Deadlock terjadi akibat situasi saling mengunci (*mutual deadlock*). DBMS biasanya mengatasi ini dengan menghentikan salah satu transaksi secara paksa (*victim*) agar transaksi lain dapat berlanjut."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_58",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metode penjaminan integritas data di mana perubahan data pada tabel induk secara otomatis akan mengupdate atau menghapus data terkait yang ada pada tabel anak dinamakan...",
    pilihan = listOf(
    "ON UPDATE RESTRICT / ON DELETE RESTRICT",
    "ON UPDATE CASCADE / ON DELETE CASCADE",
    "ON UPDATE SET NULL",
    "CHECK CONSTRAINT",
    "UNIQUE INDEX BINDING"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. ON UPDATE CASCADE / ON DELETE CASCADE",
    skalaPoin = null,
    pembahasan = "Sifat `CASCADE` menginstruksikan database agar menyebarkan aksi perubahan/penghapusan dari baris primary key ke baris foreign key yang mereferensikannya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_59",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam ekosistem Big Data Hadoop, komponen utama yang berfungsi sebagai sistem penyimpanan file terdistribusi di beberapa node server komoditas secara fault-tolerant dinamakan...",
    pilihan = listOf(
    "MapReduce",
    "YARN",
    "HDFS (Hadoop Distributed File System)",
    "Hive",
    "Spark"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. HDFS (Hadoop Distributed File System)",
    skalaPoin = null,
    pembahasan = "HDFS memecah file berukuran besar menjadi beberapa blok data kecil dan mereplikasikannya ke berbagai server di dalam klaster untuk menjamin ketersediaan data jika ada server yang mati."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_60",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Objek virtual pada database relasional yang menyimpan definisi query SQL tertentu (bukan menyimpan fisik datanya sendiri) dan dapat diakses layaknya tabel biasa disebut...",
    pilihan = listOf(
    "Materialized View",
    "Index",
    "View",
    "Stored Procedure",
    "Synonym"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. View",
    skalaPoin = null,
    pembahasan = "View adalah tabel virtual yang dibuat berdasarkan hasil query SQL tertentu. View menyembunyikan kompleksitas query join dan membatasi eksposur kolom tabel asli demi alasan keamanan data."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_61",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam paradigma Object-Oriented Programming (OOP), kemampuan suatu objek untuk mengambil banyak bentuk atau memiliki banyak implementasi metode dengan nama yang sama disebut...",
    pilihan = listOf(
    "Encapsulation",
    "Inheritance",
    "Polymorphism",
    "Abstraction",
    "Composition"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Polymorphism",
    skalaPoin = null,
    pembahasan = "Polymorphism (banyak bentuk) memungkinkan kelas turunan mendefinisikan ulang perilakunya sendiri dari kelas induk melalui teknik Overriding atau Overloading dengan menggunakan nama metode yang sama."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_62",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Prinsip SOLID dalam pemrograman berorientasi objek menyatakan bahwa sebuah kelas seharusnya hanya memiliki satu alasan untuk berubah. Prinsip ini disebut...",
    pilihan = listOf(
    "Single Responsibility Principle (SRP)",
    "Open/Closed Principle (OCP)",
    "Liskov Substitution Principle (LSP)",
    "Interface Segregation Principle (ISP)",
    "Dependency Inversion Principle (DIP)"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "A. Single Responsibility Principle (SRP)",
    skalaPoin = null,
    pembahasan = "SRP (Single Responsibility Principle) menegaskan bahwa satu modul atau kelas harus bertanggung jawab atas satu bagian fungsionalitas saja, sehingga meminimalkan efek samping saat kode dimodifikasi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_63",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metodologi pengembangan perangkat lunak (SDLC) yang bersifat adaptif, iteratif, berfokus pada kolaborasi tim, dan rilis produk secara cepat dalam siklus pendek (Sprint) disebut...",
    pilihan = listOf(
    "Waterfall Model",
    "Scrum (Agile Framework)",
    "Spiral Model",
    "V-Model",
    "Big Bang Model"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Scrum (Agile Framework)",
    skalaPoin = null,
    pembahasan = "Scrum adalah bagian dari metodologi Agile yang memecah proses pengembangan menjadi iterasi waktu tetap (biasanya 2-4 minggu) yang disebut Sprint, sangat responsif terhadap perubahan kebutuhan pengguna."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_64",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis pengujian perangkat lunak di mana penguji mengevaluasi fungsionalitas internal, struktur kode, alur logika, dan algoritma program secara langsung disebut...",
    pilihan = listOf(
    "Black Box Testing",
    "White Box Testing",
    "Gray Box Testing",
    "User Acceptance Testing (UAT)",
    "Beta Testing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. White Box Testing",
    skalaPoin = null,
    pembahasan = "White Box Testing (Glass Box) menuntut pengetahuan mendalam tentang struktur kode internal program. Penguji membuat test case untuk memverifikasi alur eksekusi pernyataan (*statement coverage*) atau cabang logika."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_65",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam arsitektur perangkat lunak Pattern MVC (Model-View-Controller), komponen yang bertugas memproses logika bisnis, mengelola manipulasi data, dan berinteraksi dengan database adalah...",
    pilihan = listOf(
    "View",
    "Controller",
    "Model",
    "Router",
    "Service"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Model",
    skalaPoin = null,
    pembahasan = "Model merepresentasikan struktur data aplikasi dan aturan bisnisnya. View menangani tampilan UI, sementara Controller menjembatani data dari Model ke View berdasarkan request user."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_66",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Design Pattern dalam OOP yang digunakan untuk menjamin bahwa suatu kelas hanya memiliki satu instance objek global di seluruh siklus hidup aplikasi disebut...",
    pilihan = listOf(
    "Factory Pattern",
    "Singleton Pattern",
    "Observer Pattern",
    "Strategy Pattern",
    "Adapter Pattern"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Singleton Pattern",
    skalaPoin = null,
    pembahasan = "Singleton Pattern membatasi instansiasi kelas dan memastikan hanya ada satu instans objek yang hidup di memori aplikasi (sering digunakan untuk manajemen koneksi database atau konfigurasi global)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_67",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Algoritma pencarian data pada array terurut yang bekerja dengan cara membagi dua ruang pencarian secara berulang hingga elemen ditemukan disebut...",
    pilihan = listOf(
    "Linear Search",
    "Binary Search",
    "Bubble Sort",
    "Hashing Search",
    "Depth-First Search"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Binary Search",
    skalaPoin = null,
        pembahasan = "Binary Search memiliki kompleksitas waktu logaritmik karena pada setiap langkah ruang pencarian dipersempit menjadi setengah dari ukuran sebelumnya. Algoritma ini hanya dapat digunakan pada data yang telah terurut."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_68",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam pemodelan sistem menggunakan UML (Unified Modeling Language), diagram yang digunakan untuk menggambarkan interaksi fungsionalitas sistem dari sudut pandang pengguna luar (aktor) disebut...",
    pilihan = listOf(
    "Class Diagram",
    "Sequence Diagram",
    "Use Case Diagram",
    "Activity Diagram",
    "State Machine Diagram"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Use Case Diagram",
    skalaPoin = null,
    pembahasan = "Use Case Diagram memetakan hubungan antara aktor (user/sistem eksternal) dengan fungsi-fungsi utama (*use cases*) yang disediakan oleh aplikasi yang sedang dirancang."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_69",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Struktur data linier yang menerapkan prinsip LIFO (Last-In, First-Out), di mana elemen yang terakhir dimasukkan akan menjadi elemen pertama yang dikeluarkan adalah...",
    pilihan = listOf(
    "Queue (Antrean)",
    "Stack (Tumpukan)",
    "Linked List",
    "Tree",
    "Graph"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Stack (Tumpukan)",
    skalaPoin = null,
    pembahasan = "Stack beroperasi dengan prinsip LIFO menggunakan fungsi dasar `push()` (menambah elemen di atas) dan `pop()` (mengambil elemen teratas). Sementara Queue menggunakan prinsip FIFO (First-In, First-Out)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_70",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Proses menyembunyikan detail implementasi internal suatu objek dan hanya menyediakan interface/fungsi publik yang dapat diakses dari luar dinamakan konsep...",
    pilihan = listOf(
    "Inheritance",
    "Polymorphism",
    "Encapsulation (Enkapsulasi)",
    "Coupling",
    "Generalization"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Encapsulation (Enkapsulasi)",
    skalaPoin = null,
    pembahasan = "Enkapsulasi melindungi status internal objek dengan membatasi akses langsung ke variabel/atribut (biasanya diset *private*) dan menyediakan metode getter/setter publik untuk berinteraksi dengannya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_71",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam manajemen kode sumber dengan Git, perintah yang digunakan untuk menggabungkan riwayat perubahan dari suatu cabang (branch) ke cabang aktif saat ini adalah...",
    pilihan = listOf(
    "git clone",
    "git push",
    "git merge",
    "git checkout",
    "git fetch"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. git merge",
    skalaPoin = null,
    pembahasan = "`git merge` mengintegrasikan riwayat komit dari branch target ke branch aktif tempat developer berada, menyatukan basis kode secara otomatis atau meminta resolusi konflik jika ada bentrokan kode."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_72",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis kompleksitas waktu (Big O Notation) dari algoritma pengurutan Bubble Sort dan Insertion Sort dalam skenario terburuk (worst-case scenario) adalah...",
    pilihan = listOf(
    "O(1)",
    "O(n)",
    "O(n log n)",
    "O(n^2)",
    "O(2^n)"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. O(n^2)",
    skalaPoin = null,
    pembahasan = "Bubble Sort dan Insertion Sort menggunakan mekanisme perulangan bersarang (*nested loops*) untuk mengurutkan elemen, sehingga pada skenario terburuk membutuhkan waktu kuadratik ."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_73",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metode pengujian perangkat lunak untuk memastikan bahwa modifikasi kode baru atau perbaikan bug tidak merusak fitur-fitur lama yang sebelumnya sudah berjalan dengan baik disebut...",
    pilihan = listOf(
    "Unit Testing",
    "Integration Testing",
    "Regression Testing",
    "Smoke Testing",
    "Stress Testing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Regression Testing",
    skalaPoin = null,
    pembahasan = "Regression Testing dijalankan ulang setelah ada pembaruan kode untuk memastikan fungsionalitas sistem yang sudah stabil tidak mengalami regresi atau kerusakan tidak disengaja akibat kode baru."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_74",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam rekayasa perangkat lunak, tingkat ketergantungan antar-modul kode aplikasi sebaiknya dirancang dengan karakteristik...",
    pilihan = listOf(
    "High Cohesion dan High Coupling",
    "Low Cohesion dan Low Coupling",
    "Low Cohesion dan High Coupling",
    "High Cohesion dan Low Coupling",
    "Zero Cohesion dan Infinite Coupling"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. High Cohesion dan Low Coupling",
    skalaPoin = null,
    pembahasan = "Desain software yang baik mengutamakan *High Cohesion* (elemen di dalam satu modul fokus melakukan tugas spesifik yang sama) dan *Low Coupling* (ketergantungan/keterikatan antar-modul minimal agar mudah dimodifikasi)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_75",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Model SDLC yang menerapkan pendekatan sekuensial sistematis mulai dari analisis kebutuhan, desain, pengkodean, pengujian, hingga pemeliharaan tanpa adanya fleksibilitas kembali ke tahap sebelumnya dinamakan...",
    pilihan = listOf(
    "Agile Model",
    "Waterfall Model",
    "Prototype Model",
    "RAD Model",
    "DevOps Framework"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Waterfall Model",
    skalaPoin = null,
    pembahasan = "Waterfall (Model Air Terjun) mengalir kaku ke bawah secara linear. Tahap berikutnya baru bisa dimulai jika tahap sebelumnya telah selesai sepenuhnya, kurang cocok untuk proyek dengan kebutuhan yang dinamis."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_76",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam konsep pembersihan dan pemeliharaan kode (refactoring), kode program yang strukturnya buruk, sulit dipahami, namun secara fungsionalitas masih berjalan dengan benar disebut...",
    pilihan = listOf(
    "Bug",
    "Syntax Error",
    "Code Smell",
    "Memory Leak",
    "Technical Debt"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Code Smell",
    skalaPoin = null,
    pembahasan = "Code Smell adalah indikasi adanya kelemahan dalam desain atau penulisan kode (seperti fungsi yang terlalu panjang atau duplikasi kode) yang berpotensi menyulitkan pemeliharaan kode di masa depan."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_77",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Arsitektur web service yang menggunakan format pertukaran data JSON, bersifat stateless, dan mengandalkan metode standar protokol HTTP seperti GET, POST, PUT, dan DELETE adalah...",
    pilihan = listOf(
    "SOAP API",
    "RESTful API",
    "gRPC",
    "GraphQL",
    "XML-RPC"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. RESTful API",
    skalaPoin = null,
    pembahasan = "REST (Representational State Transfer) memanfaatkan HTTP verb secara langsung (GET untuk membaca, POST untuk membuat, PUT untuk memperbarui, DELETE untuk menghapus) menjadikannya ringan dan populer untuk arsitektur modern."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_78",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Struktur data non-linier hierarkis yang setiap simpulnya (node) maksimal hanya boleh memiliki dua anak cabang (left child dan right child) disebut...",
    pilihan = listOf(
    "B-Tree",
    "Graph",
    "Binary Tree",
    "AVL Tree",
    "Red-Black Tree"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Binary Tree",
    skalaPoin = null,
    pembahasan = "Binary Tree (Pohon Biner) adalah struktur data pohon di mana setiap node induk dibatasi maksimal hanya memiliki dua degree dari percabangan anak."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_79",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam UML, diagram perilaku yang menggambarkan aliran kendali atau aliran kerja langkah demi langkah dari suatu aktivitas bisnis atau algoritma sistem disebut...",
    pilihan = listOf(
    "Class Diagram",
    "Deployment Diagram",
    "Activity Diagram",
    "Component Diagram",
    "Object Diagram"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Activity Diagram",
    skalaPoin = null,
    pembahasan = "Activity Diagram mirip dengan flowchart, berfungsi memodelkan alur kerja sistem, keputusan prosedural (*decision node*), dan eksekusi paralel (*fork and join*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_80",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metode manajemen proyek perangkat lunak Kanban berfokus pada visualisasi papan kerja. Tujuan utama dari pembatasan Work in Progress (WIP) pada Kanban adalah...",
    pilihan = listOf(
    "Memastikan kode bebas dari bug sebelum rilis",
    "Mengurangi hambatan (bottleneck) dan mengoptimalkan aliran kerja tim",
    "Memaksa developer bekerja lembur",
    "Menghapus kebutuhan peran Project Manager",
    "Menghitung poin efisiensi biaya secara otomatis"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Mengurangi hambatan (bottleneck) dan mengoptimalkan aliran kerja tim",
    skalaPoin = null,
    pembahasan = "Membatasi jumlah tugas aktif (WIP) membantu tim fokus menyelesaikan pekerjaan yang sudah berjalan sebelum mengambil tugas baru, mencegah kelebihan beban kerja dan mendeteksi hambatan proses alur kerja lebih cepat."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_81",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam pemrograman berorientasi objek, sebuah kelas yang tidak dapat diinstansiasi menjadi objek secara langsung dan hanya berfungsi sebagai cetak biru abstrak untuk diwariskan ke kelas anak disebut...",
    pilihan = listOf(
    "Concrete Class",
    "Abstract Class",
    "Inner Class",
    "Final Class",
    "Static Class"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Abstract Class",
    skalaPoin = null,
    pembahasan = "Abstract Class bertindak sebagai template generik. Kelas ini bisa memiliki metode abstrak (tanpa bodi kode) yang wajib diimplementasikan ulang secara spesifik oleh kelas turunannya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_82",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Skenario pengujian non-fungsional perangkat lunak yang bertujuan untuk menguji batas kemampuan tertinggi sistem dengan cara memberikan beban kerja ekstrem di luar kapasitas normal disebut...",
    pilihan = listOf(
    "Load Testing",
    "Stress Testing",
    "Volume Testing",
    "Usability Testing",
    "Security Testing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Stress Testing",
    skalaPoin = null,
    pembahasan = "Stress Testing mengevaluasi ketahanan dan stabilitas aplikasi saat mengalami lonjakan trafik ekstrem untuk melihat bagaimana sistem menangani kegagalan (*failover*) dan memulihkan diri kembali."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_83",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Pada arsitektur microservices, pola komponen yang bertugas sebagai pintu gerbang tunggal untuk mengarahkan rute permintaan API dari client menuju layanan internal yang sesuai dinamakan...",
    pilihan = listOf(
    "Service Registry",
    "API Gateway",
    "Load Balancer",
    "Message Broker",
    "Config Server"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. API Gateway",
    skalaPoin = null,
    pembahasan = "API Gateway mengabstraksi kompleksitas microservices di sisi backend dari client, menangani fungsi routing, autentikasi terpusat, SSL termination, serta rate limiting."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_84",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metodologi penulisan kode di mana developer wajib membuat skenario uji otomatis (unit test) terlebih dahulu sebelum menulis implementasi kode fitur aplikasinya sendiri dikenal sebagai...",
    pilihan = listOf(
    "Behavior Driven Development (BDD)",
    "Test Driven Development (TDD)",
    "Object Oriented Analysis (OOAD)",
    "Continuous Integration",
    "Pair Programming"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Test Driven Development (TDD)",
    skalaPoin = null,
    pembahasan = "Siklus TDD mengikuti pola Red-Green-Refactor: Menulis tes yang gagal (Red), menulis minimal kode program agar tes sukses (Green), kemudian merapikan struktur kode tanpa mengubah fungsi (Refactor)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_85",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Konsep dalam pemrograman di mana suatu fungsi memanggil dirinya sendiri di dalam bodi kodenya guna memecahkan masalah kompleks menjadi sub-masalah yang sejenis dinamakan...",
    pilihan = listOf(
    "Iterasi Linear",
    "Rekursif (Recursion)",
    "Concurrency",
    "Encapsulation",
    "Abstraksi Polimorfik"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Rekursif (Recursion)",
    skalaPoin = null,
    pembahasan = "Fungsi rekursif mempermudah penulisan kode untuk masalah matematika tertentu (seperti faktorial atau Fibonacci). Karakteristik wajibnya adalah harus memiliki *Base Case* agar tidak terjadi perulangan tanpa akhir (*stack overflow*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_86",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam Git, jika terjadi situasi di mana dua developer mengubah baris kode yang sama pada file yang sama di cabang berbeda, dan mencoba menggabungkannya, maka akan memicu terjadinya...",
    pilihan = listOf(
    "Git Detached HEAD",
    "Fast-Forward Merge",
    "Merge Conflict",
    "Code Corruption",
    "Repository Refusal"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Merge Conflict",
    skalaPoin = null,
    pembahasan = "Merge Conflict terjadi karena Git tidak bisa menentukan secara otomatis perubahan mana yang benar, sehingga proses merge dihentikan sementara dan developer harus memilih atau menggabungkan kode tersebut secara manual."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_87",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam rekayasa perangkat lunak, dokumen formal yang berisi spesifikasi lengkap mengenai kebutuhan fungsional dan non-fungsional sistem yang disepakati pengguna dan pengembang dinamakan...",
    pilihan = listOf(
    "User Acceptance Document",
    "Software Requirement Specification (SRS)",
    "Architecture Design Document",
    "Source Code Documentation",
    "Standard Operating Procedure"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Software Requirement Specification (SRS)",
    skalaPoin = null,
    pembahasan = "SRS (atau SKPL dalam bahasa Indonesia) adalah dokumen kontrak teknis utama yang mendefinisikan apa saja kemampuan yang harus dimiliki oleh aplikasi sebelum proyek mulai dibangun."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_88",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Jenis pengujian fungsional yang dilakukan pada tahap akhir siklus pengembangan dengan melibatkan pengguna akhir secara langsung untuk memverifikasi kesesuaian aplikasi terhadap kebutuhan bisnis nyata disebut...",
    pilihan = listOf(
    "System Testing",
    "Integration Testing",
    "User Acceptance Testing (UAT)",
    "Alpha Testing",
    "Performance Testing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. User Acceptance Testing (UAT)",
    skalaPoin = null,
    pembahasan = "UAT adalah gerbang final sebelum perangkat lunak dirilis ke lingkungan produksi (*production environment*). Di sini, pemilik bisnis menguji alur kerja aplikasi untuk memberikan persetujuan sign-off."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_89",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam OOP, mekanisme yang memungkinkan sebuah kelas mewarisi semua atribut dan metode dari kelas lain yang sudah ada demi mempromosikan prinsip reusabilitas kode disebut...",
    pilihan = listOf(
    "Encapsulation",
    "Inheritance (Pewarisan)",
    "Polymorphism",
    "Abstraction",
    "Coupling"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Inheritance (Pewarisan)",
    skalaPoin = null,
    pembahasan = "Inheritance mendefinisikan hubungan *is-a* antar-kelas. Kelas turunan (*subclass/child class*) otomatis memiliki akses ke properti kelas induk (*superclass/parent class*) yang memiliki akses kontrol public atau protected."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_90",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Praktik otomasi pengembangan software yang menggabungkan integrasi kode secara kontinu ke repositori bersama (CI) dan melakukan rilis deployment otomatis ke lingkungan server produksi (CD) dikenal sebagai...",
    pilihan = listOf(
    "Agile Scrum Framework",
    "DevOps (CI/CD Pipeline)",
    "Rapid Application Development",
    "Component-Based Architecture",
    "Extreme Programming"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. DevOps (CI/CD Pipeline)",
    skalaPoin = null,
    pembahasan = "CI/CD (Continuous Integration/Continuous Deployment) dalam budaya DevOps mengotomatiskan proses build, pengujian, hingga pengiriman kode ke server menggunakan alat bantu seperti Jenkins, GitHub Actions, atau GitLab CI."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_91",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam sistem operasi, kondisi di mana dua atau lebih proses mengakses dan memanipulasi data bersama secara konkuren, dan hasil akhir dari eksekusi tergantung pada instruksi proses mana yang selesai lebih dahulu disebut...",
    pilihan = listOf(
    "Deadlock",
    "Race Condition",
    "Starvation",
    "Context Switching",
    "Paging Fault"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Race Condition",
    skalaPoin = null,
    pembahasan = "Race Condition terjadi saat beberapa thread/proses berbagi memori tanpa sinkronisasi yang tepat. Masalah ini diselesaikan dengan mengisolasi kode manipulasi data tersebut ke dalam 'Critical Section' menggunakan Mutex atau Semaphore."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_92",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Mekanisme manajemen memori pada sistem operasi yang memindahkan halaman data (pages) dari memori utama (RAM) ke penyimpanan sekunder (seperti partisi SWAP) ketika RAM penuh dinamakan...",
    pilihan = listOf(
    "Fragmentation",
    "Virtual Memory (Paging/Swapping)",
    "Cache Memory Mapping",
    "Interprocess Communication",
    "Dynamic Linking"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Virtual Memory (Paging/Swapping)",
    skalaPoin = null,
    pembahasan = "Virtual Memory mengizinkan sistem operasi mengeksploitasi media penyimpanan harddisk/SSD sebagai ekstensi logis dari RAM, sehingga komputer dapat menjalankan program yang ukurannya melebihi kapasitas RAM fisik."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_93",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Layanan komputasi awan (Cloud Computing) di mana pengguna menyewa infrastruktur komputasi murni berupa server virtual, storage, dan network, namun wajib mengelola OS dan runtime sendiri disebut...",
    pilihan = listOf(
    "Software as a Service (SaaS)",
    "Platform as a Service (PaaS)",
    "Infrastructure as a Service (IaaS)",
    "Function as a Service (FaaS)",
    "Data as a Service (DaaS)"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Infrastructure as a Service (IaaS)",
    skalaPoin = null,
    pembahasan = "Contoh IaaS adalah AWS EC2 atau Google Compute Engine. Di sini penyedia cloud hanya menyediakan hardware virtual, sedangkan instalasi sistem operasi, database, dan security patching menjadi tanggung jawab penuh penyewa."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_94",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Teknologi virtualisasi modern yang bekerja dengan cara berbagi kernel sistem operasi host (Containerization) sehingga jauh lebih ringan dan cepat dibandingkan virtualisasi berbasis Hypervisor tradisional adalah...",
    pilihan = listOf(
    "VMware ESXi",
    "VirtualBox",
    "Docker",
    "KVM",
    "Microsoft Hyper-V"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Docker",
    skalaPoin = null,
    pembahasan = "Docker menerapkan containerization yang mengisolasi aplikasi pada level user-space dengan menggunakan kernel OS host yang sama. Hal ini membuatnya jauh lebih efisien dalam penggunaan RAM dibandingkan VM (Virtual Machine) yang harus memuat OS utuh di setiap instans-nya."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_95",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Framework tata kelola teknologi informasi (IT Governance) standar global yang berfokus pada penyelarasan strategi IT dengan tujuan bisnis perusahaan serta pembagian kontrol objektif adalah...",
    pilihan = listOf(
    "ITIL (IT Infrastructure Library)",
    "COBIT (Control Objectives for Information and Related Technology)",
    "TOGAF",
    "ISO 27001",
    "PMBOK"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. COBIT (Control Objectives for Information and Related Technology)",
    skalaPoin = null,
    pembahasan = "COBIT dirancang khusus sebagai alat kontrol tata kelola IT strategis untuk menjembatani celah antara risiko teknis, kebutuhan kontrol, dan isu-isu bisnis institusi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_96",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam sistem operasi Linux, perintah CLI yang digunakan untuk mengubah hak akses (read, write, execute) dari suatu file atau direktori adalah...",
    pilihan = listOf(
    "chown",
    "chmod",
    "chgrp",
    "ls -la",
    "touch"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. chmod",
    skalaPoin = null,
    pembahasan = "`chmod` (change mode) digunakan untuk mengubah permission file/folder menggunakan notasi angka (seperti 755 atau 644) maupun simbolis (seperti +x). Sementara `chown` digunakan untuk mengubah kepemilikan (*owner*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_97",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Sistem file standar (Default File System) yang digunakan oleh sebagian besar distribusi sistem operasi Linux modern saat ini adalah...",
    pilihan = listOf(
    "NTFS",
    "FAT32",
    "exFAT",
    "Ext4",
    "APFS"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "D. Ext4",
    skalaPoin = null,
    pembahasan = "Ext4 (Fourth Extended Filesystem) adalah sistem file bawaan (standard) pada Linux yang mendukung kapasitas volume besar, fitur journaling untuk mencegah kerusakan data saat listrik padam tiba-tiba, serta performa baca-tulis yang stabil."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_98",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Algoritma penjadwalan prosesor (CPU Scheduling) yang bersifat non-preemptive di mana proses yang pertama kali meminta jatah CPU akan dieksekusi terlebih dahulu disebut...",
    pilihan = listOf(
    "Round Robin",
    "Shortest Job First (SJF)",
    "First-Come, First-Served (FCFS)",
    "Priority Scheduling",
    "Multilevel Queue"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. First-Come, First-Served (FCFS)",
    skalaPoin = null,
    pembahasan = "FCFS menjadwalkan proses secara linear berdasarkan urutan waktu kedatangan di *ready queue*. Kelemahan utamanya adalah potensi terjadinya Convoy Effect (proses kecil terhambat karena menunggu proses raksasa di depannya selesai)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_99",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam arsitektur Cloud Computing, platform orkestrasi kontainer open-source berskala besar yang berfungsi mengotomatiskan deployment, penskalaan (scaling), dan manajemen klaster kontainer Docker disebut...",
    pilihan = listOf(
    "Jenkins",
    "Kubernetes (K8s)",
    "Ansible",
    "Terraform",
    "Prometheus"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Kubernetes (K8s)",
    skalaPoin = null,
    pembahasan = "Kubernetes mengelola ribuan kontainer di lingkungan produksi secara otomatis melalui fitur-fitur canggih seperti auto-scaling, self-healing (merestart kontainer gagal), dan load balancing antar-node."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_100",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Dalam standardisasi manajemen layanan IT berdasarkan ITIL framework, proses yang bertujuan mengembalikan operasi layanan IT ke kondisi normal secepat mungkin guna meminimalkan dampak gangguan bisnis disebut...",
    pilihan = listOf(
    "Problem Management",
    "Incident Management",
    "Change Management",
    "Release Management",
    "Asset Management"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Incident Management",
    skalaPoin = null,
    pembahasan = "Incident Management berfokus pada kecepatan pemulihan layanan (solusi sementara / workaround diizinkan). Hal ini berbeda dengan Problem Management yang bertugas mencari akar penyebab masalah (*root cause analysis*) agar gangguan tidak terulang lagi."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_101",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Istilah bagi program kecil yang bertindak sebagai antarmuka penerjemah antara sistem operasi dan komponen perangkat keras (hardware) agar hardware tersebut dapat dikenali dan berfungsi dengan benar adalah...",
    pilihan = listOf(
    "Firmware",
    "Device Driver",
    "Kernel",
    "BIOS",
    "Compiler"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Device Driver",
    skalaPoin = null,
    pembahasan = "Device Driver menyediakan jembatan komunikasi instruksi software tingkat tinggi dari sistem operasi menuju instruksi biner spesifik komponen hardware bersangkutan."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_102",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Kategori komputasi awan yang menyediakan lingkungan eksekusi berbasis peristiwa (event-driven) di mana developer hanya mengunggah potongan kode fungsi terkecil tanpa perlu memikirkan keberadaan server fisik maupun virtual sama sekali dinamakan...",
    pilihan = listOf(
    "Monolithic Cloud",
    "Container-as-a-Service",
    "Serverless Computing (FaaS)",
    "Dedicated Hosting",
    "Edge Computing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Serverless Computing (FaaS)",
    skalaPoin = null,
    pembahasan = "Serverless (seperti AWS Lambda atau Google Cloud Functions) mengenakan biaya komputasi murni hanya pada saat kode fungsi tersebut dipicu dan dieksekusi (*pay-per-use*), membebaskan pengembang dari pengelolaan server."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_103",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Standardisasi internasional untuk sistem manajemen keamanan informasi (Information Security Management System / ISMS) yang wajib dipenuhi oleh instansi penyedia layanan IT publik adalah...",
    pilihan = listOf(
    "ISO 9001",
    "ISO 14001",
    "ISO 27001",
    "ISO 20000",
    "ISO 31000"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. ISO 27001",
    skalaPoin = null,
    pembahasan = "ISO/IEC 27001 merupakan standar internasional pengelolaan aspek keamanan informasi, mencakup kebijakan aset data, manajemen risiko siber, kepatuhan hukum, dan kontrol akses fisik/digital."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_104",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam arsitektur komputer dan sistem operasi, struktur kode program inti paling dalam yang menjembatani hubungan antara software aplikasi dengan CPU, memori, dan hardware adalah...",
    pilihan = listOf(
    "Shell",
    "Desktop Environment",
    "Kernel",
    "System Call",
    "API Bridge"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Kernel",
    skalaPoin = null,
    pembahasan = "Kernel bertindak sebagai jantung dari sistem operasi, mengelola alokasi waktu prosesor, manajemen ruang memori, serta akses driver hardware secara aman (*kernel space*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_105",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Konsep pengelolaan infrastruktur server cloud menggunakan file konfigurasi deskriptif terpusat (seperti file YAML atau Terraform HCL) sebagai pengganti konfigurasi manual lewat UI panel disebut...",
    pilihan = listOf(
    "Continuous Deployment",
    "Infrastructure as Code (IaC)",
    "Software Defined Storage",
    "Configuration Profiling",
    "Cloud Automation System"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Infrastructure as Code (IaC)",
    skalaPoin = null,
    pembahasan = "IaC memungkinkan tim operasional mereplikasi, memperbarui, dan memelihara ratusan arsitektur server secara cepat, konsisten, dan terukur menggunakan repositori kode skrip otomatis."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_106",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Skenario kegagalan sistem di mana suatu aplikasi terus-menerus mengalokasikan memori pada RAM namun gagal melepaskannya kembali setelah selesai digunakan, sehingga RAM komputer lama-kelamaan habis disebut...",
    pilihan = listOf(
   "Buffer Overflow",
    "Memory Leak (Kebocoran Memori)",
    "Stack Underflow",
    "Segment Fault",
    "Cache Thrashing"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Memory Leak (Kebocoran Memori)",
    skalaPoin = null,
    pembahasan = "Memory Leak dipicu oleh kesalahan logika pemrograman (misal referensi objek yang tidak diputus). Jika dibiarkan berjalan lama, sistem operasi akhirnya akan mengalami kehabisan RAM dan mematikan aplikasi secara paksa (*Out of Memory Error*)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_107",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Metode pencadangan data (Backup) yang hanya menyalin file-file yang mengalami perubahan atau penambahan baru sejak cadangan terakhir (apapun jenis backup terakhirnya) dilakukan disebut...",
    pilihan = listOf(
   "Full Backup",
    "Differential Backup",
    "Incremental Backup",
    "Mirror Backup",
    "Snapshot Backup"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "C. Incremental Backup",
    skalaPoin = null,
    pembahasan = "Incremental Backup sangat menghemat kapasitas storage cadangan karena hanya menyalin data delta terbaru dari backup hari sebelumnya. Berbeda dengan Differential Backup yang menyalin seluruh perubahan kumulatif dari Full Backup terakhir."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_108",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di bawah ini, manakah yang merupakan representasi alamat sistem direktori tingkat teratas (Root Directory) yang sah pada sistem operasi berbasis UNIX / Linux?",
    pilihan = listOf(
    "C:\\",
    "/",
    "~",
    "/root",
    "../"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. /",
    skalaPoin = null,
    pembahasan = "Pada sistem keluarga UNIX/Linux, seluruh hierarki folder dimulai dari karakter tunggal garis miring (*forward slash*) `/` yang melambangkan Root. Karakter `~` melambangkan Home direktori user aktif."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_109",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Strategi mitigasi bencana infrastruktur IT yang menentukan batas waktu maksimal yang diperbolehkan untuk memulihkan operasional sistem kembali pasca-terjadinya insiden kegagalan disebut...",
    pilihan = listOf(
    "Recovery Point Objective (RPO)",
    "Recovery Time Objective (RTO)",
    "Maximum Tolerable Downtime (MTD)",
    "Service Level Agreement (SLA)",
    "Disaster Response Window"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Recovery Time Objective (RTO)",
    skalaPoin = null,
    pembahasan = "RTO mengukur target durasi durasi pemulihan sistem (kecepatan perbaikan hardware/software). Sedangkan RPO mengukur ambang batas maksimal toleransi kehilangan data yang dihitung dalam satuan waktu (misal data 4 jam terakhir hilang)."
    ),

    QuestionEntity(
    idSoal = "TKB_tik_110",
    kategori = "TKB",
    subKategori = "TIK",
    pertanyaan = "Di dalam arsitektur web server terdistribusi, perangkat atau perangkat lunak yang bertugas membagi beban trafik jaringan masuk secara merata ke beberapa node backend server guna mencegah overload dinamakan...",
    pilihan = listOf(
    "Reverse Proxy",
    "Load Balancer",
    "Firewall Gateway",
    "CDN (Content Delivery Network)",
    "Name Server"
    ),
    tipeScoring = "STANDAR",
    jawabanBenar = "B. Load Balancer",
    skalaPoin = null,
    pembahasan = "Load Balancer menggunakan algoritma pembagian beban kerja (seperti Round Robin atau Least Connections) untuk memastikan ketersediaan tinggi (*High Availability*) dan skalabilitas aplikasi web saat menerima lonjakan trafik."
    )
    )
}