package creational.builder;

public class Car {
    private String id;
    private String brand;
    private String model;
    private String color;
    private Double height;

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    private Double weight;

    /**
     * Do you see a problem here? What if we have 100's of fields for the class
     *  We don't need certain type of parameters for certain car. So, passing null value
     *  for those parameters which will make the constructor call ugly.
     *
     *  Solution:
     *  1) create overloaded constructors, which will end up creating lot's of constructors.
     *  2) use builder pattern.
     *
     */
     Car(String id, String brand, String model, String color, Double height, Double weight) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public static CarBuilder builder() {
         return new CarBuilder();
    }
}
