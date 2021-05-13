package creational.builder;

public class VeryComplexObject {

    String name;
    boolean smart;
    int index;
    int coordX;
    int coordY;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", smart=" + smart +
                ", index=" + index +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }
}