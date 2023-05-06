package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // [] direk sout ile yazdiriliyor
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse"));
        System.out.println(isimler); // [Basak,Ayse] print ile yazdirsak dahi array icine dahil ediliyor.
    }
}
