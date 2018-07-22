package java8.datatime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;

public class TimeEx {
    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();

        System.out.println(clock.millis());
        System.out.println(clock.getZone());

        ZoneId zoneId = clock.getZone();
        System.out.println(zoneId.getId());

        Instant instant = clock.instant();
        Date instantDate = Date.from(instant);
        System.out.println(instantDate);

        Set<String> allZonId=ZoneId.getAvailableZoneIds();
        allZonId.stream().sorted().forEach(System.out::println);

        //Chrono
        System.out.println("#########################");
        LocalTime now1 = LocalTime.now(ZoneId.of("Asia/Dubai"));
        LocalTime now2 = LocalTime.now(ZoneId.of("Asia/Calcutta"));

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);



    }
}
