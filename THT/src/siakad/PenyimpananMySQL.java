package siakad;

public class PenyimpananMySQL implements PenyimpananRiwayatKRS {

    private MySQLDatabaseConnection mySQLDatabaseConnection;

    public PenyimpananMySQL(MySQLDatabaseConnection mySQLDatabaseConnection) {
        this.mySQLDatabaseConnection = mySQLDatabaseConnection;
    }

    @Override
    public void simpanRiwayatKRS(RiwayatKRS riwayatKRS) {
        String dataRiwayatKRS = "NIM=" + riwayatKRS.getMahasiswa().getNim()
                + ", Semester=" + riwayatKRS.getSemester()
                + ", TotalUKT=" + riwayatKRS.getTotalUKT();
        mySQLDatabaseConnection.simpanData(dataRiwayatKRS);
    }
}
