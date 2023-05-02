package day19_Scope;

public class C01_InstanceVariables {
    /*
    Class icerisinde her yerden kullanmak istedigimiz variable'lari class level'da
    (Class'ın icinde ama methodl'ların disinda) genellikle class level variable'lar
    class'in basinda olusturulurlar.

    class level variable 2 adet mevcuttur.
    1- static variables(Class variableri'da denir.)
    2- instance(static olmayan) variables(obje variable'i da denir
     */
    int instSayi = 20; // static olmayıp class level'da oldugu icin class variable'dir.
    public static void main(String[] args) {

        /*
        System.out.println(instSayi);
        instance variables static olmadigi icin static'e üye main method'da kullanamayiz.
        instance variables'larin diger adi object variable'dir.
        dolayisiyla obje olusturursak instance variable'lari her yerden kullanabiliriz.
         */
        C01_InstanceVariables obj1 = new C01_InstanceVariables();
        System.out.println(obj1.instSayi); // 20
        obj1.instSayi = 30;
        System.out.println(obj1.instSayi); // 30
        C01_InstanceVariables obj2 = new C01_InstanceVariables();
        System.out.println(obj2.instSayi); // 20
        obj2.instSayi = 25;
        System.out.println(obj2.instSayi); // 25
        C01_InstanceVariables obj3 = new C01_InstanceVariables();
        System.out.println(obj3.instSayi); // 20
        /*
        Her obje olusturuldugunda instance (obje) variable'in ilk atanan degerini alir.
         */
    }


    public static void staticMethod(){
    // bir methodun icinde olusturulan variable sadece o methodun icinde kullanılabilir.(Local variables)
        /*
        instSayi = 30;
        instance variable'lara main method'da oldugu gibi static olan diger methodlarda da kullanamayiz.
        obje olusturursak kullanabiliriz.
         */
        C01_InstanceVariables obj4 = new C01_InstanceVariables();
        System.out.println(obj4.instSayi);
    }

    public void staticOlmayanMethod(){
        System.out.println(instSayi);
        /*
        instance variable'lar class icerisindeki static olmayan methodlarda direk kullanılabilir.
         */

    }
}
