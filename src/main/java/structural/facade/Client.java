package structural.facade;

public class Client {

    public static void main(String[] args) {

        Order order_1 = new Order();
        System.out.println("Order 1:");
        order_1.makeOrder();

        Order order_2 = new Order();
        System.out.println("\nOrder 2:");
        order_2.makeVipOrder();
    }
}
