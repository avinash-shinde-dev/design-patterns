package creational.factory.transport.problem;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by bike");
    }
}
