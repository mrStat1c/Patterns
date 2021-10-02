package behavioral.visitor.own;

import behavioral.visitor.OwnVisitor;
import lombok.Getter;

public class Slave extends Own {


    @Getter
    private int age;
    @Getter
    private Gender gender;

    public enum Gender {
        M,
        W
    }

    public Slave(int cost, int age, Gender gender) {
        super(cost);
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void changeOwner() {
        // something implementation
    }

    @Override
    public String accept(OwnVisitor visitor) {
       return visitor.visitSlave(this);
    }
}
