package behavioral.mediator;

public abstract class User {

    protected Chat chat;
    protected String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void getMessage(String msg, String sender);
    abstract void sendMessage(String msg);
}
