package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");


        System.out.println(urunler.contains("Elma")); // true

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Elma");
        urunler2.add("Armut");

        System.out.println(urunler.containsAll(urunler2)); // true

        urunler2.add("Hobby");

        System.out.println(urunler.containsAll(urunler2)); // false

    }
}
