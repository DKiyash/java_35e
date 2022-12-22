package java_35e_HW.HW_24_DataTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 13, 17, 54, 8);
        System.out.println("LocalDateTime = " + ldt);
        System.out.println("EpochSecond = " + ldt.toEpochSecond(ZoneOffset.UTC));
        System.out.println("DayOfYear = " + ldt.getDayOfYear());
        System.out.println();

        long time = ldt.toEpochSecond(ZoneOffset.UTC);
        CustomDateTime dateTime = new CustomDateTime(time);
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println();
        System.out.println(dateTime);

        System.out.println();
        LocalDateTime ldt2 = LocalDateTime.of(2022, Month.JUNE, 25, 17, 54, 8);
        System.out.println(ldt.isBefore(ldt2));
        System.out.println(ldt.isAfter(ldt2));
    }
}

/*
January - 31 days
February - 28 days (29 days in a leap year)
March - 31 days
April - 30 days
May - 31 days
June - 30 days
July - 31 days
August - 31 days
September - 30 days
October - 31 days
November - 30 days
December - 31 days
 */