package thread.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    
    public static void log(Object obj){
        String time = LocalTime.now().format(format);
        //[%9s]는 9칸을 채워준다는 의미이다.
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
