package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaMapMain {
    

    public static void main(String[] args) {
        run(new HashMap<>()); //순서 보장 안 됨
        run(new LinkedHashMap<>()); //입력한 순서로 보장
        run(new TreeMap<>()); //key의 값의 순서로 저장이 된다.
    }

    private static void run(Map<String, Integer> map){
        System.out.println("map : " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "= " + map.get(key) + " ");
        }
        System.out.println();
    }
}
