package day36_InheritanceDataTypeUsage;

public class EYanHizmetler extends BMuhasebe {
    int saatUcreti = 9;
    int gunlukMesai = 8;


    protected void maas(){
        System.out.println("Yan Hizmetler :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }


    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir.");
    }

    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un parent class'daki ayni isimdeki methodu etkisiz hale
        getirecek kendisinin spesifik ozelligini ortaya cikarmasidir.

        Overriding'i nerede dikkate aliyoruz?

        bir obje olusturulurken data turu ve constructur farklı ise

        eger bir obje olusturulurken data turu ve constructur farklı ise objenin ozelliklerini belirlerken
        3 konuya dikkat etmeliyiz
        1- Obje constructur'in oldugu class'da olusur.
        2- objenin ozelliklerini aramaya data turunun  oldugu class'dan baslariz.
        bu class'da aranan ozellik  bulunamazsa parent class'lara bakilir orada da bulunamazsa CTE verir.

        eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
        3- aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekiyor.
        eger override edilmis ise guncel degeri yazdiririz.
         */

        BMuhasebe yh1 = new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); //
        System.out.println(yh1.saatUcreti); //
        yh1.maas(); //
        yh1.ozelSigorta(); //
        yh1.sigorta(); //
        System.out.println(yh1.isim);  //
        System.out.println(yh1.soyisim); //
        System.out.println(yh1.departman); //


    }
}
