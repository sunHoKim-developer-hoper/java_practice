package generic.genericMethod;

public class Main1 {
    
    public static void main(String[] args) {
        Integer i = 10;

        int n  = (int) GenericMethod.objectMethod(i);

        int nu = GenericMethod.<Integer>genericMethod(i);

        int num = GenericMethod.<Integer>numberMethod(i);
        double d = GenericMethod.<Double>numberMethod(20.00);
    }   

}
