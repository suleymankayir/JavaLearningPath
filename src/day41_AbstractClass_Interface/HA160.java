package day41_AbstractClass_Interface;

public class HA160 extends FMercedes{
    /*
    Abstract parent silsilesinden gelen ilk concrete class Parent'i olan tum class'daki
    abstract method'lari concrete hale donusturmek (override) ZORUNDADIR.

    Bu kuralin istisnasi parent class'lardan herhangi birinde concrete hale donusturulmus,
    abstract method'lardir.'
     */

    public static void main(String[] args) {
        HA160 obj1 = new HA160();
        // concrete bir class'dan obje olusturabiliriz.
        FMercedes obj2 = new FMercedes();

        EToyota obj3 = new EToyota() {
            @Override
            protected void yakit() {

            }

            @Override
            protected void kaporta() {

            }
        };
        // Abstract class'lar constructor barindirir ancak obje uretemezler.
        // Toyota class'i abstract class oldugundan obje uretilemez.
    }

}
