package structural.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

/**
 * Flyweight
 * Содержит общее состояние для группы (типа) зергов
 */
@AllArgsConstructor
public class ZergType {

    private String name;
    private Color color;
    private int size;
    private boolean flying;

    public void draw(Graphics graphics, int x, int y) {
        graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
        if (this.flying) {
            graphics.setColor(Color.RED);
            graphics.drawOval(x, y, size, size);
        }
    }
}