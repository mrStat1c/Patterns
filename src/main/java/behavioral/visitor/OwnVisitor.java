package behavioral.visitor;

import behavioral.visitor.own.Car;
import behavioral.visitor.own.Flat;
import behavioral.visitor.own.Slave;

/**
 * Visitor
 */
public interface OwnVisitor {

    String visitFlat(Flat flat);
    String visitCar(Car car);
    String visitSlave(Slave slave);
}
