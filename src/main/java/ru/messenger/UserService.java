package ru.messenger;

public class UserService {
    public static User[] create4User () {
        User user1 = new User("Дамир", "@damirkuz", "88005553535", "password123password");
        User user2 = new User("Женя", "@zhenshen", "89277727409", "dragonball882");
        User user3 = new User("Леонид", "@leonid007", "85021648900", "PgXZv4)QnP");
        User user4 = new User("Никита", "@nikitaliili", "89277799999", "parol123");
        return new User[]{user1, user2, user3, user4};
    }
}
