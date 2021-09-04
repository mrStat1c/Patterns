package behavioral.iterator;

import lombok.Getter;

import java.util.List;
import java.util.Map;

public class Account {

    @Getter
    private String name;
    @Getter
    private String email;
    @Getter
    private Map<String, List<String>> contacts;

    public Account(String name, String email, Map<String, List<String>> contacts) {
        this.name = name;
        this.email = email;
        this.contacts = contacts;
    }
}
