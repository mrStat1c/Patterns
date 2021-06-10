package structural.decorator;

public class ConcreteDeliveryService implements DeliveryService {

    @Override
    public void delive(Object product) {
        System.out.println("Product delived");
    }
}
