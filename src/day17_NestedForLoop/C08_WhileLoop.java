package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;
        while (!sifreBasariliMi) {

            System.out.println("Lütfen bir sifre giriniz");
            sifre = scan.nextLine();

            if ((sifre.charAt(0)>= 'A') && (sifre.charAt(0)<= 'Z')){
                kontrol++;
            } else {
                System.out.println("İlk harf buyuk harf icermiyor");
            }

            if ((sifre.charAt(sifre.length()-1)>= 'a') && (sifre.charAt(sifre.length()-1)<= 'z')){
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf icermiyor");
            }

            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol ++;
            }

            if (sifre.length()>=8){
                kontrol++;

            } else {
                System.out.println("Sifre 8 karakterden az");
            }
            if (kontrol==4){
                System.out.println("Sifre basari ile kaydedildi.");
                sifreBasariliMi = true;
            } else {
                kontrol = 0; // 4 'ten az ise basa döndügünde kodu calismaz hale getirir.
            }

        }
    }
}
