package creational.builder.problem;

public class Application {
    public static void main(String[] args) {
        Car topModel = new Car("car-101", "Hyundai", "Creta", "White", true, true, true);

        System.out.println(topModel);

        // Now, still I am getting the details, but I have to provide the details of all the fields
        // what If I have 100's of fields, imagine the constructor
        // Also, what if sometimes, I don't even need all the fields as well.
        // That's where builder design pattern will help you.
    }

}
