package creational.factoryMethod;

public abstract class UnitCreator {

    /**
     * Fabric method (может быть абстрактным)
     */
    public Unit createUnit() {
        System.out.println("Default behavior: Swordman create!");
        return new Swordman();
    }

}
