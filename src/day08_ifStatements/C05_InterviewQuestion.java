package day08_ifStatements;

import java.util.Scanner;

public class C05_InterviewQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen artık yıl kontrolü yapılacak sayıyı giriniz.");
        int sayi = scan.nextInt();
        if (sayi%4 == 0){
            if (sayi%100 != 0){
                System.out.println("Artık yildir.");
            } else if (sayi%400 == 0){
                System.out.println("Artık yildir");
            } else {
                System.out.println("Artık yıl değildir.");
            }
        /* KENDİ CEVABIM
            if (sayi%400 == 0 && sayi%100 == 0) {
                System.out.println("Artık yildir.");
            } else if (sayi%100 == 0) {
                System.out.println("Artık yıl değildir");
            } else {
                System.out.println("Artık yildir");
            }
        */




        } else {
            System.out.println("Artık yıl değildir.");
        }

    }
}
