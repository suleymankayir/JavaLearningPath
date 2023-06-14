package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    // Deque acilimi double ended queue.
    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);

        System.out.println(ll4.pop()); // removeFirst() ile esdegerdir. ilk elemani dondurup ayni zamanda siler.
        System.out.println(ll4);

        // Deque'deki methodlar queue'den farkli olarak listeye bastan ve sondan erisilme durumundan dolayı
        // farklilik arz ediyor.



    }
}
