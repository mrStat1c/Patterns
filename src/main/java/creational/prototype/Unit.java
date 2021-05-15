package creational.prototype;

import lombok.Setter;

public abstract class Unit {

    @Setter
    protected String name;
    @Setter
    protected int hp;
    @Setter
    protected int damage;

    public Unit(String name, int hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public abstract Unit clone();
}