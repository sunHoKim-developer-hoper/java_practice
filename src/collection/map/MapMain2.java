package collection.map;

import java.util.HashMap;
import java.util.Map;
//중복 키
public class MapMain2 {
    
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("A", 90);
        studentMap.put("B", 80);
        studentMap.put("B", 70);
        System.out.println(studentMap);
    
        boolean containsKey = studentMap.containsKey("A");
        System.out.println("containsKey : " + containsKey);

        studentMap.remove("A");
        System.out.println(studentMap);
    }
}
