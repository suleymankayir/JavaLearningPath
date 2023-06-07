package day38_Exception;

public class C01_Exceptions {

    public static void main(String[] args) {
        /*
        bir sorunla karşılaşmayı beklediginiz durumlarda if else ile sorunu yakalayip o sorunu cozebilirsiniz.

        Ancak Java sorunu her zaman if else ile cozemeyecegimizden Java try-catch bloklari olusturmustur.
         */
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while(sayac<100){

            if (b==0){
                System.out.println("Payda 0 oldugu icin isleme son verildi");

            } else {
                System.out.println(a/b);
            }

            sayac++;
            b--;
        }

    }

}
