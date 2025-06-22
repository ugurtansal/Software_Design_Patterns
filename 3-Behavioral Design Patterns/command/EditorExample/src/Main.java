//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        HistoryHandler historyHandler = new HistoryHandler();

        // Write some text
        Command writeCommand = new WriteHandler(editor, "Hello, World!");
        if (writeCommand.execute()) {
            historyHandler.push(writeCommand);
        }

        Command writeCommand2 = new WriteHandler(editor, " How are you?");
        if (writeCommand2.execute()) {
            historyHandler.push(writeCommand2);
        }

        System.out.println("Current Text: " + editor.getText());
        historyHandler.pop().undo();
        System.out.println("After Undo: " + editor.getText());

    }
}