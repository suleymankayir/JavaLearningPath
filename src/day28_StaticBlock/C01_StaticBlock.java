package day28_StaticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {

        /*
        StaticBlock class üyelerinden önce calisir. (main method'dan bile önce)

        static blok class olusturuldugunda calisir genellikle de class'la ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir.

        static bloklarin class icerisinde nerede oldugu önemli degildir. once statik bloklar calisir.
        birden fazla olursa yukarıdan asagiya dogru calisir.

         */
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main metod calisti");
    }

    static {
        System.out.println("main method altındaki static blok calisti");
    }

}
