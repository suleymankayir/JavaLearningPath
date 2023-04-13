package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        if (ilkHarf >= 'A' && ilkHarf<= 'Z'){
            if (ilkHarf == 'A'){
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }

        } else if (ilkHarf>= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        } else {
            System.out.println("LUtfen ilk karakter icin sadece harf kullanınız.");
        }
    }
}
