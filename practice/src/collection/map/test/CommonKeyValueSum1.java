package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A",1, "B",2,"c",3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("D", 6);
        map2.put("B",4);
        map2.put("C", 5);

        Map<String, Integer> result = new HashMap<>();
        map1.forEach((k,v)->{
            if(map2.containsKey(k))
                result.put(k, v+map2.get(k));
        });
        System.out.println(result);
    }
}
