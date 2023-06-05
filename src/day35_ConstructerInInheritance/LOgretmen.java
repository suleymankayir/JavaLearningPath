package day35_ConstructerInInheritance;

public class LOgretmen {

    LOgretmen(){
        System.out.println("Matematik parametresiz cons");
    }

    LOgretmen(String isim){
        super();
        System.out.println("Matematik parametreli cons");
    }

    public static void main(String[] args) {
        MMatematikciler obj1 = new MMatematikciler("Tugba");

    }

    /*
    this(); cons call icinde bulunulan conslari super() ise parent class'da bulunan cons.lari cagirir.

    this() veya super() parametre yapisina uygun bir constructor bulamazsa CTE verir.

    constructot konusunda gordugumuz this. o class'daki instance variable'lari refere eder.

    Aynı sekilde inheritance da da super. vardir.
    super. parent class'daki instance'lari refere eder.
     */
}
