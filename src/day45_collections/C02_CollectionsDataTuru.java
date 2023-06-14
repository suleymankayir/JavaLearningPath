package day45_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Collections <dataTuru> nu Object secilmesi durumunda collections'a farkli data turlerinden object
        koymaniza izin verir.

        Bu da bize depolama acisindan esneklik saglar.

        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan oturu cok fazla casting yapmamiz
        gerekebilir.

         */

        List<String> liste = new ArrayList<>();


        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" Can");
        list.set(2,!(Boolean)list.get(2));

        System.out.println(list);




    }
}
