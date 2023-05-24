package day29_PassByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("List ilk hali" + list);

        elemanlariDegistir(list);
        System.out.println("elemanlariDegistir methodundan sonra listemiz" + list);

        listDegistir(list);
        System.out.println("listDegistir methodundan sonra list" + list);
    }

    public static void listDegistir(List<String> list) {
        list = new ArrayList<String>();
        list.add("Nutella");
        list.add("Çay");
        list.add("Çokokrem");
        System.out.println("listDegistir methodunda: " + list);
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("Eleman degistir methodunda" + list);
    }
}
