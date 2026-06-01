package Day13;

import java.util.*;

public class User {
    private String name;
    private List<User> subscriptions;

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){

    }

    public boolean isSubscribed(User user){

    }

    public boolean isFriend(User user){

    }

    public void sendMessage(User user, String text){

    }

    @Override
    public String toString(){

    }

}
