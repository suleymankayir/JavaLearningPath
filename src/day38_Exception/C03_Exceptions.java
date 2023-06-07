package day38_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan;

        int istenenIndex = 0;
        boolean kontrol = true;

        while (kontrol){
            try {
                scan = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira numarasini giriniz");
                istenenIndex = scan.nextInt();
                System.out.println("Aradiginiz urun: " + urunler[istenenIndex-1]);
                kontrol = false;
            } catch (InputMismatchException deneme) {
                System.out.println("Urun indeksi icin bir tam sayi girmeniz gerekli");

            }
        }




    }
     /*
        catch blogunun onundeki parantezde exception class'inin ismi ve yaninda o class'dan yakalanan
        exception'i atadigimiz variable'in ismi olur.

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz

        eger exception ile ilgili bilgileri kullaniciya verme ihtiyaci yoksa e kullanilmasa da kod calisir.

         */
}
