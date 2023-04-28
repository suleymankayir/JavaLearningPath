package day15_overloading_forLoop;

public class C01_MethodCreation {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        int sonuc = sayilariCarp(sayi1, sayi2);
        System.out.println(sonuc);

    }

    public static int sayilariCarp(int sayi1, int sayi2) {
        int carpma = sayi1*sayi2;
        return carpma;
    }
}
