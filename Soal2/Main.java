package pbo._10_polymorphism.Soal2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Karyawan karyawan = new Karyawan();
        Fakultas fakultas = new Fakultas();
        StafPegawai stafPegawai = new StafPegawai();

        System.out.println(person);
        System.out.println(student);
        System.out.println(karyawan);
        System.out.println(fakultas);
        System.out.println(stafPegawai);
    }
}