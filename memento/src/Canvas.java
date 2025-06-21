import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<String> lines = new ArrayList<>();

    public void drawLine(String line) {
        lines.add(line);
        System.out.println("Çizildi: " + line);
    }

    public void showCanvas() {
        System.out.println("🖼️ Şu anki çizim:");
        for (String line : lines) {
            System.out.println(" - " + line);
        }
    }

    public CanvasMemento save() {
        return new CanvasMemento(lines);
    }

    public void restore(CanvasMemento memento) {
        lines = memento.getSavedLines();
    }
}
