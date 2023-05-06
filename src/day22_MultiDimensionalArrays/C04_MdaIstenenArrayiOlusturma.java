package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {
       int[][] input = {{1,2,3},{4,5},{6,7}};
        int[] yeniArr = new int[input.length];
        int toplam = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {

            toplam += input[i][j];
                
            }
            yeniArr[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
