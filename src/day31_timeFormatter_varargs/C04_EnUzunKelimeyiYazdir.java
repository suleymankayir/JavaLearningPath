package day31_timeFormatter_varargs;

public class C04_EnUzunKelimeyiYazdir {

    public static void main(String[] args) {

        enuUzunKelimeyiYazdir("Ali","Ayse","Ahmet","Mustafa");

    }

    public static void enuUzunKelimeyiYazdir(String...kelime) {

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
