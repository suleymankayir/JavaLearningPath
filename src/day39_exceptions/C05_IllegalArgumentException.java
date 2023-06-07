package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            } else {
                System.out.println("Yasiniz " + yas);
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz"); // err mesaji kirmizi yazdirmak icin
        }
    }
}
