package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar override edilemez.
        Eger child class'da parent class'daki private method ile ayni signature'da bir method olusturursaniz
        bu overriding method olmaz
         */

    }

    @Override
    void motor() {
        /*
        @Override notasyonu Java'ya birbirine bagli olan 2 methodu sürekli kontrol etmesi gorevini verir.

        Eger parent class'daki overridden methodu silerseniz CTE verir ancak bu durum @override notasyonu varsa
        gecerlidir.

        @override notasyonu kullanmak mecburi degildir.
        eger overriding method silinirse, kodun CTE vermesini istersek @override notasyonu kullanmaliyiz.
         */
    }
}
