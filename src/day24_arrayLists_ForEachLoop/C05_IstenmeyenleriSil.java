package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf = "r";
        List<String> kalanlar =new ArrayList<>();
        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        // loop bittiginde istenmeyen harf icerelenler listeye eklenmiş olacak.

        String[] arr = new String[kalanlar.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kalanlar.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
