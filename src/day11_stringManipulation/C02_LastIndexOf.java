package day11_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String cumle = "Java cok kolay, Java cok guzel";
        String kelime= "Java";

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("Böyle bir kelime yoktur.");
        } else {
            if (kelimeIlkIndex == kelimeSonIndex){
                System.out.println("Yalnzca bir defa kullanılmıs");
            } else {
                System.out.println("Birden fazla kullanılmistir");
            }
        }
    }
}
