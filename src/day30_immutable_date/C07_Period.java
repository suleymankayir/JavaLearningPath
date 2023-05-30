package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        LocalDate tarih =  LocalDate.of(1995,10,24);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih,bugun);
        System.out.println(period);
    }
}
