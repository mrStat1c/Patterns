package behavioral.observer.publisher;

import behavioral.observer.observer.Observer;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный издатель
 */
public class MediaStore implements Publisher {

    @Getter
    private Content content = new Content();

    @Data
    public class Content {
        List<String> games = new ArrayList<>();
        List<String> movies = new ArrayList<>();
        List<String> music = new ArrayList<>();
    }

    public void addGame(String game) {
        this.content.games.add(game);
        notifyObservers();
    }

    public void addMovie(String movie) {
        this.content.movies.add(movie);
        notifyObservers();
    }

    public void addMusic(String music) {
        this.content.music.add(music);
        notifyObservers();
    }


    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    //можно передавать обновленное состояние через этот метод (объект Content)
    //либо передавать в него сам объект MediaStore
    @Override
    public void notifyObservers() {
        observers.forEach(Observer::handleEvent);
    }
}
