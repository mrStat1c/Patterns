package creational.abstractFabric;

import creational.abstractFabric.Products.Beverage.Beverage;
import creational.abstractFabric.Products.MainCourse.MainCourse;
import creational.abstractFabric.Products.Salad.Salad;

/**
 * Abstract fabric
 */
public interface LanchFabric {

    MainCourse createMainCourse();
    Salad createSalad();
    Beverage createBeverage();
}
