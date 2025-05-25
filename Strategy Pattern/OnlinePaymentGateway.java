import java.util.Scanner;

public class OnlinePaymentGateway {


    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        Scanner scanner = new Scanner(System.in);

        String strategy = scanner.next();

        if (strategy.equalsIgnoreCase("credit")) {
            paymentService
                    .setPaymentStrategy
                            (new CreditCardPayment("CClarke"
                                    , "1234-3222-3223"));
            paymentService.pay(100.0);

        } else if (strategy.equalsIgnoreCase("crypto")) {

            paymentService.setPaymentStrategy(new CryptoPayments("122434234234cxcdv"));
            paymentService.pay(32323.0);

        } else if (strategy.equalsIgnoreCase("paypal")) {

            paymentService.setPaymentStrategy(new PayPalPayment("cclarke@campus.com"));
            paymentService.pay(32323.0);

        }

        checkout();
    }

    public static void checkout() {
        PaymentService paymentService = new PaymentService();
        PaymentStrategy strategy = PaymentTypeFactory.getPaymentType(PaymentTypes.CREDIT_CARD);

        paymentService.setPaymentStrategy(strategy);
        paymentService.pay(2323.0);

    }

}
