package behavioral.strategy.withpattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();  // sports drive implementation

        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive(); // normal drive implementation
    }
}
