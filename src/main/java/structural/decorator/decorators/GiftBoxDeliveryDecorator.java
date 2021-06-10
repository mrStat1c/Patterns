package structural.decorator.decorators;

import structural.decorator.DeliveryService;
import structural.decorator.DeliveryServiceDecorator;

/**
 * Decorator
 */
public class GiftBoxDeliveryDecorator extends DeliveryServiceDecorator {

    public GiftBoxDeliveryDecorator(DeliveryService deliveryService) {
        super(deliveryService);
    }

    @Override
    public void delive(Object product) {
        super.delive(wrapProductToGiftBox(product));
    }

    private Object wrapProductToGiftBox(Object product){
        System.out.println("Product wrapped to Gift box");
        return product;
    }

}
