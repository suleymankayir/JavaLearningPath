package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<Integer>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler = new ArrayList<>();
        isimler.add("Erkan");
        isimler.add("Kaan");
        isimler.add("Hakan");

        System.out.println(isimler.get(2));; // Hakan
    }
}
