package structural.bridge.Robots;

import structural.bridge.BehaviorMode;

public class M606 implements BattleRobot {

    private BehaviorMode mode = BehaviorMode.PATROL;

    @Override
    public BehaviorMode getMode() {
        return this.mode;
    }

    @Override
    public void patrol() {
        this.mode = BehaviorMode.PATROL;
        System.out.println("M606 patrol mode ON");
    }

    @Override
    public void guard() {
        this.mode = BehaviorMode.GUARD;
        System.out.println("M606 guard mode ON");
    }

    @Override
    public void attack() {
        this.mode = BehaviorMode.ATTACK;
        System.out.println("M606 attack mode ON");
    }
}
