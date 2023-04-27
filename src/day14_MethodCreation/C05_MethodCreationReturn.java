package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("Girdiginiz sehir: " + sehir);
        System.out.println("Gİrdirdiginiz tarih " + tarih);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz:");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu yaziniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("Lütfen 1-12 arasında bir sayi giriniz");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("Lütfen ayın kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("Gun no olarak 1-31 arasında sayi girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun ;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sehir adi giriniz");
        String sehirAdi = scan.next().toUpperCase();
        return sehirAdi ;
    }
}
