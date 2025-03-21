package behavioral.nullobject;

public class VehicleFactory {

    public Vehicle getVehicleFromFactory(String vehicleName) {
        if (vehicleName.equals("car"))
            return new Car();
        else if (vehicleName.equals("bike"))
            return new Bike();
        else
            return new NullVehicle();
    }
}
