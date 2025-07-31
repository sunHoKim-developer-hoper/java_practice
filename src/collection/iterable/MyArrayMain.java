
package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4,5});
        Iterator<Integer> myIterator =  myArray.iterator();
        while (myIterator.hasNext()) {
            Integer value = myIterator.next();
            System.out.println("value = " + value);
        }
        System.out.println("for-each 사용");
        for (Integer integer : myArray) {
            System.out.println("value : " + integer);
        }
    }
}
