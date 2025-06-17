package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object o) {
                return ((String) o).toUpperCase();
            }
        };

        String result = (String) upperCase.apply("hello");
        System.out.println("Upper String : " + result);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object o) {
                return (Integer) o * (Integer) o;
            }
        };

        Integer result2 = (Integer) square.apply(3);
        System.out.println("square Num : " + result2);

    }

    @FunctionalInterface
    public interface ObjectFunction {
        Object apply(Object o);
    }
}
