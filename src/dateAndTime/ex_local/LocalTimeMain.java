package dateAndTime.ex_local;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMain {
    
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);
        //지정 날짜
        LocalTime ofTime = LocalTime.of(9, 30, 41);
        System.out.println("지정 시간 = " + ofTime);
        
        ofTime = ofTime.plusHours(10);
        System.out.println("지정 시간 + 10 Hours = " + ofTime);
        
    }
}
