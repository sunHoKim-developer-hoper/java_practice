package dateAndTime.ex_format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println( "formatted Date : "+formattedDate);

        String input = "2023년 01월 01일";
        LocalDate date2 = LocalDate.parse(input, formatter);

        System.out.println(date2);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String localDateTime = dateTime.format(formatter2);
        System.out.println(localDateTime);
        String dateTimeString = "2024-10-10 10:30:55";
        LocalDateTime dateTime2 = LocalDateTime.parse(dateTimeString, formatter2);
        System.out.println(dateTime2);
    }
}
