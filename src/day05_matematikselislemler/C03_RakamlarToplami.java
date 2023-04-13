package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tam sayı giriniz: ");
        int sayi= scan.nextInt(); // 5267

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        birlerBasamagi = sayi%10; // --> bB = 7
        rakamlarToplami += birlerBasamagi; // rT = 0+7 bB = 7
        sayi /= 10; // -> 526
        birlerBasamagi = sayi%10; // -> bB = 6
        rakamlarToplami += birlerBasamagi; // rT = 7+6 bB = 6
        sayi /= 10; // -> 52
        birlerBasamagi = sayi%10; // -> bB = 2
        rakamlarToplami += birlerBasamagi; // rT = 13+2 bB = 2
        sayi /= 10; // -> 5
        birlerBasamagi = sayi % 10; // bB= 5
        rakamlarToplami += birlerBasamagi; // rT = 15+5 bB = 5
        sayi /= 10; // -> 0
        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami: " + rakamlarToplami);

    }
}
