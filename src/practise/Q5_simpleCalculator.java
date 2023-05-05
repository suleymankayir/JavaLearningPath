package practise;

import java.util.Scanner;

public class Q5_simpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz.");
        double number1 = scan.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz.");
        double number2 = scan.nextDouble();
        System.out.println("Lütfen yapmak istediğiniz 4 işlemden birini giriniz");
        char islem = scan.next().charAt(0);

        double sonuc = 0.0;

        switch (islem) {
            case '+':
                sonuc = number1 + number2;
                break;
            case '-':
                sonuc = number1 - number2;
                break;
            case '*':
                sonuc = number1 * number2;
                break;
            case '/':
                sonuc = number1 / number2;
                break;
            default:
                System.out.println("İslem gecersiz.");
                break;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
