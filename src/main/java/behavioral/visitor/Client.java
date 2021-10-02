package behavioral.visitor;

import behavioral.visitor.own.Car;
import behavioral.visitor.own.Flat;
import behavioral.visitor.own.Slave;

public class Client {

    public static void main(String[] args) {

        DescribeOwnVisitor ownVisitor = new DescribeOwnVisitor();
        ownVisitor.describe(
                new Flat(130000, 68, "Green street, b 14, f 146, s 22"),
                new Car(33000, 170, "sedan", 230),
                new Car(25000, 140, "mini-sedan", 180),
                new Slave(28000, 23, Slave.Gender.W)
        );
    }
}
