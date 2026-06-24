package com.kampus.siakad.manager;

import com.kampus.siakad.database.DatabaseConnection;
import com.kampus.siakad.keuangan.KalkulasiUKT;
import com.kampus.siakad.akademik.OperasiMataKuliah;

public class SistemKRSManager {
    private DatabaseConnection database;
    private KalkulasiUKT kalkulatorUKT;

    public SistemKRSManager(DatabaseConnection db, KalkulasiUKT kalkulator) {
        this.database = db;
        this.kalkulatorUKT = kalkulator;
    }

    public void prosesPengambilanKRS(OperasiMataKuliah mk) {
        System.out.println("Mata Kuliah : " + mk.getNamaMataKuliah());
        System.out.println("Total UKT   : Rp " + kalkulatorUKT.hitungTagihan());
        database.simpanRiwayatKRS("Berhasil Disimpan!");
    }
}
