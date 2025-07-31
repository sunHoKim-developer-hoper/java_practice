package collection.iterable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = new HashSet<>(list);
        Iterator<Integer> lisIterator = list.iterator();
        Iterator<Integer> setIterator = set.iterator();
        printAll(lisIterator);
        printAll(setIterator);
        forEach(list);
    }

    private static void printAll(Iterator<Integer> i){
        while (i.hasNext()) {
            System.out.println("Iterator : " + i.getClass());
            System.out.println("Value : " + i.next());
        }
    }

    private static void forEach(Iterable<Integer> i){
        for (Integer value : i) {
            System.out.println("Iterable : " + i.getClass());
            System.out.println("Value : " + value);
        }
    }
}
