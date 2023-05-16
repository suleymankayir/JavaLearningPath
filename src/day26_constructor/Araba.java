package day26_constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;

    }
    /*
    Biz herhangi bir constructor olusturdugumuzda Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasını istemiyorsak
    mutlaka default constructor yerine parametresiz bir constructor olusturabiliriz.
     */
    public Araba(){

    }

    public void benzinliAracMethodu(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba "+ hiz + " hiz yapar");
    }
}
