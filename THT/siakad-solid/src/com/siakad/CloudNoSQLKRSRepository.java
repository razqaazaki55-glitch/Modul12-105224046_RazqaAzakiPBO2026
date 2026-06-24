package com.siakad;

public class CloudNoSQLKRSRepository implements KRSRepository {
    @Override
    public void simpan(DataKRS krs) {
        System.out.println("Menyimpan KRS Mhs " + krs.getMahasiswaId() + " ke [Cloud NoSQL] secara asinkron...");
    }
}
