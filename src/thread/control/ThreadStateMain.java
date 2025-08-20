package thread.control;

import static util.MyLogger.*;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state_1 : " + thread.getState());
        
        thread.start();
        
        Thread.sleep(1000);
        //myThread가 sleep했을 때의 state ==> TIMED_WAITING
        log("myThread.state_3 : " + thread.getState());
        Thread.sleep(4000);

        //myThread가 종료되었을 때의 state
        log("myThread.state_5 : " + thread.getState());
        log("end");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                //시작했을 때의 state
                log("start");
                log("myThread.state_2 : " + Thread.currentThread().getState());
                
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state_4 : " + Thread.currentThread().getState());
                
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
