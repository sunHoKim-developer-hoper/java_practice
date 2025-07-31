package dateAndTime.ex_local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    
    public static void main(String[] args) {
        
        LocalDateTime ofDt = LocalDateTime.of(2024, 11, 6 , 12,30,00);

        LocalDateTime ofDt2 = ofDt.with(ChronoField.YEAR, 2010);
        System.out.println(ofDt2);

        LocalDate localDate= LocalDate.now();

        LocalDateTime ofDt3 = ofDt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDateTime ofDt4 = ofDt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));

        LocalDate withedLocalDate = localDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        LocalDate withedLocalDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("같은 달의 마지막 일요일 = " + withedLocalDate);
        System.out.println("같은 달의 마지막 날 = " + withedLocalDate2);
    }
}
