package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);


        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());

        LocalDate tarih2 = LocalDate.of(1995, 10, 24);
        System.out.println(tarih2);


        LocalDate tarih3 = LocalDate.of(1999, Month.NOVEMBER,17);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(15));

        System.out.println(tarih.minusWeeks(20).minusMonths(5).minusDays(23));

        System.out.println(tarih.isAfter(tarih2));

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if ((tarih2.isBefore(tarih3))){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else {
            System.out.println("aynı gun dogmuslar");
        }

    }
}
