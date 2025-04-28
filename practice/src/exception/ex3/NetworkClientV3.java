package exception.ex3;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SentExceptionV3;

public class NetworkClientV3 {
    public final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV3(String address){
        this.address = address;
    }


    public void connect() throws ConnectExceptionV3{
        if(connectError){
            throw new ConnectExceptionV3(address, address+ " 연결 실패");
        }
        System.out.println(address + " 서버와 연결 성공");
    }

    public void send(String data) throws SentExceptionV3{
        if(sendError){
            //throw new SentExceptionV3(data, data + " 전송 실패");
            throw new RuntimeException("ex");
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
