package day10_stringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("t"));
        /*
        t str icinde yok ancak indexOf methodu ınt return type'a sahip.
        o sebeple yok seklinde bir degeri de bulunmuyor.
        0 da index'in ilki oldugu icin Java bu konuda özel bir deger tanimis
        bu degerde -1 java bu degeri her seferinde dondurur.
         */

        String str5 = "asfilskimlgğwkrwöeağ,sdcv,mqüwlqwğü,eqsçc";
        if (str5.indexOf("e")==-1){
            System.out.println("Bu karakter yoktur");
        } else {
            System.out.println("Bu karakter " + str5.indexOf("e") + ". indexte kullanılmistir");
        }
    }
}
