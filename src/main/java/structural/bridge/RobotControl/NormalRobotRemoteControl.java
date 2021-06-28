package structural.bridge.RobotControl;

import structural.bridge.Robots.BattleRobot;
import structural.bridge.Robots.M606;
import structural.bridge.Robots.R8000;

public class NormalRobotRemoteControl implements RobotRemoteControl {

    BattleRobot battleRobot;

    public NormalRobotRemoteControl(BattleRobot battleRobot) {
        this.battleRobot = battleRobot;
    }

    @Override
    public void nextMode() {
        switch (this.battleRobot.getMode()) {
            case GUARD: {
                this.battleRobot.attack();
                break;
            }
            case ATTACK: {
                this.battleRobot.patrol();
                break;
            }
            case PATROL: {
                this.battleRobot.guard();
                break;
            }
        }
    }

    @Override
    public void defaultMode() {
        if (this.battleRobot instanceof M606) {
            this.battleRobot.patrol();
        } else if (this.battleRobot instanceof R8000) {
            this.battleRobot.attack();
        } else {
            throw new RuntimeException("No implementation for robot type " + this.battleRobot.getClass());
        }
    }
}
