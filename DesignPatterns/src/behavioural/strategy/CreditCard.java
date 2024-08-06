package behavioural.strategy;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with credit cart"+amount);
    }
}
