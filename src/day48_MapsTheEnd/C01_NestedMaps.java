package day48_MapsTheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {
        /*
        ic ice map kullandigimizda daha kompleks datalari daha duzenli olarak tutma imkani olur ancak
        bu da beraberinde bilgiye ulasmayi ve kodu manipule etmeyi zorlastirir.

        Ornek olarak dunku map'imizi map'lerden olusan bir olarak olusturalim.
         */

        Map< String,String> ogr101 = new HashMap<String,String>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map< String,String> ogr102 = new HashMap<String,String>();
        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("brans","JDev");

        Map< String,String> ogr103 = new HashMap<String,String>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","DevOps");

        Map<Integer,Map<String,String>> ogrenciNestedMap = new HashMap<>();
        ogrenciNestedMap.put(101,ogr101);
        ogrenciNestedMap.put(102,ogr102);
        ogrenciNestedMap.put(103,ogr103);

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti  = ogrenciNestedMap.entrySet();
        for (Map.Entry each : ogrenciEntrySeti
             ) {
            System.out.println(each);
        }

       // 102 nolu kisinin ismini yazalim

        System.out.println(ogrenciNestedMap.get(102).get("isim"));


    }
}
