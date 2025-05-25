import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = factory.createNotification(NotificationTypes.EMAIL);

        Notification smsNotification = factory.createNotification(NotificationTypes.SMS);

        Notification pushNotification = factory.createNotification(NotificationTypes.PUSH);


        emailNotification.sendMessage();
        smsNotification.sendMessage();
        pushNotification.sendMessage();

    }
}
