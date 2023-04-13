package day03_scanner;

import java.util.Scanner;

public class C09_ScannerPractise {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        char ilkHarf = scan.next().toUpperCase().charAt(1);
        System.out.println(ilkHarf);
        System.out.println("İsminiz: " + isim  + "\nSoyisminiz:" + soyisim + "\nTeşekkürler");


    }
}
