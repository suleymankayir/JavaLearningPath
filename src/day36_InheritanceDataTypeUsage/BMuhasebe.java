package day36_InheritanceDataTypeUsage;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai = 8;


    protected  void maas(){
        System.out.println("Personel min : " + (30*gunlukMesai*saatUcreti)  + " maas alir." );
    }

    protected void ozelSigorta(){
        System.out.println("İsteyen calisanlara %50 indirimli ozel sigorta yaptirilir.");
    }

}
