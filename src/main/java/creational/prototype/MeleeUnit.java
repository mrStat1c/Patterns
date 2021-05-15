package creational.prototype;

import lombok.Setter;

public class MeleeUnit extends Unit {

    @Setter
    private double parryChance;

    public MeleeUnit(String name, int hp, int damage, double parryChance) {
        super(name, hp, damage);
        this.parryChance = Math.min(parryChance, 1.0);
    }

    @Override
    public Unit clone() {
        return new MeleeUnit(name, hp, damage, parryChance);
    }

    @Override
    public String toString() {
        return "{" +
                "parryChance=" + parryChance +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}