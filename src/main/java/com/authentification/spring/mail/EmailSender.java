package com.authentification.spring.mail;

public interface EmailSender {
    void send(String to, String email);
}
