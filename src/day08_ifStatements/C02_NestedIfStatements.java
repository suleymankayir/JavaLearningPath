package day08_ifStatements;

import java.util.Scanner;

public class C02_NestedIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazınız \n(Erkek için E, kadın için K.).");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Geçersiz giris yapildi");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsınız" + (65 - yas) + "yıl daha calismalisiniz.");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Geçersiz giris yapildi");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsınız" + (65 - yas) + "yıl daha calismalisiniz.");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        } else {
            System.out.println("Hatalı cinsiyet girisi.");
        }
    }
}
