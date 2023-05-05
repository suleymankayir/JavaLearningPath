package practise;

import java.util.Scanner;

public class Q8_TersCevir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scan.nextLine();

        String tersKelime = "";

        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelime += kelime.charAt(i);
        }
        System.out.println(tersKelime);
    }
}
