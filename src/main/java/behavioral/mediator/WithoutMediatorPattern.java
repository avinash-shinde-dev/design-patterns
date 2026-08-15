package behavioral.mediator;


public class WithoutMediatorPattern {

    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        User joe = new User("Joe");

        alice.sendMessage("Hello", bob);
        alice.sendMessage("Hello", joe);

        bob.sendMessage("Hii", alice);
        bob.sendMessage("Hii", joe);
    }
}
