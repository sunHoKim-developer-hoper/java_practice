package thread.control.join;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.*;

public class JoinMainV3 {
    
    public static void main(String[] args) throws InterruptedException{
        log("start");
        SumTask task1 = new SumTask(1,50);
        SumTask task2 = new SumTask(51,100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();
        
        //스레드가 종료될 때까지 대기 ==> main thread가 waiting 상태가 된다.
        log("join() 호출 시 - main 스레드가 Thread-1, 2가 종료까지 대기");
        thread1.join();
        thread2.join();
        log("메인 스레드 대기 완료!!");

        int sum = task1.result + task2.result;
        log("Sum : " + sum);
        log("end");
    }

    static class SumTask implements Runnable{
        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i; 
            }

            result = sum;
            log("작업 완료 result = " + result);
        }
    }
}
