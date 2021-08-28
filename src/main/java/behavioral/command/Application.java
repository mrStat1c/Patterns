package behavioral.command;

import behavioral.command.commands.Command;

public class Application {

    private CommandHistory commandHistory = new CommandHistory();


    public CommandHistory getCommandHistory() {
        return this.commandHistory;
    }

    public void start() {
        System.out.println("Application started...");
    }

    public void stop() {
        System.out.println("Application stopped...");
    }


    public void executeCommand(Command command){
        command.execute();
        this.commandHistory.addNewCommand(command);
    }
}
