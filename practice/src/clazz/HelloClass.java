package clazz;

public class HelloClass {
    
    public static void main(String[] args) throws Exception{
        Class helloClass = Hello.class;

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        System.out.println(hello.hello());
    }
}
