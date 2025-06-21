import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<User> users=new ArrayList<>();
    @Override
    public void notify(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i)!=user){
                users.get(i).receiveMessage(user.getName() + " has sent a message.");
            }

        }
    }

    public void register(User user){
        users.add(user);
    }
}
