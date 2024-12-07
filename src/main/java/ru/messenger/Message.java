package ru.messenger;
/*
    - Отправитель (пользователь)
    - Получатель (пользователь)
    - Текст
    - Дата-время
 */
public class Message {
    private User sender;
    private User recipient;
    private String text;
    private String date;

    public Message() {}

    public String getInformation(){
        return "Сообщение от " + getSender().getUserName() + " к " + getRecipient().getUserName() + ": " + getText() + " отправлено " + getDate();
    }

    public Message(User sender, User recipient, String text, String date) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
