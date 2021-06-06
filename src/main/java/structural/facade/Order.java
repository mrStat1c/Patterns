package structural.facade;


/**
 * Facade
 */
public class Order {

    private Basket basket;
    private Restaurant restaurant;
    private DeliveryService deliveryService;

    public Order() {
        this.basket = new Basket();
        this.restaurant = new Restaurant();
        this.deliveryService = new DeliveryService();
    }

    public void makeOrder(){
        this.basket.calculatePositions();
        this.basket.paymentOrder();
        this.restaurant.cooking();
        this.restaurant.addNapkins(10);
        this.restaurant.transferToDeliveryService();
        this.deliveryService.deliveByCar();
    }

    public void makeVipOrder(){
        this.basket.calculatePositions();
        this.basket.calculateVipPrivilege();
        this.basket.paymentOrder();
        this.restaurant.cooking();
        this.restaurant.addNapkins(500);
        this.restaurant.transferToDeliveryService();
        this.deliveryService.deliveByHelicopter();
    }
}
