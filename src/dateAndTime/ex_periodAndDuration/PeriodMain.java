package dateAndTime.ex_periodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    
    public static void main(String[] args) {
        Period p = Period.ofDays(10);
        System.out.println("Period : " + p);

        LocalDate currentlDate = LocalDate.of(2023, 1, 24);
        LocalDate plusDate = currentlDate.plus(p);
        System.out.println("plusDate : " + plusDate );

        //기간 차이
        LocalDate starDate = LocalDate.of(2023, 1, 24);
        LocalDate endDate = LocalDate.of(2023, 5, 24);

        Period between =  Period.between(starDate, endDate);
        System.out.println("between : " + between.getMonths() + "개월");
    }
}
