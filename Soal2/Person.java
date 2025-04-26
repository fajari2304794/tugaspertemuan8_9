package pbo._10_polymorphism.Soal2;

public class Person {
    protected String nama;
    protected String alamat;
    protected String nomorTelepon;
    protected String email;

    Person() {
        this.nama = "Fajari";
        this.alamat = "Bandung";
        this.nomorTelepon = "0895-2467-0977";
        this.email = "fajariarkan@upi.edu";
    }

    Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String toString() {
        return "Kelas : Person" + "\nNama : " + nama + 
               "\nAlamat : " + alamat + "\nNomor Telepon : "
                + nomorTelepon + "\nEmail : " + email;
    }
    
    public String toString(String className) {
        return "Kelas : " + className + "\nNama : " + nama + 
               "\nAlamat : " + alamat + "\nNomor Telepon : "
                + nomorTelepon + "\nEmail : " + email;
    }
}