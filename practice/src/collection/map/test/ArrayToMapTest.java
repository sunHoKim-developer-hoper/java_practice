package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    
    public static void main(String[] args) {
        String [][] productArr = {{"JAVA", "10000"},{"Spring", "20000"},{"JPA", "30000"}};

        //주어진 배열로 Map  생성
        Map<String, Integer> productMap = new HashMap<>();
        for(String [] product : productArr){
            String key = product[0];
            Integer value = Integer.valueOf(product[1]);
            productMap.put(key, value);
        }
        for(Map.Entry<String, Integer> entry : productMap.entrySet()){
            System.out.printf("제품 : %s, 가격 : %d\n", entry.getKey(), entry.getValue());
        }
    }
}
