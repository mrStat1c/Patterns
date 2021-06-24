package structural.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

/**
 * Содержит уникальное состояние каждого зерга
 */
@AllArgsConstructor
public class Zerg {

    private int x;
    private int y;
    private ZergType type;

    public void draw(Graphics graphics){
       type.draw(graphics, x, y);
    }
}