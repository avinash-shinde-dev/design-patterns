package behavioral.mediator;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg, User recipient){
        System.out.println(this.getName() + "is sending " + msg
         + " to " +recipient.getName());
    }
}
