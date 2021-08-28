package behavioral.command;

import behavioral.command.commands.RestartCommand;
import behavioral.command.commands.StartCommand;
import behavioral.command.commands.StopCommand;


public class Client {

    public static void main(String[] args) {


        Application application = new Application();

        application.executeCommand(new StartCommand(application));
        application.executeCommand(new StopCommand(application));
        application.executeCommand(new RestartCommand(application));

        System.out.println(application.getCommandHistory().getHistory());
    }
}
