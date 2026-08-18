package structural.adapter;

public class SendGridNotificationService {
    public void sendEmail(String recipient, String title, String content){
        System.out.println("Recipient : " + recipient);
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }
}
