package lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();

        String result = (String) upperCase.apply("hello");
        System.out.println("Upper String : " + result);

        GenericFunction<Integer, Integer> square = n -> n * n;

        Integer result2 = (Integer) square.apply(3);
        System.out.println("square Num : " + result2);

    }

    @FunctionalInterface
    public interface GenericFunction<T,R> {
        R apply(T o);
    }
}
