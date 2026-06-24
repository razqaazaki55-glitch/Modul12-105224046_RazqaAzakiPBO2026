package siakad;

public class Mahasiswa {

    private String nim;
    private String nama;
    private JalurMasuk jalurMasuk;
    private int jumlahSksDiambilSebelumnya;

    public Mahasiswa(String nim, String nama, JalurMasuk jalurMasuk, int jumlahSksDiambilSebelumnya) {
        this.nim = nim;
        this.nama = nama;
        this.jalurMasuk = jalurMasuk;
        this.jumlahSksDiambilSebelumnya = jumlahSksDiambilSebelumnya;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public JalurMasuk getJalurMasuk() {
        return jalurMasuk;
    }

    public int getJumlahSksDiambilSebelumnya() {
        return jumlahSksDiambilSebelumnya;
    }
}
