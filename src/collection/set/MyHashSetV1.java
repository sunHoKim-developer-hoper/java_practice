package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    @SuppressWarnings("unchecked")
    public void initBuckets() {
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if (bucket.contains(value)) //O(n)이 될 수도 있다 but 대부분 데이터가 1개 2개정도 저장되어 있다, 따라서 O(1)
            return false;
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; 
        return bucket.contains(searchValue); //O(n)이 될 수도 있다 but 대부분 데이터가 1개 2개정도 저장되어 있다, 따라서 O(1)
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        boolean result = bucket.remove(Integer.valueOf(value)); //O(n)이 될 수도 있다 but 대부분 데이터가 1개 2개정도 저장되어 있다, 따라서 O(1)
        if (result) {
            size--;
            return true;
        } else
            return false;
    }

    public int size() {
        return size;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1 [buckets=" + Arrays.toString(buckets) + ", size=" + size + ", capacity=" + capacity + "]";
    }
}
