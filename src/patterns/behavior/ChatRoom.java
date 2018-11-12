package patterns.behavior;

import java.util.Date;

public class ChatRoom {
    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString() + ", User: " + user.getName() + ", send message "
                + message);
    }
}
