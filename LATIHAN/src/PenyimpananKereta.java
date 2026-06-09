public interface PenyimpananKereta {
    KeretaApi get(String kode);
    Iterable<KeretaApi> values();
}