package day10_stringManipulation;

import java.util.Locale;

public class C01_charAt {
    public static void main(String[] args) {
        String str = "Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // ilk harfi yazdırır --> J
        System.out.println(str.toUpperCase().charAt(7)); // --> R
        System.out.println(str.charAt(21)); //  --> L
        System.out.println(str.charAt(str.length()-1));
        // charAt kullandigimizda verdigi value char data type oldugundan dolayı
        // daha sonrasında String manipulation yapamayız.
        // String bir method kullanacaksak charAt'ten once kullanmalıyız."

    }
}
