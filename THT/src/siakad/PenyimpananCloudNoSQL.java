package siakad;

public class PenyimpananCloudNoSQL implements PenyimpananRiwayatKRS {

    private CloudNoSQLConnection cloudNoSQLConnection;

    public PenyimpananCloudNoSQL(CloudNoSQLConnection cloudNoSQLConnection) {
        this.cloudNoSQLConnection = cloudNoSQLConnection;
    }

    @Override
    public void simpanRiwayatKRS(RiwayatKRS riwayatKRS) {
        String dataRiwayatKRS = "NIM=" + riwayatKRS.getMahasiswa().getNim()
                + ", Semester=" + riwayatKRS.getSemester()
                + ", TotalUKT=" + riwayatKRS.getTotalUKT();
        cloudNoSQLConnection.simpanDokumen(dataRiwayatKRS);
    }
}
