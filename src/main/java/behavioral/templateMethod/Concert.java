package behavioral.templateMethod;

import java.util.Date;

public abstract class Concert {

    String groupName;
    Date date;


    void buyTicket() {
        System.out.println("Go to the ticket site...");
        System.out.println("Buy ticket to concert " + groupName + " " + date + "...");
        System.out.println("Print ticket...");
    }

    abstract void getDressed();

    void go() {
        System.out.println("Call a taxi...");
        System.out.println("Go to the club...");
    }

    void additionalActions(){
        // можно реализовать дополнительное поведение в классах-наследниках (hook-метод)
    }

    abstract void behave();

    /**
     * Template method
     */
    public void visit(){
        buyTicket();
        getDressed();
        go();
        additionalActions();
        behave();
    }
}
