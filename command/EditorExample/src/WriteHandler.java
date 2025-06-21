public class WriteHandler extends Command {
    private String input;

public WriteHandler(Editor editor, String input) {
        super(editor);
        this.input = input;
    }



    @Override
    public boolean execute() {
        backup();
        editor.appendText(input);
        return true;
    }
}
