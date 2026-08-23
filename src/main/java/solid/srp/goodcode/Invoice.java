package solid.srp.goodcode;

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
}
