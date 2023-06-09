package day41_AbstractClass_Interface;

public class GCorolla extends EToyota {
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }


    /*
    Etoyota class'inin 2 tane parent class'i var
    corolla parent'larinin ikisinin de standartlarina(abstract method)
    uymak zorundadir.

    Concrete bir class parent'in olan tum abstract class'larda abstract olan methodlari implement etmek
    zorundadir.

    Ancak Parent silsilesinde override edilerek concrete yapilan method'lari overrride etmek zorunda degildir.

     */
}
