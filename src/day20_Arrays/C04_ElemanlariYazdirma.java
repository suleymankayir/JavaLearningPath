package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[] = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(sayilar)); // array'in tamamı böyle yazdırılıyor.
        // tüm elemetlerini yazdirmak icinse asagidaki gibi
        for (int i = 0; i <sayilar.length ; i++) {
            if(i<sayilar.length-1) {
                System.out.print(sayilar[i] + ", ");
            } else {
                System.out.println(sayilar[i]);
            }
        }
    }
}
