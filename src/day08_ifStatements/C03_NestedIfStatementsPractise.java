package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfStatementsPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayi giriniz.");
        int sayi = scan.nextInt();
        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lütfen 4 basamaklı sayi girin");
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5'e bölünen cift sayi");
            } else {
                System.out.println("5'e bölünen tek sayi");
            }
        } else {
            System.out.println("Tekrar deneyin");
        }

    }
}

