package exception.basic.checked;

public class Client {
    
    //이 메서드는 예외 처리를 못하고 던지겠다는 의미
    public void call() throws MycheckedException {
        throw new MycheckedException("ex");
    }
}
