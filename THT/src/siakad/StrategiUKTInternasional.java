package siakad;

public class StrategiUKTInternasional implements StrategiKalkulasiUKT {

    private double tarifDasarPerSks;
    private double kelipatanTarifInternasional;

    public StrategiUKTInternasional(double tarifDasarPerSks, double kelipatanTarifInternasional) {
        this.tarifDasarPerSks = tarifDasarPerSks;
        this.kelipatanTarifInternasional = kelipatanTarifInternasional;
    }

    @Override
    public double hitungUKT(Mahasiswa mahasiswa) {
        return tarifDasarPerSks * 24 * kelipatanTarifInternasional;
    }
}
