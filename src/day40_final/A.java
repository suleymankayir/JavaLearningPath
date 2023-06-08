package day40_final;

public class A {
    protected String isim = "Cuneyt";
   final static String OKUL = "Yildiz Koleji";
   /*
   Bir variable final olarak tanimlandiysa baska class'lardan veya icinde oldugumuz class'dan bu variable'a
   baska deger atanmasi mumukun degildir.

   Madem ki degeri degistirilemiyor static yaparak bu variable'a erisim kolaylastirilir.

   ve genelde final static olarak belirlenen variable isimleri buyuk harfle yazilir.
    */

    final void finalMethod(){
        System.out.println("Final methodlar override edilemez");
    /*
    bir methodu final olarak belirlersek bu method degistirilemez demektir.
     */
    }



}
