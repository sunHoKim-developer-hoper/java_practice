package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(c) = " + list.indexOf("c"));
        System.err.println("list.set(2,'z') = " + list.set(2, "z"));
        System.out.println(list);
        
        // 범위 초가하면??
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add("f");
    }   
}
