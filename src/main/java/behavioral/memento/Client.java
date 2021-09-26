package behavioral.memento;

public class Client {

    public static void main(String[] args) {

        SaveHolder saveHolder = new SaveHolder();

        Game game = new Game();
        game.setId(145785);
        game.setLevel("Blood Caves");
        game.setExp(543000);
        game.setGold(1406);
        System.out.println(game);

        System.out.println("Save game...");
        saveHolder.addSave(game.saveGame());

        game.setId(4574578);
        game.setLevel("Rage road");
        game.setExp(655033);
        game.setGold(567);
        System.out.println(game);

        System.out.println("Load the last game...");
        game.loadGame(saveHolder.getSave(145785));
        System.out.println(game);

    }
}
