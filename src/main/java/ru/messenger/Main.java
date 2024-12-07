package ru.messenger;

public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4Users();
        Message[] messages = MessageService.create4Messages(users);

        for (User user : users) {
            System.out.println(user.getInformation());
        }

        System.out.println();

        for (Message message : messages) {
            System.out.println(message.getInformation());
        }

    }
}