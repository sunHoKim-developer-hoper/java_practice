package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
//해시 충돌 해결
public class HashStart5 {
    
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer> [] buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        add(buckets, 1);
        add(buckets, 12);
        add(buckets, 14);
        add(buckets, 8);
        add(buckets, 5);
        add(buckets, 9);
        add(buckets, 99);
        System.out.println("buckets = "  + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("9 포함하고 있음? " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(!bucket.contains(value)){ //O(n)의 성능
            bucket.add(value);
        }
    }

    private static boolean contains (LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
