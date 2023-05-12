package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueElement {
    public static void main(String[] args) {

        int [] arr = {2,3,5,6,3,5,4,1,9,6,3};

        int[] uniqueArray = uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));

    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        List<Integer> benzersizList = new ArrayList<>( );
        // yanındaki elemente esit olup olmadıgına gore list e ekliyor.
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] != arr[i+1]){
                benzersizList.add(arr[i]);

            }
        }
        // son elementi kontrol edip, yoksa listeye ekliyoruz.
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length-1]);
        }


        // benzersiz listenin size bilgisini kullanarak bir array olusturduk
        int[] tekrarsizArr = new int[benzersizList.size()];
        // benzersiz listteki elemanları arraye aktardık.
        for (int i = 0; i < tekrarsizArr.length ; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
            
        }
        return tekrarsizArr;
    }
}
