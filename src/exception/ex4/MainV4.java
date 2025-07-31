package exception.ex4;

import java.util.Scanner;

import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex4.exception.SentExceptionV4;

public class MainV4 {
    
    public static void main(String[] args) throws NetworkClientExceptionV3{
        Scanner sc = new Scanner(System.in);
        //catch에서 잡지 못하는 예외가 발생했을 경우 like throw RuntimeException
        //NetworkServiceV4 service = new NetworkServiceV4();
        NetworkServiceV5 service = new NetworkServiceV5();
        while(true){
            System.out.print("전송할 문자:");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            try {
                service.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
        sc.close();
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("개발자용 디버깅 메세지");
        e.printStackTrace(System.out);

        //필요하면 예외 별로 처리 가능
        if(e instanceof SentExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
