package day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {

        /*
        binary search ile aradigimiz eleman yoksa java bize hem olmadigini
        hem de olsaydi nerede olacagini dondurur.

        olmadigini ifade icin - kullanir.
        olsaydi nerede olacagini belirtmek icin index degil siralama(length) kullanir.

        Olanlarda index !!
        olmayanlarda length !!
         */
      int [] sayilar = {3,5,1,4,7,0}; // [0, 1, 3, 4, 5, 7]
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,3)); // 2
        System.out.println(Arrays.binarySearch(sayilar,-5)); // -1
        System.out.println(Arrays.binarySearch(sayilar,6)); // -6
        System.out.println(Arrays.binarySearch(sayilar,10)); // -7
        // - sayilar length'i indexi degil karistirma.
    }
}
