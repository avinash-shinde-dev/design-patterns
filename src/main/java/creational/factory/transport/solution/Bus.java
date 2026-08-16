package creational.factory.transport.solution;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by bus");
    }
}
