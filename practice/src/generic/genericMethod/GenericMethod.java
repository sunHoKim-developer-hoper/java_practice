package generic.genericMethod;

public class GenericMethod {

    public static Object objectMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("Object print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("number print : " + t);
        return t;
    }
}
