package structural.adapter;

public class Client {
    public static void main(String[] args) {

        /**
         * Problem : When two systems or components have incompatible interfaces,
         * then it cannot work together directly
         *
         * Solution: Adapter pattern bridge the gap by converting the interface of
         *  one class to Another class
         *
         */

         NotificationService emailService = new EmailNotificationService();
         emailService.send("abc@gmail.com", "Course update", "Your course has been updated.");

         // Now let's say, we have another service SendGrid which sends an email, but not
        // compatible with client interface i.e NotificationSerivce
        // but we want to support the SendGridNotificationService

        // Client cannot directly call it, thath's not possible
        // NotificationService sendGridService = new SendGridNotificationService();

        // How can we achieve this with minimal changes
        // we can introduce an adapter SendGridAdapter implements NotificationService

        System.out.println("Sending Notification usign Send Grid ");
        NotificationService sendGridService = new SendGridAdapter(new SendGridNotificationService());
        sendGridService.send("abc@gmail.com", "Course update", "Your course has been updated.");

    }

}

