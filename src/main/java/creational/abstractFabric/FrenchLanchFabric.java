package creational.abstractFabric;

import creational.abstractFabric.Products.Beverage.Beer;
import creational.abstractFabric.Products.Beverage.Beverage;
import creational.abstractFabric.Products.MainCourse.FishAndChips;
import creational.abstractFabric.Products.MainCourse.MainCourse;
import creational.abstractFabric.Products.Salad.CaesarSalad;
import creational.abstractFabric.Products.Salad.Salad;

public class FrenchLanchFabric implements LanchFabric {

    @Override
    public MainCourse createMainCourse() {
        return new FishAndChips();
    }

    @Override
    public Salad createSalad() {
        return new CaesarSalad();
    }

    @Override
    public Beverage createBeverage() {
        return new Beer();
    }
}
