import java.util.LinkedList;

public class LinkedNoteIterator implements NoteIterator {
    private LinkedList<Note> notes;
    private int index = -1;

    public LinkedNoteIterator(LinkedList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < notes.size();
    }

    @Override
    public Note next() {
        if (hasNext()) {
            index++;
            return notes.get(index);
        }
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Note previous() {
    if (hasPrevious()) {
            index--;
            return notes.get(index);
    }
        return null;
    }
}
