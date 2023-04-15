package day12_stringManipulation;

public class C07_Substring {
    public static void main(String[] args) {
        String str = "Java cok yasa";

        System.out.println(str.substring(3,4)); // --> a
        System.out.println(str.substring(5,7)); // --> co
        System.out.println(str.substring(6,6)); // --> ""
    }
}
