package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        // bir gun önceki classtan araba olusturma
        Car car1 = new Car();
        // car1. dedigimizde variable'lar gozukmez cunku public variable degiller ancak methodlarda bu durum
        // soz konusu degil o sebeple baska bir package da bile kullanılabilir.
        System.out.println(car1.marka);
        /*
        Araba class'indan bir obje olustururken eger default constructor kullanıldıysa tum ozellikler
        icin tek tek deger atamak zorunda kaliriz.

         */
        Araba araba1 = new Araba();
        araba1.fiyat = 1000;
        araba1.yil = 2010;
        araba1.model = "Passat";
        araba1.marka = "VW";

        System.out.println("Fiyat: " + araba1.fiyat +"\nMarka: "+ araba1.marka +"\nYil: "+
                araba1.yil+"\nModel: "+ araba1.model );

        /*
        Eger bir obje olustururken bazi ozelliklerini argument olarak belirtip o ozelliklerde bir obje
        olusturmak istersek Java itiraz eder.
        Cunku her class'da default bir constructor bulunur ama o da parametresizdir.
        Bizim yeni ve parametreli constructor(lar)'a ihtiyacımız var.

         */

        Araba araba2 = new Araba("BMW","5.20",2020,150000);
        System.out.println("Fiyat: " + araba2.fiyat +"\nMarka: "+ araba2.marka +"\nYil: "+
                araba2.yil+"\nModel: "+ araba2.model );




    }
}
