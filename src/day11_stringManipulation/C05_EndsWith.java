package day11_stringManipulation;

public class C05_EndsWith {
    public static void main(String[] args) {
        /*
        endsWith()
        Verilen String'in istenen karakter(ler) ile bitip bitmedigini kontrol eder. Istenen karakter(ler)
        ile bitiyorsa TRUE, yoksa FALSE dondurur.
         */

        String str = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.endsWith("y")); // --> true
        System.out.println(str.endsWith("t")); // --> false
        System.out.println(str.endsWith("olay")); // --> true

        String str1 = "Ah be Java";
        System.out.println(str1.endsWith("ava")); // true
        System.out.println(str1.endsWith("be Java")); // true
        System.out.println(str1.endsWith("Ah be Java")); // true
        System.out.println(str1.endsWith("")); // true
    }
}
