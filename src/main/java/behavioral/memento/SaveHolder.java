package behavioral.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * Содержит историю снимков
 */
public class SaveHolder {


    private Map<Integer, Save> saves = new HashMap<>();

    public void addSave(Save save) {
        this.saves.put(save.getId(), save);
    }

    public Save getSave(int id) {
        return this.saves.get(id);
    }
}
