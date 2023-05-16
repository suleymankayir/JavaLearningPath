package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

            C01       obj1     =     new         C01();
     // class adi  objenin adi     keyword    constructor
        System.out.println(obj1.sayi);
        obj1.deneme();

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> a = new ArrayList<>();
        /*
        Javada bir obje olusturmak icin mutlaka constructor kullanmalisiniz.
         */



    }
}
