package creational.factoryMethod;

public class Client {

    public static void main(String[] args) {

        UnitCreator unitCreator;

        unitCreator = System.getProperty("cavalry", "false").equals("true") ?
                new CavalryCreator():
                new SwordmanCreator();

        Unit unit = unitCreator.createUnit();
        unit.run();
        unit.fight();
    }
}
