package ru.messenger;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Дамир", "@damirkuz", "88005553535", "password123password");
        User user2 = new User("Женя", "@zhenshen", "89277727409", "dragonball882");
        User user3 = new User("Леонид", "@leonid007", "85021648900", "PgXZv4)QnP");
        User user4 = new User("Никита", "@nikitaliili", "89277799999", "parol123");

        Message message1 = new Message(user1, user2, "Привет", "07.12.2024 - 09:00");
        Message message2 = new Message(user2, user3, "Что ты как", "07.12.2024 - 09:15");
        Message message3 = new Message(user3, user4, "Сообщение?", "07.12.2024 - 09:30");
        Message message4 = new Message(user4, user1, "Когда", "07.12.2024 - 12:00");


        System.out.println(user1.getInformation());
        System.out.println(user2.getInformation());
        System.out.println(user3.getInformation());
        System.out.println(user4.getInformation());

        System.out.println();

        System.out.println(message1.getInformation());
        System.out.println(message2.getInformation());
        System.out.println(message3.getInformation());
        System.out.println(message4.getInformation());
    }
}