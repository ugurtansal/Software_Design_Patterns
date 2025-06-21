import java.util.Stack;

public class HistoryHandler {

    private Stack<Command> history = new Stack<Command>();

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
       return history.pop();
    }
}
