package sprint3Tasca_S302Nivel3;

public class PaymentGateway {
    public void payment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
        System.out.println("The payment has been realized");
    }
}
