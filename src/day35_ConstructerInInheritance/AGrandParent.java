package day35_ConstructerInInheritance;

public class AGrandParent {


    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'da gorunmesede bile bir constructor vardir.
    Bu class'dan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin
    onun yerine kullanılabilecek parametresiz constructor olusturalim.
     */

    protected String grandpaKlupAdi = "Grandpa Kulubü";

    AGrandParent(){
        System.out.println("Grandpa construct calisti");
    }
}
