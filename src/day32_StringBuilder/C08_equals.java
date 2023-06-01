package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb.equals(sb2)); // false
        System.out.println(sb.equals(str)); // false

        // StringBuilder'da equals methodu aynı obje olursa ancak true doner
        // Stringdeki gibi dusunulemez


        System.out.println(sb.compareTo(sb2)); // 0
        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb.compareTo(sb3)); // -4
        /*
        compareTo methodu iki sb'yi bastan baslayarak karsilastirir ve ilk farkli olan harfe kadar gider
        farklı olanı buldugu an farklı olan karakterlerin ascii degerlerini alara aradaki farki bize cikti verir.

        hic farkli harf yoksa 0 dondurur.
         */
    }
}
