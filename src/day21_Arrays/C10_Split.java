package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        bir array metodu degil String metodudur. ancak array dondurur.

         split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup,
         bir array haline getiriyoruz.
         */

        String str = "Java ne kadar guzel";
        String [] kelimeler = str.split(" "); // boslukları kaldırarak her bosluga kadar olanları array'e ekliyor
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]
        String [] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String [] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); //[Java n,  kadar guz, l]

        String [] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
        // "" ile split kullanırsak bütün stringi tek parça halinde bir array'e dondurur.
    }
}
