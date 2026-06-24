package siakad;

public class StrategiUKTReguler implements StrategiKalkulasiUKT {

    private double tarifDasarPerSks;

    public StrategiUKTReguler(double tarifDasarPerSks) {
        this.tarifDasarPerSks = tarifDasarPerSks;
    }

    @Override
    public double hitungUKT(Mahasiswa mahasiswa) {
        return tarifDasarPerSks * 24;
    }
}
