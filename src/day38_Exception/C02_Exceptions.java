package day38_Exception;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while(sayac<100){

            /*
            Try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir

            Catch'ten sonraki parantez karsilasmayi bekledigimiz exception turunu Java'ya soylemek icin kullanilir.
            Catch blogu: Java'ya soyledigimiz excepiton gerceklesirse Java'nin yapmasini istedimiz islem

            Catch blogunun onundeki paranteze karsilasmayi bekledimiz exception'i yazabilir veya her turlu exception'da
            devreye girmesini istiyorsak tum exception'larin parent'i olan Exception yazabiliriz.
             */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu dikkatli ol");;
            }

            sayac++;
            b--;
        }



    }
}
