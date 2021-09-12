package behavioral.mediator;

public class ConcreteChat extends Chat {

    @Override
    void getMessage(String msg, User sender) {
       this.userList.forEach(user -> user.getMessage(msg, sender.name));
    }

}
