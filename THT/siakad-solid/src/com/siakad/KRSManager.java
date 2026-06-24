package com.siakad;

public class KRSManager {
    private KRSRepository repository;
    private KRSValidator validator;
    private KRSPrinter printer;

    public KRSManager(KRSRepository repository, KRSValidator validator, KRSPrinter printer) {
        this.repository = repository;
        this.validator = validator;
        this.printer = printer;
    }

    public void prosesKRS(DataKRS krs, UKTCalculationStrategy uktStrategy) {
        System.out.println("\n--- Memulai Sistem Pengisian KRS ---");
        
        if (!validator.validasiPrasyarat(krs)) {
            System.out.println("Validasi gagal!");
            return;
        }

        int totalSks = krs.getMataKuliahList().stream().mapToInt(MataKuliah::getSks).sum();
        double tagihanUKT = uktStrategy.hitungUKT(totalSks);
        
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Tagihan UKT: Rp " + String.format("%.2f", tagihanUKT));

        for (MataKuliah mk : krs.getMataKuliahList()) {
            if (mk instanceof MataKuliahPraktikum) {
                MataKuliahPraktikum mkPraktikum = (MataKuliahPraktikum) mk;
                mkPraktikum.cekPeralatanPraktikum();
                mkPraktikum.alokasiAsistenLab();
            }
        }

        repository.simpan(krs);
        printer.cetakPDF(krs);
        
        System.out.println("--- Proses KRS Selesai ---");
    }
}
