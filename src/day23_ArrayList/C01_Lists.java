package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();


        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println(sayilar1.size());
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1.size());

        sayilar1.set(0,12); // 0. index 12 olarak set ediliyor.
        System.out.println(sayilar1); // [12, 3, 2, 5, 3, 2]

        System.out.println(sayilar1.set(1,4)); // 3 olarak yazdiriliyor cunku set edilip yazdırılınca silinen
        // deger(int) yazdıriliyor.
        System.out.println(sayilar1); // [12, 4, 2, 5, 3, 2] burda da set edilmis hali
        // elementi set methodundadiki silmek istemiyorsak add(index,deger) methodu kullaniyoruz.
    }
}
