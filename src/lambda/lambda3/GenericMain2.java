package lambda.lambda3;

public class GenericMain2 {

    public static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        String result = (String) upperCase.apply("hello");
        System.out.println("Upper String : " + result);

        ObjectFunction square = n -> (Integer) n * (Integer) n;
        Integer result2 = (Integer) square.apply(3);
        System.out.println("square Num : " + result2);

    }

    @FunctionalInterface
    public interface ObjectFunction {
        Object apply(Object n);
    }
}
