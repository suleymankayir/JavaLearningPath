package day19_Scope;

public class C03_ClassVariables {
    public static void main(String[] args) {
        /*
        Farkli class'larda calisirken herhangi bir class adini yazip
        . 'ya basarsak adini yazdigimiz class'daki tüm STATIC class uyelerini gorebilir ve
        kullanabiliriz.
         */

        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.statSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar); // 0

        /*
        Class level variable'lara deger atayip atamamak bize kalmistir.
        istersek deger atamasi yapabiliriz, istemezsek deger atamayiz.
        Eger deger atamıs isek Java atadigimiz o degeri kabul eder
        deger atamazsak Java bu variable'a default bir deger atamasi yapar.
        int icin --> 0
        String icin --> null
        boolean icin --> false
        char icin --> '' hiclik
         */


        /*
        baska classlardaki instance variable'lara obje olusturarak ulasabiliriz.
         */

        C02_StaticVariables obj1 = new C02_StaticVariables();
        obj1.staticOlmayan(); // 10
        // bu method icinde statSayi=20 oldu
        System.out.println(obj1.isim); // Mehmet
        System.out.println(obj1.degersizInstanceVariable); // 0

        System.out.println(C02_StaticVariables.statSayi); // 20

        /*
        Farkli bir class'dan C02 class'indan method ve variable'lari kullandigimizda
        C02 Class'inin tamami degil sadece cagrilan class üyeleri calisir.
         */
    }
}
