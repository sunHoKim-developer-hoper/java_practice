package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerfomanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("ArrayList 추가");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); //찾는데 O(1), 데이터 추가 O(n) arrayList가 약간 빠른다
        
        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); //찾는데 O(1), 데이터 추가 O(1) 
        
        int loop = 10000;

        System.out.println("ArrayList 조회");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size -1);

        System.out.println("ArrayList 검색");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size -1);
        //===============================================================================//
        System.out.println("LinkedList 추가");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); //찾는데 O(n), 데이터 추가 O(1)
        
        LinkedList<Integer> linkedList = new LinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size); //찾는데 O(n), 데이터 추가 O(1)
        
        System.out.println("LinkedList 조회");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("LinkedList 검색");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size -1);
    }    

    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + ((endTime - startTime)) + "ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(i / 2, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + ((endTime - startTime)) + "ms");
    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + ((endTime - startTime)) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) { //O(n)
            list.get(index); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + ", 계산 시간 : " + ((endTime - startTime)) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findvalue){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) { //O(n)
            list.indexOf(findvalue); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findvalue : " + findvalue + ", 계산 시간 : " + ((endTime - startTime)) + "ms");
    }
}
