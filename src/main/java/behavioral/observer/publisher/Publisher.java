package behavioral.observer.publisher;

import behavioral.observer.observer.Observer;

/**
 * Издатель
 */
public interface Publisher {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
