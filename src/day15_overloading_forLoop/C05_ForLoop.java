package day15_overloading_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            toplam +=i;
        }
        System.out.println(toplam);
        int toplam1 = 0;
        for (int i = 10; i <=20 ; i++) {
          toplam1 +=i;
        }
        System.out.println("toplam1 = " + toplam1);
        int toplam2 = 0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam2 += i;
        }
        System.out.println("toplam2 = " + toplam2);
        int toplam3 = 0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam3 +=i;
            }

        }
        System.out.println("toplam3 = " + toplam3);
    }
}
