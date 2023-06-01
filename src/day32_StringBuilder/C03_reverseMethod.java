package day32_StringBuilder;

public class C03_reverseMethod {

    public static void main(String[] args) {

        String input = "Hey gidi forLoop gunleri";

        String tersInput = tersineCevir(input);
        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();


    }
}
