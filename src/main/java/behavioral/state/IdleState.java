package behavioral.state;

public class IdleState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void idle() {
        System.out.println("Coin inserted, please select a coffee ");
        this.coffeeMachine.setCurrentState(new SelectingCoffeeState(this.coffeeMachine));
    }

    @Override
    public void selecting() {
        System.out.println("Please insert a coin ... ");
    }

    @Override
    public void dispensing() {
        System.out.println("Please insert a coin ... ");
    }
}
