package day48_MapsTheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfMapi= new HashMap<>();


        harfMapi.put("A",5);
        harfMapi.put("B",1);
        harfMapi.put("C",3);
        harfMapi.put("D",2);
        harfMapi.put("E",4);

        System.out.println(harfMapi);

        harfMapi.compute("A", (k,v) -> v*2);
        harfMapi.compute("D", (a,b) -> b*b);
        harfMapi.computeIfAbsent("F", v -> 30 );
        System.out.println(harfMapi);
        harfMapi.computeIfPresent("E", (k,v) -> v+5);
        harfMapi.computeIfPresent("G", (k,v) -> v+10);

        System.out.println(harfMapi);

    }
}
