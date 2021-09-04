package behavioral.iterator;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {


        Pikabu pikabu = new Pikabu(new ArrayList<>());
        PikabuAccountIterator accountIterator = pikabu.createPikabuIterator();
        // todo ничего выводиться не будет т.к. нужна нормальная реализация методов
        while (accountIterator.hasNext()){
            Account account = accountIterator.getNext();
            System.out.println(account.getName());
        }
    }
}
