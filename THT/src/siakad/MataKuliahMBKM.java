package siakad;

public class MataKuliahMBKM extends MataKuliah {

    private double faktorKonversiSksMbkm;

    public MataKuliahMBKM(String kodeMataKuliah, String namaMataKuliah, int sks, double faktorKonversiSksMbkm) {
        super(kodeMataKuliah, namaMataKuliah, sks);
        this.faktorKonversiSksMbkm = faktorKonversiSksMbkm;
    }

    @Override
    public int hitungSks() {
        return (int) Math.round(sks * faktorKonversiSksMbkm);
    }
}
