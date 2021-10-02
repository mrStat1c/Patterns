package behavioral.visitor.own;

import behavioral.visitor.OwnVisitor;
import lombok.Getter;

public class Flat extends Own {

    @Getter
    private int area;
    @Getter
    private String address;


    public Flat(int cost, int area, String address) {
        super(cost);
        this.area = area;
        this.address = address;
    }

    @Override
    public void changeOwner() {
        // something implementation
    }

    @Override
    public String accept(OwnVisitor visitor) {
      return visitor.visitFlat(this);
    }
}
