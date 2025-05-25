public class PayPalPayment implements PaymentStrategy{

    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying with Paypal Email : "
                + email + " Amount :" + amount);
    }
}
