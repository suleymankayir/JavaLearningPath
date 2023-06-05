package day36_InheritanceDataTypeUsage;

public class DMemur {
    int saatUcreti = 11;
    int gunlukMesai = 9;


    protected void maas(){
        System.out.println("Memurlar :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }


    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }
}
