package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli arraylerde array'i direk yazdiramiyoruz.
        cunku array non-primitive data türüdür ve
        her non-primitive data direk yazdiramayabilir.

        ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data veya String elementler kullaniliyordu

        Multi-dimensional array'lerde en dikkat edecegimiz konu, ulasmak
        iştedigimiz elementin bir array mi yoksa primitive data mı oldugudur
         */

        int[][] sayilar = {{1,2,4,5},{3,4}};

        System.out.println(sayilar); // [[I@2a84aee7

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2

        System.out.println(Arrays.toString(sayilar)); //[[I@a09ee92, [I@30f39991]

        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

    }
}
