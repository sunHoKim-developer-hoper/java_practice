package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result = upperCase.apply("hello baby");
        System.err.println("result : " + result);

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square : " + square.apply(5));
    }

}
