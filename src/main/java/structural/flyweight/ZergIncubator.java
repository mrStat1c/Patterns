package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика зергов
 */
public class ZergIncubator {

    static Map<String, ZergType> zergTypes = new HashMap<>();

    public static ZergType getZergType(String name, Color color, int size, boolean flying) {
        ZergType zergType = zergTypes.get(name);
        if (zergType == null) {
            zergType = new ZergType(name, color, size, flying);
            zergTypes.put(name, zergType);
        }
        return zergType;
    }
}