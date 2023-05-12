package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_StringCompare {
    public static void main(String[] args) {
        String[] str1 = {"a", "b", "c", "d", "e", "f"};
        String[] str2 = {"a", "b", "c", "z","f", "g"};
        List<String> ortakIsımler = new ArrayList<String>();
        for (String each1: str1
             ) {
            for (String each2: str2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsımler.add(each1);
                }
            }
        }
        if (ortakIsımler.isEmpty()){
            System.out.println("Hic ortak eleman yok.");
        } else {
            System.out.println(ortakIsımler);
        }
    }
}
