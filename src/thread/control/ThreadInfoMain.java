package thread.control;

import static util.MyLogger.*;

import thread.runnable.HelloRunnable;

public class ThreadInfoMain {
    
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId = " + mainThread.threadId());
        log("mainThread.name = " + mainThread.getName());
        log("mainThread.priority = " + mainThread.getPriority()); 
        log("mainThread.threadGroup = " + mainThread.getThreadGroup());
        log("mainThread.state = " + mainThread.getState());
        System.out.println("=================================================");
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId = " + myThread.threadId());
        log("myThread.name = " + myThread.getName());
        log("myThread.priority = " + myThread.getPriority()); 
        log("myThread.threadGroup = " + myThread.getThreadGroup());
        log("myThread.state = " + myThread.getState());
    }
}
