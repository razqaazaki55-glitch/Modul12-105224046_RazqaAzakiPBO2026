package siakad;

public class StrategiUKTKaryawan implements StrategiKalkulasiUKT {

    private double tarifDasarPerSks;
    private double biayaTambahanKelasKaryawan;

    public StrategiUKTKaryawan(double tarifDasarPerSks, double biayaTambahanKelasKaryawan) {
        this.tarifDasarPerSks = tarifDasarPerSks;
        this.biayaTambahanKelasKaryawan = biayaTambahanKelasKaryawan;
    }

    @Override
    public double hitungUKT(Mahasiswa mahasiswa) {
        return (tarifDasarPerSks * 24) + biayaTambahanKelasKaryawan;
    }
}
