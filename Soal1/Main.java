package pbo._10_polymorphism.Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai sisi 1 : ");
        double sisi1 = in.nextDouble();
        System.out.print("Masukkan nilai sisi 2 : ");
        double sisi2 = in.nextDouble();
        System.out.print("Masukkan nilai sisi 3 : ");
        double sisi3 = in.nextDouble();
        System.out.print("Masukkan warna segitiga : ");
        String warna = in.next();
        System.out.print("Apakah mau diisi? (ya/tidak) : ");
        String isi = in.next();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setIsTerisi(isi.equals("ya"));
        segitiga.setWarna(warna);

        System.out.println();
        System.out.println(segitiga);
        System.out.println("Luas segitiga : " + segitiga.getArea());
        System.out.println("Keliling segitiga : " + segitiga.getPerimeter());
        System.out.println("Warna segitiga : " + segitiga.getWarna());
        System.out.println("Di isi : " + segitiga.getIsTerisi());
        in.close();

    }
}
