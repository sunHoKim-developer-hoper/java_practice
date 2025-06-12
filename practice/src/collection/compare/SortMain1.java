package collection.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain1 {
    
    public static void main(String[] args) {
        Integer[] array = {3,2,1,};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        list.sort((a, b) -> b - a);
    }
}
