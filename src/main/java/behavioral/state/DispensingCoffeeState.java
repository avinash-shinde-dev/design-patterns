package behavioral.state;

public class DispensingCoffeeState implements CoffeeMachineState {
    private CoffeeMachine coffeeMachine;

    public DispensingCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void idle() {
        System.out.println("Your coffee is in making ... take a chill pill");
    }

    @Override
    public void selecting() {
        System.out.println("Your coffee is in making ... take a chill pill");
    }

    @Override
    public void dispensing() {
        System.out.println("Your coffee is ready ... !Dispensing now !!  ");
        this.coffeeMachine.setCurrentState(new IdleState(this.coffeeMachine));
    }
}
