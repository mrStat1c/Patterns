package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PikabuAccountIterator implements AccountIterator {

    //коллекция
    private Pikabu pikabu;
    private String email;
    private List<String> emails = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private int currentPosition = 0;

    public PikabuAccountIterator(Pikabu pikabu, String email) {
        this.pikabu = pikabu;
        this.email = email;
    }

    @Override
    public boolean hasNext() {
        if (emails.size() == 0) {
            List<String> profiles = pikabu.requestProfileFriendsFromPikabu(this.email);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.accounts.add(null);
            }
        }
        return this.currentPosition < emails.size();
    }

    @Override
    public Account getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Account friendAccount = accounts.get(currentPosition);
        if (friendAccount == null) {
            friendAccount = pikabu.requestProfileFromPikabu(friendEmail);
            accounts.set(currentPosition, friendAccount);
        }
        currentPosition++;
        return friendAccount;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
