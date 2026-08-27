package oops;

import java.util.HashMap;

public class PaymentService {

    private HashMap<String, IPayment> paymentMap;

    public PaymentService() {
        this.paymentMap = new HashMap<>();
    }

    public void add(String name, IPayment paymentMethod){
        this.paymentMap.put(name, paymentMethod);
    }

    public void makePayment(String name){
        this.paymentMap.get(name).pay();
    }
}
