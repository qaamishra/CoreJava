package java8.datatime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {
    public static void main(String[] args) {

        // Current date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Specific date
        LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
        System.out.println(localDate2);

        //Plus and ChronoUnit
        LocalDate tomorrow=localDate.plus(1,ChronoUnit.DAYS);
        System.out.println("tomorrow : " +tomorrow);

        //Minus
        System.out.println("yesterday : "+localDate.minus(1,ChronoUnit.DAYS));

        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.minusMonths(1));

        getBirthDateDetails(1989,9,15);

        //Compare
        System.out.println("#########################");
        LocalDate date1 = LocalDate.of(2018, Month.JANUARY, 14);
        LocalDate date2 = LocalDate.of(2016, Month.SEPTEMBER, 12);

        // ifAfter() example
        if (date1.isAfter(date2)) {
            System.out.println("Date1 comes after Date2");
        }
        // isBefore() example
        if (date2.isBefore(date1)) {
            System.out.println("Date2 comes before Date1");
        }

    }

    private static void getBirthDateDetails(int year, int month,int date ) {

        LocalDate birthdate=LocalDate.of(year,month,date);
        System.out.println("============================");
        System.out.println("DayOfMonth : "+birthdate.getDayOfMonth());
        System.out.println("DayOfWeek : "+birthdate.getDayOfWeek());
        System.out.println("DayOfYear : "+birthdate.getDayOfYear());

    }
}
