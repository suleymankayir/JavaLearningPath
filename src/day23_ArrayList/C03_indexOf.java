package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");

        System.out.println(urunler.indexOf("Elma"));

        /*
        indexOf bilgi döndürür bilgileri degistirmez
         */
        System.out.println(urunler.lastIndexOf("Elma"));
        /*
        indexOf method'u urunu aramaya bastan baslar.
        lastIndexOf ise sondan aramaya baslar

        arama bitip urun bulundugunda,
        ikisi de bulunan urunun index'ini verir.
         */
        System.out.println(urunler.lastIndexOf("ELMA")); // -1
    }
}
