package com.siakad;

public class MySQLKRSRepository implements KRSRepository {
    @Override
    public void simpan(DataKRS krs) {
        System.out.println("Menyimpan KRS Mhs " + krs.getMahasiswaId() + " ke [MySQL]...");
    }
}
