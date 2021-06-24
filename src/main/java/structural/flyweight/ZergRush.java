package structural.flyweight;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Создает полчище зергов
 */
public class ZergRush extends JFrame {

    private List<Zerg> zergs = new ArrayList<>();

    public void releaseZerg(int x, int y, String name, Color color, int size, boolean flying) {
        ZergType zergType = ZergIncubator.getZergType(name, color, size, flying);
        Zerg zerg = new Zerg(x, y, zergType);
        zergs.add(zerg);
    }

    @Override
    public void paint(Graphics graphics) {
        zergs.forEach(zerg -> zerg.draw(graphics));
    }
}
