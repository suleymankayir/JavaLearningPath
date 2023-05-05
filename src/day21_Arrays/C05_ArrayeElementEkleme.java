package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        String [] sinifListesi= {"Ali can"};

        String eklenecekİsim  = "Murat";

        sinifListesi = elemanEkle(sinifListesi,eklenecekİsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekİsim) {

        String [] yeniSinifListesi = new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];

        }
        yeniSinifListesi[yeniSinifListesi.length-1] = eklenecekİsim;
        return yeniSinifListesi;
    }


}
