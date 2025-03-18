package behavioral.strategy.withpattern;

public class SportVehicle extends Vehicle {
    public SportVehicle(){
        super(new SportDriveStrategy());
    }
}
