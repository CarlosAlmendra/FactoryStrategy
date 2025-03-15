package entity;

import interfaces.Notification;

public class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Send SMS");
    }
}
