import java.util.LinkedList;

public class NoteHistory  {
    LinkedList<Note> notes;

    public NoteHistory() {
        notes = new LinkedList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public NoteIterator createIterator() {
        return new LinkedNoteIterator(notes);
    }
}
