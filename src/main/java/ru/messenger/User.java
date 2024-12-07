package ru.messenger;

public class User {
    private String nickName;
    private String userName;
    private String phone;
    private String password;

    User(){}
    User(String nickName, String userName,String phone, String  password){
        this.nickName = nickName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
