package sprint3Tasca_S302Nivel３;

public class CashPay implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pay in cash.");
    }
}