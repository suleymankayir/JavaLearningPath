package practiseDay01;

import java.util.Scanner;

public class Q01_Sout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length()-1);

        if (ilkHarf>= 'A' && ilkHarf<= 'Z'){
            kontrol++;
        } else {
            System.out.println("İlk harf buyuk olmali");
        }
        if (sonHarf>= 'a' && sonHarf<= 'z'){
            kontrol++;
        } else {
            System.out.println("Son harf kucuk olmali");
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        } else {
            kontrol++;
        }
        if (sifre.length()>= 8){
            kontrol++;
        } else {
            System.out.println("Sifre 8 karakter olmali");
        }
        if (kontrol == 4){
            System.out.println("Kayıt başarılı");
        } else {
            System.out.println("Kayıt yanlış");
        }


    }
}
