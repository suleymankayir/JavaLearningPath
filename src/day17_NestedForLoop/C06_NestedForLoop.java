package day17_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        String input = "Deniz";
        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");

        }
        for (int i = input.length()-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");
        }
        /*
        for (int i = deniz.length() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(deniz.charAt(j));
            }
            System.out.println();
         */

    }
}
