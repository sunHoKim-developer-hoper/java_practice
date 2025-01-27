package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName() + " main() start");
        
        System.out.println(Thread.currentThread().getName() + " start 호출 전");
        HelloThread helloThread = new HelloThread();
        //start()로 실행해야 한다.
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + " start 호출 후");
        
        System.out.println(Thread.currentThread().getName() + " main() end");
    }   
}
