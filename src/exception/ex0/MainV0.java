package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NetworkServiceV0 service = new NetworkServiceV0();
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
    }
}
