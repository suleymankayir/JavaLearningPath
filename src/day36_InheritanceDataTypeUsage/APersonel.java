package day36_InheritanceDataTypeUsage;

public class APersonel {


    String isim ="Isim belirtilmedi";
    String soyisim ="Soyisim belirtilmedi";
    String departman = "Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir.");
    }

    protected void sigorta(){
        System.out.println("Tum personelimize sigorta yaptirilir.");
    }

}
