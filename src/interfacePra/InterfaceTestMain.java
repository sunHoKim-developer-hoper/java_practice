package interfacePra;

public class InterfaceTestMain {

    public static void main(String[] args) {
        
        InterfaceA a = new Child();
        InterfaceB b = new Child();
        
        Child c = new Child();
        a.methodA();
        b.methodB();
        a.commonMethod();
        b.commonMethod();
        c.commonMethod();
    }
} 
