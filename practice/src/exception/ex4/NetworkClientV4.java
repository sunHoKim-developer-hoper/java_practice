package exception.ex4;
import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SentExceptionV4;

public class NetworkClientV4 {
    public final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV4(String address){
        this.address = address;
    }


    public void connect(){
        if(connectError){
            throw new ConnectExceptionV4(address, address+ " 연결 실패");
        }
        System.out.println(address + " 서버와 연결 성공");
    }

    public void send(String data){
        if(sendError){
            throw new SentExceptionV4(data, data + " 전송 실패");
        }
        System.out.println(address + " 서버에 데이터 전송: "+ data);
    }
    public void disconnect(){
        System.out.println(address + " 서버와 연결해제 ");
    }

    public void initError(String data){
        if(data.contains("error1"))
            connectError = true;
        if(data.contains("error2"))
            sendError = true;
    }

}
