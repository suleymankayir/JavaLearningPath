package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7);
        topla(5,8);
        topla(5,9);
        topla(5,10);
        topla(1,2,3);

        /*
        Java hangi method'un calisacagina karar vererken optimizasyon yapar
        - eger hic cast yapmadan kullanabileceği bir method varsa onu kullanilir.
        - eger cast yapmadan kullanabilceği method yoksa, bu sefer en az casting yapacagi methodu secer.
         */

    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("Iki integer'in toplami : " + (sayi1+sayi2));
    }

    /*
    Bir class'da parametre sayisi ve parametre data türleri ayni sayida olan 2 method olusturamayiz
    public static void topla(int sayi3,int sayi4){
        System.out.println("Iki integer'in toplami : " + (sayi3+sayi4));
    }

     */
    public static void topla(double sayi1,int sayi2){
        System.out.println("Bir double ve bir integer'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("Bir integer'in ve double'ın toplami : " + (sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("Iki double'ın toplami : " + (sayi1+sayi2));
    }
    public static void topla(int sayi1,int sayi2, int sayi3){
        System.out.println("Uc integer'in toplami : " + (sayi1+sayi2+sayi3));
    }
    /*
    method signature degistirmek icin uc yontem vardir
    - parametrelerin data tipleri degisitirilebilir.
    - parametre sayisi degistirilebilir.
    - parametre sayisi ayni olmak zorunda ise farkli data tipindeki
     parametrelerin sirası degistirilir.
     */
}
