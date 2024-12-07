package ru.messenger;

public class UserService {


    public static User createUser (String nickName, String userName, String phone, String password) {
        return new User(nickName,userName,phone,password);
    }

    public static User[] create4Users(){
        User[] users = new User[4];
        users[0] = createUser("Дамир", "@damirkuz", "88005553535", "password123password");
        users[1] = createUser("Женя", "@zhenshen", "89277727409", "dragonball882");
        users[2] = createUser("Леонид", "@leonid007", "85021648900", "PgXZv4)QnP");
        users[3] = createUser("Никита", "@nikitaliili", "89277799999", "parol123");
        return users;
    }
}
