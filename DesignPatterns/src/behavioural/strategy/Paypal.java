package behavioural.strategy;

public class Paypal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with paypal"+amount);
    }
}
