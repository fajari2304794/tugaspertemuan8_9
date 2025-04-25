package pbo._10_polymorphism.Soal2;

public final class Fakultas extends Karyawan {
    protected int jamKerja;
    protected String pangkat;

    Fakultas(){
        jamKerja = 8;
        pangkat = "Dekan";
    }

    Fakultas(int jamKerja, String pangkat){
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String toString(){
        String hasil = super.toString("Fakultas");
        return hasil + "\nJam kerja : " + jamKerja + "\nPangkat : " + pangkat;
    }
}
