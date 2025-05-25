public class NotificationFactory {

    public Notification createNotification(NotificationTypes type) {

        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                return null;
        }

    }
}
