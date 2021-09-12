package behavioral.mediator;

public class Client {

    public static void main(String[] args) {

        Chat chat = new ConcreteChat();
        User user1 = new ConcreteUser(chat, "Martin");
        User user2 = new ConcreteUser(chat, "Gorlum");
        User user3 = new ConcreteUser(chat, "Haisenberg");
        chat.registerUser(user1);
        chat.registerUser(user2);
        chat.registerUser(user3);
        user1.sendMessage("Winter is coming!");
        user2.sendMessage("Martin, shut up! Guys, Do you sell a fish?");
        user3.sendMessage("No, but I sell blue methamphetamine. Will you buy it?");
    }

}
