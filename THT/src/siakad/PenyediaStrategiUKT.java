package siakad;

import java.util.HashMap;
import java.util.Map;

public class PenyediaStrategiUKT {

    private Map<JalurMasuk, StrategiKalkulasiUKT> daftarStrategiUKT;

    public PenyediaStrategiUKT() {
        this.daftarStrategiUKT = new HashMap<>();
    }

    public void daftarkanStrategiUKT(JalurMasuk jalurMasuk, StrategiKalkulasiUKT strategiKalkulasiUKT) {
        daftarStrategiUKT.put(jalurMasuk, strategiKalkulasiUKT);
    }

    public StrategiKalkulasiUKT ambilStrategiUKT(JalurMasuk jalurMasuk) {
        StrategiKalkulasiUKT strategiKalkulasiUKT = daftarStrategiUKT.get(jalurMasuk);
        if (strategiKalkulasiUKT == null) {
            throw new IllegalStateException("Belum ada strategi UKT terdaftar untuk jalur masuk " + jalurMasuk);
        }
        return strategiKalkulasiUKT;
    }
}
