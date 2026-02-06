package notification;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification via WhatsApp");

    }
}
