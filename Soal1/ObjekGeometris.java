package pbo._10_polymorphism.Soal1;

public class ObjekGeometris {
    private String warna;
    private boolean isTerisi;

    ObjekGeometris(){
        warna = "putih";
        isTerisi = false;
    }

    String getWarna(){
        return this.warna;
    }

    boolean getIsTerisi(){
        return isTerisi;
    }

    void setWarna(String warna){
        this.warna = warna;
    }

    void setIsTerisi(boolean isTerisi){
        this.isTerisi = isTerisi;
    }
}
