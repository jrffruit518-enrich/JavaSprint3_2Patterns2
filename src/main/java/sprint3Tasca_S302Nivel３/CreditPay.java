package sprint3Tasca_S302Nivel３;

public class CreditPay implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Pay by credit card");
    }
}
