package oops;

public class DebitCard extends Card implements IPayment{
    public DebitCard(String cardNumber, String name, String validTill, Integer cvv) {
        super(cardNumber, name, validTill, cvv);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via debit card");
    }
}
