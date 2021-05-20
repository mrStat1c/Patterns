package creational.factoryMethod;

public class Swordman implements Unit {

    @Override
    public void fight() {
        System.out.println("Swordman fighting...");
    }

    @Override
    public void run() {
        System.out.println("Swordman running...");
    }
}
