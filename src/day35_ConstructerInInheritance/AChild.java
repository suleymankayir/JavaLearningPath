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
        AChild child1 = new AChild();
        child1.grandpaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";
        // child1 objesi icin Child cons calisir.
        /*
        Java'da bir class'i kullanabilmek icin o class'dan obje olusturur, dolayisiyla o class'in
        constructror'ini kullanirdik.

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur.

        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde Child. cons. kullaniriz.

        Java Child(){} gordugunde once parent'in cons.'ini kullanmam lazım der. Buradan parent cons'a gider.
        Parent class'inda Parent(){} gorunce once bunun parent'i yani GrandParent cons. calismasi gerekir der.

        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak tum constructurlari asagi dogru
        calistirir.
         */


    }
}
