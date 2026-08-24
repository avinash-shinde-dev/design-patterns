package solid.ocp.goodcode;

public class UPI implements IPayment{

    @Override
    public void pay() {
        System.out.println("Payment using upi");
    }
}
