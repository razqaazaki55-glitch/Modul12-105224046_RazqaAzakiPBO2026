package com.kampus.siakad.main;

import com.kampus.siakad.database.CloudNoSQLDatabaseConnection;
import com.kampus.siakad.keuangan.UKTMBKM;
import com.kampus.siakad.akademik.MataKuliahPraktikum;
import com.kampus.siakad.manager.SistemKRSManager;

public class MainSIAKAD {
    public static void main(String[] args) {
        System.out.println("=== SISTEM SIAKAD ===");
        CloudNoSQLDatabaseConnection db = new CloudNoSQLDatabaseConnection();
        UKTMBKM uktMBKM = new UKTMBKM();
        SistemKRSManager krsManager = new SistemKRSManager(db, uktMBKM);
        MataKuliahPraktikum mkPraktikum = new MataKuliahPraktikum();
        
        mkPraktikum.cekPeralatanPraktikum();
        mkPraktikum.alokasiAsistenLab();
        krsManager.prosesPengambilanKRS(mkPraktikum);
    }
}
