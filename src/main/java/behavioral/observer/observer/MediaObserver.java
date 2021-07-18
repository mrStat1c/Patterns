package behavioral.observer.observer;

import behavioral.observer.publisher.MediaStore;

public class MediaObserver implements Observer {

    private String name;
    private MediaStore mediaStore;

    public MediaObserver(String name, MediaStore mediaStore) {
        this.name = name;
        this.mediaStore = mediaStore;
    }

    @Override
    public void handleEvent() {
        MediaStore.Content content = this.mediaStore.getContent();
        System.out.println("-------- " + name + " -------");
        System.out.println("Content of Media store updated...");
        System.out.println("List of games: " + content.getGames());
        System.out.println("List of movies: " + content.getMovies());
        System.out.println("List of music: " + content.getMusic());
    }

}
