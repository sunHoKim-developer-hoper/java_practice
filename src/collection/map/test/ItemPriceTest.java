package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나",500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        
        List<String> result = new ArrayList<>();
        map.forEach((k,v)->{
            if(v == 1000)
                result.add(k); 
        });
        System.out.println(result);
    }
}
