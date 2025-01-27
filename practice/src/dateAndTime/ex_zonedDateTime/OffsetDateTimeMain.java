package dateAndTime.ex_zonedDateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("now Offset DT : " + nowOdt);

        LocalDateTime ltd = LocalDateTime.now();
        OffsetDateTime ofOffsetDateTime = OffsetDateTime.of(ltd, ZoneOffset.of("+01:00"));
        System.out.println("ofOffsetTime : " + ofOffsetDateTime);
    }
}
