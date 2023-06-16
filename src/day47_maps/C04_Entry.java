package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {

    /*
    Java Entry<K, V> map'in icerisinde bulunan her bir kaydi
    K=V seklinde tutar. Dolayisiyla herhangi bir Enrty'e ulastigimizda hem key'e hem de value'ya
    ulasabilir ve istedigimiz islemleri yapabiliriz.

    entry.getKey() bize key'i getirir.
    entry.getValue() bize value verir.
    entry.setValue() value'yu istedigimiz deger olarak update eder.
     */
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        // map'in her bir elemani alt alta yazdirin.

        Set<Map.Entry<Integer,String>> sinifEnrtySet = sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEnrtySet
             ) {
            System.out.println(each);
        }
        //  Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim.
        String eachValue;
        for(Map.Entry<Integer,String> each: sinifEnrtySet
             ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }

        System.out.println(sinifListMap);




    }
}
