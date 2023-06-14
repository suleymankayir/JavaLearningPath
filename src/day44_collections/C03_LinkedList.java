package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {


        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Berk");
        ll2.add("Azure");
        ll2.add("Cemre");
        ll2.add("Dilek");

        System.out.println(ll2.remove("A"));
        System.out.println(ll2.remove(3));
        /*
        eger listemiz Integer elementlerden olusuyorsa direk sayi yazarsak index olarak kabul eder.
        Bir variable'a atama yapar ve remove'da o variable'in ismini yazarsak obje olarak kabul eder.

         */

        System.out.println(ll2.remove("Kemal"));
        System.out.println(ll2.isEmpty());

        ll2.set(1,"Serap");
        System.out.println(ll2);
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);
        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 dekilerle karsilastirir ll1'de olmayanlari siler.

        System.out.println(ll2 );


    }
}
