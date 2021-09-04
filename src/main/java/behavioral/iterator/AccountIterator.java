package behavioral.iterator;

public interface AccountIterator {

    boolean hasNext();
    Account getNext();
    void reset();
}
