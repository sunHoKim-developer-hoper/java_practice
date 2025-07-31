package equals;

public class RectangleMain {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(100,2220);
        Rectangle r2 = new Rectangle(100,202);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }

}
