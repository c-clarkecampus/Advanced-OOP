public class CreditCardPayment implements PaymentStrategy{

    String creditCardNumber;
    String cardHolderName;


    public CreditCardPayment(String cardHolderName, String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        this.cardHolderName = cardHolderName;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paying With Card : " + creditCardNumber +
                " CardHolderName :" + cardHolderName + " Amount: " + amount);
    }
}
