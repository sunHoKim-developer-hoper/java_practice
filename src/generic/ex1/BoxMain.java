package generic.ex1;

public class BoxMain {
    
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");

        //Object 형태로 위의 중복된 코드를 해결할 수 있다.
        //잘못된 타입의 인수가 전달된 가능성이 있다.
        ObjectBox integerObjectBox = new ObjectBox();
        integerObjectBox.setValue("잘못된 타입!!");

        GenericBox<String> genericStringBox = new GenericBox<>();
        GenericBox<Integer> genericIntegerBox = new GenericBox<>();
        
    }

}
