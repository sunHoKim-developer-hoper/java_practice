package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    
    public static void main(String[] args) throws NetworkClientExceptionV2{
        Scanner sc = new Scanner(System.in);
        //catch에서 잡지 못하는 예외가 발생했을 경우 like throw RuntimeException
        NetworkServiceV2_4 service = new NetworkServiceV2_4();

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
