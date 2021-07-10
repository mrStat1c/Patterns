package behavioral.templateMethod;

import java.util.Date;

public class RockConcert extends Concert {

    public RockConcert(String groupName, Date date) {
        this.groupName = groupName;
        this.date = date;
    }

    @Override
    public void getDressed() {
        System.out.println("Put on a black t-shirt and jeans...");
        System.out.println("Drink alcohol...");
    }

    @Override
    public void behave() {
        System.out.println("Shake your head, jump, sing along, slam...");
    }

    @Override
    public void additionalActions(){
        System.out.println("Drink alcohol...");
        System.out.println("Drink alcohol...");
    }
}
