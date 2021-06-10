package structural.decorator.decorators;

import structural.decorator.DeliveryService;
import structural.decorator.DeliveryServiceDecorator;

/**
 * Decorator
 */
public class SaleCouponDeliveryDecorator extends DeliveryServiceDecorator {

    public SaleCouponDeliveryDecorator(DeliveryService deliveryService) {
        super(deliveryService);
    }

    @Override
    public void delive(Object product) {
        super.delive(addSaleCouponToProduct(product));
    }

    private Object addSaleCouponToProduct(Object product){
        System.out.println("Sale coupon added to product");
        return product;
    }
}
