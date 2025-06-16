package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple {

    public static void main(String[] args) {
        //MyFunction myFunction = (a, b) -> { return a + b; };
        
        //단일 표현식일 경우 중괄호와 return 생략 가능
        //MyFunction myFunction = (int a, int b) -> a + b;
        
        //타입 추론 가능
        MyFunction myFunction = (a, b) -> a + b;

        int result = myFunction.apply(1, 2);
        System.out.println("result : " + result);

        //단일 표현식이 아닐 경우 중괄호와 리턴 모두 필수
        MyFunction myFunction2 = (int a, int b) -> {
            System.out.println("단일 표현식이 아닐 경우!!");
            return a + b;};
        int result2 = myFunction2.apply(100, 200);
        System.out.println("result2 : " + result2);

        //매개변수가 하나일 때는 ()도 생략이 가능하다.
        OneParameter one = value -> System.out.println("one parameter");
        one.apply(result2);
    };

    interface  OneParameter{
        void apply(int value);
    }
}
