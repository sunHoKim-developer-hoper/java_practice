package exception.ex4.exception;

public class SentExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendData;

    public SentExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }

}
