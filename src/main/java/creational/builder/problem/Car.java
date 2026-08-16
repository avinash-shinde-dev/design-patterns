package creational.builder.problem;

import creational.builder.solution.CarBuilder;

public class Car {
    private final String id;
    private final String brand;
    private final String model;
    private final String color;
    private final boolean hasSunRoof;
    private final boolean hasReverseCamera;
    private final boolean hasVentilatedSeats;

    public Car(String id, String brand, String model, String color, boolean hasSunRoof, boolean hasReverseCamera, boolean hasVentilatedSeats) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
        this.hasReverseCamera = hasReverseCamera;
        this.hasVentilatedSeats = hasVentilatedSeats;
    }

    /**
     *  Do you see a problem here? What if we have 100's of fields for the class
     *  We don't need certain type of parameters for certain car. So, passing null value
     *  for those parameters which will make the constructor call ugly.
     *
     *  Solution:
     *  1) create overloaded constructors, which will end up creating lot's of constructors.
     *  2) use builder pattern.
     *
     */



    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", hasSunRoof=" + hasSunRoof +
                ", hasReverseCamera=" + hasReverseCamera +
                ", hasVentilatedSeats=" + hasVentilatedSeats +
                '}';
    }
}
