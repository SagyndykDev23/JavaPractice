package Day13;

public class Day13 {
    public static void main(String[] args) {

        User user1 = new User("Sagyndyk");
        User user2 = new User("Damir");
        User user3 = new User("Renat");

        user1.subscribe(user2);
        user2.subscribe(user1);
        user1.subscribe(user3);

        System.out.println(user1.isFriend(user2));
        System.out.println("My UserName: " +user1.toString());
        System.out.println("My Subscribers: " + user1.getSubscriptions());

        user1.sendMessage(user2, "Hello!");
        user2.sendMessage(user1, "Hi");
        user1.sendMessage(user2, "How a u?");
        user2.sendMessage(user1,"I'm fine");

        MessageDatabase.showDialog(user1, user2);


        User user4 = new User("Medet");
        user4.subscribe(user1);
        user1.subscribe(user4);
        user4.sendMessage(user1, "Where a u?");
        user1.sendMessage(user4, "Doma");
        MessageDatabase.showDialog(user1, user4);
    }
}

