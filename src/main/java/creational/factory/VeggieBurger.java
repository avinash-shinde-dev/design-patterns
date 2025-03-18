package creational.factory;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Prepare the veggie burger");
    }
}
