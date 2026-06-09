public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private long hariTerlambat;

    public Peminjaman(Anggota anggota, Buku buku, long hariTerlambat) {
        this.anggota = anggota;
        this.buku = buku;
        this.hariTerlambat = hariTerlambat;
    }

    public Anggota getAnggota() { return anggota; }
    public Buku getBuku() { return buku; }
    public long getHariTerlambat() { return hariTerlambat; }
}