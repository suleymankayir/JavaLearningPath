package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        /*
        remove() methodu iki sekilde calisir
        1-objeyi yazip silinmesini istersek bize boolean donus yapar
        2-index girersek o index'deki elemani siler ve bize silinen elemani dondurur.
         */
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");

        System.out.println(urunler.remove("Armut"));
        System.out.println(urunler);

        System.out.println(urunler.remove("Biskevit"));
        System.out.println(urunler);

        System.out.println(urunler.remove(1));
        System.out.println(urunler);

        System.out.println(urunler.remove(3)); // runtime Error indexoutbounds

    }
}
