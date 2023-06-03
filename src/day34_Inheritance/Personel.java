package day34_Inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladigimiz class varsa veya
    ileride bu class'i parent yapmak isteyenler olabilir diyorsak
    variable veya methodlarin access modifier'ini
    protected yapmamiz gerekir.
    protected yapmamiz halinde child olmayan classlar bu class'a
    ulasamazlar
    protected keywordu inheritance ile genellikle kullanilir.
     */


   protected int persNo;
   protected String isim = "Isim belirtilmedi";
   protected String departman = "Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir.");
    }

    protected void mesai(){
        System.out.println("Tum personel statüsüne göre mesai yapar.");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir.");

    }



}
