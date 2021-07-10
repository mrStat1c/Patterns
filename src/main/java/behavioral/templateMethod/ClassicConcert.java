package behavioral.templateMethod;

import java.util.Date;

public class ClassicConcert extends Concert {

    public ClassicConcert(String groupName, Date date) {
        this.groupName = groupName;
        this.date = date;
    }


    @Override
    public void getDressed() {
        System.out.println("Put on a suit...");
        System.out.println("Apply perfume...");
    }

    @Override
    public void behave() {
        System.out.println("Sit on a velvet chair...");
        System.out.println("Watch the concert...");
    }
}
