package Java8Test;

import java.time.*;
import java.util.Date;

public class DateTimeTest {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date = " + date);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.parse("20:30");
        System.out.println("localTime = " + localTime);

        LocalDateTime   zonelocalDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonelocalDateTime = " + zonelocalDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        LocalDate of = LocalDate.of(1999, 9, 30);

        System.out.println("of = " + of);

        System.out.println("of = " + of.minusMonths(2)+"::"+ of.minusYears(1)+"::"+of.withYear(123));

        LocalDate localDat = LocalDate.now();

        LocalDate localDateTime1 = localDat.minusDays(10);
        System.out.println("localDateTime1 = " + localDateTime1);



    }
}
