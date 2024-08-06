package behavioural.strategy;

public class PaymentContext {
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void executePayment(double amount){
        payment.pay(amount);
    }
}
