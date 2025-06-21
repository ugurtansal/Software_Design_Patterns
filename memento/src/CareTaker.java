import java.util.Stack;

public class CareTaker {
    private Stack<CanvasMemento> history = new Stack<>();

    public void save(Canvas canvas) {
        history.push(canvas.save());
    }

    public void undo(Canvas canvas) {
        if (!history.isEmpty()) {
            canvas.restore(history.pop());
            System.out.println("↩️ Geri alındı.");
        } else {
            System.out.println("🚫 Geri alınacak bir durum yok.");
        }
    }
}
