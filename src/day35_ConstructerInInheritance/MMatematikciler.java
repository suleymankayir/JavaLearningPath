package day35_ConstructerInInheritance;

public class MMatematikciler extends LOgretmen{


    MMatematikciler(){
        System.out.println("MMatematikciler parametresiz");
    }

    MMatematikciler(String isim){
        this();
        System.out.println("Matematikciler Parametreli ");
    }
}
