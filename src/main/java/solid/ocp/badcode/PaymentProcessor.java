package solid.ocp.badcode;

public class PaymentProcessor {

    public void pay(String paymentType) {
        if(paymentType.equals("CreditCard")){
            System.out.println("credit card payment");
        }else if(paymentType.equals("DebitCard")){
            System.out.println("debit card payment");
        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }

    }
}
