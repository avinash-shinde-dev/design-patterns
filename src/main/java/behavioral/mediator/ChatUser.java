package behavioral.mediator;
public class ChatUser {
        private String name;
        private ChatMediator chatMediator;

        public ChatUser(String name, ChatMediator chatMediator) {
            this.name = name;
            this.chatMediator = chatMediator;
        }

        public String getName() {
            return name;
        }

        public void sendMessage(String msg, ChatUser sender){
            this.chatMediator.send(msg, this);
        }

        public void receiveMessage(String msg, ChatUser sender){
            if(!sender.getName().startsWith(this.getName()))
                 System.out.println(this.getName() + ": Received msg from " + sender.getName() + " : " + msg);
        }
    }
