package day27_staticKeyword;

public class C01 {


    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {



        /*
        class level'da iki tur variable olusturabiliriz:
        1- static(class) variable
        2- instance(obje) variable

        static variable'lar tum class'tan kullanılabilirken
        isntance olanlar static olmayan method'lar kullanılabilir.
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

         */

        C01 obj1 = new C01();
        System.out.println(obj1.rakam);//5
        System.out.println(sayi);//10
        obj1.rakam += 1;
        sayi+=1;
        System.out.println(obj1.rakam);//6
        System.out.println(sayi);//11
        System.out.println("////////////////////////////////");
        C01 obj2 = new C01();
        System.out.println(obj2.rakam);//5
        System.out.println(sayi);//11
        obj2.rakam += 1;
        sayi+=1;
        System.out.println(obj2.rakam);//6
        System.out.println(sayi);//12
        /*
        obje ile olusturulan rakam degerinden de gorulecegi uzere instance(obje) ya da non static variable'lar
        yeni obje olusturuldugunda class icinde sadece obje olusturulduktan sonra bir atama yapılmışmı ona bakar
        sonrasında eger yok ise class level'dan variable degeri alir.
        ancak static(class) variable ise class'in basindan o asamaya gelene kadar ki durumuna bakarak deger yazdirir.


         */


    }


}
       