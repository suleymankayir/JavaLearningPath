package day12_stringManipulation;

public class C06_Substring {
    public static void main(String[] args) {
        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 5678 1234 2142";

        System.out.println(isim.substring(3)); // --> eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // --> fil
        System.out.println(isim.substring(2,4)); // --> le

        // isim,soyisim ill harfi buyuk harf, geriye kalan *
        // kart no ilk 4 rakamı gorunsun gerisi *

        String isimİlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");
        String soyisimİlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimKalanlar = soyisim.substring(1).replaceAll("\\w","*");
        String ilk4KartNo = kartNo.substring(0,4);
        String kartNoKalanlar = kartNo.substring(4,kartNo.length()).replaceAll("\\d", "*");
        System.out.println(isimİlkHarf+isimGeriyeKalanlar + " "
                            + soyisimİlkHarf + soyisimKalanlar
                            + "\n" + ilk4KartNo + kartNoKalanlar);

    }
}
