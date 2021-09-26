package behavioral.memento;

import lombok.Getter;

/**
 * Memento
 * Содержит состояние объекта Game
 */

public class Save {

    @Getter
    private final int id;
    @Getter
    private final String level;
    @Getter
    private final int exp;
    @Getter
    private final int gold;

    public Save(int id, String level, int exp, int gold) {
        this.id = id;
        this.level = level;
        this.exp = exp;
        this.gold = gold;
    }
}
