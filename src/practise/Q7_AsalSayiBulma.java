package practise;

import java.util.Scanner;

public class Q7_AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = scan.nextInt();
        boolean asal = true;
        if (sayi < 2) {
            asal = false;
        } else {
            for (int i = 2; i < sayi ; i++) {
                if (sayi % i == 0) {
                    asal = false;

                }
            }
        }
        if (asal) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
