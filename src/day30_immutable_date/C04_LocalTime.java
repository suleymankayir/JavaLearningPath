package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        /*
        Bizim olusturdugumuz date ve time
        canli saat ve ya tarih degildir.
        LocalTime.now() kullnadigimiz satirda
        o anki tarih veya saati alip bizim variable'a store eder.
        time1 variable degeri SABİTTİR.

         */

        Thread.sleep(500);
        time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getMinute());
        System.out.println(time1.plusHours(2));
        System.out.println(time1.minusMinutes(38));


    }
}
