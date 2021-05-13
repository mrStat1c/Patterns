package creational.builder;

public class VeryComplexObjectBuilderImpl implements VeryComplexObjectBuilder {

    VeryComplexObject veryComplexObject = new VeryComplexObject();

    @Override
    public VeryComplexObjectBuilder setName(String name) {
        this.veryComplexObject.name = name;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setSmart(boolean smart) {
        this.veryComplexObject.smart = smart;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setIndex(int index) {
        this.veryComplexObject.index = index;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setCoordX(int coordX) {
        this.veryComplexObject.coordX = coordX;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setCoordY(int coordY) {
        this.veryComplexObject.coordY = coordY;
        return this;
    }

    @Override
    public VeryComplexObject build() {
        if (this.veryComplexObject.coordX == 0 || this.veryComplexObject.coordY == 0) {
            System.out.println("Object must have coordinates! NULL returned!");
            return null;
        }
        return this.veryComplexObject;
    }
}