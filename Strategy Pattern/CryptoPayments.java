public class CryptoPayments implements PaymentStrategy{

    String walletAddress;

    public CryptoPayments(String walletAddress) {
        this.walletAddress = walletAddress;
    }



    @Override
    public void pay(double amount) {
        System.out.println("Paying With Crypto Address: " + walletAddress
                + " Amount: " + amount );
    }
}
