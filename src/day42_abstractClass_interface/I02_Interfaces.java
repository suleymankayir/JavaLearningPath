package day42_abstractClass_interface;

public interface I02_Interfaces {

    /*
     int sayi;
     interfaceler'de tum variable'lar public static ve final'dir. Dolayisiyla sonradan deger atama sansimiz yoktur.
     bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz.

     Birr interface bir class'i parent edinemez.
     */
    int SAYI=20;

    void yakit();
    /*
    Interface icerisindeki her method public abstract ozelliklerine sahiptir.

    abstract bir method'un body'si olmasi mumkun degildir.
    Java sonradan developer'larin istegi uzerine kismi bir update getirmistir.

    Bir interface'e sonradan bir abstract method eklerseniz o interface'i daha once implement etmis tum class'lara
    gidip hepsine yeni eklenen method'u override etmemiz gerekir. Bu durumda buyuk ve eskiden gelen
    projeler icin cok zor bir islemdir.

    Bunun icin Java Java 8 den itibaren ınterface'lere sonradan body'si olan method eklenmesine izin vermistir.

    Bu methodlarin bodysi olsa da interface'in yapisi geregi concrete denmez.
    Body'si olan bu method'lar istisna olarak kabul edilebilir.

     */

    public void motor();
    public abstract void teker();

    public static void aku(){

    }

}
