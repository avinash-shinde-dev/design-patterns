package creational.builder.solution;

public class CarBuilder {
    private String id;
    private String brand;
    private String model;
    private String color;
    private boolean hasSunRoof;
    private boolean hasReverseCamera;
    private boolean hasVentilatedSeats;

    private CarBuilder(String id, String brand, String model, String color){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getId() {
        return this.id;
    }
    public CarBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }
    public CarBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return this.model;
    }
    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return this.color;
    }
    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isHasSunRoof() {
        return this.hasSunRoof;
    }

    public CarBuilder withSunRoof(Boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
        return this;
    }

    public boolean isHasReverseCamera() {
        return this.hasSunRoof;
    }

    public CarBuilder withReverseCamera(Boolean hasReverseCamera) {
        this.hasReverseCamera = hasReverseCamera;
        return this;
    }

    public boolean isHasVentilatedSeats() {
        return this.hasVentilatedSeats;
    }

    public CarBuilder withVentilatedSeats(Boolean hasVentilatedSeats) {
        this.hasVentilatedSeats = hasVentilatedSeats;
        return this;
    }

    // This could be no args constructor or constructor with required fields
    public static CarBuilder builder(String id, String brand, String model, String color) {
        return new CarBuilder(id, brand, model, color);
    }
    public Car build(){
        return new Car(this);
    }


}
