package com.kampus.siakad.database;

public class CloudNoSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void simpanRiwayatKRS(String dataKrs) {
        System.out.println("Menyimpan ke Cloud NoSQL: " + dataKrs);
    }
}
