package behavioral.command.commands;

import behavioral.command.Application;

public class RestartCommand extends Command {


    public RestartCommand(Application application) {
        super(application);
    }


    @Override
    public void execute() {
        this.application.stop();
        this.application.start();
    }
}
