package wrapper;

public class AutoBoxing {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        int unboxedValue = boxedValue.intValue();

        Integer autoBoxing = value;
        int autoUnboxing = boxedValue;

        System.out.println(autoBoxing.compareTo(Integer.valueOf(8)));
    }
}
