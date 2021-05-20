package creational.factoryMethod;

public class CavalryCreator extends UnitCreator {

    @Override
    public Unit createUnit() {
        return new Cavalry();
    }
}
