import factory.NotificationFactory;
import interfaces.Notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NotificationFactory notificationFactory = new NotificationFactory();

        System.out.print("Select payment method:\nEMAIL\nSMS\nPUSH\nR:");
        String type = sc.next();

        Notification notification = notificationFactory.createNotification(type);

        if (notification != null) {
            notification.send();
        } else {
            System.out.println("Invalid notification type.");
        }

        sc.close();
    }
}