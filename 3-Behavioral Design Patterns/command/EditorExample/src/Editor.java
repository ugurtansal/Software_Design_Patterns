public class Editor {
    public String text="";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String text) {
        this.text += text;
    }

    public void remove() {
        this.text = "";
    }
}
