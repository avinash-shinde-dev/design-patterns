package behavioral.state;

// Context
public class CoffeeMachine {
    // Holds the current state
    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        // should hold the initial state
        this.currentState =  new IdleState(this);;
    }

    public CoffeeMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CoffeeMachineState currentState) {
        this.currentState = currentState;
    }

    public void insertCoin(){
        this.currentState.idle();
    }

    public void selectCoffee() {
        this.currentState.selecting();
    }

    public void dispenseCoffee(){
        this.currentState.dispensing();
    }
}
