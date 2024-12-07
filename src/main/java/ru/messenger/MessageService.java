package ru.messenger;
import java.time.LocalTime;

public class MessageService {
    public static Message send (User sender, User recepient, String text) {
        String dateTime = LocalTime.now().toString();
        return new Message(sender, recepient, text, dateTime);
    }
    public static Message[] create4Messages(User[] users){
        Message[] messages = new Message[4];
        messages[0]= send(users[0], users[1], "Привет");
        messages[1]= send(users[1], users[2], "Что ты как");
        messages[2]= send(users[2], users[3], "Сообщение?");
        messages[3]= send(users[3], users[0], "Когда");
        return messages;
    }
}
