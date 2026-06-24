package siakad;

import java.util.List;

public class SistemKRSManager {

    private ValidasiPrasyaratService validasiPrasyaratService;
    private PenyediaStrategiUKT penyediaStrategiUKT;
    private PenyimpananRiwayatKRS penyimpananRiwayatKRS;
    private PencetakDokumenKRS pencetakDokumenKRS;

    public SistemKRSManager(ValidasiPrasyaratService validasiPrasyaratService,
                             PenyediaStrategiUKT penyediaStrategiUKT,
                             PenyimpananRiwayatKRS penyimpananRiwayatKRS,
                             PencetakDokumenKRS pencetakDokumenKRS) {
        this.validasiPrasyaratService = validasiPrasyaratService;
        this.penyediaStrategiUKT = penyediaStrategiUKT;
        this.penyimpananRiwayatKRS = penyimpananRiwayatKRS;
        this.pencetakDokumenKRS = pencetakDokumenKRS;
    }

    public void prosesPengisianKRS(Mahasiswa mahasiswa, List<MataKuliah> daftarMataKuliahDiambil, String semester) {

        // 1. Delegasi validasi prasyarat ke ValidasiPrasyaratService (SRP).
        for (MataKuliah mataKuliah : daftarMataKuliahDiambil) {
            boolean lolosValidasi = validasiPrasyaratService.validasiPrasyaratMataKuliah(mahasiswa, mataKuliah);
            if (!lolosValidasi) {
                throw new IllegalStateException("Mahasiswa " + mahasiswa.getNama()
                        + " tidak lolos prasyarat mata kuliah " + mataKuliah.getNamaMataKuliah());
            }
        }

        // 2. Delegasi kalkulasi UKT ke strategi sesuai jalur masuk mahasiswa (OCP).
        StrategiKalkulasiUKT strategiKalkulasiUKT = penyediaStrategiUKT.ambilStrategiUKT(mahasiswa.getJalurMasuk());
        double totalUKT = strategiKalkulasiUKT.hitungUKT(mahasiswa);

        // 3. Susun riwayat KRS.
        RiwayatKRS riwayatKRS = new RiwayatKRS(mahasiswa, daftarMataKuliahDiambil, semester, totalUKT);

        // 4. Delegasi penyimpanan riwayat KRS ke abstraksi PenyimpananRiwayatKRS (DIP).
        //    Implementasi konkretnya (MySQL atau Cloud NoSQL) tidak diketahui oleh kelas ini.
        penyimpananRiwayatKRS.simpanRiwayatKRS(riwayatKRS);

        // 5. Delegasi pencetakan draf KRS ke PencetakDokumenKRS (SRP).
        pencetakDokumenKRS.cetakDraftKRS(riwayatKRS);
    }
}
