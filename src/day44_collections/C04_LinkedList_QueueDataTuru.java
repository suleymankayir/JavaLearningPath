package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        /*
        Queue kuyruk demektir, sira onemlidir. gelen sona gelir, giden bastan gider.
         */

        System.out.println(ll3.remove()); // queue'nin ilk elemani gideceginden bize sormadan direk ilk elemani siler.
        System.out.println(ll3.remove("Hpolat"));


        System.out.println(ll3.element());
        System.out.println(ll3.peek());

        Queue<String> ll4 = new LinkedList<>();
        // System.out.println(ll4.element()); ---> NoSuchElementException firlatir.
        // System.out.println(ll4.peek()); ---> list bos ise null dondurur
        /*
        peek ve element ilk elemani silmeden bize dondurur
        aralarindaki fark ise bos list olursa peek null dondurur, element ise exception throwlar.
         */

        ll3.offer("Ahmet");
        ll3.offer("Zekai");
        System.out.println(ll3);
        // offer methodu da add gibi String bir elemani list'e sondan ekler.

        System.out.println(ll3.poll()); // remove() ile ayni islemi gorur ilk elemani silip bize dondurur.
        // ayrildigi kisim ise list bos ise bize null dondurur. remove ise bize NoSuchElementException verir.

        System.out.println(ll3);

    }
}
