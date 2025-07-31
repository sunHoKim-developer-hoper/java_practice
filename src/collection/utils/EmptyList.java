package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyList {
    
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list = new ArrayList<>();
        List<Integer> emptyList = Collections.emptyList();
        List<Integer> ofList = List.of();
        
        //asList는 원본 배열을 그대로 활용한다.
        Integer [] arr = {1,2,3,4,5};
        //인덱스가 많은 경우 성능 상 나을 수도 있다. List.of에 비해서..
        List<Integer> arrList = Arrays.asList(arr);
        //가변으로 만들어진다.
        List<Integer> arrList2 = new ArrayList<>(List.of(arr));
        System.out.println(Arrays.toString(arr));
        //arr 배열도 같이 바뀐다.
        arrList.set(1, 100);
        System.out.println(Arrays.toString(arr));
        arrList2.add(200);
    }

}
