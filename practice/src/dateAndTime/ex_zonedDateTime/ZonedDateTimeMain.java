package dateAndTime.ex_zonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        
        // for(String availableZoneId : ZoneId.getAvailableZoneIds()){
        //     ZoneId zoneId = ZoneId.of(availableZoneId);
        //     System.out.println(zoneId + " | " + zoneId.getRules());
        // }
        // ZoneId zoneId = ZoneId.systemDefault();
        // System.out.println("====================================");
        // System.out.println("ZoneId.systemDefault =" + zoneId);

        // ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        // System.out.println("tokyo ZoneId = " +tokyoZoneId);
        

        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("ZonedDateTime Now : " + nowZdt);

        LocalDateTime ofDt = LocalDateTime.of(2024, 11, 6 , 12,30,00);
        ZonedDateTime ofZdt  = ZonedDateTime.of(ofDt, ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime of : " + ofZdt);
        
        System.out.println("UTC : " + ofZdt.withZoneSameInstant(ZoneId.of("UTC")));
    }
}
