package day21_Arrays;

public class C01_Array_MaxSayiBulma {
    public static void main(String[] args) {
        int[] sayilar = {3,5,7,1,4,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxValue = sayilar[0];
        for (int i = 0; i < sayilar.length ; i++) {
            if (maxValue<sayilar[i]){
                maxValue = sayilar[i];
            }
        }
        System.out.println(maxValue);
    }
}
