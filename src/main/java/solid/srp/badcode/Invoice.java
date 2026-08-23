package solid.srp.badcode;

// Now, this class has 3 reasons to change
// 1. invoice generation logic changed
// 2. save to database logic changed
// 3. how notifications are being sent is changed
public class Invoice {
    private String invoiceName;
    private double amount;

    public Invoice(String invoiceName, double amount) {
        this.invoiceName = invoiceName;
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("generate invoices ...");
    }

    public void saveToDatabase() {
        System.out.println("Saving to database ... ");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification once the invoice is generated ...");
    }
}
