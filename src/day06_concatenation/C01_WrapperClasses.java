package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java cok guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi= true;
        // guzelMi. boolean primitive olduğundan method gelmez.
        Boolean buGuzelMi = true;
        // buGuzelMi. dediğimizde ise javanın wrapper class oluşturmasından ötürü bazı methodlar kullanılabilir.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli sifre giriniz :");
        String sifre = scan.nextLine();
        Integer sifreSayisi = Integer.parseInt(sifre);
        System.out.println("Sifre : " + sifre);
        System.out.println("SifreSayisi: " + sifreSayisi );
        // wrapped classta int Integer olarak, char ise Character olarak yazılır diğerleri yine aynı şekilde.
    }
}
