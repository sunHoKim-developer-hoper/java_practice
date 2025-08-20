package thread.control.yield;

import static util.ThreadUtils.sleep;


public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+ "-" + i);
                //1. empty
                //sleep(1); //하나의 스레드가 쭉 실행되지 못 한다. // 2. sleep
                Thread.yield(); // 3. yield, empty와 sleep의 중간 느낌이다.
            }
        }
    }
}
