package Day13;

import java.util.*;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(String text, User receiver, User sender) {
        this.text = text;
        this.receiver = receiver;
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){

    }
}
