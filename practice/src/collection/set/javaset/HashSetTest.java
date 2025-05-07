package collection.set.javaset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));
        
        //합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 : "  + union);

        //교집합
        Set<Integer> intersaction = new HashSet<>(set1);
        intersaction.retainAll(set2);
        System.out.println("교집합 : "  + intersaction);

        Set<Integer> differenct = new HashSet<>(set1);
        differenct.removeAll(set2);
        System.out.println("차집합 : "  + differenct);        
    }
}
