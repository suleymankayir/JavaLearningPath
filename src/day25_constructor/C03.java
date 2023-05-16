package day25_constructor;

public class C03 {
    /*
    proje olusturulurken bazı class'lar run etmek icin degil variable
    ve method olusturup bunları baska class'lardan kullanmak icin
    olusturulur

    */
    /*
    default constructor parametresizdir gormesek bile calisir
    class icerisinde parametreli ve parametresiz herhangi bir constructor
    olusturursak Java default constructor'ı siler.
     */
    C03(){

    }
    /*
    olusturdugumuz parametresiz bu constructor default constructor ile
    birebir aynidir. ancak default constructor degildir.
     */




    String isim = "Etka";


    public void method01(){
        System.out.println("C03 method calisti.");
    }
}
