package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArrayPractiseBeginner {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        ////////////////////////////////
        List<String> meyve = new ArrayList<>();
        meyve.add("Elma");
        meyve.add("Armut");
        meyve.add("Şeftali");
        System.out.println(meyve);
        ////////////////////////////////
        double [] sayilar1 = {0.30,2.5,3.4,2.2};
        double toplam = 0;
        for (int i = 0; i < sayilar1.length; i++) {
            toplam += sayilar1[i];

        }
        System.out.println(toplam);
        ////////////////////////////////
        char [] harfler = {'a', 'b', 'c', 'd', 'e'};
        char [] terstenHarfler = new char[harfler.length];
        for (int i = 0; i < harfler.length; i++) {
            terstenHarfler[i] = harfler[harfler.length -1 - i];
        }
        System.out.println(Arrays.toString(terstenHarfler));
        ////////////////////////////////
        String [] diller = {"Java", "Python", "C++", "JavaScript"};
        List<String> dillerList = new ArrayList<String>();
        for (int i = 0; i < diller.length; i++) {
            dillerList.add(diller[i]);
        }
        System.out.println(dillerList);
        System.out.println(dillerList.contains("C#"));
        System.out.println(dillerList.size());
    }
}
