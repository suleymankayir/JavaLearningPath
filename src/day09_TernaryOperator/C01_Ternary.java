package day09_TernaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println("Girdiginiz sayinin mutlak degeri : " + (sayi>=0 ? sayi: (-1*sayi)));

    }
}
