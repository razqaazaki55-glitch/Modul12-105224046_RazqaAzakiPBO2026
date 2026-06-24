package siakad;

import java.util.ArrayList;
import java.util.List;

public class DemoSIAKAD {

    public static void main(String[] argumen) {

        // Siapkan strategi kalkulasi UKT untuk setiap jalur masuk yang sudah ada saat ini.
        PenyediaStrategiUKT penyediaStrategiUKT = new PenyediaStrategiUKT();
        penyediaStrategiUKT.daftarkanStrategiUKT(JalurMasuk.REGULER, new StrategiUKTReguler(150000));
        penyediaStrategiUKT.daftarkanStrategiUKT(JalurMasuk.KARYAWAN, new StrategiUKTKaryawan(150000, 2000000));
        penyediaStrategiUKT.daftarkanStrategiUKT(JalurMasuk.INTERNASIONAL, new StrategiUKTInternasional(150000, 3));
        penyediaStrategiUKT.daftarkanStrategiUKT(JalurMasuk.BIDIKMISI, new StrategiUKTBidikmisi(0));

        ValidasiPrasyaratService validasiPrasyaratService = new ValidasiPrasyaratService();
        PencetakDokumenKRS pencetakDokumenKRS = new PencetakDokumenKRSPdf("Kop Surat Universitas Versi 2026");

        // --- SKENARIO A: sistem masih berjalan di atas MySQL (kondisi awal). ---
        PenyimpananRiwayatKRS penyimpananMySQL = new PenyimpananMySQL(new MySQLDatabaseConnection());
        SistemKRSManager sistemKRSManagerMySQL = new SistemKRSManager(
                validasiPrasyaratService, penyediaStrategiUKT, penyimpananMySQL, pencetakDokumenKRS);

        Mahasiswa mahasiswaReguler = new Mahasiswa("2023010001", "Andi Saputra", JalurMasuk.REGULER, 18);
        List<MataKuliah> krsAndi = new ArrayList<>();
        krsAndi.add(new MataKuliahTeori("IF101", "Algoritma dan Struktur Data", 3));
        krsAndi.add(new MataKuliahPraktikum("IF102", "Praktikum Basis Data", 1));
        krsAndi.add(new MataKuliahKKN("KKN300", "Kuliah Kerja Nyata", 4));

        sistemKRSManagerMySQL.prosesPengisianKRS(mahasiswaReguler, krsAndi, " 2026/2027 Ganjil");

        System.out.println("------------------------------------------------------------");

        PenyimpananRiwayatKRS penyimpananCloudNoSQL = new PenyimpananCloudNoSQL(new CloudNoSQLConnection());
        SistemKRSManager sistemKRSManagerCloud = new SistemKRSManager(
                validasiPrasyaratService, penyediaStrategiUKT, penyimpananCloudNoSQL, pencetakDokumenKRS);

        Mahasiswa mahasiswaInternasional = new Mahasiswa("202372", "Rizqy Hergiansyah", JalurMasuk.INTERNASIONAL, 20);
        List<MataKuliah> krsLee = new ArrayList<>();
        krsLee.add(new MataKuliahTeori("IF101", "Algoritma dan Struktur Data", 3));
        // Mata kuliah baru dengan skema SKS MBKM, ditambahkan tanpa mengubah kelas mata kuliah lama.
        krsLee.add(new MataKuliahMBKM("MBKM010", "Magang Industri Bersertifikat", 6, 1.5));

        sistemKRSManagerCloud.prosesPengisianKRS(mahasiswaInternasional, krsLee, "2026/2027 Ganjil");

        System.out.println("------------------------------------------------------------");

        // Cukup daftarkan strategi UKT baru, tanpa membongkar strategi jalur lain.
        penyediaStrategiUKT.daftarkanStrategiUKT(JalurMasuk.BIDIKMISI, new StrategiUKTBidikmisi(0));
    }
}
