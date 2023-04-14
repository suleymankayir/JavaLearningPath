package day09_TernaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        String sonuc = (harf>='a'&& harf<= 'z') ? ("Kucuk harf") :
                (harf>= 'A' && harf<= 'Z') ? ("Buyuk harf") : ("Gecersiz karakter" );
        System.out.println(sonuc);
    }
}
