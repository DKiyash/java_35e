package java_35e_HW.ClassWork_24;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;

public class MainData {
    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());

        LocalDate ld = LocalDate.of(1970, 1, 8);
//        System.out.println(ld.get(ChronoField.DAY_OF_YEAR));
//        System.out.println(ld.isLeapYear());
//        System.out.println(ld.getDayOfYear());
//        System.out.println(ld.isAfter(LocalDate.of(2022, 1, 10)));

//        LocalDateTime ldt = LocalDateTime.of(2022, 2, 10, 22, 48);
//        System.out.println(ldt.withHour(10).withMinute(2).withSecond(15));
//        System.out.println(ldt);

//        System.out.println(String.format("%tD\n%n", ldt));
//        System.out.println(String.format("%tF\n%n", ldt));
//        System.out.println(String.format("%tr\n%n", ldt));

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println();

        LocalTime localTime = LocalTime.of(14, 22, 17, 598);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(ld, localTime);
        System.out.println(localDateTime);
        System.out.println(Timestamp.valueOf(localDateTime));

        //LocalDateTime to epoch seconds
        long timeInSeconds = localDateTime.toEpochSecond(ZoneOffset.UTC);
        System.out.println(timeInSeconds);
    }
}
