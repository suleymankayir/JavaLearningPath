package day09_TernaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcadan bir sayı isteyin.
        sayı pozitifse yazdır.
        sayı sıfır veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi>0){
            System.out.println("Pozitif sayi");
        } else {
            System.out.println("Negatif sayi bir sayi daha giriniz");
            double sayi1 = scan.nextDouble();
            System.out.println(sayi1*sayi);
        }
    }
}
