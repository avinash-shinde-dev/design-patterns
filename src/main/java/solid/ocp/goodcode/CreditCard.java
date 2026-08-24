package solid.ocp.goodcode;

public class CreditCard extends Card{
    @Override
    public void pay() {
        System.out.println("Payment using credit card");
    }
}
