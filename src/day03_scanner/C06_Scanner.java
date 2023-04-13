package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz:");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz:");
        String soyisim = scan.next();
        System.out.println("Lütfen yasinizi giriniz:");
        int yas = scan.nextInt();
        System.out.println("Isim: " + isim + " Soyisim : " + soyisim + " Yas : " + yas );
    }
}
