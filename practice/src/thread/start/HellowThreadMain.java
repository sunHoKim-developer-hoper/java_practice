package thread.start;

public class HellowThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main Start()");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start(); // main 쓰레드는 호출하라고 지시만 내리는 거지.. 직접 실행하는 것은 절대 아니다.
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main End()");
    }
}
