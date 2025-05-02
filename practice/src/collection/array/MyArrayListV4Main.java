package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> strList = new MyArrayListV4<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        System.out.println(strList);
        
        //원하는 위치에 추가
        //list.add(3, 1);
        
        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
    }
}
