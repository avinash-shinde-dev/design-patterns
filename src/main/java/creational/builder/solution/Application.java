package creational.builder.solution;

public class Application {
    public static void main(String[] args) {

        Car topModel = CarBuilder.builder("car-101", "Hyundai", "Creta", "White")
                .withSunRoof(true)
                .withReverseCamera(true)
                .withVentilatedSeats(true)
                .build();

        System.out.println(topModel);

        // Now let's say I don't have the details of the car, you can easily have
        // the object with the required fields and no need to have the constructor
        // explosion.

        Car baseModel = CarBuilder.builder("car-101", "Hyundai", "Creta", "White")
                .build();


        System.out.println(baseModel);

        // This is one way doing it?
        // Other way is you can have the nested class, and it's the standard
        // convention to have like that
        //

    }
}
