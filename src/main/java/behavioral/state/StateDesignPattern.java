package behavioral.state;

public class StateDesignPattern {
    public static void main(String[] args) {
        /**
         * Intent :
         *  State is a behavioural design pattern that lets an object alter it's behaviour
         *  when its internal state changes.
         *
         *  It is closely related to the finite-state machine
         *
         * Usecase : Coffee Machine
         *       Vending Machine
         *       Order Processing System/
         *
         * Applicability:
            -> Use : when you have an object that behaves differently depending on its
                     current state, the number of states is enormous, and the state specific code
                     changes frequently
                   : when you have class polluted with massive conditional statements that alter
                     how the class behaves according to current value
                   : when you have lot of duplicate code across the similar states and transition
                     condition based state machine.

           Relation:
              State can be considered as extension to the strategy design pattern. Both patterns are
              based on composition, which is delegating work to other objects.
         */
        // << Client >>
         CoffeeMachine coffeeMachine = new CoffeeMachine();
         coffeeMachine.insertCoin();
         coffeeMachine.selectCoffee();
         coffeeMachine.dispenseCoffee();
    }
}
