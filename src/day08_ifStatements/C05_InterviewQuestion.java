package day08_ifStatements;

import java.util.Scanner;

public class C05_InterviewQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen artık yıl kontrolü yapılacak sayıyı giriniz.");
        int yil = scan.nextInt();
        if (yil%4 == 0){
            if (yil%100 != 0){
                System.out.println("Artık yildir.");
            } else if (yil%400 == 0){
                System.out.println("Artık yildir");
            } else {
                System.out.println("Artık yıl değildir.");
            }
        /* KENDI CEVABIM
            if (yil%400 == 0 && yil%100 == 0) {
                System.out.println("Artık yildir.");
            } else if (yil%100 == 0) {
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
