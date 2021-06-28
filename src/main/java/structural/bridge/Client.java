package structural.bridge;

import structural.bridge.RobotControl.InsaneRobotRemoteControl;
import structural.bridge.RobotControl.NormalRobotRemoteControl;
import structural.bridge.Robots.M606;
import structural.bridge.Robots.R8000;

public class Client {

    public static void main(String[] args) {

        NormalRobotRemoteControl normalControl = new NormalRobotRemoteControl(new M606());
        normalControl.nextMode();
        normalControl.nextMode();
        normalControl.nextMode();
        normalControl.nextMode();
        normalControl.defaultMode();
        InsaneRobotRemoteControl insaneControl = new InsaneRobotRemoteControl(new R8000());
        insaneControl.nextMode();
        insaneControl.nextMode();
        insaneControl.nextMode();
        insaneControl.nextMode();
        insaneControl.defaultMode();
    }
}