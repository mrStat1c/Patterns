package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {

    protected List<User> userList = new ArrayList<>();

    public void registerUser(User user){
        this.userList.add(user);
    }

    abstract void getMessage(String msg, User sender);
}
