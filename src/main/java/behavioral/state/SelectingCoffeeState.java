package behavioral.state;

public class SelectingCoffeeState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;

    public SelectingCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void idle() {
        System.out.println("Please select your coffee first.. ");
    }

    @Override
    public void selecting() {
        System.out.println("Let me make this coffee special for you ...");
        this.coffeeMachine.setCurrentState(new DispensingCoffeeState(this.coffeeMachine));
    }

    @Override
    public void dispensing() {
        System.out.println("Please select your coffee first.. ");
    }
}
