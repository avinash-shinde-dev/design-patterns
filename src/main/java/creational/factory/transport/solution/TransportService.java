package creational.factory.transport.solution;

public class TransportService {
    public static void main(String[] args) {

        // now we are not creating objects in this class
        // we have delegated the responsibility to factory class to create the object
        // if there is any new transport service, we don't have to changed anything here

        Transport bus = TransportFactory.createTransport("bus");

    }
}
