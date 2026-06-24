package siakad;

public class MataKuliahPraktikum extends MataKuliah implements OperasiPraktikum {

    private boolean asistenLabSudahDialokasikan;
    private boolean peralatanPraktikumSudahDicek;

    public MataKuliahPraktikum(String kodeMataKuliah, String namaMataKuliah, int sks) {
        super(kodeMataKuliah, namaMataKuliah, sks);
        this.asistenLabSudahDialokasikan = false;
        this.peralatanPraktikumSudahDicek = false;
    }

    @Override
    public void alokasiAsistenLab() {
        this.asistenLabSudahDialokasikan = true;
        System.out.println("Asisten lab dialokasikan untuk mata kuliah " + getNamaMataKuliah());
    }

    @Override
    public void cekPeralatanPraktikum() {
        this.peralatanPraktikumSudahDicek = true;
        System.out.println("Peralatan praktikum dicek untuk mata kuliah " + getNamaMataKuliah());
    }
}
