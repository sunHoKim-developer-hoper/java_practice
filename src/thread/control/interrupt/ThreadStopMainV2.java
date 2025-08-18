package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    log("작업 중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                //인터럽트 상태가 깨어나서 false가 된다.
                log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
                log("Interrupt Message : " + e.getMessage());
                log("state : " + Thread.currentThread().getState());
            }
            log("자원 정리 중");
            log("자원 종료");
        }
    }
}
