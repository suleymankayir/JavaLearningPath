package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenList {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozellik elemanlari tek tek eklemek
         */


        Integer [] arr = {2,3,4,5,6,6,7,8,9,1};
        /*
        bu kdara cok elemanlı listeyi tek tek girmek yerine array olusturup for loop ile olusturdugumuz liste
        tasiyabiliriz.
         */

        List<Integer> sayilar = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
            
        }
        System.out.println(sayilar);
        /*
        yukarıdaki işlem icin Java'nın özel bir methodu var ancak bu yöntemin bir çok yan etkisi var

        1- bu sekilde olusturulan listede add, remove, gibi size'ı degistiren method'lar KULLANILAMAZ.
        2- asList methodu ile olusturulan liste ve kaynak olan array birbiriyle ile ilisik olarak hayatlarına devam eder
        birinde yaptigimiz degisiklikler, otomatik olarak digerine de isler.
         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 4, 5, 6, 6, 7, 8, 9, 1, 5]

        /*sayilar2.add(5); // UnsupportedOperationException
        System.out.println(sayilar2); // error
        */

        arr[0] = 20;
        System.out.println(Arrays.toString(arr));
        System.out.println(sayilar2);



    }
}
