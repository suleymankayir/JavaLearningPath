package day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi araligi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sonuc = 0;
        for (int i = sayi1; i <= sayi2 ; i++) {
            sonuc += i;


        }
        System.out.println(sonuc);

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayi araligi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        topla(sayi1,sayi2);
    }

    public static void topla(int sayi1, int sayi2) {
        int sonuc = 0;
        for (int i = sayi1; i <=sayi2 ; i++) {
            sonuc += i;

        }
        System.out.println(sonuc);
    }
}
