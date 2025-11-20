package sprint3Tasca_S302Nivel3;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PayPal();
        ShoeStore shoeStore = new ShoeStore(new PaymentGateway());
        shoeStore.checkout(paymentMethod,500.0);
    }
}
