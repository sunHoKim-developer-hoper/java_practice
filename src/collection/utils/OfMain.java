package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    
    public static void main(String[] args) {
       //편리한 불변 컬렉션 생성
       List<Integer> list = List.of(1,2,3);
       Set<Integer> set = Set.of(1,2,3,4,5);
       Map<String, Integer> map = Map.of("A",1, "B",1);
       System.out.println(list.getClass());
       System.out.println(set.getClass());
       System.out.println(map.getClass());
    }
}
