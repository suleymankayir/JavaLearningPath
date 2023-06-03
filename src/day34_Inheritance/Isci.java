package day34_Inheritance;

public class Isci extends Personel{
    /*
    Normal hayatta parent cocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    mesela isci class'i olusturdugumuzda nelere ihtiyaci oldugunu
    Personel class'indaki tum variable ve method'lara ihtiyaci oldugunu
    gorebiliriz.

    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'i kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz.

    bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere (variable + method) otomatik olarak
    sahip olur.
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir.
    3- Parent class'da olmayan bazi yeni ozellikler olusturabilir.
    not: parent class'daki ozelliklerden hicbirini reddedemez ancak degistirebilir.

     */
    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim);
        isci1.isim = "Selim";
        System.out.println(isci1.persNo);// variable kendi classimizda
        // oldugu icin(guncel) parent classtan bilgi almaya ihtiyac kalmaz.


        isci1.maas();
    }

    public void maas(){
        System.out.println("Isciler min 15 euro saat ücreti alir.");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir.");

    }
}
