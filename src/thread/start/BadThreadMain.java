package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        //run은 메인 쓰레드가 호출한다.
        System.out.println(Thread.currentThread().getName() + ": run() 호출 전");
        helloThread.run(); 
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");
    }
}
