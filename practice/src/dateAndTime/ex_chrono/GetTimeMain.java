package dateAndTime.ex_chrono;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.of(2023,1,1,13,30,59);
        System.out.println("Year = " + dt.get(ChronoField.YEAR));
        System.out.println("month = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("day = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("week = " + dt.get(ChronoField.DAY_OF_WEEK));
        System.out.println("hourOfDay = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("minOfHour = " + dt.get(ChronoField.MINUTE_OF_HOUR));
    
        System.out.println("Year = " + dt.getYear());
        System.out.println("month = " + dt.getMonthValue());
        System.out.println("day = " + dt.getDayOfMonth());
        System.out.println("week = " + dt.getDayOfWeek());
        System.out.println("hourOfDay = " + dt.getHour());
        System.out.println("minOfHour = " + dt.getMinute());
    
    }
}
