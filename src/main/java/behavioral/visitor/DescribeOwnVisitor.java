package behavioral.visitor;

import behavioral.visitor.own.Car;
import behavioral.visitor.own.Flat;
import behavioral.visitor.own.Own;
import behavioral.visitor.own.Slave;

import java.util.Arrays;
import java.util.List;

public class DescribeOwnVisitor implements OwnVisitor {

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public void describe(Own... own){
        List<Own> ownList = Arrays.asList(own);
        System.out.println("Own list:\n");
        ownList.forEach(ownObj -> System.out.println(ownObj.accept(this)));
        System.out.println("Calculated cost = " + ownList.stream().map(Own::getCost).reduce(Integer::sum).get() + " galactic credits");
    }

    @Override
    public String visitFlat(Flat flat) {
        return String.format("FLAT:\nArea = %s square meters\nAddress = %s\nCost = %s galactic credits\n",
                flat.getArea(), flat.getAddress(), flat.getCost());
    }

    @Override
    public String visitCar(Car car) {
        return String.format("CAR:\nPower = %s HP\nForm factor = %s\nMaximum speed = %s Km/h\nCost = %s galactic credits\n",
                car.getHp(), car.getFormFactor(), car.getMaxSpeed(), car.getCost());
    }

    @Override
    public String visitSlave(Slave slave) {
        return String.format("SLAVE:\nAge = %s\nGender = %s\nCost = %s galactic credits\n",
                slave.getAge(), slave.getGender(), slave.getCost());
    }
}
