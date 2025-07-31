package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("A", 90);
        
        if(!studentMap.containsKey("A"))
            studentMap.put("A", 100);
        
        studentMap.putIfAbsent("B", 70);
        studentMap.putIfAbsent("A", 10);
        
        System.out.println(studentMap);
    }
}
