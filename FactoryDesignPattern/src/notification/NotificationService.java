package notification;

public class NotificationService {
    public static void sendNotification(String mode) {
        Notification notification = NotificationFactory.getNotification(mode);
        notification.sendNotification();
    }
}
