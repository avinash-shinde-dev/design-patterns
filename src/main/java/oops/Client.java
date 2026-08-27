package oops;

public class Client {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.add("AvinashCC", new CreditCard("1234", "avinash", "10/31", 123));
        paymentService.add("DnyaneshwariDC", new DebitCard("1234", "ds", "04/29", 567));
        paymentService.add("AvinashUPI", new UPI("abs@oksbi"));


        System.out.println("Started making payments ... !!");

        paymentService.makePayment("AvinashCC");
        paymentService.makePayment("AvinashUPI");
        paymentService.makePayment("DnyaneshwariDC")  ;
      }
}
