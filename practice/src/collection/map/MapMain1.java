package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("A", 90);
        studentMap.put("B", 80);
        studentMap.put("C", 70);
        studentMap.put("D", 80);
        System.out.println(studentMap);
        
        Integer result = studentMap.get("A");
        System.out.println("result : " + result);
        
        System.out.println("\nkeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }

        System.out.println("\nentrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String,Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + ", value : " + value);
        }

        System.out.println("\nvalues 활용");
        List<Integer> values = (ArrayList<Integer>) studentMap.values();

        for (Integer value : values) {
            System.out.println("value = " + value);    
        }
    }
}
