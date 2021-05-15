package creational.prototype;

import lombok.Setter;

public class DistanceUnit extends Unit {

    @Setter
    private int attackDistance;

    public DistanceUnit(String name, int hp, int damage, int attackDistance) {
        super(name, hp, damage);
        this.attackDistance = attackDistance;
    }

    @Override
    public Unit clone() {
        return new DistanceUnit(this.name, this.hp, this.damage, this.attackDistance);
    }

    @Override
    public String toString() {
        return "{" +
                "attackDistance=" + attackDistance +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}