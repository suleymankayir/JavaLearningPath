package day41_AbstractClass_Interface;

public abstract class EToyota extends DAraba{
    public static void main(String[] args) {

    }

    @Override
    public void motor() {

    }

    /*
    parent class'daki standard belirleyici methodlar'in(abstract methodlar) tamami
    child class tarafindan override edilmelidir.

    concrete methodlar'in override edilme mecburiyeti yoktur.
    istersek override edebiliriz ya da etmeyedebiliriz.

    Aslinda Toyota class'i da obje uretebilecegimiz bir class degil bu durumda
    eger proje tasarimi yapiyor isek
    Toyota class'ini da abstract class haline getirmek kodumuz acisindan güzel olur.

     */
}
