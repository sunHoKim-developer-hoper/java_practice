package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain {
    public static void main(String[] args) {
        MyFunction add = (a,b) -> a + b;
        MyFunction sub = (a,b) -> a - b;
        
        //변수에 대입하기
        MyFunction cal = add;
        //메서드에 전달
        calculate(add);
        calculate(sub);
        calculate((a,b) -> a + b);
        
    }
    //람다를 메서드에 전달하기
    static void calculate(MyFunction function){
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int result = function.apply(a, b);
        System.out.println("result : " + result);
    }
}
