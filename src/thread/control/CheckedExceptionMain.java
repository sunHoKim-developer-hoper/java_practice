package thread.control;

import util.ThreadUtils;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {
        @Override
        public void run() /* throws Exception이 허용이 안 된다!! */ {
            // throw new Exception 허용이 안 된다.
            ThreadUtils.sleep(1000);
        }
    }
}
