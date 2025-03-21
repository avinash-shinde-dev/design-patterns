package structural.decorator;

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        /**
         *  Decorator design pattern that allows you to enhance or modify
         *  the behaviour of objects at runtime. It achieves this by creating
         *  the set of decorator classes that are uses to wrap the concrete
         *  component. Each decorator adds the specific features to the component.
         *  you can stack multiple decorators to create various combination.

         *  When to use ?
         *  - Add new features: If you want extra features to the object without changing
         *  their core structure. ex. It's like putting toppings on pizza without
         *  changing pizza itself.

         *  - Avoid messy code : you want to avoid having too many different classes for
         *    all possible combinations of features. Instead, you can mix and match
         *    decorators as needed.

         *  - Open for Extension, Closed for Modifications: you want to make your
         *    code ready for future changes by allowing new features to be added
         *    without messing up existing code. This aligns with the Open/Closed
         *    principle.
         *
         */

         Pizza pizza = new PlainPizza();

         pizza = new CheeseDecorator(pizza);
         pizza = new PepperoniDecorator(pizza);

         System.out.println("Description: " + pizza.getDescription());
         System.out.println("Cost: Rs " + pizza.getCost());

    }
}
