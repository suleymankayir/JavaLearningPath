package day14_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        String isim = "Suleyman";
        String soyisim = "Kayir";

        ismiGizle(isim, soyisim);
        C02_MethodCreation.rakamlariTopla(654);
    }

    public static void ismiGizle(String isim, String soyisim) {
       isim =  isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);
    }
}
