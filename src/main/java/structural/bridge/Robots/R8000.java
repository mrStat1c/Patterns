package structural.bridge.Robots;

import structural.bridge.BehaviorMode;

public class R8000 implements BattleRobot {

    private BehaviorMode mode = BehaviorMode.GUARD;

    @Override
    public BehaviorMode getMode() {
        return this.mode;
    }

    @Override
    public void patrol() {
        this.mode = BehaviorMode.PATROL;
        System.out.println("R8000 patrol mode ON");
    }

    @Override
    public void guard() {
        this.mode = BehaviorMode.GUARD;
        System.out.println("R8000 guard mode ON");
    }

    @Override
    public void attack() {
        this.mode = BehaviorMode.ATTACK;
        System.out.println("R8000 attack mode ON");
    }
}
