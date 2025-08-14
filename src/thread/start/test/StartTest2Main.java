package thread.start.test;

import static thread.util.MyLogger.log;

public class StartTest2Main {

    // Thread-A는 1초에 한 번씩 A 출력, Thread-B는 0.5초에 한 번씩 출력

    public static void main(String[] args) {

        Thread printA = new Thread(new PrintContent("A", 1000), "Thread-A");
        Thread printB = new Thread(new PrintContent("B", 500), "Thread-B");
        printA.start();
        printB.start();
    }

    static class PrintContent implements Runnable {

        private String content;
        private int sleepMs;

        public PrintContent(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    log("content : " + content);
                    Thread.sleep(sleepMs);
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
