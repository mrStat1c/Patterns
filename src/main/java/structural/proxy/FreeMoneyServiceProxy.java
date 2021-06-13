package structural.proxy;


import java.util.HashSet;
import java.util.Set;

/**
 * Proxy
 */
public class FreeMoneyServiceProxy implements FreeMoneyService {

    private FreeMoneyService freeMoneyService;
    private Set<String> persons = new HashSet<>();

    public FreeMoneyServiceProxy(FreeMoneyService freeMoneyService) {
        this.freeMoneyService = freeMoneyService;
    }

    @Override
    public void getFreeMoney(Person person) {
        String personName = person.getName();
        System.out.println(System.currentTimeMillis() + " : Person " + personName + " want to get free money...");
        if (persons.contains(person.getName())) {
            System.out.println(System.currentTimeMillis() + " : Person " + personName + " has already received money, so he will not receive any more...");
        } else {
            freeMoneyService.getFreeMoney(person);
            persons.add(personName);
            System.out.println(System.currentTimeMillis() + " : Person " + personName + " got free money...");
        }
    }
}