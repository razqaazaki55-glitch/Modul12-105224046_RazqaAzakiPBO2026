public interface TampilanSistem {
    void tampilkanJadwal(Iterable<KeretaApi> daftarKereta);
    void cetakKonfirmasi(String nama, String nik, KeretaApi keretaDipesan, int jumlah);
}