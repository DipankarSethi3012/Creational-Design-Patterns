package notification;

public class NotificationFactory {
    public static Notification getNotification(String mode) {
        Notification notification;
        if(mode.equalsIgnoreCase("Whatsapp")) {
            notification = new WhatsAppNotification();
        } else if (mode.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else throw new IllegalArgumentException("wrong mode for the notification");

        return notification;
    }
}
