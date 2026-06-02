package Day13;

import java.util.*;

public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text){
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for(Message message: messages){
            if(
                    (message.getSender().equals(u1) && message.getReceiver().equals(u2))
                    ||
                    (message.getSender().equals(u2) && message.getReceiver().equals(u1))
            ){
                System.out.printf(
                        "%s: %s\n",
                        message.getSender(),
                        message.getText()
                        );
            }
        }
    }
}
