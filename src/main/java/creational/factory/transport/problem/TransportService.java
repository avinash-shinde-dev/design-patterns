package creational.factory.transport.problem;

public class TransportService {
    public static void main(String[] args) {

        // Now if i want the object of car
        Transport car = new Car();
        // now bike

        Transport bike = new Bike(); // as you can see the Bike or Car are tightly
        // coupled with the TransportService
        // whenever you need to add some new transport service let's say bus
        // then you need to make changes in this class

        Transport bus = new Bus();

        // This is where factory design pattern will help you, where you will
        // ask for the transport object and you will get that dynamically from
        // the factory.

    }
}
