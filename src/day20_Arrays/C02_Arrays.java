package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int myArray[] = {9,10,11};
        System.out.println(myArray); // [I@2a84aee7 stack memory'deki referansını verir
        System.out.println(Arrays.toString(myArray));

        myArray[0] = 8;
        myArray[1] = 9;
        myArray[2] = 10;
        System.out.println(Arrays.toString(myArray));



        String sinifList[] = {"Ali","Mehmet","Azra"}; //  array içindeki elemanlar değisse de length değiştirilemez.
        System.out.println(Arrays.toString(sinifList));
        sinifList[1] = "Hasan";
        System.out.println(Arrays.toString(sinifList));
        System.out.println(sinifList[1]);
    }


}
