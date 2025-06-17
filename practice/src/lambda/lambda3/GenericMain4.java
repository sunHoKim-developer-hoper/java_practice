package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String o) {
                return o.toUpperCase();
            }
        };

        String result = (String) upperCase.apply("hello");
        System.out.println("Upper String : " + result);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer o) {
                return o * o;
            }
        };

        Integer result2 = (Integer) square.apply(3);
        System.out.println("square Num : " + result2);

    }

    @FunctionalInterface
    public interface GenericFunction<T,R> {
        R apply(T o);
    }
}
