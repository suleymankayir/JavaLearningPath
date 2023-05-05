package day21_Arrays;

public class C02_EnUzunVeEnKısaKelime {
    public static void main(String[] args) {
        String[] isimler = {"erdal", "onur", "mehmetcan", "mihrican", "aleyna"};
        enUzunVeEnKisayiYazdir(isimler);
    }

    public static void enUzunVeEnKisayiYazdir(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length() ){
                enKisaKelime = isimler[i];
            }
        }
        System.out.println(enKisaKelime);
        System.out.println(enUzunKelime);

    }
}
