package siakad;

public abstract class MataKuliah implements OperasiMataKuliah {

    protected String kodeMataKuliah;
    protected String namaMataKuliah;
    protected int sks;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    @Override
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    @Override
    public int hitungSks() {
        return sks;
    }
}
