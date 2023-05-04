package day20_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        System.out.println(array.length); // arraylerde length yazdıktansonra () yazılmaz.
        String harfler[] = new String[4];
        System.out.println(Arrays.toString(harfler)); // default value String te null oldugu icin 4 null yazar.
        System.out.println(harfler[harfler.length-1]); // default value String
    }
}
