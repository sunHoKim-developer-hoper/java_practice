package interfacePra.car;

public class Sonata implements Car{
    @Override
    public void offEngine() {
        System.out.println("Sonata.offEngine");
    }

    @Override
    public void pressAcclerator() {
        System.out.println("Sonata.pressAcclerator");
    }

    @Override
    public void startEngine() {
        System.out.println("Sonata.startEngine");
    }
}
