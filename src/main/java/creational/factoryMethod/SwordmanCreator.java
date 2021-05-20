package creational.factoryMethod;

public class SwordmanCreator extends UnitCreator {

   @Override
    public Unit createUnit() {
        return new Swordman();
    }
}
