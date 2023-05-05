package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary search Java'da eleman aramanin kısa yoludur.
        Ancak binary search'un calismasi icin once sirali hale
        getirilmesi gerekir.
        Eger sıralama yapilmadan binarySearch sonucu bulamayabilir ya da yanlıs bulur.
         */


        String[] harfler = {"Y","B","D","G","O" };

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));;

        // binarySearch bize aradigimiz elemanin indexini döndürür.
        // binarySearch ortadan başlayarak büyüklük kücüklüge göre saga sola gider.
        // o sebeple array'i sıralamak önem arz ediyor.
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
