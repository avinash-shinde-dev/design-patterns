package oops;

public class UPI implements IPayment{
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making UPI Payment ....");
    }
}
