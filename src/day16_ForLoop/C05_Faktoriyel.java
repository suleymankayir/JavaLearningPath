package day16_ForLoop;

import java.util.Scanner;

public class C05_Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk faktoriyel alınacak pozitif tam sayiyi giriniz");
        int sayi = scan.nextInt();
        if (sayi <10 && sayi >0 ) {
            for (int i = sayi - 1; i > 0; i--) {
                sayi *= i;
            }
            System.out.println(sayi);
        } else if (sayi == 0){
            System.out.println("0!= 1'dir");
        } else {
            System.out.println("10'dan kucuk 0'dan buyuk bir pozitif tam sayi giriniz");
        }

    }
}
