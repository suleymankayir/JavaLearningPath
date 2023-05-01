package day17_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        int toplam = 0;
        int sayi = 0;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        while (toplam <=500){
            System.out.println("Lütfen sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
    System.out.println("Toplamda " + sayac + " sayi girdiniz ve toplamlari : " + toplam);
    }
}
