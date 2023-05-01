package day18_While_doWhile;

public class C02_WhileLoop {
    public static void main(String[] args) {
        int input = 1234;
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;

        int temp = input;
        while (temp>0){
            birlerBasamagi = temp%10;
            rakamlarToplami += birlerBasamagi;
            temp/=10;
        }
        System.out.println(input + " sayisinin rakamlar toplami: " + rakamlarToplami);
    }
}
