package com.siakad;

import java.util.List;

public class SiakadApp {
    public static void main(String[] args) {
        KRSRepository repository = new CloudNoSQLKRSRepository(); 
        KRSValidator validator = new KRSValidator();
        KRSPrinter printer = new KRSPrinter();

        KRSManager manager = new KRSManager(repository, validator, printer);

        List<MataKuliah> mkMahasiswa = List.of(
            new KelasTeori("T01", "Algoritma dan Struktur Data", 3),
            new KelasPraktikum("P01", "Praktikum Algoritma", 1),
            new KelasKKN("K01", "Kuliah Kerja Nyata", 4)
        );

        DataKRS krs = new DataKRS("MHS12345", mkMahasiswa);
        UKTCalculationStrategy skemaMBKM = new MBKMUKTStrategy();
        
        manager.prosesKRS(krs, skemaMBKM);
    }
}
