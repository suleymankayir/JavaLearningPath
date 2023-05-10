package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturmak {
    public static void main(String[] args) {


        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiList = new ArrayList<Integer>();

        while (sayiList.size() < 200){
            sayi = rnd.nextInt(1000);
            if (!sayiList.contains(sayi)){
                sayiList.add(sayi);
            }
        }
        System.out.println(sayiList);

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi){

            System.out.println("Lütfen bir sayi tahmininde bulununuz");
            sayi = scan.nextInt();
            if (sayiList.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde bulundunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet tahminde bulundunuz ama listede yok");
                tahminSayisi++;
            }

        }
    }
}
