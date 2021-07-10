package behavioral.templateMethod;

import java.util.GregorianCalendar;

public class Client {

    public static void main(String[] args) {

        Concert concert;

        concert = new RockConcert("Tardigrade Inferno", new GregorianCalendar(2021, 11, 3).getTime());
        concert.visit();

        System.out.println("\n");

        concert = new ClassicConcert("Best classical compositions", new GregorianCalendar(2022, 5, 12).getTime());
        concert.visit();
    }
}
