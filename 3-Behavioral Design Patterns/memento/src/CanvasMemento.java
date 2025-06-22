import java.util.ArrayList;
import java.util.List;

public class CanvasMemento {
    private List<String> lines;

    public CanvasMemento(List<String> lines) {
        // Derin kopya: dışarıdan müdahale edilmesin diye
        this.lines = new ArrayList<>(lines);
    }

    public List<String> getSavedLines() {
        return lines;
    }
}
