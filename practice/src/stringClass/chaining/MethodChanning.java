package stringClass.chaining;

public class MethodChanning {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        //adder.add(1);
        //adder.add(2);
        //adder.add(3);

        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println(result);
    }
    
}
