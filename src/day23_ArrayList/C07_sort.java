package day23_ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");


        Collections.sort(urunler);
        System.out.println(urunler);
        /*
        List ile gelen sort methodunda sıralama özelligini girmek gerekiyor.
        bunun yerine Collections class'ından sort methodunu kullaniyoruz.
        bu method listemizi natural order'a gore siralar.
         */
    }
}
