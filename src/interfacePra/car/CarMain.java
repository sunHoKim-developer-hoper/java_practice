package interfacePra.car;

public class CarMain {
    
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3 k3 = new K3();
        driver.setCar(k3);
        driver.drive();

        Sonata so = new Sonata();
        driver.setCar(so);
        driver.drive();

        Venu v = new Venu();
        driver.setCar(v);
        driver.drive();
    }
}
