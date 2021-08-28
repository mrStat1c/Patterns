package behavioral.command.commands;

import behavioral.command.Application;

public class StartCommand extends Command {


    public StartCommand(Application application) {
        super(application);
    }


    @Override
    public void execute() {
        this.application.start();
    }
}
