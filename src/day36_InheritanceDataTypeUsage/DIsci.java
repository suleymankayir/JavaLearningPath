package day36_InheritanceDataTypeUsage;

public class DIsci extends BMuhasebe{
    int saatUcreti = 11;
    int gunlukMesai = 7;


    protected void maasIsci(){
        System.out.println("Isciler :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }


    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci(); // burda bir isci olusturuyoruz.

        /*
        Bir obje olusturulurken Data turu ve constructor ayni class'dan ise direk o class'a gidiyorduk

        Eger data turu ve constructor farklı class'dan ise obje constructor'in oldugu class objesidir.
        ancak bizden istenen İsci class'indaki spesifik ozellikler degil bir iscinin muhasebe class'indaki
        tum calisanlarla beraber sahip oldugu genel ozellikleri istiyoruz.

         */
        System.out.println(isc1.gunlukMesai); // BMuhasebe
        System.out.println(isc1.saatUcreti); // BMuhasebe
        isc1.maas(); // BMuhasebe
        isc1.ozelSigorta(); // BMuhasebe
        isc1.sigorta(); // APersonel
        System.out.println(isc1.isim);  // APersonel
        System.out.println(isc1.soyisim); // APersonel
        System.out.println(isc1.departman); // APersonel

        APersonel isc2 = new APersonel();

        // System.out.println(isc2.gunlukMesai); // BMuhasebe CTE
        // System.out.println(isc2.saatUcreti); // BMuhasebe CTE
        isc2.maas(); // BMuhasebe
        // isc2.ozelSigorta(); // BMuhasebe CTE
        isc2.sigorta(); // APersonel
        System.out.println(isc2.isim);  // APersonel
        System.out.println(isc2.soyisim); // APersonel
        System.out.println(isc2.departman); // APersonel
        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa varsa onun parent'ina gidebilir.
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir.
         */
    }
}
