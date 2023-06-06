package day37_overriding;

public class EToyota extends DAraba{

    void marka(){
        /* super.marka();
        eger hem overridden hem de overriding method'un calismasini istersek ilk satira super.marka()
        yazabiliriz.
         */
        System.out.println("Markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota marka araclar Toyota motoru kullanir");
    }
}
