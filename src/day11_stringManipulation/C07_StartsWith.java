package day11_stringManipulation;

public class C07_StartsWith {
    public static void main(String[] args) {
        /*
        Verilen String'in istenen karakter(ler) ile baslayip baslamadigini kontrol eder.
        Istenen karakter(ler) ile basliyorsa TRUE yoksa FALSE dondurur.
         */

        String str = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.startsWith("C")); // --> true
        System.out.println(str.startsWith("Calis")); // --> true
        System.out.println(str.startsWith("s",4)); // --> true
        System.out.println(str.startsWith("Java", 14)); // --> true
    }
}
