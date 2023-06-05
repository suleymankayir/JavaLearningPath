package day35_ConstructerInInheritance;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla(){
        System.out.println("DizelCorolla parametresiz constructor");
    }


    KDizelCorolla(String isim){
        super(isim); // default olanı Java oto olarak siler cunku kullanicinin kendisi super tanimlamistir.
        System.out.println("DizelCorolla parametreli cons");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla("Hasan");

    }


}
