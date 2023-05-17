package day26_constructor;

public class Kamyon {
    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        Bizim temel amacimiz KamyonRunner'da argument olarak girilen
        degerin bu class'da instance variable'a atanmasi
        Ancak scope konusunda ogrendigimiz gibi
        Kamyon constructor scope'unda marka oldugu icin
        instance marka'ya gitmiyor

        Bu karisikligi gidermek icin instance variable'lari  belirli
        hale getirmemiz gerekiyor.
        java bunun icin this keyword'unu kullanıyor.
        This ile yazilan variable'in instance oldugunu anlamamizi sagliyor.

        Genel kullanim acisindan kodu herkesin anlamasini kolaylastirdigi icin
        tercih edilir.

         */


    }


    Kamyon() {

    }

    @Override
    public String toString() {
        return
                "marka=" + marka +
                        "\nmodel=" + model +
                        "\nyil=" + yil +
                        "\nfiyat=" + fiyat;

    }

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;
}
