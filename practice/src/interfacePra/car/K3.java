package interfacePra.car;

public class K3 implements Car{

    @Override
    public void offEngine() {
        System.out.println("K3.offEngine");
    }

    @Override
    public void pressAcclerator() {
        System.out.println("K3.pressAcclerator");
    }

    @Override
    public void startEngine() {
        System.out.println("K3.startEngine");
    }
}
