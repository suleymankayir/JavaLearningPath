package day11_stringManipulation;

public class C04_Contains {
    public static void main(String[] args) {
        String cumle = "Java buyuk, dunya kucuk";
        cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Buyuk mu yazdırılacak yoksa kucuk mu?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("Cumlede kucuk ya da buyuk numarası gecmiyor.");
        }
    }
}
