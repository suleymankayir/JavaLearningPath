package day12_stringManipulation;

public class C05_ReplaceFirst {
    public static void main(String[] args) {
        /*
        Verilen String'deki istenen karakter(ler)in ilkini, istenen yeni karakter(ler) ile degistirir.
         */
        String str = "Java'da rakamlar 1234567890";
        System.out.println(str.replaceFirst("a","*"));
        System.out.println(str.replaceFirst("lar", "*"));
        System.out.println(str.replaceFirst("\\s", "*"));
        System.out.println(str.replaceFirst("\\D", "*"));
    }
}
