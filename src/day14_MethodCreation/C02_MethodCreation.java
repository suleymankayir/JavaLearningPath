package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        int  input = 423;

        rakamlariTopla(input);
        C01_MethodCreation.terstenYazdir("okan");
    }

    private static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println("Girdiginiz " + temp + " sayisinin rakamlar toplami:" + rakamlarToplami);
    }
}
