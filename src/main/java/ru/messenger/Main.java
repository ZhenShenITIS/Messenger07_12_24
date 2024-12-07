package ru.messenger;

public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4User();

        Message[] messages1 = MessageService.create4Message(users[0], users[1]);

        Message[] messages2 = MessageService.create4Message(users[2], users[3]);

        for (User user : users) {
            System.out.println(user.getInformation());
        }

        System.out.println();

        for (Message message : messages1) {
            System.out.println(message.getInformation());
        }

        for (Message message : messages2) {
            System.out.println(message.getInformation());
        }
    }
}