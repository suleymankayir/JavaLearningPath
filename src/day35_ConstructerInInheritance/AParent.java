package day35_ConstructerInInheritance;

public class AParent extends AGrandParent {
    protected String isim ="Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Kulubü";

    AParent(){
        System.out.println("Parent constructor calisti");
    }
}
