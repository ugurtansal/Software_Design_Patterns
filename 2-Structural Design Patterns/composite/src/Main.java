//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a folder
        Folder rootFolder = new Folder("Root", "/root", "2023-10-01 12:00:00");

        // Create files
        File file1 = new File("File1.txt", "/root/File1.txt", "2023-10-01 12:00:00");
        File file2 = new File("File2.txt", "/root/File2.txt", "2023-10-01 12:00:00");

        // Add files to the folder
        rootFolder.addItem(file1);
        rootFolder.addItem(file2);

        // Display folder contents
        System.out.println("Folder: " + rootFolder.getName());
        for (FileSystemItem item : rootFolder.getItems()) {
            System.out.println(" - " + item.getName() + " (Last Modified: " + item.lastModified() + ")");
        }

        // Remove a file and display again
        rootFolder.removeItem(file1);
        System.out.println("After removing File1:");
        for (FileSystemItem item : rootFolder.getItems()) {
            System.out.println(" - " + item.getName() + " (Last Modified: " + item.lastModified() + ")");
        }

    }
}