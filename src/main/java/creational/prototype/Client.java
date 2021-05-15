package creational.prototype;

public class Client {

    public static void main(String[] args) {

        DistanceUnit archer_1 = new DistanceUnit("Archer", 80, 70, 120);
        DistanceUnit archer_2 = (DistanceUnit) archer_1.clone();
        archer_2.setName("Super archer");
        archer_2.setDamage(500);

        System.out.println("Archer 1: " + archer_1);
        System.out.println("Archer 2: " + archer_2);

    }
}