package behavioral.nullobject;

public class NullObjectDesignPattern {
    public static void main(String[] args) {
        /**
         *  Null object design pattern uses an object as a substitute when a
         *  real object is not present. This helps simplify your code by removing
         *  the need for explicit null checks. This will help to reduce the NPE.
         * Advantage:
         *  - Avoid null checks.
         *  - prevent NPE
         *  - provides the default behaviour.
         *  When to use this Pattern
         *   - you have multiple places in your code where a null object is returned.
         *   - the absence of an object should result in predictable and default behaviour.
         *   - you want to avoid the cluttering you code with null checks.

         */

        Vehicle vehicle = new VehicleFactory().getVehicleFromFactory("car");

        System.out.println("tank capacity: " + vehicle.tankCapacity());

        Vehicle vehicle2 = new VehicleFactory().getVehicleFromFactory("truck");

        System.out.println("tank capacity: " + vehicle2.tankCapacity());
    }
}
