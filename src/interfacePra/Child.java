package interfacePra;

public class Child implements InterfaceA, InterfaceB{
    
    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");        
    }

    @Override
    public void commonMethod() {
        System.out.println("I AM COMMON");
    }
}
