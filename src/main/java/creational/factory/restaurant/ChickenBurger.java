package creational.factory.restaurant;

public class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Prepare the chicken burger");
    }
}
