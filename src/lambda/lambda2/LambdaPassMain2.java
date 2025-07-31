package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1,2) : " + add.apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;

            case "sub":
                return (a, b) -> a - b;

            default:
                return (a, b) -> 0;
        }
    }
}
