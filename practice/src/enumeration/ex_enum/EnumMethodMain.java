package enumeration.ex_enum;

import java.util.Arrays;

public class EnumMethodMain {
    
    public static void main(String[] args) {
        Grade [] values = Grade.values();
        System.out.println(Arrays.toString(values));
        for(Grade g : values){
            System.out.println(g.ordinal() +"번 : " + g.name());
        }
        //String => Enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        
    }
}
