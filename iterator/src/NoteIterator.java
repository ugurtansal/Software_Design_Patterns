public interface NoteIterator {
    boolean hasNext();
    Note next();
    boolean hasPrevious();
    Note previous();
}
