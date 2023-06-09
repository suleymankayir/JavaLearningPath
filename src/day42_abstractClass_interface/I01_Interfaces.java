package day42_abstractClass_interface;

public interface I01_Interfaces {
    /*
    interface bir class degildir.

    Abstract class'lar java'da abstraction islevini yerine getiriyordu
    Ancak abstract bir class'da abstract olmayan method'lar olabilir bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concrete method olmasin dedigimiz bir class olusturmak istiyorsak
    bunu class degil Interface yapmaliyiz.

    1- Interface'lerde concrete method olmaz.
    2- Interface'ler full abstraction yaptigindan Interface'lerden obje olusturulamaz.
    3- Class'larda bir child birden fazla parent edinemez. Ancak interface'lerde concrete method olmadigindan
    biz her methodu child class'da override etmek zorundayiz.
    Override ederken kimin soyledigini override ettigimizin onemi yok.
    4- Interface'ler neyin yapılmasi gerektigini soyler.
    Ama nasil yapilacagina karismaz.



     */
    int SAYI = 30;
    String ISIM = "Yildiz Koleji";
}
