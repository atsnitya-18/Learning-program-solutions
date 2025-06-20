public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("email");
        if (notification1 != null) {
            notification1.notifyUser();
        }

        Notification notification2 = factory.createNotification("sms");
        if (notification2 != null) {
            notification2.notifyUser();
        }

        Notification notification3 = factory.createNotification("whatsapp");
        if (notification3 != null) {
            notification3.notifyUser();
        } else {
            System.out.println("Invalid notification type.");
        }
    }
}
