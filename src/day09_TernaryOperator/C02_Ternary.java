package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi>= 0 ? "Sayi pozitif": (sayi*sayi));
        // Eger ternary icindeki data türleri farklı ise atama yapılamaz
        // sadece yazdırabiliriz.
    }
}
