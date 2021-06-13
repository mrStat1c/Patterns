package structural.proxy;

public class FreeMoneyServiceImpl implements FreeMoneyService {

    private long money = 99999999999999999L;

    @Override
    public void getFreeMoney(Person person) {
        this.money -= 1000;
        person.setMoney(person.getMoney() + 1000);
    }
}