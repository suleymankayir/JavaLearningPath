package day28_StaticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        double indirimliFiyat = indirimliFiyatHesapla(satisFiyati);

    }

    public static double indirimliFiyatHesapla(double satisFiyati) {

        double indirimliFiyat = satisFiyati*0.75;
        return indirimliFiyat;

    }
}
