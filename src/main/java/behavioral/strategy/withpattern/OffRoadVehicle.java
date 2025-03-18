package behavioral.strategy.withpattern;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
