package dateAndTime.ex_instant;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    
    //UTC을 기준으로 한다!!
    
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("instant now : " + now);
        System.out.println(now.getNano());
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("from : " + Instant.from(zdt));

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart : " + epochStart);
    }
}   
