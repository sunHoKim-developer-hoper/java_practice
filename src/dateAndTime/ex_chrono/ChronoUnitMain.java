package dateAndTime.ex_chrono;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {

        ChronoUnit[] values = ChronoUnit.values();

        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS : " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.duration : " + ChronoUnit.HOURS.getDuration().getSeconds());

        LocalTime start = LocalTime.of(1, 0, 15);
        LocalTime end = LocalTime.of(2, 0, 15);
    
        long  secondsBetween = ChronoUnit.SECONDS.between(start, end);
        System.out.println("secBetween : " + secondsBetween);

        long  minBetween = ChronoUnit.MINUTES.between(start, end);
        System.out.println("minBetween : " + minBetween);

        
        LocalDate nowDate = LocalDate.now();
        LocalDate endOf2024 = LocalDate.of(2025, 1, 1);

        System.out.println("남은 2024년도 일자 : " + ChronoUnit.DAYS.between(nowDate, endOf2024));
    }
}
