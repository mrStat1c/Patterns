package behavioral.memento;

import lombok.Data;

/**
 * Создает снимки и воспроизводит свое прошлое состояние
 */
@Data
public class Game {

    private int id;
    private String level;
    private int exp;
    private int gold;

    public Save saveGame() {
        return new Save(this.id, this.level, this.exp, this.gold);
    }

    public void loadGame(Save save) {
        this.id = save.getId();
        this.level = save.getLevel();
        this.exp = save.getExp();
        this.gold = save.getGold();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", exp='" + exp + '\'' +
                ", gold='" + gold + '\'' +
                '}';
    }
}
