package equals;

public class EqualsMain {
    
    public static void main(String[] args) {
        UserV1 v1 = new UserV1("id-100");
        UserV1 v1_2 = new UserV1("id-100");

        System.out.println("v1.equals(v1_2) : " + v1.equals(v1_2));
        System.out.println("v1 == v1_2 : " + (v1 == v1_2));


        UserV2 v2 = new UserV2("id-100");
        UserV2 v2_2 = new UserV2("id-100");
        System.out.println("v2.equals(v2_2) : " + v2.equals(v2_2));
        System.out.println("v2 == v2_2 : " + (v2 == v2_2));
    }
}
