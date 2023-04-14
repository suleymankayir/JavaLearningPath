package day09_TernaryOperator;

public class C07_SwitchPractise {
    public static void main(String[] args) {
        int input = 99;

        switch (input){
            case 10:
                System.out.println("İki basamaklı en kucuk sayi");
                break;
            case 100:
                System.out.println("3 basamaklı en kucuk sayi");
                break;
            case 1000:
                System.out.println("4 basamaklı en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }
    }
}
