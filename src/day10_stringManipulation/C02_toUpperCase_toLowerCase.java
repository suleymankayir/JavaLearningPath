package day10_stringManipulation;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {
        String str = "Beni psikopata baglamayin";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        // upper ya da lowerCase de locale bir dil için kullanılır.
    }
}
