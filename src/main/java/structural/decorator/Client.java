package structural.decorator;

import structural.decorator.decorators.GiftBoxDeliveryDecorator;
import structural.decorator.decorators.SaleCouponDeliveryDecorator;

public class Client {

    public static void main(String[] args) {

        Object product = new Object();
        DeliveryServiceDecorator delivery =
                new SaleCouponDeliveryDecorator(
                        new GiftBoxDeliveryDecorator(
                                new DeliveryServiceDecorator(
                                        new ConcreteDeliveryService())));

        delivery.delive(product);
    }
}
