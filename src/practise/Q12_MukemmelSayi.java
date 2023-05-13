package practise;

import java.util.Scanner;

public class Q12_MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (isMukemmelSayi(sayi)) {
            System.out.println(sayi + " mükemmel bir sayidir.");

        } else {
            System.out.println(sayi + "mükemmel sayi degildir.");
        }
    }

    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 0; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }
        }
        return toplam == sayi;
    }
}
