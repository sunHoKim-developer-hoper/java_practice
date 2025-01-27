package dateAndTime.ex_local;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    
    public static void main(String[] args) {

        LocalDateTime ofDt = LocalDateTime.of(2024, 11, 6 , 12,30,00);
        
        LocalDateTime plusDt1= ofDt.plus(1, ChronoUnit.DAYS);
        LocalDateTime plusDt2= ofDt.plus(10, ChronoUnit.YEARS);
        LocalDateTime plusDt4= ofDt.plusDays(1);

        Period p = Period.ofYears(10);
        LocalDateTime plusDt3= ofDt.plus(p);


    }
}
