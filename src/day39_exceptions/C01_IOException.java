package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'dan bilgisayarimizdaki bir dosyaya erismek istersek
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz.


         */

        FileInputStream fis = new FileInputStream("day39_exceptions/Test.txt");

        /*
        Goruldugu uzere compile time'da altini kirmizi cizen her durum Compile Time Error degildir.
        Java'da bazı exceptionlarda Compile Time Exception'dir.
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dir.

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try/catch ile cevirmek
        2- method signature'ina throws keywords ile beklenen excepiton turunu yazdirmak

        throws exception sadece olayin farkinda oldugumuzun deklarasyonudur.
        exception'in handle edilmesinde hic bir rolü yoktur.
        Yani try catch ile kontrol altina aldigimiz exception'lar da kod calismaya devam ediyordu.
        Ancak throws exception yazdigimizda Java bir exception ile karsilastiginda hicbir sey yapilmamis gibi
        hata mesaji yayinlayip, calismayi durdurur.


         */
    }
}
