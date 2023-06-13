package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class M04_listIterator {
    /*
    ListIterator Iterator interface'inin child interface'idir.
    ama daha cok method'a sahiptir.
     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
        Integer temp;
        ListIterator lit1= liste.listIterator();


        while(lit1.hasNext()){
            temp=(Integer) lit1.next()+3;
            lit1.set(temp);
        }
        System.out.println(liste);


    }
}
