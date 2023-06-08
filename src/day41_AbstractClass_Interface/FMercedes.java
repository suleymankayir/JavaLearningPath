package day41_AbstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        Abstract bir parent'i concrete bir child class inherit ederse
        parent abstract class'daki tum abstract method'lari overrride etmek zorundadir

        abstract bir class, abstract baska bir class'i parent edinirse parent class'daki tum abstract
        method'lari override etmek zorunda degildir.
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
