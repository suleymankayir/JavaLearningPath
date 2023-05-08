package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Elma");
        urunler.add("Armut");
        urunler.add("Muz");
        urunler.add("Ayva");

        List<String> eskiUrunler = new ArrayList<>();
        String urun = "Bisküvi";
        String silinecekUrun = "Armut";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp,urun);
        eskiUrunler.add(silinenUrun);

        System.out.println(urunler);
        System.out.println(eskiUrunler);
    }
}
