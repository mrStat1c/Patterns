package behavioral.command;

import behavioral.command.commands.Command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public Stack<Command> getHistory() {
        return history;
    }

    public void addNewCommand(Command command){
        this.history.push(command);
    }

    public Command getLastCommand(Command command){
        return this.history.pop();
    }
}
