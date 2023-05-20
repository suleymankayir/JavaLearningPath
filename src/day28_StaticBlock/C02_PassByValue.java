package day28_StaticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        System.out.println(satisFiyati); // 100

        System.out.println(indirimliFiyat(satisFiyati)); // 90

    }


    public static double indirimliFiyat(double orjinalFiyat){
        double satisFiyati = orjinalFiyat*0.9;
        return satisFiyati;

    }
}
