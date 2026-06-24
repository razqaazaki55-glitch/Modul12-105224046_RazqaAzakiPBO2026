package com.siakad;

public class KelasPraktikum implements MataKuliahPraktikum {
    private String kode;
    private String nama;
    private int sks;

    public KelasPraktikum(String kode, String nama, int sks) {
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

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Mengalokasikan asisten lab untuk: " + nama);
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Mengecek ketersediaan peralatan lab untuk: " + nama);
    }
}
