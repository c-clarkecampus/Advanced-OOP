public class PaymentTypeFactory {

    public static PaymentStrategy getPaymentType(PaymentTypes type) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCardPayment("CClarke", "213123123123123123");
            case PAYPAL:
                return  new PayPalPayment("cclarke@gmail.com");
            case CRYPTO:
                return  new CryptoPayments("2334343434343434");
            default:
                return null;
        }
    }

}
