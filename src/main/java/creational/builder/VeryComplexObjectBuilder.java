package creational.builder;


public interface VeryComplexObjectBuilder {

    VeryComplexObjectBuilder setName(String name);

    VeryComplexObjectBuilder setSmart(boolean smart);

    VeryComplexObjectBuilder setIndex(int index);

    VeryComplexObjectBuilder setCoordX(int coordX);

    VeryComplexObjectBuilder setCoordY(int coordY);

    VeryComplexObject build();
}