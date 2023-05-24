package day29_PassByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim= "Mine";
        /*
        String her ne kadar datatype olsa da ayni zamanda bir class'dir. olusturulan isim variable'i da
        bir objedir. new yazarak olusturmasak da variable bir objedir.

        ve String'in referansinin stack memory de olmasından ötürü bizim yeni deger atamalarimiz da
        referans degismez ama heap memory'de yeni bir klon variable olusur. Eskisi ise cop haline gelir.


         */

        isim = isim.toUpperCase(); // her ne kadar isim objesine yeni deger atiyor gibi gözükse de aslında
        // Java yeni bir klon obje olusturarak bize deger ataması yaptırmaktadır.

        System.out.println(isim);


    }
}
