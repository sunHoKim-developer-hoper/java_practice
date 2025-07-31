package exception.basic.unchecked;

public class Client {
    
    //던질 필요가 없다.
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
