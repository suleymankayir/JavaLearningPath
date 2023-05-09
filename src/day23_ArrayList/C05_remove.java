package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();


        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1); // [5, 3, 2]
        sayilar1.remove(1);
        System.out.println(sayilar1); // [5, 2, 1]
        /*
        sayilardan olusan bir list oldudugunda java remove methodunda direk index olarak kabul eder
         */
        Integer sil = 5;
        sayilar1.remove(sil);
        System.out.println(sayilar1); // [2, 1]
        // silinecek objeyi bir variable'a tanımlayabiliriz.
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1); //  [1]

    }
}
