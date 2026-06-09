import java.util.HashMap;
import java.util.Map;

public class PenyimpananKeretaLokal implements PenyimpananKereta {
    private Map<String, KeretaApi> daftarKereta;
    
    public PenyimpananKeretaLokal() {
        daftarKereta = new HashMap<String, KeretaApi>();
        daftarKereta.put("K01", new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.put("K02", new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public KeretaApi get(String kode) {
        return daftarKereta.get(kode);
    }

    public Iterable<KeretaApi> values() {
        return daftarKereta.values();
    }
}