package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<0){
            System.out.println("Lütfen gecerli bir yas giriniz.");
        }
        else if (yas >= 65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsınız, " + (65-yas) + " yil daha calismalisiniz.");
        }
    }
}
