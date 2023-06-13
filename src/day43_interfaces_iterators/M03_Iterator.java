package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {


        List <Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        // liste'deki tum elementleri INDEX kullanmadan 3 artirin

        for (Integer each: liste
             ) {
            each +=3;
            System.out.print(each + "");
            
        }
        System.out.println("");
        System.out.println(liste);
        /*
        Java index yapisi olmayan collection'lardaki elementlere ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.
        Bunun yerine bize ıterator donduren list.interator() method'unu kullaniyoruz.
         */

        Iterator it1 = liste.listIterator();

        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
       // System.out.println(it1.next()); // 30'dan sonra element kalmaddigindan next() RTE verir.

        // Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek istenirse yeniden bir Iterator olusturmamiz gerekir.

        Iterator it2 = liste.iterator();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden "+liste);
        Iterator it3 = liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();

        }
        System.out.println("loop'dan sonra liste" + liste);

        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
        Bu da bize yetmez
         */



    }
}
