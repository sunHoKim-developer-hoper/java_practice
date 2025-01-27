package dateAndTime.ex_periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    

    public static void main(String[] args) {

        Duration duration = Duration.ofMinutes(30);

        LocalTime lt = LocalTime.of(1, 0, 15);
        System.out.println("lt : " + lt);

        LocalTime localTimePlus = lt.plus(duration);
        System.out.println("더한 시간 : "  + localTimePlus);
        

        LocalTime start = LocalTime.of(1, 0, 15);
        LocalTime end = LocalTime.of(2, 0, 15);

        Duration between = Duration.between(start, end);
        System.out.println("between : " + between.getSeconds() );

    }
}
