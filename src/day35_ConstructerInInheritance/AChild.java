package day35_ConstructerInInheritance;

public class AChild extends AParent{
    String isim = "Child isim belirtilemdi ";
    protected String childKlupAdi = "Child Kulubu";
    AChild(){
        System.out.println("Child constructor calisti");

    }

    public static void main(String[] args) {
        AGrandParent gp1 = new AGrandParent();
        /*
        BU objeyi olusturmak icin sadece Grandpa constructor calisir
        Parent veya child class calismaz
         */

    }
}
