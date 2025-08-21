package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV5 implements BankAccount {

    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountV5(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : " + getClass().getSimpleName());

        if(!lock.tryLock()){
            log("[진입 실패] 이미 실행 중인 작업이 있습니다. (다른 스레드가 락을 걸고 있습니다)");
            return false;
        }

        try {
            // 임계영역 시작
            log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
                return false;
            }

            log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
            sleep(1000); // 출금에 걸리는 시간
            balance -= amount;
            // 임계영역 종료
            log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
            log("거래 종료");
        } finally {
            lock.unlock();
        }
        return true;
    }

    @Override
    public int getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
