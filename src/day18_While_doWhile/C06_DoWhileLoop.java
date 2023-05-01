package day18_While_doWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        int pozSayiAdeti = 0;
        int negSayiAdeti = 0;
        int pozSayilarToplami = 0;
        int sayi = 0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere pozitif sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi>0){
                pozSayilarToplami += sayi;
                pozSayiAdeti++;
            } else if(sayi<0){
                negSayiAdeti++;
                System.out.println("Negatif sayi giremezsiniz.");
            }


        } while (sayi !=0);

        System.out.println("pozSayilarToplami = " + pozSayilarToplami);
        System.out.println("negSayiAdeti = " + negSayiAdeti);
        System.out.println("pozSayiAdeti = " + pozSayiAdeti);
    }
}
