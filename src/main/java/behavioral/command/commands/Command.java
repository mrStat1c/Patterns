package behavioral.command.commands;

import behavioral.command.Application;

public abstract class Command {

    Application application;

    public abstract void execute();

    public Command(Application application) {
        this.application = application;
    }
}
