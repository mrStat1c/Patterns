package structural.flyweight;

import java.awt.*;

public class Client {

    static int CANVAS_SIZE = 500;

    public static void main(String[] args) {

        ZergRush zergRush = new ZergRush();

        // рисуем зерглингов
        for (int i = 0; i < 500; i++) {
            zergRush.releaseZerg(
                    random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE),
                    "Zergling",
                    Color.ORANGE,
                    5,
                    false
            );
        }

        // рисуем гидралисков
        for (int i = 0; i < 150; i++) {
            zergRush.releaseZerg(
                    random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE),
                    "Gidralisk",
                    Color.GREEN,
                    12,
                    false);
        }

        // рисуем муталисков
        for (int i = 0; i < 100; i++) {
            zergRush.releaseZerg(
                    random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE),
                    "Mutalisk",
                    Color.DARK_GRAY,
                    8,
                    true
            );
        }

        // рисуем ультралисков
        for (int i = 0; i < 8; i++) {
            zergRush.releaseZerg(
                    random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE),
                    "Ultralisk",
                    Color.BLUE,
                    40,
                    false
            );
        }

        zergRush.setSize(CANVAS_SIZE, CANVAS_SIZE);
        zergRush.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
