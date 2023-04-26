package day10_stringManipulation;

public class C04_Length {
    public static void main(String[] args) {
        String str = "Java Ogren, Isi Kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));


        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildiği variable'in hic bir deger almadiginin göstergesidir.
         */

        String str2 = ""; // str2'ye bir deger atanmistir. Bu deger hicliktir.
        System.out.println(str2.length()); // 0
        String str3 = null; // str3'e bir deger atanmamistir. Null bu deger atamamayi göstermektedir.
        System.out.println(str3.length()); // deger atanmadigindan oturu uzunlugu yoktur.

    }
}
