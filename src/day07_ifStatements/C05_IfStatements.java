package day07_ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char harf = scan.next().charAt(0);
        if ((harf>= 'a' && harf<= 'z') || (harf>= 'A' && harf <= 'Z')){
            System.out.println("harf");
        } else {
            System.out.println("Harf degil");
        }
    }
}
