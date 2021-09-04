package behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pikabu {

    private List<Account> accounts;

    public Pikabu(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<String> requestProfileFriendsFromPikabu(String email) {
        // todo здесь должна быть нормальная реализация
        return new ArrayList<>();
    }


    public Account requestProfileFromPikabu(String friendEmail) {
        // todo здесь должна быть нормальная реализация
        return new Account("Martin", "martin@mart.in", new HashMap<>());
    }

    public PikabuAccountIterator createPikabuIterator(){
        // todo здесь должна быть нормальная реализация
        return new PikabuAccountIterator(this, "ololo@olo.lo");
    }
}
