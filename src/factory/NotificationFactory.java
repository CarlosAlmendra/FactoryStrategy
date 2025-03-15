package factory;

import entity.EmailNotification;
import entity.PushNotification;
import entity.SMSNotification;
import interfaces.Notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory  {

    public static Map<String, Notification> notifications = Map.of(
            "sms", new SMSNotification(),
            "email", new EmailNotification(),
            "push", new PushNotification()
    );

    public static Notification createNotification(String type){
        return notifications.get(type.toLowerCase());
    }
}
