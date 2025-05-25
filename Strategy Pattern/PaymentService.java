public class PaymentService {

    PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("You have not Selected a Payment Type");
        }
    }
}
