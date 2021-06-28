package structural.bridge.RobotControl;

import structural.bridge.Robots.BattleRobot;

public class InsaneRobotRemoteControl implements RobotRemoteControl {

    BattleRobot battleRobot;

    public InsaneRobotRemoteControl(BattleRobot battleRobot) {
        this.battleRobot = battleRobot;
    }

    @Override
    public void nextMode() {
        madness();
    }

    @Override
    public void defaultMode() {
        madness();
    }

    private void madness() {
        System.out.println("SUPER HOT! SUPER HOT! SUPER HOT! SUPER HOT! SUPER HOT!");
        this.battleRobot.attack();
    }
}
