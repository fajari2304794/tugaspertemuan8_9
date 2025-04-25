package pbo._10_polymorphism.Soal2;

public final class Student extends Person {
    final String kelas;

    Student() {
        this.kelas = "Mahasiswa tahun kedua Pendidikan Ilmu Komputer - B";
    }

    Student(String kelas) {
        this.kelas = kelas;
    }

    public String toString() {
        String hasil = super.toString("Student");
        return hasil + "\nStatus Kelas : " + kelas;
    }
}
