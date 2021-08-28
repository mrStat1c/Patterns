package behavioral.command.commands;

import behavioral.command.Application;

public class StopCommand extends Command {


    public StopCommand(Application application) {
        super(application);
    }


    @Override
    public void execute() {
        this.application.stop();
    }
}
