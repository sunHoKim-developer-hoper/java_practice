package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        
        //원하는 위치에 추가
        list.add(3, "d");
        System.out.println(list);

        list.add(0, "A");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
