package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        
        List<Integer> mutableList = new ArrayList<>(List.of(1,2,3));
        
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println(unmodifiableList.getClass());
    }    
}
