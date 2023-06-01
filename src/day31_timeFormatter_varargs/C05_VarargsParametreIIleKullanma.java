package day31_timeFormatter_varargs;

public class C05_VarargsParametreIIleKullanma {

    public static void main(String[] args) {

        enuUzunKelimeyiYazdir(5,"Ali","Ayse","Ahmet","Mustafa");

    /*
    Varargs teorik olarak sınırsız element alabilir. bir method'da parametre olarak varargs varsa
    varargs'İn sınırlarını bilmesi icin parametrelerin sonuncusu olmak zorundadır.
    Oncesinde farklı parametreler olabilirken sonrasında OLAMAZ.
    Bu kuraldan ötürü bir methodda sadece 1 tane varargs olabilir.

     */


    }

    public static void enuUzunKelimeyiYazdir(int kelimeSayisi, String...kelime) {

        String enUzunKelime = kelime[0];

        for (String each: kelime
        ) {
            if (each.length() > enUzunKelime.length()){
                enUzunKelime = each;
            }
        }

        System.out.println(enUzunKelime);
    }
}
