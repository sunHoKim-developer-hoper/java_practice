package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SentExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data); // throw new RuntimeException이 발생
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (SentExceptionV3 e) {
            System.out.println("[데이터 전송 오류] 전송 실패 데이터 : " + e.getSendData() + ", 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
