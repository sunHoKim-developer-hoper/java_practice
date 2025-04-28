package exception.ex3.exception;

public class SentExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SentExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }

}
