import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private String path;
    private String lastModified;
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name, String path, String lastModified) {
        this.name = name;
        this.path = path;
        this.lastModified = lastModified;
    }
    @Override
    public String lastModified() {
        return lastModified;
    }
    public void addItem(FileSystemItem item) {
        items.add(item);
        item.setLastModified(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
        lastModified= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    }
    public List<FileSystemItem> getItems() {
        return items;
    }

    public void removeItem(FileSystemItem item) {
        items.remove(item);
        lastModified = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified.toString();
    }

    @Override
    public String display() {
        lastModified= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        return "";
    }
}
