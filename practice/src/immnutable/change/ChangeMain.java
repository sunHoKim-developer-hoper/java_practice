package immnutable.change;

public class ChangeMain {
    
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);
        System.out.println(obj.getValue());
    
        ImmutableObj obj2 = new ImmutableObj(10);
        obj2 = obj2.add(20);
        System.out.println(obj2.getValue());
    }
}
