package day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {
        Integer[] sayilar = {5,7,1,6,4,3,9};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));


        for (int i = 0; i < sayilar.length-1 ; i++) {
            for (int j = 0; j < sayilar.length-1; j++) {
                if(sayilar[j]<sayilar[j+1]){
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j+1];
                    sayilar[j+1] = temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
