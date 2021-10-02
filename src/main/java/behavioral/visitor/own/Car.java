package behavioral.visitor.own;

import behavioral.visitor.OwnVisitor;
import lombok.Getter;

public class Car extends Own {

    @Getter
    private int hp;
    @Getter
    private String formFactor;
    @Getter
    private int maxSpeed;

    public Car(int cost, int hp, String formFactor, int maxSpeed) {
        super(cost);
        this.hp = hp;
        this.formFactor = formFactor;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void changeOwner() {
        // something implementation
    }

    @Override
    public String accept(OwnVisitor visitor) {
       return visitor.visitCar(this);
    }
}
