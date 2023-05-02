package day19_Scope;

public class C02_StaticVariables {

    static int statSayi = 10;
    String isim = "Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul eder.
     */
    public static void main(String[] args) {
        /*
        bir variable static olarak olusturulduysa objeler icin degil class icin gecerlidir.

         */
        System.out.println(statSayi); // 10
        staticMethod();
        statSayi = 12;
        System.out.println(statSayi); // 12
        C02_StaticVariables obj1 = new C02_StaticVariables();
        obj1.staticOlmayan();
        System.out.println(statSayi); // 20
        /*
        instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz.

        Static variable'da ise class'in en basindan baslayarak
        istenen satira kadar kodu takip edip
        static variable'in son degerini bulmamiz gerekir.
         */
    }

    public static void staticMethod(){
        System.out.println(statSayi);

    }

    public void staticOlmayan(){
        /*
        static olan variable'lara her yerden ulasilabilir. static olsun ya da olmasin her method
        variable degerini degistirebilir.
        farkli methodlarda static variable'in hangi degeri alacagini bilmek istiyorsak class'in basindan
        itibaren kodun calismasini takip etmeliyiz.
        method ne zaman cagrilirsa o anki static variable degerini methodda kullanırız.
         */
        System.out.println(statSayi);
        statSayi = 20;
    }
}
