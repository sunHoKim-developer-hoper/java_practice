package thread.start;

public class DemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main Start()");

        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(true); //데몬쓰레드 여부
        demonThread.start();
        System.out.println(Thread.currentThread().getName() + ": main End()");
    }

    static class DemonThread extends Thread {
        
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : run()");
            try {
                Thread.sleep(10000); //10초간 실행
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : run End()");
        }
        
    }
}
