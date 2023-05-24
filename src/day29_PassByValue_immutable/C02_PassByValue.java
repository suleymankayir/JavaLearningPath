package day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        Birden fazla eleman iceren Array ve ArrayList gibi yapilarda da PassByValue gecerlidir.

        Eger methodda array ve listin kendisi degistirilirse PassByValue ozelligi nedeniyle Java degisen degeri
        degil array veya listin orjinal degerini alir.

        Ancak array veya list degistirilmeden icindeki elemanlar degistirilirse Java obje degismedigi icin
        (referans ayni) ayni array veya listi bize dondurur ancak icindeki elementler degismis olacaktir.
         */

        int[] arr = {3,5,8,10};

        arrayiDegistir(arr);

        System.out.println("Method sonrasi" + Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {
        Random rnd = new Random();
        arr = new int[3];
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method ici array" + Arrays.toString(arr));



    }
}
