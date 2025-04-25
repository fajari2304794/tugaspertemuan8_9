package pbo._10_polymorphism.Soal2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Karyawan extends Person {
    protected String kantor;
    protected String gaji;
    protected Date tanggalDiPekerjakan;

    Karyawan() {
        this.kantor = "PT. Indonesia Sejahtera";
        this.gaji = "Rp1.000.000";
        this.tanggalDiPekerjakan = MyDate("20-10-2020");
    }

    Karyawan(String kantor, String gaji, String tanggalDiPekerjakan) {
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDiPekerjakan = MyDate(tanggalDiPekerjakan);
    }

    public String toString() {
        String hasil = super.toString("Karyawan");
        return hasil + "\nKantor : " + kantor + "\nGaji : " + gaji + "\nTanggal Dipekerjakan : " + tanggalDiPekerjakan;
    }
    public String toString(String className) {
        String hasil = super.toString(className);
        return hasil + "\nKantor : " + kantor + "\nGaji : " + gaji + "\nTanggal Dipekerjakan : " + tanggalDiPekerjakan;
    }

    final protected Date MyDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggalDiPekerjakan = new Date();
        try {
            tanggalDiPekerjakan = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }
        return tanggalDiPekerjakan;
    }
}
