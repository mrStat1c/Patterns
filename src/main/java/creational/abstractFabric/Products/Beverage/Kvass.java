package creational.abstractFabric.Products.Beverage;

public class Kvass implements Beverage {

    @Override
    public void drink() {
        System.out.println("Kvass drinked...");
    }
}
