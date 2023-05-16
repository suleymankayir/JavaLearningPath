package day25_constructor;

public class car {
    /*
    Bu class bizim kalıphanemiz bir araba olusturmak icin ihtiyacımız olan
    variable ve method'lari bu class'da belirleriz.

    sonrasında da farkli class'larda araba olusturmamız gerekirse bu class'dan bir obje olusturup
    burada belirlenen variable ve methodlara gore araba uretiriz.
     */

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil;
    int fiyat;


    public void benzinliAracMethodu(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba "+ hiz + " hiz yapar");
    }

}
