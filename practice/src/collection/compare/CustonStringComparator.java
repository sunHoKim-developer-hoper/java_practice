package collection.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustonStringComparator implements Comparator<String>{

    private List<String> order = new ArrayList<>(List.of("X", "Q", "A", "U", "C", "S", "J", "Z", "D", "K", "R", "F", "Y", "N", "V", "B", "W", "P", "G", "M", "E", "O", "L", "I", "H", "T"));

    @Override
    public int compare(String o1, String o2) {
        int o1Index = order.indexOf(o1);
        int o2Index = order.indexOf(o2);
        return Integer.compare(o1Index, o2Index);
    }
}
