package behavioral.state;

// state machine
public interface CoffeeMachineState {
    void idle();
    void selecting();
    void dispensing();
}
