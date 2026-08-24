package solid.ocp.goodcode;

public class DebitCard extends Card{
    @Override
    public void pay() {
        System.out.println("Payment using debit card");
    }
}
