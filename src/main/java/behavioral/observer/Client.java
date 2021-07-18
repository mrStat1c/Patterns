package behavioral.observer;

import behavioral.observer.observer.MediaObserver;
import behavioral.observer.observer.Observer;
import behavioral.observer.publisher.MediaStore;

public class Client {

    public static void main(String[] args) {

        MediaStore mediaStore = new MediaStore();
        mediaStore.addGame("Dark Souls 3");
        mediaStore.addGame("Half Life Alex");
        mediaStore.addGame("Beat Saber");
        mediaStore.addMovie("Friday 13 Part 10");
        mediaStore.addMovie("Avatar 2");
        mediaStore.addMusic("Dope Stars Inc");
        mediaStore.addMusic("Rammstein");
        mediaStore.addMusic("SOAD");

        Observer observer_1 = new MediaObserver("Observer 1", mediaStore);
        Observer observer_2 = new MediaObserver("Observer 2", mediaStore);
        mediaStore.addObserver(observer_1);
        mediaStore.addObserver(observer_2);

        mediaStore.addMusic("Static-X");
        mediaStore.addMovie("Triangle");

        mediaStore.removeObserver(observer_1);

        mediaStore.addGame("Mortal Kombat 12");

    }
}
