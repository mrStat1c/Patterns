package structural.proxy;

public class Client {

    public static void main(String[] args) {

        FreeMoneyService freeMoneyService = new FreeMoneyServiceProxy(new FreeMoneyServiceImpl());
        Person person_1 = new Person("Soler", 123);
        Person person_2 = new Person("Baraka", 500);

        freeMoneyService.getFreeMoney(person_1);
        freeMoneyService.getFreeMoney(person_2);
        freeMoneyService.getFreeMoney(person_2);
    }
}