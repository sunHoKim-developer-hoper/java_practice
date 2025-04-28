package exception.basic.checked;

//Exception을 상속받은 예외는 체크 예외가 된다.
public class MycheckedException extends Exception{
    
    public MycheckedException(String message){
        super(message);
    }

}
