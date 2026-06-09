public class SistemReservasi {
    
    //daftar kereta
    private PenyimpananKereta daftarKereta;
    private TampilanSistem tampilan;
    
    // Constructor
    public SistemReservasi(PenyimpananKereta daftarKereta, TampilanSistem tampilan) {
        this.daftarKereta = daftarKereta;
        this.tampilan = tampilan;
    }

    public void tampilkanJadwal() {
        tampilan.tampilkanJadwal(daftarKereta.values());
    }

    // Metode transaksi
    public void pesanTiket(String kode, String nik, String nama, int jumlah) 
        throws RuteTidakDitemukanException, TiketHabisException {
                
        // Validasi NIK
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK tidak valid! Harus tepat 16 digit angka.");
        }

        // Pencarian Kereta menggunakan key
        KeretaApi keretaDipesan = daftarKereta.get(kode);

        // Jika kereta tidak ditemukan, maka gagal akan dilempar ke Exception
        if (keretaDipesan == null) {
            throw new RuteTidakDitemukanException("Gagal: Kereta dengan kode " + kode + " tidak ditemukan.");
        }

        // Mengecek sisa Kursi
        if (jumlah > keretaDipesan.getSisaKursi()) {
            throw new TiketHabisException(keretaDipesan.getNamaKereta(), keretaDipesan.getSisaKursi());
        }

        // Jika semua pengecekan berhasil, maka jumlah kursi dikurangi 
        keretaDipesan.kurangiKursi(jumlah);

        // Menyerahkan cetakan konfirmasi ke interface tampilan
        tampilan.cetakKonfirmasi(nama, nik, keretaDipesan, jumlah);
    }
}