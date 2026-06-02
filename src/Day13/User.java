package Day13;

import java.util.*;

public class User {
    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return username;
    }

    public List<User> getSubscriptions() {
        return Collections.unmodifiableList(subscriptions);
    }

    public void subscribe(User user) {
        if (user != this && !this.subscriptions.contains(user)) {
            this.subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user){
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        return (this.isSubscribed(user) && user.isSubscribed(this));
    }

    public void sendMessage(User receiver, String text) {
        if(this.isFriend(receiver)){
            MessageDatabase.sendMessage(this, receiver, text);
        }
}

    @Override
    public String toString() {
        return username;
    }
}
