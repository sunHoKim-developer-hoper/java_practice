package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        //람다 직접 대입 : 문제 없음
        FunctionA functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10)" + functionA.apply(10));
        FunctionB functionB = i -> "value = " + i;

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입, 아래와 같은 코드는 컴파일 에러가 발생한다.
        // FunctionB targetB = functionA;
    }

    @FunctionalInterface
    public interface FunctionA {
        String apply(Integer o);
    }

    @FunctionalInterface
    public interface FunctionB {
        String apply(Integer o);
    }
}
