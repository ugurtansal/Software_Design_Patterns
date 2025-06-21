public class DocumentProxy implements Document {
    RealDocument document;
    String fileName;
    User user;

    public DocumentProxy(User user, String fileName) {
        this.user = user;
        this.fileName = fileName;
    }

    public void display() {
        if (document == null) {
            document = new RealDocument();
        }
        if (user.isAuthenticated()) {
            document.display();
        } else {
            System.out.println("Access denied. User is not authenticated.");
        }
    }


}
