package structural.bridge.Robots;

import structural.bridge.BehaviorMode;

public interface BattleRobot {

    BehaviorMode getMode();
    void patrol();
    void guard();
    void attack();
}
