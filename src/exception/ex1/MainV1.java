package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NetworkServiceV1_1 service = new NetworkServiceV1_1();
        //NetworkServiceV1_2 service = new NetworkServiceV1_2();
        NetworkServiceV1_3 service = new NetworkServiceV1_3();
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
