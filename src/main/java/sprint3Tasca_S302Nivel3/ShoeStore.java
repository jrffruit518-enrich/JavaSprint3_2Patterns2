package sprint3Tasca_S302Nivel3;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(PaymentMethod method, double price) {
        System.out.println("The shoe store is processing the purchase.");
        paymentGateway.payment(method,price);
    }

}
