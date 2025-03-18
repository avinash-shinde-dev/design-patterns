package creational.builder;

public class CarBuilder {
    private String id;
    private String brand;
    private String model;
    private String color;
    private Double height;
    private Double weight;

    public CarBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public CarBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public CarBuilder withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Car build(){
        return new Car(id, brand, model, color, height, weight);
    }
}
