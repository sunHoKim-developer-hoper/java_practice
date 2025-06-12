package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4,5}));
        //정렬을 해서 가져온다
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        
        System.out.println("Max Value : " + max);
        System.out.println("Min Value : " + min);

        Collections.shuffle(list);
        System.out.println("Shuffled List : " + list);

        Collections.reverse(list);
        System.out.println("Reversed List : " + list);
    }
}
