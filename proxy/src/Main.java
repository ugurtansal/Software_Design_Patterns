//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ali", true);
        User user2 = new User("Zeynep", false);

        Document doc1 = new DocumentProxy( user1,"secret_file.pdf");
        Document doc2 = new DocumentProxy( user2,"secret_file.pdf");

        System.out.println(">>> Ali erişiyor:");
        doc1.display();

        System.out.println("\n>>> Zeynep erişiyor:");
        doc2.display();
    }
}
