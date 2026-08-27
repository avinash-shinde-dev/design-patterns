package solid.dip.goodcode;

public class Client {

    public static void main(String[] args) {

        NotificationService emailService = new NotificationService(new EmailService());

        emailService.notify("Your order is shipped ... ");

    }
}
