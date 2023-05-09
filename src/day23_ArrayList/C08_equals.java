package day23_ArrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");

        List<String> urunler2 = new ArrayList<>();

        urunler2.add("Armut");

        urunler2.add("Ayva");
        urunler2.add("Elma");
        urunler2.add("Muz");

        System.out.println(urunler.equals(urunler2));

        Collections.sort(urunler);
        Collections.sort(urunler2);
        System.out.println(urunler.equals(urunler2)); // true
    }
}
