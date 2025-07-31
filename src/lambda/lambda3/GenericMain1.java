package lambda.lambda3;

public class GenericMain1 {

    public static void main(String[] args) {
        StringFunction upperCase = (String s) -> s.toUpperCase();
        String result = upperCase.apply("hello");
        System.out.println("Upper String : " + result);

        NumberFunction square = n -> n * n;
        Integer result2 = square.apply(3);
        System.out.println("square Num : " + result2);

    }

    @FunctionalInterface
    public interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    public interface NumberFunction {
        Integer apply(Integer n);
    }


    
}
