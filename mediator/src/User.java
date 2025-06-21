public class User extends Component {
    private String name;
    public User(Mediator mediator, String name) {

        super(mediator);
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println("User sending message: " + message);
        mediator.notify(this);
    }

    public void receiveMessage(String message) {
        System.out.println("User received message: " + message);
    }

    public String getName() {
        return name;
    }
}
