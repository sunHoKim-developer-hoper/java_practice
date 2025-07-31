package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 3);
        MyUser myUser2 = new MyUser("b", 2);
        MyUser myUser3 = new MyUser("c", 1);
        MyUser [] arr = {myUser1, myUser2, myUser3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));

        System.out.println("Id로 정렬");
        Arrays.sort(arr, new IdComparator().reversed());
        System.out.println(Arrays.toString(arr));
    }
}
