package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        /*
        List primitive data type'larını kabul etmez.
         */

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5,3,7]
        // sadece add kullanirsak sırasıyla array olusturur.
        sayilar.add(2,10); // index 2 ye 10'u ekler.
        System.out.println(sayilar); // [5, 3, 10, 7]
        /*
        add(index,element) istedigimiz index'e istedigimiz elementi yerlestirir.
        add methodu eski elementleri silmez veya update etmez, belirtilen index'e element ekler.
         */
    }
}
