package structural.decorator;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 130;
    }
}
