package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data); //throw new RuntimeException이 발생
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] : " + e.getErrorCode());
        } 
        client.disconnect();
    }
}
