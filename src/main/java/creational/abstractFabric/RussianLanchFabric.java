package creational.abstractFabric;

import creational.abstractFabric.Products.Beverage.Beverage;
import creational.abstractFabric.Products.Beverage.Kvass;
import creational.abstractFabric.Products.MainCourse.ChickenFillet;
import creational.abstractFabric.Products.MainCourse.MainCourse;
import creational.abstractFabric.Products.Salad.RussianSalad;
import creational.abstractFabric.Products.Salad.Salad;

public class RussianLanchFabric implements LanchFabric{

    @Override
    public MainCourse createMainCourse() {
        return new ChickenFillet();
    }

    @Override
    public Salad createSalad() {
        return new RussianSalad();
    }

    @Override
    public Beverage createBeverage() {
        return new Kvass();
    }
}
