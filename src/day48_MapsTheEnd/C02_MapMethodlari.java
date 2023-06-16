package day48_MapsTheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap =ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.getOrDefault(104, "Yok"));
        System.out.println(sinifListMap.getOrDefault(110, "Yok"));

        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")!=null){
            System.out.println("Kayit basarili");
        } else {
            System.out.println("Eski degeri degistirmek istediginize emin misiniz?");
        }
    }
}
