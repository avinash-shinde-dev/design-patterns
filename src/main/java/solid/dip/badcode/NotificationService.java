package solid.dip.badcode;


// Tight coupling, if we introduce new service, we need to modify this class, which voilates
// ocp
public class NotificationService {
    private EmailService emailService;  // tight coupling
    private SMSService smsService; // tight coupling

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }

    public void notifyBySms(String msg){
        smsService.sendSMS(msg);
    }
}
