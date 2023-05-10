package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {


        String [] arr = {"İsmail","Nur","Fatih"};
        /*
        uzun listeler olusturmak gerektiginde tek tek eklemek yerine array olusturup, bunları list'e cevirmek,
        daha pratik olabilir.
        1- Loop ile arraydeki tüm elementleri liste atabiliriz.
        2- Arrays.asList() kullanabiliriz.
        Ancak bu methodun 2 yan etkisi var
            - Arrays class'i kullanildigi icin array özellikleri gecerli olur. dolayisiyla list'te olan add,
            remove gibi size'i degistiren method'lar bu sekilde olusturulan list'lerde kullanılmaz.
            - Kaynak olan array ile ürün olan list özdeşleştirilir. Birinde yapılan değişiklik otomatik olarak
            diğerine de işler.

         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [İsmail, Nur, Fatih]

        // 1. yan etki
        // sinifList.add("Erdem"); // UnsupportedOperationException
        // sinifList.remove("Erdem"); // UnsupportedOperationException


        // 2.yan etki
        arr [1] = "Emre";
        System.out.println("degisim sonrası array" + Arrays.toString(arr));
        System.out.println("Array'i degisitirince list" + sinifList);

        // sadece arr degismesine yani array degismesine ragmen list de aynı sekilde degisti.
    }
}
