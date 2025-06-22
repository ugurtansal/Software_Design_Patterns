public class Main {
    public static void main(String[] args) {
        NoteHistory history = new NoteHistory();
        Note note1 = new Note("Başlangıç", "Bu bir başlangıç notudur.", "Yazar 1");
        Note note2 = new Note("Ara", "Bu bir ara notudur.", "Yazar 2");
        Note note3 = new Note("Devam", "Bu bir devam notudur.", "Yazar 3");
        Note note4 = new Note("Yaklaşım", "Bu bir yaklaşım notudur.", "Yazar 4");
        Note note5 = new Note("Bitiş", "Bu bir bitiş notudur.", "Yazar 5");
        history.addNote(note1);
        history.addNote(note2);
        history.addNote(note3);
        history.addNote(note4);
        history.addNote(note5);

        NoteIterator iterator = history.createIterator();

        System.out.println("İleri yönde gezinme:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        System.out.println("\nGeri yönde gezinme:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous().getTitle());
        }
    }
}
