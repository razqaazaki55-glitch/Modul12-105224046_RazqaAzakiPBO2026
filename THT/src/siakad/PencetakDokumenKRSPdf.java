package siakad;

public class PencetakDokumenKRSPdf implements PencetakDokumenKRS {

    private String formatKopSurat;

    public PencetakDokumenKRSPdf(String formatKopSurat) {
        this.formatKopSurat = formatKopSurat;
    }

    @Override
    public void cetakDraftKRS(RiwayatKRS riwayatKRS) {
        // surat yang dikonfigurasi. Mengubah formatKopSurat tidak akan
        // memengaruhi kelas penyimpanan data sama sekali.
        System.out.println("Mencetak draf KRS ke PDF dengan kop surat: " + formatKopSurat);
        System.out.println("Isi draf KRS untuk mahasiswa " + riwayatKRS.getMahasiswa().getNama()
                + " semester " + riwayatKRS.getSemester());
    }
}
