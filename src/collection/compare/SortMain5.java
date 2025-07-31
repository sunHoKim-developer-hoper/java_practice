package collection.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("C", 3);
        MyUser myUser2 = new MyUser("B", 1);
        MyUser myUser3 = new MyUser("A", 6);
        Set<MyUser> treeSet = new TreeSet<>();
        treeSet.add(myUser1);
        treeSet.add(myUser2);
        treeSet.add(myUser3);
        System.out.println(treeSet);

        Set<MyUser> sorted = new TreeSet<>(new IdComparator());
        sorted.add(myUser1);
        sorted.add(myUser2);
        sorted.add(myUser3);
        System.out.println(sorted);
    }
}
