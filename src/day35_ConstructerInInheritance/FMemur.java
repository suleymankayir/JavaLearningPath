package day35_ConstructerInInheritance;

public class FMemur extends EMuhasebe {
    /*
    extends keyword kullanilan classlarda ister default constructor bulunsun istersek de biz yeni constructor/lar
    olusturalim

    Java constructor'in ilk satirina super(); constructor call yazar.

    super(); constructor call, default constructor'a benzer gorunmese de vardir ve calisir.
    ancak biz ilk satira farkli bir constructor call yazarsak
    Java super();'i siler.

    Eger biz mudahale edip kendi constructor call olusturmazsak Javanın default olarak olusturdugu cons call
    her zaman parametresizdir.
    super();

     */


    FMemur(){
        System.out.println("Parametresiz Memur cons");
    }

    FMemur(String isim){
        System.out.println("Parametreli Memur cons");
    }

    public static void main(String[] args) {

        FMemur mmmr1 = new FMemur();

    }
}
