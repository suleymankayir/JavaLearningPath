package day12_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {
        /*
        Verilen String'deki istenen karakter(ler)i istenen karakter(ler) ile degistirir.
         */
        String str = "Java ogrenmek cok kolay";
        System.out.println(str.replace("a","x"));
        System.out.println(str.replace("Java", "x"));
        System.out.println(str.replace("a","xxx"));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace('a','x'));
    }
}
