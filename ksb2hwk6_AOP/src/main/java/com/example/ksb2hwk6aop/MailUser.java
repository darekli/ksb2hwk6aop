package com.example.ksb2hwk6aop;

public class MailUser {

    String user = "twoj email@gmail.com";//todo wpisz swoj email
    String subject ="test ksb2";
    String text = "test";


    public MailUser() {
    }

    public MailUser(String user, String subject, String text) {
        this.user = user;
        this.subject = subject;
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MailUser{" +
                "user='" + user + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
