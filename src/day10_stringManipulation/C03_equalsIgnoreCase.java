package day10_stringManipulation;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "ALİ CAN";
        String str4 = "Ali Can_";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str4));

    }
}
