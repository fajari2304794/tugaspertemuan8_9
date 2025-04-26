package pbo._10_polymorphism.Soal1;

public class Segitiga extends ObjekGeometris {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    Segitiga() {
        super();
        sisi1 = 1;
        sisi2 = 1;
        sisi3 = 1;
    }

    Segitiga(double sisi1, double sisi2, double sisi3) {
        super();
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    double getArea() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    public String toString(){
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
