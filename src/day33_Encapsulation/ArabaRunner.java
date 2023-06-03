package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 =new Araba();
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);
        // model variable'i private oldugundan bu classtan erisilemiyor.
        // yani access modifier ya hep ya hic diyor


        // marka'yi degistirelim ama goremeyelim
        // yakiti'da gorelim ama degisitiremeyelim

        // set ve get yetkilerini ozel tanımlamak istersek
        // 1. adim ozel yetki tanımlanacak variable'i private hale getiriyoruz.
        // 2. adim set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla"); // burada arabanın modelini atadık
        // model'İ yazdırma imkanı yok yok cunku getter methodu yok
        System.out.println(arb1.getYakit()); //  burda ise aaracın yakıt türünü getirdik
        // yakıt türünü degistiremeyiz cunku setter methodu yok.
    }
}
