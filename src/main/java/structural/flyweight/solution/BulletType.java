package structural.flyweight.solution;

public class BulletType {
    private String colour;

    public BulletType(String colour) {
        this.colour = colour;
        System.out.println("Creating bullet type with colour : " + this.colour);
    }

}
