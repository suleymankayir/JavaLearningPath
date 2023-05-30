package day30_immutable_date;

import java.time.LocalDateTime;
import java.time.Month;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);


        System.out.println(zaman.plusDays(2).plusHours(2));
        System.out.println(zaman.toLocalDate());
        System.out.println(zaman.toLocalTime());
    }
}
