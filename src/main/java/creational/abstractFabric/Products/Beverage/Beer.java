package creational.abstractFabric.Products.Beverage;

public class Beer implements Beverage {

    @Override
    public void drink() {
        System.out.println("Beer drinked...");
    }
}
