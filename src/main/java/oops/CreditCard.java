package oops;

public class CreditCard extends Card implements IPayment{

    public CreditCard(String cardNumber, String name, String validTill, Integer cvv) {
        super(cardNumber, name, validTill, cvv);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via credit card");
    }
}
