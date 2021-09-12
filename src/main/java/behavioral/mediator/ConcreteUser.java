package behavioral.mediator;

public class ConcreteUser extends User {

    public ConcreteUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String msg, String sender) {
        System.out.println("User " + this.name + " got message from user " + sender + " \"" + msg + "\"");
    }

    @Override
    void sendMessage(String msg) {
        super.chat.getMessage(msg, this);
    }
}
