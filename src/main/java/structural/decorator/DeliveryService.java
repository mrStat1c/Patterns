package structural.decorator;

/**
 * Общий для целевого класса (ConcreteDeliveryService) и базового декоратора (DeliveryServiceDecorator) интерфейс
 */
public interface DeliveryService {

    void delive(Object product);
}
