package structural.facade;

public class Restaurant {

    public void cooking(){
        System.out.println("Positions cooked");
    }

    public void addNapkins(int napkinsCount){
        System.out.println(napkinsCount + " napkins added");
    }

    public void transferToDeliveryService(){
        System.out.println("Positions transfered to Delivery Service");
    }

    // + другие методы
}
