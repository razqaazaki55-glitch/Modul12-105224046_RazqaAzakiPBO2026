package com.kampus.siakad.akademik;

public class MataKuliahPraktikum implements OperasiMataKuliah, OperasiPraktikum {
    @Override
    public String getNamaMataKuliah() {
        return "Praktikum Jaringan Komputer";
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Menyiapkan Asisten Lab...");
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Mengecek Peralatan...");
    }
}
