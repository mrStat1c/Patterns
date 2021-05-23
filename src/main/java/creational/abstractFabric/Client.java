package creational.abstractFabric;

import creational.abstractFabric.Products.Beverage.Beverage;
import creational.abstractFabric.Products.MainCourse.MainCourse;
import creational.abstractFabric.Products.Salad.Salad;

public class Client {


    public static void main(String[] args) {

        MainCourse mainCourse;
        Salad salad;
        Beverage beverage;

        LanchFabric lanchFabric = System.getProperty("rus", "false").equals("true") ?
                new RussianLanchFabric() :
                new FrenchLanchFabric();

        mainCourse = lanchFabric.createMainCourse();
        salad = lanchFabric.createSalad();
        beverage = lanchFabric.createBeverage();

        mainCourse.eat();
        salad.eat();
        beverage.drink();
    }
}
