package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;

        System.out.println(sayi1);
        System.out.println(sayi2);
    }
}
