package day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        int [] arr = {5,7,8,10};

        elemanDegistir(arr);

        System.out.println("Method calismasi sonrasi" + Arrays.toString(arr));
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);

        System.out.println(Arrays.toString(arr));
    }
}
