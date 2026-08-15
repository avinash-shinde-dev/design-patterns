package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

interface IMediator {
    void send(String msg, ChatUser sender);
    void add(ChatUser user);
}

class ChatMediator implements IMediator{

    private final List<ChatUser> users;
    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void send(String msg, ChatUser sender) {
        for(ChatUser user: users){
            user.receiveMessage(msg, sender);
        }
    }

    @Override
    public void add(ChatUser user) {
        this.users.add(user);
    }
}

public class WithMediatorDesignPattern {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        ChatUser alice = new ChatUser("Alice", chatMediator);
        ChatUser bob = new ChatUser("Bob", chatMediator);
        ChatUser joe = new ChatUser("Joe", chatMediator);

        chatMediator.add(alice);
        chatMediator.add(bob);
        chatMediator.add(joe);

        alice.sendMessage("Hello", alice);
    }
}
