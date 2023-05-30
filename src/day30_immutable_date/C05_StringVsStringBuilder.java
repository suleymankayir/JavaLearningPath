package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        LocalTime baslangic = LocalTime.now();
        String str = "Ah Java";
        for (int i = 0; i < 1000; i++) {
            str += ".";
        }
        LocalTime bitis = LocalTime.now();

        System.out.println(bitis.getNano() - baslangic.getNano());

        baslangic = LocalTime.now();

        StringBuilder sb = new StringBuilder("Ahhh Java");
        for (int i = 0; i < 1000; i++) {
            sb.append(".");
        }

        bitis = LocalTime.now();


        System.out.println(bitis.getNano()-baslangic.getNano());
    }
}

