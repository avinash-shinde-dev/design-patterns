package structural.adapter;

public class SendGridAdapter implements NotificationService{
    private SendGridNotificationService sendGridNotificationService;

    public SendGridAdapter(SendGridNotificationService sendGridNotificationService) {
        this.sendGridNotificationService = sendGridNotificationService;
    }

    @Override
    public void send(String to, String subject, String body) {
        this.sendGridNotificationService.sendEmail(to, subject, body);
    }
}
