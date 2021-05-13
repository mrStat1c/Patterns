package creational.builder;

public class VeryComplexObjectChaosBuilderImpl implements VeryComplexObjectBuilder {

    VeryComplexObject veryComplexObject = new VeryComplexObject();

    @Override
    public VeryComplexObjectBuilder setName(String name) {
        this.veryComplexObject.name = "Chaos " +name;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setSmart(boolean smart) {
        this.veryComplexObject.smart = true;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setIndex(int index) {
        this.veryComplexObject.index = 666;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setCoordX(int coordX) {
        this.veryComplexObject.coordX = coordX + 9000;
        return this;
    }

    @Override
    public VeryComplexObjectBuilder setCoordY(int coordY) {
        this.veryComplexObject.coordY = coordY - 18000;
        return this;
    }

    @Override
    public VeryComplexObject build() {
        return this.veryComplexObject;
    }
}