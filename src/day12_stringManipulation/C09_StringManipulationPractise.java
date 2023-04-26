package day12_stringManipulation;

import java.util.Scanner;

public class C09_StringManipulationPractise {
    public static void main(String[] args) {
        /*
        String str = "Java ogrenmek123 Cok guzel@";
        // "Java ogrenmek cok guzel" seklinde yazdır
        str = str.replaceAll(" ", "space");
        str = str.replaceAll("\\W", "");
        str = str.replaceAll("\\d", "");
        str = str.replace("space", " ");
        str = str.replace("C", "c");
        System.out.println(str);



        // String iki deger toplami
        String str1 = "13.99";
        String str2 = "10.55";
        double toplam = Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println(toplam);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim = scan.next();
        if (!(isim.contains("a") && isim.contains("Z"))){
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor.");
        } else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }

         */


        /*
        Kullanıcidan sifre isteyelim.
        Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi"
        tasimiyorsa "Islem basarisiz, lütfen tekrar deneyin." yazdirin.
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre'de bosluk olmamali
        - Sifre 8 karakterden asagi olmamali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;
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

        if (kontrol == 4){
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz, tekrar deneyin");
        }
    }
}
