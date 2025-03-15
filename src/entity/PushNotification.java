package entity;

import interfaces.Notification;

public class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Send PUSH");
    }
}
