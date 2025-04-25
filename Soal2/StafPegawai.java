package pbo._10_polymorphism.Soal2;

public final class StafPegawai extends Karyawan{
    protected String gelar;

    StafPegawai(){
        this.gelar = "Sarjana Pendidikan";
    }
    
    StafPegawai(String gelar){
        this.gelar = gelar;
    }

    public String toString(){
        String hasil = super.toString("Staf Pegawai");
        return hasil + "\nGelar : " + gelar;
    }
}
