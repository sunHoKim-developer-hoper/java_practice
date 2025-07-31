package collection.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("C", 1);
        MyUser myUser2 = new MyUser("B", 2);
        MyUser myUser3 = new MyUser("A", 3);
        List<MyUser> list = new ArrayList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        List<String> order = List.of("B","C","F","G");
        list.sort(Comparator.comparing((MyUser o) -> {
            int index = order.indexOf(o.getId());
            return index == -1 ? Integer.MAX_VALUE : index;
        }).thenComparing(MyUser::getAge));
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(new IdComparator());
        System.out.println(list);

        list.sort((o1, o2) -> o2.getId().compareTo(o1.getId()));
        list.sort(new Comparator<MyUser>() {
            @Override
            public int compare(MyUser o1, MyUser o2){
                return o2.getId().compareTo(o1.getId());
            }
        });
    
        List<String> strs = new ArrayList<>(List.of("M", "L", "D", "K", "T", "U", "C", "P", "F", "W", "S", "H", "I", "R", "N", "V", "B", "A", "O", "J", "Q", "Y", "E", "G", "X", "Z"));
        strs.sort(new CustonStringComparator());
        System.out.println(strs);
    }
}
