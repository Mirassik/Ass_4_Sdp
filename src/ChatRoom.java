import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Subject{
    private List<Observer> users;
    private String name;

    public ChatRoom(String name) {
        this.name = name;
        users = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        users.add(observer);
    }

    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer user : users) {
            user.update("[" + name + "] " + message);
        }
    }

    public void sendMessage(String message) {
        notifyObservers(message);
    }
}
