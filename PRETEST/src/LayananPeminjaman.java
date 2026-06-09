public interface LayananPeminjaman {
    Peminjaman pinjamBuku(Anggota anggota, Buku buku);
    void kembalikanBuku(Peminjaman peminjaman);
}