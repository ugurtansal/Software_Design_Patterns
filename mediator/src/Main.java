//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User(chatRoom, "Alice");
        User user2 = new User(chatRoom, "Bob");
        User user3 = new User(chatRoom, "Charlie");

        chatRoom.register(user1);
        chatRoom.register(user2);
        chatRoom.register(user3);

        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi Alice!");
        user3.sendMessage("Good morning!");
    }
}