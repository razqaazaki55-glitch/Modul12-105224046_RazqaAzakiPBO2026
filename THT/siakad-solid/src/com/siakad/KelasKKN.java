package com.siakad;

public class KelasKKN implements MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public KelasKKN(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String getKode() { return kode; }
    @Override
    public String getNama() { return nama; }
    @Override
    public int getSks() { return sks; }
}
