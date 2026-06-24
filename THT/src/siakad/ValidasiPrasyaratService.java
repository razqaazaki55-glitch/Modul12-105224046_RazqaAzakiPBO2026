package siakad;

//SINGLE RESPONSIBILITY PRINCIPLE

public class ValidasiPrasyaratService {

    public boolean validasiPrasyaratMataKuliah(Mahasiswa mahasiswa, MataKuliah mataKuliah) {
        // Simulasi pengecekan prasyarat mata kuliah, misalnya jumlah SKS
        // yang sudah pernah diambil sebelumnya oleh mahasiswa.
        boolean lolosValidasi = mahasiswa.getJumlahSksDiambilSebelumnya() >= 0;
        System.out.println("Validasi prasyarat mata kuliah " + mataKuliah.getNamaMataKuliah()
                + " untuk mahasiswa " + mahasiswa.getNama()
                + " hasilnya: " + (lolosValidasi ? "LOLOS" : "TIDAK LOLOS"));
        return lolosValidasi;
    }
}
