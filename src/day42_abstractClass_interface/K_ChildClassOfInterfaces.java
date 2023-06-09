package day42_abstractClass_interface;

import static day42_abstractClass_interface.I02_Interfaces.SAYI;

public class K_ChildClassOfInterfaces implements I01_Interfaces,I02_Interfaces{
    /*
    Bir class'i bir interface'e child yapmak icin implements keyword kullanilir.
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz.

    Bir interface bir class'i parent edinemez.'
     */
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI);
        System.out.println(I01_Interfaces.SAYI);
        System.out.println(ISIM);
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
