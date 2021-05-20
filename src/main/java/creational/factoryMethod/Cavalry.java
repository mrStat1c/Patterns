package creational.factoryMethod;

public class Cavalry implements Unit {

    @Override
    public void fight() {
        System.out.println("Cavalry fighting...");
    }

    @Override
    public void run() {
        System.out.println("Cavalry running...");
    }
}
