public class TampilanController implements TampilanSistem {

    public void tampilkanJadwal(Iterable<KeretaApi> daftarKereta) {
        System.out.println("=== Jadwal Kereta ===");
        for(KeretaApi kereta: daftarKereta){
            System.out.println("Kode Kereta: " + kereta.getKodeKereta());
            System.out.println("Kode: " + kereta.getKodeKereta() + "|" + "Nama Kereta: " + kereta.getNamaKereta() + "|" + "Rute: " + kereta.getRute() + "|" + "Kapasitas: " + kereta.getSisaKursi());       
        }
    }

    public void cetakKonfirmasi(String nama, String nik, KeretaApi keretaDipesan, int jumlah) {
        System.out.println("=== Konfirmasi Pemesanan ===");
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Kereta: " + keretaDipesan.getNamaKereta() + " (" + keretaDipesan.getKodeKereta() + ")");
        System.out.println("Rute: " + keretaDipesan.getRute());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Sisa Kursi: " + keretaDipesan.getSisaKursi());
    }
}