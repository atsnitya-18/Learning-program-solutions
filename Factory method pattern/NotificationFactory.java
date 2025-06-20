public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;

        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }

        return null;
    }
}
