import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class File implements FileSystemItem {
    private String name;
    private String path;
    private String lastModified;

    public File(String name, String path, String lastModified) {
        this.name = name;
        this.path = path;
        this.lastModified = lastModified;
    }
    @Override
    public String lastModified() {
        return lastModified;
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
        this.lastModified = lastModified;
    }

    @Override
    public String display() {
        lastModified= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        return "";
    }
}
