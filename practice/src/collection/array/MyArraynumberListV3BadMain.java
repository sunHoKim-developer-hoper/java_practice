package collection.array;

public class MyArraynumberListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자");
        System.out.println(numberList);

        // Object를 반환하므로 다운 캐스팅이 필요하다
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        
        // ClassCast익셉션이 발생한다. 문자가 입력되었기 때문
        //Integer num3 = (Integer) numberList.get(2);
        
    }
}
