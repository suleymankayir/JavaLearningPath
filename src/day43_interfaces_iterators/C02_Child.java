package day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod{

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface'de abstract olan 3 method'u implement ettigimizde  Java itirazini durdurur.
    sonradan ekledigimiz default veya static keyword ile tanimladigimiz
    method'lari implement etmemiz sorun olusturmadi.
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj1 = new C02_Child();
        obj1.teker();


    }
}
