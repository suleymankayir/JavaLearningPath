package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim-soyisim-yasinizi giriniz \naralarda enter'a basın");

        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();

        System.out.println("Isim: " + isim + " Soyisim : " + soyisim + " Yas : " + yas );

    }
}
