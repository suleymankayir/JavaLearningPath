package day07_ifStatements;

import java.util.Scanner;

public class C04_IfStatementsPractise {
    public static void main(String[] args) {
        /* sayının tek mi çift mi olduğunu söylemek
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println("Cift sayi");
        }
        if (sayi%2 == 1) {
            System.out.println("Tek sayi");
        } */
        /* İLK HARFE GÖRE GÜNLERİ VEREN UYG.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk harfi giriniz.");
        char ilkHarf = scan.next().charAt(0);
        if (ilkHarf == 'p' || ilkHarf == 'P') {
            System.out.println("Pazartesi,Perşembe,Pazar");
        }
        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Salı");
        }
        if (ilkHarf == 'c' || ilkHarf == 'C') {
            System.out.println("Carsamba,Cuma,Cumartesi");
        }
        */
        /*HAFTANIN GÜNÜNÜ VEREN UYG.
         Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen haftanın bir gününü giriniz.");
         String gun = scan.nextLine().toUpperCase();

         if (gun.equals("PAZARTESİ")  || gun.equals("SALI") || gun.equals("CARSAMBA") || gun.equals("PERSEMBE") || gun.equals("CUMA")){
             System.out.println("Hafta ici");
         }
         if (gun.equals("CUMARTESİ") || gun.equals("PAZAR")){
             System.out.println("Hafta sonu");
         }

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas >= 65){                                                            
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsınız, " + (65-yas) + " yil daha calismalisiniz.");
        }
    }
}
