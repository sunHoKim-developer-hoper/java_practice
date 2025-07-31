package exception.ex3;

import java.util.Scanner;

import exception.ex3.exception.NetworkClientExceptionV3;

public class MainV3 {
    
    public static void main(String[] args) throws NetworkClientExceptionV3{
        Scanner sc = new Scanner(System.in);
        //catch에서 잡지 못하는 예외가 발생했을 경우 like throw RuntimeException
        NetworkServiceV3_2 service = new NetworkServiceV3_2();

        while(true){
            System.out.print("전송할 문자:");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
        sc.close();
    }
}
