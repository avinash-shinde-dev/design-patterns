package creational.builder.solution;

public class Car {
    private final String id;
    private final String brand;
    private final String model;
    private final String color;
    private final boolean hasSunRoof;
    private final boolean hasReverseCamera;
    private final boolean hasVentilatedSeats;

    public Car(CarBuilder builder) {
        this.id = builder.getId();
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.color = builder.getColor();
        this.hasSunRoof = builder.isHasSunRoof();
        this.hasReverseCamera = builder.isHasReverseCamera();
        this.hasVentilatedSeats = builder.isHasVentilatedSeats();
    }

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
