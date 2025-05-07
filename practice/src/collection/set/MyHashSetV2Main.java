package collection.set;

public class MyHashSetV2Main {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A"); //O(1)
        set.add("B"); 
        set.add("C");
        set.add("AB"); 
        set.add("SET"); 
        System.out.println(set);

        //검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult : "+  removeResult);
        System.out.println(set);
    }
}
