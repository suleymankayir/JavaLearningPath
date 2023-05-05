package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        String isimler[] = {"Basak","Nurullah","Fatih", "Adem","Enes" };
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananKelime = scan.nextLine();

        boolean sonuc = contains(isimler,arananKelime);
        if (sonuc){
            System.out.println("Girilen isim listede var.");
        } else {
            System.out.println("Girilen isim listede yok.");
        }
    }

    public static boolean contains(String[] isimler, String arananKelime) {
        boolean methodSonuc = false;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(arananKelime) ){
                methodSonuc = true;
            }

        }

        return methodSonuc;
    }
}
