public abstract class Command {
    protected Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;

    }
    public void backup() {
        this.backup = editor.getText();
    }

public void undo() {
        editor.setText(backup);
    }

    abstract public boolean execute();

}
