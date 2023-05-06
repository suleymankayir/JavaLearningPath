package day22_MultiDimensionalArrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        int [][]  sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        int istenenToplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                if ((i == j)) {
                    istenenToplam+= sayilar[i][j];

                }


            }

        }
        System.out.println(istenenToplam);
        System.out.println(Arrays.deepToString(sayilar));
    }
}
