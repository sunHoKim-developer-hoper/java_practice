package dateAndTime.ex_local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    
    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("오늘 날짜 및 현재 시간 = " + nowDt);
        
        LocalDateTime ofDt = LocalDateTime.of(2024, 11, 6 , 12,30,00);
        System.out.println("지정 날짜 = " + ofDt);
        
        ofDt = ofDt.plusHours(10);
        System.out.println("지정 날짜 + 10 Hours = " + ofDt);
        
        //날짜와 시간 분리
        LocalTime localTime = ofDt.toLocalTime();
        LocalDate localDate = ofDt.toLocalDate();

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        
        //비교
        //.isBefore, .isAfter, .isEquals -> 서울의 9시와 UTC의 시간적으로 같다. == true
    }
}
