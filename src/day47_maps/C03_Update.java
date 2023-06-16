package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key) ==> verdigimiz key'in bize olup olmadigini bize boolean olarak dondurur.
        map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini dondurur.

        Not: map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz.
        eger value icindeki bir parcayi bumak istiyorsak map uzerinden manipulation yapmamiz lazim.

        map.get(key) ==> verilen key'e ait degeri dondurur.
         */

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));

        // verilen map'de degerleri JavaDeveloper olarak degistirelim
        // map'te replace tum value degerlerini degistrmek istediginizde kullanilir.
        // kısmi degisiklik yapılacaginda kullanilamaz.

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Map'i guncellemek icin key, yeniDeger'i map'e eklemeliyiz.
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin jer bir key'e ve ona ait value'ye ihtiyacim var.

        Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each: keySeti
             ) {
            eachValue= sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            key'lerin tamamini aldik her bir key'in value'sini getirdik value uzerinden degisikligi yapip
            yeni halini put(key, yeniDeger) ile map'e koyduk.
             */
        }

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
    }
}
