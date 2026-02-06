package notification;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification via Email");
    }
}
