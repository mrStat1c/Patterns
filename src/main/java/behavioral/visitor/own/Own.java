package behavioral.visitor.own;

import behavioral.visitor.OwnVisitor;
import lombok.Getter;

public abstract class Own {

    @Getter
    protected int cost;

    public Own(int cost) {
        this.cost = cost;
    }

    abstract void changeOwner();

    public abstract String accept(OwnVisitor visitor);
}
