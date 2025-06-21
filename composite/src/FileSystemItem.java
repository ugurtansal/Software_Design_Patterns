import java.time.format.DateTimeFormatter;

public interface FileSystemItem {
    String lastModified();
    String getName();
    String getPath();
    void setLastModified(String lastModified);
    String display();
}
