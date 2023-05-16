package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        // CAR 1
        car car1 = new car();
        car1.fiyat = 15000;
        car1.yil = 2020;
        car1.marka = "Toyota";
        System.out.println("Fiyat: " + car1.fiyat +"\nMarka: "+ car1.marka +"\nYil: "+ car1.yil+"\nModel: "+ car1.model );

        // CAR 2
        car car2 = new car();
        System.out.println("Fiyat: " + car2.fiyat +"\nMarka: "+ car2.marka +"\nYil: "+ car2.yil+"\nModel: "+ car2.model );
        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda Java degeri su sıralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi
        2- objenin olusturuldugu class'da bir deger atandi mi
        3-
         */



    }
}
