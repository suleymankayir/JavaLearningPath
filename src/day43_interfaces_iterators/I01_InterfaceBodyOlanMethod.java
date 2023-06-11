package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();


    /*
    normal bir class da oldugumuzu dusunursek iki tane access modifier kullanilma ihtimali olmaz.

    Asagidaki method'da gorulecegi uzere interface'de istisnai olarak body'si olan method'lar
    olusturulabilir.
    Bu ozellik java 8'den sonra kullanilmaya baslanmistir.
    Bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde eskiden beri bu interface'i implement eden tum classlara
    gidip yeni eklenen method'u override etmemiz gerekirdi.

    bu ozellik sayesinde basina default veya static keyword ekleyerek interface'de yeni ve body'si olan bir method
    olusturursak bu method'un child class tarafindan override edilme mecburiyeti olmaz
    ve eskiden implement etmis class'lari degistirmemiz gerekmez.

    Bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz

    Bu method'larin body'si olsa da bunlara concrete method denmez ama override edilme
    mecburiyetleri yoktur.

    buradaki default kelimesi access modifier ile ilgili degil
    istisnai durum belirtmesi icindir.

    bu iki farkli kelimenin (static ve default) amaci child class'lardan bu method'a nasil eriselecegini belirlemek
    icindir staic keyword kullanilirsa, child class'lardan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.


     */

    public default void teker(){
        System.out.println("default...Tum arabalarin tekeri vardir.");

    }

    public static void direksiyon(){
        System.out.println("static...Tum arabalarin direksiyonu vardir.");
    }

}
