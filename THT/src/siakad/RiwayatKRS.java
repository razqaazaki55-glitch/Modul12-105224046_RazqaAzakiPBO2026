package siakad;

import java.util.List;

public class RiwayatKRS {

    private Mahasiswa mahasiswa;
    private List<MataKuliah> daftarMataKuliahDiambil;
    private String semester;
    private double totalUKT;

    public RiwayatKRS(Mahasiswa mahasiswa, List<MataKuliah> daftarMataKuliahDiambil, String semester, double totalUKT) {
        this.mahasiswa = mahasiswa;
        this.daftarMataKuliahDiambil = daftarMataKuliahDiambil;
        this.semester = semester;
        this.totalUKT = totalUKT;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public List<MataKuliah> getDaftarMataKuliahDiambil() {
        return daftarMataKuliahDiambil;
    }

    public String getSemester() {
        return semester;
    }

    public double getTotalUKT() {
        return totalUKT;
    }
}
