package day14_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime giriniz");
        String input = scan.nextLine();
        terstenYazdir(input);
        day13_MethodCreation.C01_MethodCreation.topla(6,5);
    }
    public static void terstenYazdir(String input){
        String tersInput = input.substring(3)+input.substring(2,3)
                +input.substring(1,2)+ input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi : " + tersInput);

    }
}
