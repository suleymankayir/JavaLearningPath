package day18_While_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=0;
        /*while (sayi%2==0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek sayi");
            }
        }
        */


        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek sayi");
            }
        } while (sayi%2==0);
    }
}
