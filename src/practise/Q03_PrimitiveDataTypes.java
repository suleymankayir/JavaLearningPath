package practise;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax); // soutv seklinde yazınca value'u da ekliyor.
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);

        float sayi1 = 1.23f;
        double sayi2 = 1.23;
        char karakter = 'a';
        boolean onerme = false;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("karakter = " + karakter);
        System.out.println("onerme = " + onerme);
    }
}
