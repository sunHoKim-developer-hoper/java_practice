package interfacePra.car;

public class Venu implements Car {
    
    @Override
    public void offEngine() {
        System.out.println("Venu.offEngine");
    }

    @Override
    public void pressAcclerator() {
        System.out.println("Venu.pressAcclerator");
    }

    @Override
    public void startEngine() {
        System.out.println("Venu.startEngine");
    }

}
