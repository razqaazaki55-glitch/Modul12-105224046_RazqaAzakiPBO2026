package siakad;

public class StrategiUKTBidikmisi implements StrategiKalkulasiUKT {

    private double tarifSubsidiPerSks;

    public StrategiUKTBidikmisi(double tarifSubsidiPerSks) {
        this.tarifSubsidiPerSks = tarifSubsidiPerSks;
    }

    @Override
    public double hitungUKT(Mahasiswa mahasiswa) {
        return tarifSubsidiPerSks * 24;
    }
}
