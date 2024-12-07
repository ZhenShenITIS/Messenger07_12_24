package ru.messenger;

public class MessageService {
    public static Message[] create4Message (User user1, User user2) {
        Message message1 = new Message(user1, user2, "Привет", "07.12.2024 - 09:00");
        Message message2 = new Message(user2, user1, "Что ты как", "07.12.2024 - 09:15");
        Message message3 = new Message(user1, user2, "Сообщение?", "07.12.2024 - 09:30");
        Message message4 = new Message(user2, user1, "Когда", "07.12.2024 - 12:00");
        Message[] messages = {message1, message2, message3, message4};
    }
}
