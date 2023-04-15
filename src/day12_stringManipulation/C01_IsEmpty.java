package day12_stringManipulation;

public class C01_IsEmpty {
    public static void main(String[] args) {
        /*
        Verilen String'in uzunlugu 0(sifir) ise (hicbir karakter icermiyorsa) TRUE yoksa FALSE dondurur
         */
        String str = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());
        String str3 = null; // isEMpty methodu uzunluga baktıgından ötürü null'ın uzunlugu olmadıgından ötürü
        // hata verir.
        System.out.println(str3.isEmpty());

    }
}
