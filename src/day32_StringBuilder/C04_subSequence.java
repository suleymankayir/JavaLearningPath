package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");


        sb.substring(0,2);
        // bu method String dondurdugu icin StringBuilder'in stringeski halini degistirmez
        System.out.println(sb); // Kayra

        sb.subSequence(0,3);
        System.out.println(sb); // Kayra
        // String builder icinde olan string donduren methodlarda degeri immutable hale getiriyor.



    }
}
