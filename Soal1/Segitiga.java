package pbo._10_polymorphism.Soal1;

public class Segitiga extends ObjekGeometris {
    private int sisi1;
    private int sisi2;
    private int sisi3;

    Segitiga() {
        super();
        sisi1 = 1;
        sisi2 = 1;
        sisi3 = 1;
    }

    Segitiga(int sisi1, int sisi2, int sisi3) {
        super();
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }

    void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }

    void setSisi3(int sisi3) {
        this.sisi3 = sisi3;
    }

    double getArea() {
        int s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    int getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    public String toString(){
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
