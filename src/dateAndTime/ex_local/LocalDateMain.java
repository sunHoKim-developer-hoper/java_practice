package dateAndTime.ex_local;

import java.time.LocalDate;

public class LocalDateMain {
    
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);
        //지정 날짜
        LocalDate ofDate = LocalDate.of(2018, 6, 26);
        System.out.println("지정 날짜 = " + ofDate);
        
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10 Days = " + ofDate);
        
    }
}
