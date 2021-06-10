package structural.decorator;

/**
 * Базовый декоратор
 */
public class DeliveryServiceDecorator implements DeliveryService {

    private DeliveryService deliveryService;

    public DeliveryServiceDecorator(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public void delive(Object product) {
        this.deliveryService.delive(product);
    }
}
