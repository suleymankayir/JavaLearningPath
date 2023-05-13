package practise;

import java.util.Scanner;

public class Q11_AsalSayi {
    /*
    Asal sayı kontrolünde, bir sayının bölenlerini kontrol etmek için 2'den başlayarak sayının kareköküne
    kadar olan değerlere bakmak yeterlidir. Çünkü bir sayının böleni, sayının karekökünden büyük bir değerse,
    diğer böleni sayının karekökünden küçük olacaktır.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen araligin ilk degerini giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Bitis sayisini giriniz");
        int bitis = scan.nextInt();

        System.out.println("Asal Sayilar: ");


        for (int i = baslangic; i <=bitis ; i++) {
            if (isAsal(i)){
                System.out.println(i);
            }

        }

    }

    private static boolean isAsal(int sayi) {
        if (sayi<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi) ; i++) { // Math.sqrt sayinin karekökünü almak adına gerekli
            if(sayi%i==0){
                return false;
            }

        }
        return true;
    }
}
